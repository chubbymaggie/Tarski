/*******************************************************************************
 * Copyright (c) 2015 UNIT Information Technologies R&D Ltd All rights reserved. This program and
 * the accompanying materials are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors: Ferhat Erata - initial API and implementation H. Emre Kirmizi - initial API and
 * implementation Serhat Celik - initial API and implementation U. Anil Ozturk - initial API and
 * implementation
 *******************************************************************************/
package eu.modelwriter.marker.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.Position;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.IMarkerUpdater;
import org.eclipse.ui.texteditor.MarkerUtilities;

import eu.modelwriter.marker.MarkerActivator;
import eu.modelwriter.traceability.core.persistence.AlloyType;
import eu.modelwriter.traceability.core.persistence.AtomType;
import eu.modelwriter.traceability.core.persistence.DocumentRoot;
import eu.modelwriter.traceability.core.persistence.EntryType;
import eu.modelwriter.traceability.core.persistence.FieldType;
import eu.modelwriter.traceability.core.persistence.ItemType;
import eu.modelwriter.traceability.core.persistence.SigType;
import eu.modelwriter.traceability.core.persistence.TupleType;
import eu.modelwriter.traceability.core.persistence.internal.ModelIO;

/**
 * Returns the attributes for which this updater is responsible.If the result is null, the updater
 * assumes responsibility for any attributes.
 *
 * @author anil.ozturk
 *
 */
public class MarkerUpdater implements IMarkerUpdater {
  public static String xmlFileLocation = ".modelwriter\\persistence.xml";

  public static DocumentRoot getDocumentRoot() {
    @SuppressWarnings("rawtypes")
    final ModelIO modelIO = new ModelIO<>();
    @SuppressWarnings("rawtypes")
    final List list = modelIO.read(MarkerUpdater.getUri());
    if (list.isEmpty()) {
      return null;
    }
    final DocumentRoot documentRoot = (DocumentRoot) list.get(0);
    return documentRoot;
  }

  public static String getLocation() {
    return ResourcesPlugin.getWorkspace().getRoot().getLocation() + "/"
        + MarkerUpdater.xmlFileLocation;
  }

  public static URI getUri() {
    return URI.createFileURI(MarkerUpdater.getLocation());
  }

  public static void update(IMarker marker) {
    final DocumentRoot documentRoot = MarkerUpdater.getDocumentRoot();
    final AlloyType alloyType = documentRoot.getAlloy();

    final EList<ItemType> atoms = alloyType.getRepository().getItem();

    for (final ItemType itemType : atoms) {
      if (itemType.getId().equals(MarkUtilities.getSourceId(marker))) {
        final EList<EntryType> entries = itemType.getEntry();
        for (final EntryType entryType : entries) {
          if (entryType.getKey().equals("text")) {
            entryType.setValue(MarkUtilities.getText(marker));
          } else if (entryType.getKey().equals("resource")) {
            entryType.setValue(MarkUtilities.getPath(marker));
          } else if (entryType.getKey().equals("uri")) {
            entryType.setValue(MarkUtilities.getUri(marker));
          } else if (entryType.getKey().equals("offset")) {
            entryType.setValue(Integer.toString(MarkUtilities.getStart(marker)));
          }
        }
        break;
      }
    }
    MarkerUpdater.writeDocumentRoot(documentRoot);

  }

