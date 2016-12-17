package eu.modelwriter.core.alloyinecore.ui.cs2as.mapping;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreBaseVisitor;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreLexer;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.BodyContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EAnnotationContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EAttributeContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EClassContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EClassifierContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EDataTypeContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EEnumContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EEnumLiteralContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EModelElementContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EModelElementRefContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EMultiplicityContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.ENamedElementContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EOperationContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EPackageContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EParameterContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EPrimitiveTypeContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EReferenceContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.EStructuralFeatureContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.ETypeContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.ETypedElementContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.ExpressionContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.FormulaContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.InvariantContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.ModuleContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.PostconditionContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.PreconditionContext;
import eu.modelwriter.core.alloyinecore.recognizer.AlloyInEcoreParser.QualifiedNameContext;
import eu.modelwriter.core.alloyinecore.ui.cs2as.PackageImport;
import eu.modelwriter.core.alloyinecore.ui.cs2as.Qualification;
import eu.modelwriter.core.alloyinecore.ui.model.AnnotationSources;

public class CS2ASMapping extends AlloyInEcoreBaseVisitor<Object> {
  private static final String rootLocation = "mappingTest" + System.getProperty("file.separator");
  private static final String fileName = "tutorial";
  private static final String codeFile =
      CS2ASMapping.rootLocation + CS2ASMapping.fileName + ".recore";
  private static final String ecoreFile =
      CS2ASMapping.rootLocation + CS2ASMapping.fileName + ".ecore";

  public static void main(final String[] args) {
    ANTLRInputStream input = null;
    // final File file =
    // new File("platform: plugin eu.modelwriter.core.alloyinecore src programs tutorial.recore"
    // .replace(" ", System.getProperty("file.separator")));
    final File file = new File(CS2ASMapping.codeFile);
    try {
      input = new ANTLRFileStream(file.getAbsolutePath());
    } catch (final IOException e) {
      e.printStackTrace();
    }
    // final ANTLRInputStream input = new ANTLRInputStream(str);
    final AlloyInEcoreLexer lexer = new AlloyInEcoreLexer(input);
    final CommonTokenStream tokens = new CommonTokenStream(lexer);
    final AlloyInEcoreParser parser = new AlloyInEcoreParser(tokens);
    final ParseTree tree = parser.module();

    /** ----------Loader for Data Structure------------------------------- **/
    final CS2ASMapping code2Ecore = CS2ASMapping.getInstance();
    code2Ecore.visit(tree);
  }

  private static final CS2ASMapping instance = new CS2ASMapping();

  private static final EcoreFactory factory = EcoreFactory.eINSTANCE;

  private static Map<String, PackageImport> name2packageImport = new HashMap<>();
  private static Map<String, EPackage> name2ePackage = new HashMap<>();
  private static Map<String, EClass> name2eClass = new HashMap<>();
  private static Map<String, EDataType> name2eDataType = new HashMap<>();
  private static Map<String, EEnum> name2eEnum = new HashMap<>();

  private CS2ASMapping() {}

  public static CS2ASMapping getInstance() {
    CS2ASMapping.name2packageImport.clear();
    CS2ASMapping.name2ePackage.clear();
    CS2ASMapping.name2eClass.clear();
    CS2ASMapping.name2eDataType.clear();
    CS2ASMapping.name2eEnum.clear();
    return CS2ASMapping.instance;
  }

  @Override
  public Object visitModule(final ModuleContext ctx) {
    CS2ASInitializer.instance.visit(ctx);
    CS2ASMapping.name2packageImport = CS2ASInitializer.instance.getName2packageImport();
    CS2ASMapping.name2ePackage = CS2ASInitializer.instance.getName2epackage();
    CS2ASMapping.name2eClass = CS2ASInitializer.instance.getName2eclass();
    CS2ASMapping.name2eDataType = CS2ASInitializer.instance.getName2edatatype();
    CS2ASMapping.name2eEnum = CS2ASInitializer.instance.getName2eenum();

    ctx.ownedPackageImport.forEach(opi -> {
      visitPackageImport(opi);
    });

    ctx.ownedPackage.forEach(op -> {
      visitEPackage(op);
    });

    CS2ASMapping.saveResource(CS2ASMapping.name2ePackage.get("tutorial"), CS2ASMapping.ecoreFile);

    return null;
  }

