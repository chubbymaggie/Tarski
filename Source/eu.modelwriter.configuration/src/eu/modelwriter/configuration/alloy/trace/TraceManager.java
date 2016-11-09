package eu.modelwriter.configuration.alloy.trace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IMarker;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import eu.modelwriter.configuration.internal.AlloyUtilities;
import eu.modelwriter.configuration.internal.EcoreUtilities;
import eu.modelwriter.configuration.internal.Utilities;
import eu.modelwriter.marker.internal.AnnotationFactory;
import eu.modelwriter.marker.internal.MarkUtilities;
import eu.modelwriter.marker.internal.MarkerFactory;

public class TraceManager {

  private static TraceManager instance = null;

  @SuppressWarnings("unused")
  private String alloyPath;

  private final List<SigTrace> sigTraces = new ArrayList<SigTrace>();
  private final List<RelationTrace> relationTraces = new ArrayList<RelationTrace>();
  private final List<LoadItem> loads = new ArrayList<LoadItem>();

  /**
   * 
   * @return @TraceManager instance
   */
  public static TraceManager get() {
    if (instance == null)
      instance = new TraceManager();
    return instance;
  }

  private TraceManager() {}

  /**
   * Loads traces from given path
   * 
   * @param alloyPath Path to load alloy file
   * @throws TraceException on any error
   */
  public void loadSpec(String alloyPath) throws TraceException {
    sigTraces.clear();
    relationTraces.clear();
    loads.clear();
    this.alloyPath = alloyPath;
    scanFile(alloyPath, true);
  }

  public boolean hasTraces() {
    return !sigTraces.isEmpty() && !relationTraces.isEmpty();
  }

  public boolean hasInstance() {
    for (LoadItem loadItem : loads) {
      if (loadItem.getInstanceRoot() != null)
        return true;
    }
    return false;
  }

  public boolean hasSigTrace(String sigTypeName) {
    try {
      return getSigTraceByType(sigTypeName).getLoad().getInstanceRoot() != null;
    } catch (TraceException e) {
      return false;
    }
  }

  public List<LoadItem> getLoads() {
    return loads;
  }