  public static void updateSources(IMarker marker) {
    if (MarkUtilities.getSourceList(marker).size() != 0) {
      final ArrayList<MarkElement> sourceElements = MarkUtilities.getSourceList(marker);

      for (final MarkElement sourceElement : sourceElements) {

        final IMarker sourceMarker = sourceElement.getiMarker();

        if (sourceMarker != null && sourceMarker.exists()
            && MarkUtilities.getTargetList(sourceMarker).size() != 0) {
          final ArrayList<MarkElement> targetElementsofSource =
              MarkUtilities.getTargetList(sourceMarker);

          for (final MarkElement targetElementofSource : targetElementsofSource) {
            if (targetElementofSource.getiMarker() != null
                && MarkUtilities.compare(targetElementofSource.getiMarker(), marker)) {
              MarkUtilities.setText(targetElementofSource.getiMarker(),
                  MarkUtilities.getText(marker));
              MarkUtilities.setLinenumber(targetElementofSource.getiMarker(),
                  MarkUtilities.getLinenumber(marker));
              MarkUtilities.setStart(targetElementofSource.getiMarker(),
                  MarkUtilities.getStart(marker));
              MarkUtilities.setEnd(targetElementofSource.getiMarker(),
                  MarkUtilities.getEnd(marker));
            }
          }
          MarkUtilities.setTargetList(sourceMarker, targetElementsofSource);
        }
      }
    }
  }

  public static void updateSourcesToAllDelete(IMarker marker) {
    if (MarkUtilities.getSourceList(marker).size() != 0) {
      final ArrayList<MarkElement> sourceElements = MarkUtilities.getSourceList(marker);

      for (final MarkElement sourceElement : sourceElements) {

        final IMarker sourceMarker = sourceElement.getiMarker();
        List<IMarker> groupSourceMarkers = new ArrayList<IMarker>();

        if (MarkUtilities.getGroupId(sourceMarker) != null) {
          groupSourceMarkers = MarkerFactory.findMarkersByGroupId(sourceMarker.getResource(),
              MarkUtilities.getGroupId(sourceMarker));
        }
        if (groupSourceMarkers.isEmpty()) {
          groupSourceMarkers.add(sourceMarker);
        }

        for (final IMarker groupSourceMarker : groupSourceMarkers) {

          if (MarkUtilities.getTargetList(groupSourceMarker).size() != 0) {
            final ArrayList<MarkElement> targetElementsofSource =
                MarkUtilities.getTargetList(groupSourceMarker);

            for (int i = targetElementsofSource.size() - 1; i >= 0; i--) {
              if (MarkUtilities.compare(targetElementsofSource.get(i).getiMarker(), marker)) {
                targetElementsofSource.remove(i);
              }
            }
            MarkUtilities.setTargetList(groupSourceMarker, targetElementsofSource);
          }
        }
      }
    }
  }

  public static void updateSourcesToDelete(IMarker beDeleted) {
    try {
      if (MarkUtilities.getSourceList(beDeleted).size() != 0) {
        final ArrayList<MarkElement> sourceElements = MarkUtilities.getSourceList(beDeleted);

        for (final MarkElement sourceElement : sourceElements) {

          final IMarker sourceMarker = sourceElement.getiMarker();
          List<IMarker> groupSourceMarkers = new ArrayList<IMarker>();

          if (MarkUtilities.getGroupId(sourceMarker) != null) {
            groupSourceMarkers = MarkerFactory.findMarkersByGroupId(sourceMarker.getResource(),
                MarkUtilities.getGroupId(sourceMarker));
          }
          if (groupSourceMarkers.isEmpty()) {
            groupSourceMarkers.add(sourceMarker);
          }

          for (final IMarker groupSourceMarker : groupSourceMarkers) {

            if (MarkUtilities.getTargetList(groupSourceMarker).size() != 0) {
              final ArrayList<MarkElement> targetElementsofSource =
                  MarkUtilities.getTargetList(groupSourceMarker);

              for (int i = targetElementsofSource.size() - 1; i >= 0; i--) {
                if (MarkUtilities.compare(targetElementsofSource.get(i).getiMarker(), beDeleted)) {
                  targetElementsofSource.remove(i);
                }
              }
              MarkUtilities.setTargetList(groupSourceMarker, targetElementsofSource);

              if (groupSourceMarker.getType().equals(MarkerFactory.MARKER_MAPPING)
                  && targetElementsofSource.size() == 0) {
                final IEditorPart part =
                    IDE.openEditor(MarkerActivator.getActiveWorkbenchWindow().getActivePage(),
                        groupSourceMarker, false);
                final Map<String, Object> attributes = groupSourceMarker.getAttributes();
                final IResource res = groupSourceMarker.getResource();
                AnnotationFactory.removeAnnotation(groupSourceMarker, part);
                groupSourceMarker.delete();
                MarkerUtilities.createMarker(res, attributes, MarkerFactory.MARKER_MARKING);
                final IMarker newMarker = MarkerFactory.findMarkerBySourceId(res,
                    (String) attributes.get(IMarker.SOURCE_ID));
                AnnotationFactory.addAnnotation(newMarker, part,
                    AnnotationFactory.ANNOTATION_MARKING);
              }
            }
          }
        }
      }
    } catch (final CoreException e) {
      e.printStackTrace();
    }
  }