  @Override
  public EPackage visitEPackage(final EPackageContext ctx) {
    return createEPackage(ctx);
  }

  /**
   * @param ctx
   * @return
   */
  private EPackage createEPackage(final EPackageContext ctx) {
    final EPackage ePackage = CS2ASMapping.name2ePackage.get(ctx.name.getText());

    if (ctx.visibility != null) {
      final EAnnotation visibilityAnnotation = createVisibilityAnnotation(ctx.visibility.getText());
      ePackage.getEAnnotations().add(visibilityAnnotation);
    } // DEFAULT NULL

    final String name = ctx.name.getText();
    ePackage.setName(name);

    final String nsPrefix = ctx.nsPrefix.getText();
    ePackage.setNsPrefix(nsPrefix);

    final String nsURI = ctx.nsURI.getText();
    ePackage.setNsURI(nsURI);

    ctx.ownedAnnotations.forEach(oa -> {
      final EAnnotation eAnnotation = visitEAnnotation(oa);
      ePackage.getEAnnotations().add(eAnnotation);
    });

    ctx.eSubPackages.forEach(esp -> {
      final EPackage subPackage = visitEPackage(esp);
      ePackage.getESubpackages().add(subPackage);
    });

    ctx.eClassifiers.forEach(ec -> {
      final EClassifier eClassifier = visitEClassifier(ec);
      ePackage.getEClassifiers().add(eClassifier);
    });

    ctx.eConstraints.forEach(ec -> {
      final EAnnotation invariantAnnotation = visitInvariant(ec);
      ePackage.getEAnnotations().add(invariantAnnotation);
    });

    return ePackage;
  }

  @Override
  public EClassifier visitEClassifier(final EClassifierContext ctx) {
    return (EClassifier) super.visitEClassifier(ctx);
  }


  @Override
  public EClass visitEClass(final EClassContext ctx) {
    return createEClass(ctx);
  }

  /**
   * @param ctx
   * @return
   */
  private EClass createEClass(final EClassContext ctx) {
    final EClass eClass = CS2ASMapping.name2eClass.get(ctx.name.getText());

    if (ctx.visibility != null) {
      final EAnnotation visibilityAnnotation = createVisibilityAnnotation(ctx.visibility.getText());
      eClass.getEAnnotations().add(visibilityAnnotation);
    } // DEFAULT NULL

    final boolean isAbstract = ctx.isAbstract != null ? true : false;
    // DEFAULT FALSE
    eClass.setAbstract(isAbstract);

    final String name = ctx.name.getText();
    eClass.setName(name);

    ctx.eSuperTypes.forEach(est -> {
      final EClass superType = (EClass) visitQualifiedName(est);
      if (superType != null) {
        eClass.getESuperTypes().add(superType);
      }
    });

    if (ctx.instanceClassName != null) {
      final String instanceClassName = ctx.instanceClassName.getText();
      eClass.setInstanceClassName(instanceClassName);
    }

    final boolean isInterface = ctx.isInterface != null ? true : false;
    // DEFAULT FALSE
    eClass.setInterface(isInterface);

    ctx.ownedAnnotations.forEach(oa -> {
      final EAnnotation eAnnotation = visitEAnnotation(oa);
      eClass.getEAnnotations().add(eAnnotation);
    });

    ctx.eOperations.forEach(eo -> {
      final EOperation eOperation = visitEOperation(eo);
      eClass.getEOperations().add(eOperation);
    });

    ctx.eStructuralFeatures.forEach(esf -> {
      final EStructuralFeature eStructuralFeature = visitEStructuralFeature(esf);
      eClass.getEStructuralFeatures().add(eStructuralFeature);
    });

    ctx.eConstraints.forEach(ec -> {
      final EAnnotation invariantAnnotation = visitInvariant(ec);
      eClass.getEAnnotations().add(invariantAnnotation);
    });

    return eClass;
  }

  @Override
  public EStructuralFeature visitEStructuralFeature(final EStructuralFeatureContext ctx) {
    return (EStructuralFeature) super.visitEStructuralFeature(ctx);
  }