  private void scanFile(String alloyPath, boolean scanTraces) throws TraceException {
    final Pattern sigTracePattern = Pattern.compile(
        "(\\s*)(-)(-)(\\s*)(Trace|trace)(@)((?:[a-z0-9_]+))(\\.)((?:[a-z0-9_]+))(\\s*)",
        Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
    final Pattern relationTracePattern = Pattern.compile(
        "(\\s*)(-)(-)(\\s*)(Trace|trace)(@)((?:[a-z0-9_]+))(\\.)((?:[a-z0-9_]+))(\\.)((?:[a-z0-9_]+))(\\s*)",
        Pattern.CASE_INSENSITIVE | Pattern.DOTALL);

    Scanner scanner = null;
    try {
      final File file = new File(alloyPath);
      scanner = new Scanner(file);
    } catch (final FileNotFoundException e) {
      throw new TraceException("File not found. Path: " + alloyPath);
    }

    while (scanner.hasNextLine()) {
      String line = Utilities.getNextLine(scanner);

      if (line.toLowerCase().startsWith("--loadalias")
          || line.toLowerCase().startsWith("-- loadalias")) {
        findLoads(scanner, line);
      }

      if (scanTraces) {
        final Matcher sigTrace = sigTracePattern.matcher(line);
        final Matcher relationTrace = relationTracePattern.matcher(line);

        if (relationTrace.find()) {
          findRelationTrace(scanner, line, relationTrace);
        } else if (sigTrace.find()) {
          findSigTrace(scanner, line, sigTrace);
        }
      }
    }
    scanner.close();
  }

  private void findSigTrace(Scanner scanner, String line, Matcher sigTraceMatcher)
      throws TraceException {
    String traceAlias = sigTraceMatcher.group(7);
    String className = sigTraceMatcher.group(9);
    do {
      line = Utilities.getNextLine(scanner);
    } while (!line.contains("sig "));

    if (line.contains("sig ")) {
      final int start = line.indexOf("sig ") + 4;
      int stop = line.indexOf(" ", start);
      stop = stop == -1 ? line.indexOf("{", start) : stop;
      stop = stop == -1 ? line.indexOf("\n", start) : stop;
      final String sigType = line.substring(start, stop).trim();
      LoadItem loadItem = getLoadByAlias(traceAlias);
      if (loadItem == null)
        throw new TraceException("Load traces must be above than other traces!");
      SigTrace sigTrace = new SigTrace(traceAlias, sigType, className, loadItem,
          EcoreUtilities.findEClass(loadItem.getAllEClasses(), className));
      sigTraces.add(sigTrace);
    }
  }

  private void findRelationTrace(Scanner scanner, String line, Matcher relationTraceMatcher)
      throws TraceException {
    String traceAlias = relationTraceMatcher.group(7);
    String traceClass = relationTraceMatcher.group(9);
    String traceReference = relationTraceMatcher.group(11);

    do {
      line = Utilities.getNextLine(scanner);
    } while (!line.contains(":"));

    if (line.contains(":")) {
      final String[] strings = line.split(" ");
      final String relation = strings[0].replaceAll(":", "").trim();
      @SuppressWarnings("unused")
      final String targetSig =
          strings[strings.length - 1].replaceAll(",", "").replaceAll("}", "").trim();
      RelationTrace relationTrace =
          new RelationTrace(traceAlias, traceClass, relation, traceReference);
      relationTrace.setSource(getSigTraceByClassName(traceClass));
      relationTraces.add(relationTrace);
    }
  }

  private void findLoads(Scanner scanner, String line) throws TraceException {
    String alias = "", modelFilePath = "", instanceFilePath = "";
    alias = line.substring(line.indexOf("@") + 1).trim();
    for (int i = 0; i < 2; i++) {
      String nextLine = Utilities.getNextLine(scanner);
      if (nextLine.toLowerCase().contains("loadmodel@")) {
        modelFilePath = nextLine.substring(nextLine.indexOf("@") + 1);
      } else if (nextLine.toLowerCase().contains("loadinstance@")) {
        instanceFilePath = nextLine.substring(nextLine.indexOf("@") + 1);
      }
    }
    if (!alias.isEmpty() /* && !modelFilePath.isEmpty() && !instanceFilePath.isEmpty() */) {
      loads.add(new LoadItem(alias, modelFilePath, instanceFilePath));
    } else {
      throw new TraceException("Can't load EMF models!");
    }
  }

  public SigTrace getSigTraceByType(String type) throws TraceException {
    SigTrace trace = sigTraces.stream().filter(sigTrace -> sigTrace.getSigType().equals(type))
        .findFirst().orElse(null);
    if (trace == null)
      throw new TraceException("There is no trace for the sig: " + type);
    return trace;
  }

  public SigTrace getSigTraceByClassName(String name) throws TraceException {
    SigTrace trace = sigTraces.stream().filter(sigTrace -> sigTrace.getClassName().equals(name))
        .findFirst().orElse(null);
    if (trace == null)
      throw new TraceException("There is no trace for the EClass: " + name);
    return trace;
  }

  public RelationTrace getRelationTraceByReferenceName(String reference) {
    return relationTraces.stream().filter(rt -> rt.getReferenceName().equals(reference)).findFirst()
        .orElse(null);
  }

  public RelationTrace getRelationTrace(String className, String refName) {
    return relationTraces.stream()
        .filter(
            rt -> (rt.getClassName().equals(className) && rt.getReferenceName().equals(refName)))
        .findFirst().orElse(null);
  }

  public RelationTrace getRelationTrace3(String sigType, String relName) {
    return relationTraces.stream()
        .filter(rt -> (rt.equals(sigType) && rt.getRelationName().equals(relName))).findFirst()
        .orElse(null);
  }

  public RelationTrace getRelationTrace2(String className, String relName) {
    return relationTraces.stream()
        .filter(rt -> (rt.getClassName().equals(className) && rt.getRelationName().equals(relName)))
        .findFirst().orElse(null);
  }

  private RelationTrace getRelationTraceBySigType(String sourceSigType, String relationName) {
    return relationTraces.stream().filter(t -> (t.getSource().getSigType().equals(sourceSigType)
        && t.getRelationName().equals(relationName))).findFirst().orElse(null);
  }

  public RelationTrace getRelationTraceByRelationName(String rel) {
    return relationTraces.stream().filter(rt -> rt.getRelationName().equals(rel)).findFirst()
        .orElse(null);
  }

  public LoadItem getLoadByAlias(String alias) {
    return loads.stream().filter(load -> load.getAlias().equals(alias)).findFirst().orElse(null);
  }

  public LoadItem getLoadByInstance(EObject instance) {
    return loads.stream().filter(load -> load.getInstanceRoot().equals(instance)).findFirst()
        .orElse(null);
  }

  public boolean deleteEObject(String sigType, String relativeObjectURI)
      throws IOException, TraceException {
    EObject eObject = findEObject(sigType, relativeObjectURI);
    if (eObject != null) {
      Resource eResource = eObject.eResource();
      EcoreUtil.delete(eObject);
      eResource.save(null);
      return true;
    }
    return false;
  }

  private EObject findEObject(String sigTypeName, String relativeObjectURI) throws TraceException {
    if (relativeObjectURI != null && sigTypeName != null) {
      SigTrace trace = getSigTraceByType(sigTypeName);
      return EcoreUtil.getEObject(trace.getLoad().getInstanceRoot(), relativeObjectURI);
    }
    return null;
  }

  public EObject findEObject(IMarker marker) throws TraceException {
    if (marker == null)
      return null;
    String relURI = marker.getAttribute(MarkUtilities.RELATIVE_URI, "");
    String sigTypeName = marker.getAttribute(MarkUtilities.MARKER_TYPE, "");
    return findEObject(sigTypeName, relURI);
  }

  @SuppressWarnings("unused")
  private EObject findEObject(String uri) {
    String rootURI = uri.split("#")[0];
    String relURI = uri.split("#")[1];
    EObject root = findInstanceRootByURI(rootURI);

    return EcoreUtil.getEObject(root, relURI);
  }

  private EObject findInstanceRootByURI(String rootURI) {
    for (LoadItem loadItem : loads) {
      if (loadItem.getInstanceRoot().eResource().getURI().toString().equals(rootURI)) {
        return loadItem.getInstanceRoot();
      }
    }
    return null;
  }

  public EObject createEObject(String sigTypeName, String atomName, IMarker source)
      throws TraceException {
    SigTrace trace = getSigTraceByType(sigTypeName);
    EClass eClass = trace.getEClass();
    EObject eObject = EcoreUtil.create(eClass);
    EcoreUtilities.eSetAttributeByName(eObject, "name", atomName);
    EcoreUtilities.putIntoContainer(
        source == null ? trace.getLoad().getInstanceRoot() : findEObject(source), eObject);
    EcoreUtilities.saveResource(trace.getLoad().getInstanceRoot());
    return eObject;
  }

  public IMarker createMarkerForAtom(String sigTypeName, String atomName, IMarker source)
      throws TraceException {
    SigTrace trace = getSigTraceByType(sigTypeName);
    EObject eObject = createEObject(sigTypeName, atomName, source);
    return MarkerFactory.createInstanceMarker(eObject, trace.getLoad().getInstanceFile(),
        trace.getSigType());
  }

  public IMarker createMarkerForEObject(EObject eObject) throws TraceException {
    SigTrace trace = getSigTraceByClassName(eObject.eClass().getName());
    return MarkerFactory.createInstanceMarker(eObject, trace.getLoad().getInstanceFile(),
        trace.getSigType());
  }

  public String getContainerSigType(String sigTypeName) {
    try {
      SigTrace trace = getSigTraceByType(sigTypeName);
      TreeIterator<EObject> iterator = trace.getLoad().getModelRoot().eAllContents();
      while (iterator.hasNext()) {
        EObject next = iterator.next();
        if (next instanceof EClass) {
          for (EReference eReference : ((EClass) next).getEAllReferences()) {
            if (eReference.isContainment()
                && eReference.getEReferenceType().getName().equals(trace.getClassName())) {
              return getSigTraceByClassName(((EClass) next).getName()).getSigType();
            }
          }
        }
      }
    } catch (TraceException e) {
      return "";
    }
    return "";
  }

  public Set<String> getContainerSigTypes(String sigTypeName) {
    Set<String> containerSigTypes = new HashSet<String>();
    try {
      SigTrace trace = getSigTraceByType(sigTypeName);
      TreeIterator<EObject> iterator = trace.getLoad().getModelRoot().eAllContents();
      while (iterator.hasNext()) {
        EObject next = iterator.next();
        if (next instanceof EClass) {
          ArrayList<String> parentNames =
              AlloyUtilities.getAllParentNames(AlloyUtilities.getSigTypeIdByName(sigTypeName));
          parentNames.remove("univ");
          for (String parent : parentNames) {
            SigTrace parentTrace = getSigTraceByType(parent);
            for (EReference eReference : ((EClass) next).getEAllReferences()) {
              if (eReference.isContainment()
                  && eReference.getEReferenceType().getName().equals(parentTrace.getClassName())) {
                containerSigTypes
                    .add(getSigTraceByClassName(((EClass) next).getName()).getSigType());
              }
            }
          }
        }
      }
    } catch (TraceException e) {
      return new HashSet<String>();
    }
    return containerSigTypes;
  }

  public String getContainmentRelation(IMarker fromMarker, IMarker toMarker) throws TraceException {
    EObject source = findEObject(fromMarker);
    EObject target = findEObject(toMarker);
    EReference eReference = EcoreUtilities.getContainmentEReference(source, target);
    if (eReference != null)
      return getRelationTrace(((EClass) eReference.eContainer()).getName(), eReference.getName())
          .getRelationName();
    return null;
  }

  public IMarker createReference(IMarker fromMarker, IMarker toMarker, String relationName)
      throws TraceException {
    EObject source = findEObject(fromMarker);
    EObject target = findEObject(toMarker);
    EReference ref = null;
    for (EReference eReference : source.eClass().getEAllReferences()) {
      RelationTrace relationTrace =
          getRelationTrace(((EClass) eReference.eContainer()).getName(), eReference.getName());
      if (relationTrace != null && relationTrace.getRelationName().equals(relationName)) {
        ref = eReference;
        break;
      }
    }
    if (ref != null) {
      EcoreUtilities.eSetReferenceByName(source, ref.getName(), target);
      EcoreUtilities.saveResource(source);
      return AnnotationFactory.convertAnnotationType(fromMarker, false, false,
          AlloyUtilities.getTotalTargetCount(fromMarker));
    } else {
      return null;
    }
  }

  public Set<String> findContainers(List<EClass> allEClasses, String selectedType) {
    Set<String> result = new HashSet<String>();
    ArrayList<String> supers =
        AlloyUtilities.getAllParentNames(AlloyUtilities.getSigTypeIdByName(selectedType));
    supers.remove("univ");
    for (EClass eClass : allEClasses) {
      for (EReference eReference : eClass.getEAllReferences()) {
        if (eReference.isContainment()) {
          try {
            SigTrace sigTrace = getSigTraceByClassName(eReference.getEReferenceType().getName());
            if (supers.contains(sigTrace.getSigType())) {
              result.add(getSigTraceByClassName(eClass.getName()).getSigType());
            }
          } catch (TraceException e) {
            // e.printStackTrace();
          }
        }
      }
    }
    return result;
  }

}