  public static void updateTargets(IMarker marker) {
    if (MarkUtilities.getTargetList(marker).size() != 0) {
      final ArrayList<MarkElement> targetElements = MarkUtilities.getTargetList(marker);

      for (final MarkElement targetElement : targetElements) {

        final IMarker targetMarker = targetElement.getiMarker();

        if (targetMarker != null && targetMarker.exists()
            && MarkUtilities.getSourceList(targetMarker).size() != 0) {
          final ArrayList<MarkElement> sourceElementsofTarget =
              MarkUtilities.getSourceList(targetMarker);

          for (final MarkElement sourceElementofTarget : sourceElementsofTarget) {
            if (sourceElementofTarget.getiMarker() != null
                && MarkUtilities.compare(sourceElementofTarget.getiMarker(), marker)) {
              MarkUtilities.setText(sourceElementofTarget.getiMarker(),
                  MarkUtilities.getText(marker));
              MarkUtilities.setLinenumber(sourceElementofTarget.getiMarker(),
                  MarkUtilities.getLinenumber(marker));
              MarkUtilities.setStart(sourceElementofTarget.getiMarker(),
                  MarkUtilities.getStart(marker));
              MarkUtilities.setEnd(sourceElementofTarget.getiMarker(),
                  MarkUtilities.getEnd(marker));
            }
          }
          MarkUtilities.setSourceList(targetMarker, sourceElementsofTarget);
        }
      }
    }
  }

  public static void updateTargetsToAllDelete(IMarker marker) {
    if (MarkUtilities.getTargetList(marker).size() != 0) {
      final ArrayList<MarkElement> targetElements = MarkUtilities.getTargetList(marker);

      for (final MarkElement targetElement : targetElements) {

        final IMarker targetMarker = targetElement.getiMarker();

        List<IMarker> groupTargetMarkers = new ArrayList<IMarker>();

        if (MarkUtilities.getGroupId(targetMarker) != null) {
          groupTargetMarkers = MarkerFactory.findMarkersByGroupId(targetMarker.getResource(),
              MarkUtilities.getGroupId(targetMarker));
        }
        if (groupTargetMarkers.isEmpty()) {
          groupTargetMarkers.add(targetMarker);
        }

        for (final IMarker groupTargetMarker : groupTargetMarkers) {

          if (MarkUtilities.getSourceList(groupTargetMarker).size() != 0) {

            final ArrayList<MarkElement> sourceElementsofTarget =
                MarkUtilities.getSourceList(groupTargetMarker);

            for (int i = sourceElementsofTarget.size() - 1; i >= 0; i--) {
              if (MarkUtilities.compare(sourceElementsofTarget.get(i).getiMarker(), marker)) {
                sourceElementsofTarget.remove(i);
              }
            }
            MarkUtilities.setSourceList(groupTargetMarker, sourceElementsofTarget);
          }
        }
      }
    }
  }