  @Override
  public EAttribute visitEAttribute(final EAttributeContext ctx) {
    return createEAttribute(ctx);
  }

  /**
   * @param ctx
   * @return
   */
  private EAttribute createEAttribute(final EAttributeContext ctx) {
    final EAttribute eAttribute = CS2ASMapping.factory.createEAttribute();

    if (ctx.visibility != null) {
      final EAnnotation visibilityAnnotation = createVisibilityAnnotation(ctx.visibility.getText());
      eAttribute.getEAnnotations().add(visibilityAnnotation);
    } // DEFAULT NULL

    final boolean isStatic =
        ctx.qualifier.stream().anyMatch(q -> q.getText().equals(Qualification.STATIC.toString()));
    if (isStatic) {
      final EAnnotation staticAnnotation =
          createEAnnotation(Qualification.STATIC.getAnnotationSource());
      // DEFAULT NULL
      eAttribute.getEAnnotations().add(staticAnnotation);
    }

    final String name = ctx.name.getText();
    eAttribute.setName(name);

    if (ctx.defaultValue != null) {
      final String defaultValue = ctx.defaultValue.getText();
      eAttribute.setDefaultValue(defaultValue);
    } // DEFAULT NULL

    if (ctx.eAttributeType != null) {
      final EClassifier eType = visitEType(ctx.eAttributeType);
      eAttribute.setEType(eType);
    } // DEFAULT NULL

    if (ctx.multiplicity != null) {
      final int[] multiplicity = visitEMultiplicity(ctx.multiplicity);
      eAttribute.setLowerBound(multiplicity[0]);
      eAttribute.setUpperBound(multiplicity[1]);
    } else { // DEFAULT 1
      eAttribute.setLowerBound(1);
      eAttribute.setUpperBound(1);
    }

    final boolean isDerived =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.DERIVED.toString()));
    // DEFAULT FALSE
    eAttribute.setDerived(isDerived);

    final boolean isId =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.ID.toString()));
    // DEFAULT FALSE
    eAttribute.setID(isId);

    final boolean isOrdered =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.ORDERED.toString()));
    // DEFAULT FALSE
    eAttribute.setOrdered(isOrdered);

    final boolean isReadonly =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.READONLY.toString()));
    // DEFAULT FALSE
    eAttribute.setChangeable(isReadonly);

    final boolean isTransient = ctx.qualifier.stream()
        .anyMatch(p -> p.getText().equals(Qualification.TRANSIENT.toString()));
    // DEFAULT FALSE
    eAttribute.setTransient(isTransient);

    final boolean isUnique = !ctx.qualifier.stream()
        .anyMatch(p -> p.getText().equals(Qualification.NOT_UNIQUE.toString()));
    // DEFAULT TRUE
    eAttribute.setUnique(isUnique);

    final boolean isUnsettable = ctx.qualifier.stream()
        .anyMatch(p -> p.getText().equals(Qualification.UNSETTABLE.toString()));
    // DEFAULT FALSE
    eAttribute.setUnsettable(isUnsettable);

    final boolean isVolatile =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.VOLATILE.toString()));
    // DEFAULT FALSE
    eAttribute.setVolatile(isVolatile);

    ctx.ownedAnnotations.forEach(oa -> {
      final EAnnotation eAnnotation = visitEAnnotation(oa);
      eAttribute.getEAnnotations().add(eAnnotation);
    });

    // TODO INITIAL EXPRESSION

    // TODO DERIVATION EXPRESSION

    return eAttribute;
  }

  @Override
  public EReference visitEReference(final EReferenceContext ctx) {
    return createEReference(ctx);
  }

  /**
   * @param ctx
   * @return
   */
  private EReference createEReference(final EReferenceContext ctx) {
    final EReference eReference = CS2ASMapping.factory.createEReference();

    if (ctx.visibility != null) {
      final EAnnotation visibilityAnnotation = createVisibilityAnnotation(ctx.visibility.getText());
      eReference.getEAnnotations().add(visibilityAnnotation);
    } // DEFAULT NULL

    final boolean isStatic =
        ctx.qualifier.stream().anyMatch(q -> q.getText().equals(Qualification.STATIC.toString()));
    if (isStatic) {
      final EAnnotation staticAnnotation =
          createEAnnotation(Qualification.STATIC.getAnnotationSource());
      // DEFAULT NULL
      eReference.getEAnnotations().add(staticAnnotation);
    }

    final String name = ctx.name.getText();
    eReference.setName(name);

    final EClassifier eType = visitEType(ctx.eReferenceType);
    eReference.setEType(eType);

    if (ctx.opposite != null) {
      final String oppositeName = ctx.opposite.getText();
      final EClass oppositeType = (EClass) eType;
      final EReference eOpposite = oppositeType.getEReferences().stream()
          .filter(er -> er.getName().equals(oppositeName)).findFirst().orElse(null);
      eReference.setEOpposite(eOpposite);
    } // DEFAULT NULL

    if (ctx.multiplicity != null) {
      final int[] multiplicity = visitEMultiplicity(ctx.multiplicity);
      eReference.setLowerBound(multiplicity[0]);
      eReference.setUpperBound(multiplicity[1]);
    } else { // DEFAULT 1
      eReference.setLowerBound(1);
      eReference.setUpperBound(1);
    }

    if (ctx.defaultValue != null) {
      final String defaultValue = ctx.defaultValue.getText();
      eReference.setDefaultValue(defaultValue);
    } // DEFAULT NULL

    final boolean isComposes =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.COMPOSES.toString()));
    // DEFAULT FALSE
    eReference.setContainment(isComposes);

    final boolean isDerived =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.DERIVED.toString()));
    // DEFAULT FALSE
    eReference.setDerived(isDerived);

    final boolean isOrdered =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.ORDERED.toString()));
    // DEFAULT FALSE
    eReference.setOrdered(isOrdered);

    final boolean isReadonly =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.READONLY.toString()));
    // DEFAULT FALSE
    eReference.setChangeable(isReadonly);

    final boolean isResolve =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.RESOLVE.toString()));
    // DEFAULT FALSE
    eReference.setResolveProxies(isResolve);

    final boolean isTransient = ctx.qualifier.stream()
        .anyMatch(p -> p.getText().equals(Qualification.TRANSIENT.toString()));
    // DEFAULT FALSE
    eReference.setTransient(isTransient);

    final boolean isUnique = !ctx.qualifier.stream()
        .anyMatch(p -> p.getText().equals(Qualification.NOT_UNIQUE.toString()));
    // DEFAULT TRUE
    eReference.setUnique(isUnique);

    final boolean isUnsettable = ctx.qualifier.stream()
        .anyMatch(p -> p.getText().equals(Qualification.UNSETTABLE.toString()));
    // DEFAULT FALSE
    eReference.setUnsettable(isUnsettable);

    final boolean isVolatile =
        ctx.qualifier.stream().anyMatch(p -> p.getText().equals(Qualification.VOLATILE.toString()));
    // DEFAULT FALSE
    eReference.setVolatile(isVolatile);

    ctx.ownedAnnotations.forEach(oa -> {
      final EAnnotation eAnnotation = visitEAnnotation(oa);
      eReference.getEAnnotations().add(eAnnotation);
    });

    // TODO REFERRED KEYS ?

    // TODO OWNED INITIAL EXPRESSIONS

    // TODO OWNED DERIVATION EXPRESSIONS

    return eReference;
  }

  @Override
  public EOperation visitEOperation(final EOperationContext ctx) {
    return createEOperation(ctx);
  }

  /**
   * @param ctx
   * @return
   */
  private EOperation createEOperation(final EOperationContext ctx) {
    final EOperation eOperation = CS2ASMapping.factory.createEOperation();

    if (ctx.visibility != null) {
      final EAnnotation visibilityAnnotation = createVisibilityAnnotation(ctx.visibility.getText());
      eOperation.getEAnnotations().add(visibilityAnnotation);
    } // DEFAULT NULL

    final boolean isStatic =
        ctx.qualifier.stream().anyMatch(q -> q.getText().equals(Qualification.STATIC.toString()));
    if (isStatic) {
      final EAnnotation staticAnnotation =
          createEAnnotation(Qualification.STATIC.getAnnotationSource());
      // DEFAULT NULL
      eOperation.getEAnnotations().add(staticAnnotation);
    }

    final String name = ctx.name.getText();
    eOperation.setName(name);

    ctx.eParameters.forEach(ep -> {
      final EParameter eParameter = visitEParameter(ep);
      eOperation.getEParameters().add(eParameter);
    });

    final EClassifier returnType = visitEType(ctx.returnType);
    eOperation.setEType(returnType);

    final int[] multiplicity = visitEMultiplicity(ctx.multiplicity);
    eOperation.setLowerBound(multiplicity[0]);
    eOperation.setUpperBound(multiplicity[1]);

    // TODO OWNED EXCEPTION (NOT IMPLEMENTED ON BNF)

    // TODO IS IT WRONG?
    // final Boolean isDerived =
    // ctx.qualifier.stream().anyMatch(q -> q.getText().equals(Qualification.DERIVED.toString()));
    // final EAnnotation derivedAnnotation = createDerivedAnnotation(isDerived);
    // // DEFAULT FALSE
    // eOperation.getEAnnotations().add(derivedAnnotation);

    final boolean isOrdered =
        ctx.qualifier.stream().anyMatch(q -> q.getText().equals(Qualification.ORDERED.toString()));
    // DEFAULT FALSE
    eOperation.setOrdered(isOrdered);

    final boolean isUnique = !ctx.qualifier.stream()
        .anyMatch(q -> q.getText().equals(Qualification.NOT_UNIQUE.toString()));
    // DEFAULT TRUE
    eOperation.setUnique(isUnique);

    ctx.ownedAnnotations.forEach(oa -> {
      final EAnnotation eAnnotation = visitEAnnotation(oa);
      eOperation.getEAnnotations().add(eAnnotation);
    });

    ctx.ownedPreconditions.forEach(opc -> {
      final EAnnotation preconditionAnnotation = visitPrecondition(opc);
      eOperation.getEAnnotations().add(preconditionAnnotation);
    });

    ctx.ownedBodyExpression.forEach(obe -> {
      final EAnnotation bodyAnnotation = visitBody(obe);
      eOperation.getEAnnotations().add(bodyAnnotation);
    });

    ctx.ownedPostconditions.forEach(opc -> {
      final EAnnotation postconditionAnnotation = visitPostcondition(opc);
      eOperation.getEAnnotations().add(postconditionAnnotation);
    });

    return eOperation;
  }

  @Override
  public EParameter visitEParameter(final EParameterContext ctx) {
    return createEParameter(ctx);
  }

  /**
   * @param ctx
   * @return
   */
  private EParameter createEParameter(final EParameterContext ctx) {
    final EParameter eParameter = CS2ASMapping.factory.createEParameter();

    final String name = ctx.name.getText();
    eParameter.setName(name);

    if (ctx.ownedType != null) {
      final EClassifier eType = visitEType(ctx.ownedType);
      eParameter.setEType(eType);
    } // DEFAULT NULL

    if (ctx.ownedMultiplicity != null) {
      final int[] multiplicity = visitEMultiplicity(ctx.ownedMultiplicity);
      eParameter.setLowerBound(multiplicity[0]);
      eParameter.setUpperBound(multiplicity[1]);
    } else { // DEFAULT 1
      eParameter.setLowerBound(1);
      eParameter.setUpperBound(1);
    }

    final boolean isOrdered =
        ctx.qualifier.stream().anyMatch(q -> q.getText().equals(Qualification.ORDERED.toString()));
    // DEFAULT FALSE
    eParameter.setOrdered(isOrdered);

    final boolean isUnique = !ctx.qualifier.stream()
        .anyMatch(q -> q.getText().equals(Qualification.NOT_UNIQUE.toString()));
    // DEFAULT TRUE
    eParameter.setUnique(isUnique);

    ctx.ownedAnnotations.forEach(oa -> {
      final EAnnotation eAnnotation = visitEAnnotation(oa);
      eParameter.getEAnnotations().add(eAnnotation);
    });

    return eParameter;
  }

  @Override
  public EClassifier visitEType(final ETypeContext ctx) {
    return (EClassifier) super.visitEType(ctx);
  }

  @Override
  public int[] visitEMultiplicity(final EMultiplicityContext ctx) {
    int lower = 0;
    int upper = 1;
    if (ctx.stringBounds != null) {
      final String stringBound = ctx.stringBounds.getText();
      switch (stringBound) {
        case "*":
          lower = 0;
          upper = -1;
          break;
        case "+":
          lower = 1;
          upper = -1;
        case "?":
          lower = 0;
          upper = 1;
        default:
          break;
      }
    } else {
      lower = Integer.valueOf(ctx.lowerBound.getText());
      if (ctx.upperBound != null) {
        upper = Integer.valueOf(ctx.upperBound.getText());
      } else {
        upper = lower;
      }
    } // TODO ('|?' | isNullFree= '|1')?
    return new int[] {lower, upper};
  }

  @Override
  public EDataType visitEDataType(final EDataTypeContext ctx) {
    return createEDataType(ctx);
  }

  /**
   * @param ctx
   * @return
   */
  private EDataType createEDataType(final EDataTypeContext ctx) {
    final EDataType eDataType = CS2ASMapping.name2eDataType.get(ctx.name.getText());

    if (ctx.isPrimitive != null) {
      final EAnnotation primitiveAnnotation =
          createEAnnotation(Qualification.PRIMITIVE.getAnnotationSource());
      // DEFAULT NULL
      eDataType.getEAnnotations().add(primitiveAnnotation);
    }

    final String name = ctx.name.getText();
    eDataType.setName(name);

    // TODO OWNED SIGNATURE = TEMPLATE SIGNATURE

    if (ctx.instanceClassName != null) {
      final String instanceClassName = ctx.instanceClassName.getText();
      eDataType.setInstanceClassName(instanceClassName);
    }

    final boolean isSerializable = ctx.isSerializable != null
        && ctx.isSerializable.equals(Qualification.SERIALIZABLE.toString()) ? true : false;
    // TODO DEFAULT FALSE, ANCAK ECORE DA TRUE, TARTIS!.
    eDataType.setSerializable(isSerializable);

    ctx.ownedAnnotations.forEach(oa -> {
      final EAnnotation eAnnotation = visitEAnnotation(oa);
      eDataType.getEAnnotations().add(eAnnotation);
    });

    ctx.ownedConstraints.forEach(oc -> {
      final EAnnotation invariantAnnotation = visitInvariant(oc);
      eDataType.getEAnnotations().add(invariantAnnotation);
    });

    return eDataType;
  }

  @Override
  public EDataType visitEPrimitiveType(final EPrimitiveTypeContext ctx) {
    switch (ctx.getText()) {
      case "Boolean": // EBoolean
        return EcorePackage.eINSTANCE.getEBoolean();
      case "Integer": // EBigInteger
        return EcorePackage.eINSTANCE.getEInt();
      case "String": // EString
        return EcorePackage.eINSTANCE.getEString();
      case "Real": // EBigDecimal
        return EcorePackage.eINSTANCE.getEBigDecimal();
      case "UnlimitedNatural": // EBigInteger
        return EcorePackage.eINSTANCE.getEBigInteger();
      default:
        return null;
    }
  }

  @Override
  public EEnum visitEEnum(final EEnumContext ctx) {
    return createEEnum(ctx);
  }

  /**
   * @param ctx
   * @return
   */
  private EEnum createEEnum(final EEnumContext ctx) {
    final EEnum eEnum = CS2ASMapping.name2eEnum.get(ctx.name.getText());

    if (ctx.visibility != null) {
      final EAnnotation visibilityAnnotation = createVisibilityAnnotation(ctx.visibility.getText());
      eEnum.getEAnnotations().add(visibilityAnnotation);
    } // DEFAULT NULL

    final String name = ctx.name.getText();
    eEnum.setName(name);

    // TODO OWNED SIGNATURE = TEMPLATE SIGNATURE

    if (ctx.instanceClassName != null) {
      final String instanceClassName = ctx.instanceClassName.getText();
      eEnum.setInstanceClassName(instanceClassName);
    }

    final boolean isSerializable = ctx.isSerializable != null
        && ctx.isSerializable.equals(Qualification.SERIALIZABLE.toString()) ? true : false;
    // TODO DEFAULT FALSE, ANCAK ECORE DA TRUE, TARTIS!.
    eEnum.setSerializable(isSerializable);

    ctx.ownedAnnotations.forEach(oa -> {
      final EAnnotation eAnnotation = visitEAnnotation(oa);
      eEnum.getEAnnotations().add(eAnnotation);
    });

    ctx.ownedLiteral.forEach(l -> {
      final EEnumLiteral eEnumLiteral = visitEEnumLiteral(l);
      eEnum.getELiterals().add(eEnumLiteral);
    });

    ctx.ownedConstraint.forEach(oc -> {
      final EAnnotation invariantAnnotation = visitInvariant(oc);
      eEnum.getEAnnotations().add(invariantAnnotation);
    });

    return eEnum;
  }

  @Override
  public EEnumLiteral visitEEnumLiteral(final EEnumLiteralContext ctx) {
    return createEEnumLiteral(ctx);
  }

  /**
   * @param ctx
   * @return
   */
  private EEnumLiteral createEEnumLiteral(final EEnumLiteralContext ctx) {
    final EEnumLiteral eEnumLiteral = CS2ASMapping.factory.createEEnumLiteral();

    final String name = ctx.name.getText();
    eEnumLiteral.setName(name);

    if (ctx.value != null) {
      final int value = Integer.parseInt(ctx.value.getText());
      eEnumLiteral.setValue(value);
    }

    ctx.ownedAnnotations.forEach(oa -> {
      final EAnnotation eAnnotation = visitEAnnotation(oa);
      eEnumLiteral.getEAnnotations().add(eAnnotation);
    });

    return eEnumLiteral;
  }

  @Override
  public EAnnotation visitEAnnotation(final EAnnotationContext ctx) {
    final String source = ctx.name.getText();
    final EAnnotation eAnnotation = createEAnnotation(source);

    ctx.ownedDetails.forEach(od -> {
      final String key = od.name.getText();
      final String value = od.value.getText();
      eAnnotation.getDetails().put(key, value);
    });

    ctx.ownedAnnotations.forEach(oa -> {
      final EAnnotation ownedAnnoation = visitEAnnotation(oa);
      eAnnotation.getEAnnotations().add(ownedAnnoation);
    });

    ctx.ownedContents.forEach(oc -> {
      final EModelElement eModelElement = visitEModelElement(oc);
      eAnnotation.getContents().add(eModelElement);
    });

    ctx.ownedReferences.forEach(or -> {
      final EObject eModelElementRef = visitEModelElementRef(or);
      eAnnotation.getReferences().add(eModelElementRef);
    });

    return eAnnotation;
  }

  private EAnnotation createEAnnotation(final String source) {
    final EAnnotation eAnnotation = CS2ASMapping.factory.createEAnnotation();

    eAnnotation.setSource(source);

    return eAnnotation;
  }

  @Override
  public EModelElement visitEModelElement(final EModelElementContext ctx) {
    return (EModelElement) super.visitEModelElement(ctx);
  }

  @Override
  public ENamedElement visitENamedElement(final ENamedElementContext ctx) {
    return (ENamedElement) super.visitENamedElement(ctx);
  }

  @Override
  public ETypedElement visitETypedElement(final ETypedElementContext ctx) {
    return (ETypedElement) super.visitETypedElement(ctx);
  }

  @Override
  public EObject visitEModelElementRef(final EModelElementRefContext ctx) {
    return visitQualifiedName(ctx.ownedPathName);
  }

  @Override
  public EAnnotation visitBody(final BodyContext ctx) {
    final String source = AnnotationSources.BODY;
    final EAnnotation eAnnotation = createEAnnotation(source);

    if (ctx.name != null) {
      final String name = ctx.name.getText();
      eAnnotation.getDetails().put(Qualification.NAME.toString(), name);
    }

    if (ctx.ownedExpression != null) {
      final String expression = visitExpression(ctx.ownedExpression);
      eAnnotation.getDetails().put(Qualification.EXPRESSION.toString(), expression);
    }

    return eAnnotation;
  }

  @Override
  public EAnnotation visitInvariant(final InvariantContext ctx) {
    final String source = AnnotationSources.INVARIANT;
    final EAnnotation eAnnotation = createEAnnotation(source);

    if (ctx.name != null) {
      final String name = ctx.name.getText();
      eAnnotation.getDetails().put(Qualification.NAME.toString(), name);
    }

    final Boolean isCallable = ctx.isCallable != null ? true : false;
    eAnnotation.getDetails().put(Qualification.CALLABLE.toString(), isCallable.toString());

    if (ctx.message != null) {
      final String message = ctx.message.getText();
      eAnnotation.getDetails().put(Qualification.MESSAGE.toString(), message);
    }

    if (ctx.ownedSpecification != null) {
      final String formula = visitFormula(ctx.ownedSpecification);
      eAnnotation.getDetails().put(Qualification.FORMULA.toString(), formula);
    }

    return eAnnotation;
  }

  @Override
  public EAnnotation visitPrecondition(final PreconditionContext ctx) {
    final String source = AnnotationSources.PRECONDITION;
    final EAnnotation eAnnotation = createEAnnotation(source);

    if (ctx.name != null) {
      final String name = ctx.name.getText();
      eAnnotation.getDetails().put(Qualification.NAME.toString(), name);
    }

    if (ctx.message != null) {
      final String message = ctx.message.getText();
      eAnnotation.getDetails().put(Qualification.MESSAGE.toString(), message);
    }

    if (ctx.ownedSpecification != null) {
      final String formula = visitFormula(ctx.ownedSpecification);
      eAnnotation.getDetails().put(Qualification.FORMULA.toString(), formula);
    }

    return eAnnotation;
  }

  @Override
  public EAnnotation visitPostcondition(final PostconditionContext ctx) {
    final String source = AnnotationSources.POSTCONDITION;
    final EAnnotation eAnnotation = createEAnnotation(source);

    if (ctx.name != null) {
      final String name = ctx.name.getText();
      eAnnotation.getDetails().put(Qualification.NAME.toString(), name);
    }

    if (ctx.message != null) {
      final String message = ctx.message.getText();
      eAnnotation.getDetails().put(Qualification.MESSAGE.toString(), message);
    }

    if (ctx.ownedSpecification != null) {
      final String formula = visitFormula(ctx.ownedSpecification);
      eAnnotation.getDetails().put(Qualification.FORMULA.toString(), formula);
    }

    return eAnnotation;
  }

  /**
   * @param visibilityText
   * @param ctx
   * @return
   */
  private EAnnotation createVisibilityAnnotation(final String visibilityText) {
    final EAnnotation eAnnoation =
        createEAnnotation(Qualification.VISIBILITY.getAnnotationSource());

    eAnnoation.getDetails().put(Qualification.VISIBILITY.toString(), visibilityText);

    return eAnnoation;
  }

  @Override
  public String visitExpression(final ExpressionContext ctx) {
    // TODO will be implemented when expressions are defined
    return ctx.getText();
  }

  @Override
  public String visitFormula(final FormulaContext ctx) {
    // TODO will be implemented when formulas are defined
    return ctx.getText();
  }

  @Override
  public EObject visitQualifiedName(final QualifiedNameContext ctx) {
    // TODO implement truly
    final String classifierName;
    if (ctx.lastPart != null) {
      classifierName = ctx.lastPart.getText();
    } else if (ctx.midParts != null && ctx.midParts.size() != 0) {
      classifierName = ctx.midParts.get(ctx.midParts.size() - 1).getText();
    } else {
      classifierName = ctx.firstPart.get(ctx.firstPart.size() - 1).getText();
    }
    if (CS2ASMapping.name2eClass.containsKey(classifierName)) {
      return CS2ASMapping.name2eClass.get(classifierName);
    } else if (CS2ASMapping.name2eDataType.containsKey(classifierName)) {
      return CS2ASMapping.name2eDataType.get(classifierName);
    } else if (CS2ASMapping.name2eEnum.containsKey(classifierName)) {
      return CS2ASMapping.name2eEnum.get(classifierName);
    }
    return null;
  }

  public static void saveResource(final EObject root, final String savePath) {
    final ResourceSet metaResourceSet = new ResourceSetImpl();

    /*
     * Register XML Factory implementation to handle .ecore files
     */
    metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore",
        new XMLResourceFactoryImpl());

    /*
     * Create empty resource with the given URI
     */
    final Resource metaResource = metaResourceSet.createResource(URI.createURI(savePath));

    /*
     * Add bookStoreEPackage to contents list of the resource
     */
    metaResource.getContents().add(root);

    try {
      /*
       * Save the resource
       */
      metaResource.save(null);
    } catch (final IOException e) {
      e.printStackTrace();
    }
  }
}