  public static void updateTargetsToDelete(IMarker beDeleted) {
    if (MarkUtilities.getTargetList(beDeleted).size() != 0) {
      final ArrayList<MarkElement> targetElements = MarkUtilities.getTargetList(beDeleted);

      for (final MarkElement targetElement : targetElements) {

        final IMarker targetMarker = targetElement.getiMarker();
        List<IMarker> groupTargetMarkers = new ArrayList<IMarker>();

        if (MarkUtilities.getGroupId(targetMarker) != null) {
          groupTargetMarkers = MarkerFactory.findMarkersByGroupId(targetMarker.getResource(),
              MarkUtilities.getGroupId(targetMarker));
        }
        if (groupTargetMarkers.isEmpty()) {
          groupTargetMarkers.add(targetMarker);
        }

        for (final IMarker groupTargetMarker : groupTargetMarkers) {

          if (MarkUtilities.getSourceList(groupTargetMarker).size() != 0) {

            final ArrayList<MarkElement> sourceElementsofTarget =
                MarkUtilities.getSourceList(groupTargetMarker);

            for (int i = sourceElementsofTarget.size() - 1; i >= 0; i--) {
              if (MarkUtilities.compare(sourceElementsofTarget.get(i).getiMarker(), beDeleted)) {
                sourceElementsofTarget.remove(i);
              }
            }
            MarkUtilities.setSourceList(groupTargetMarker, sourceElementsofTarget);
          }
        }
      }
    }
  }

  @SuppressWarnings("unchecked")
  public static void writeDocumentRoot(DocumentRoot documentRoot) {
    @SuppressWarnings("rawtypes")
    final ModelIO modelIO = new ModelIO<>();
    modelIO.write(MarkerUpdater.getUri(), documentRoot);
  }

  String markerType = MarkerFactory.MARKER_MARKING;

  @Override
  public String[] getAttribute() {
    return null;
  }

  /*
   * (non-Javadoc)
   *
   * @see org.eclipse.ui.texteditor.IMarkerUpdater#getMarkerType()
   *
   */
  @Override
  public String getMarkerType() {
    return markerType;
  }

  private void updateImpactAndChanged(IMarker marker) {
    final DocumentRoot documentRoot = MarkerUpdater.getDocumentRoot();
    final AlloyType alloyType = documentRoot.getAlloy();

    if (MarkUtilities.getType(marker) != null) {
      final EList<SigType> listOfSigs = alloyType.getInstance().getSig();
      for (final SigType sigType : listOfSigs) {
        final EList<AtomType> atoms = sigType.getAtom();
        for (final AtomType atomType : atoms) {
          if (atomType.getLabel().equals(MarkUtilities.getSourceId(marker))) {
            atomType.setChanged(true);
          }
        }
      }
      final EList<FieldType> listOfField = alloyType.getInstance().getField();
      for (final FieldType fieldType : listOfField) {
        final EList<TupleType> tuples = fieldType.getTuple();
        for (final TupleType tupleType : tuples) {
          if (tupleType.getAtom().get(0).getLabel().equals(MarkUtilities.getSourceId(marker))) {
            tupleType.getAtom().get(1).setImpact(true);
          }
        }
      }
      MarkerUpdater.writeDocumentRoot(documentRoot);
    }
  }

  @Override
  public boolean updateMarker(IMarker marker, IDocument doc, Position position) {
    try {
      markerType = marker.getType();
      final int start = position.getOffset();
      final int end = position.getOffset() + position.getLength();

      if (!MarkUtilities.getText(marker).equals(doc.get(start, position.getLength()))) {
        updateImpactAndChanged(marker);// text of marker is changed
      }

      MarkUtilities.setStart(marker, start);
      MarkUtilities.setEnd(marker, end);
      MarkUtilities.setLinenumber(marker, doc.getLineOfOffset(start));
      MarkUtilities.setText(marker, doc.get(start, position.getLength()));

      MarkerUpdater.update(marker);

      return true;
    } catch (CoreException | BadLocationException e) {
      return false;
    }
  }
}
