// Generated from /home/ferhat/IdeaProjects/eu.modelwriter.core.alloyinecore/src/main/java/eu/modelwriter/core/alloyinecore/recognizer/AlloyInEcore.g4 by ANTLR 4.6
package eu.modelwriter.core.alloyinecore.recognizer;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.ETypeParameter;

import eu.modelwriter.core.alloyinecore.structure.Document;
import eu.modelwriter.core.alloyinecore.structure.Element;
import eu.modelwriter.core.alloyinecore.structure.ModelElement;
import eu.modelwriter.core.alloyinecore.structure.Annotation;
import eu.modelwriter.core.alloyinecore.structure.AnnotationDetail;
import eu.modelwriter.core.alloyinecore.structure.AnnotationReference;
import eu.modelwriter.core.alloyinecore.structure.NamedElement;
import eu.modelwriter.core.alloyinecore.structure.Module;
import eu.modelwriter.core.alloyinecore.structure.Import;
import eu.modelwriter.core.alloyinecore.structure.EcoreImport;
import eu.modelwriter.core.alloyinecore.structure.Package;
import eu.modelwriter.core.alloyinecore.structure.Classifier;
import eu.modelwriter.core.alloyinecore.structure.Class;
import eu.modelwriter.core.alloyinecore.structure.Interface;
import eu.modelwriter.core.alloyinecore.structure.DataType;
import eu.modelwriter.core.alloyinecore.structure.Enum;
import eu.modelwriter.core.alloyinecore.structure.EnumLiteral;
import eu.modelwriter.core.alloyinecore.structure.StructuralFeature;
import eu.modelwriter.core.alloyinecore.structure.TypedElement;
import eu.modelwriter.core.alloyinecore.structure.Multiplicity;
import eu.modelwriter.core.alloyinecore.structure.Reference;
import eu.modelwriter.core.alloyinecore.structure.Attribute;
import eu.modelwriter.core.alloyinecore.structure.Operation;
import eu.modelwriter.core.alloyinecore.structure.Parameter;
import eu.modelwriter.core.alloyinecore.structure.GenericException;
import eu.modelwriter.core.alloyinecore.structure.TypeParameter;
import eu.modelwriter.core.alloyinecore.structure.GenericType;
import eu.modelwriter.core.alloyinecore.structure.GenericTypeArgument;
import eu.modelwriter.core.alloyinecore.structure.GenericElementType;
import eu.modelwriter.core.alloyinecore.structure.GenericSuperType;
import eu.modelwriter.core.alloyinecore.structure.GenericWildcard;
import eu.modelwriter.core.alloyinecore.structure.PrimitiveType;
import eu.modelwriter.core.alloyinecore.structure.Invariant;
import eu.modelwriter.core.alloyinecore.structure.Derivation;
import eu.modelwriter.core.alloyinecore.structure.Body;
import eu.modelwriter.core.alloyinecore.structure.PostCondition;
import eu.modelwriter.core.alloyinecore.structure.PreCondition;
import eu.modelwriter.core.alloyinecore.structure.Initial;

import eu.modelwriter.core.alloyinecore.structure.Formula;
import eu.modelwriter.core.alloyinecore.structure.Expression;
import eu.modelwriter.core.alloyinecore.structure.IntExpression;
import eu.modelwriter.core.alloyinecore.structure.QuantifierDeclaration;
import eu.modelwriter.core.alloyinecore.structure.LetDeclaration;
import eu.modelwriter.core.alloyinecore.structure.ComprehensionDeclaration;
import eu.modelwriter.core.alloyinecore.structure.Variable;

import eu.modelwriter.core.alloyinecore.Internal.ModelIO;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.stream.Collectors;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import java.io.IOException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlloyInEcoreParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, INT=136, IDENTIFIER=137, 
		DOUBLE_QUOTED_STRING=138, SINGLE_QUOTED_STRING=139, ML_SINGLE_QUOTED_STRING=140, 
		MULTILINE_COMMENT=141, SINGLELINE_COMMENT=142, WS=143;
	public static final int
		RULE_problem = 0, RULE_options = 1, RULE_option = 2, RULE_universe = 3, 
		RULE_relations = 4, RULE_relation = 5, RULE_tupleSet = 6, RULE_tuple = 7, 
		RULE_module = 8, RULE_packageImport = 9, RULE_ePackage = 10, RULE_eClassifier = 11, 
		RULE_eClass = 12, RULE_eStructuralFeature = 13, RULE_eAttribute = 14, 
		RULE_eReference = 15, RULE_eOperation = 16, RULE_eGenericException = 17, 
		RULE_eGenericSuperType = 18, RULE_eParameter = 19, RULE_eMultiplicity = 20, 
		RULE_eDataType = 21, RULE_eEnum = 22, RULE_eEnumLiteral = 23, RULE_eAnnotation = 24, 
		RULE_eDetail = 25, RULE_eModelElement = 26, RULE_eNamedElement = 27, RULE_eTypedElement = 28, 
		RULE_eModelElementRef = 29, RULE_templateSignature = 30, RULE_eTypeParameter = 31, 
		RULE_eGenericTypeArgument = 32, RULE_eGenericType = 33, RULE_eGenericElementType = 34, 
		RULE_eGenericWildcard = 35, RULE_pathName = 36, RULE_segment = 37, RULE_ePrimitiveType = 38, 
		RULE_body = 39, RULE_invariant = 40, RULE_precondition = 41, RULE_postcondition = 42, 
		RULE_initial = 43, RULE_derivation = 44, RULE_visibilityKind = 45, RULE_atom = 46, 
		RULE_arity = 47, RULE_formula = 48, RULE_expression = 49, RULE_intExpression = 50, 
		RULE_quantifierDeclarations = 51, RULE_quantifierDeclaration = 52, RULE_letDeclarations = 53, 
		RULE_letDeclaration = 54, RULE_comprehensionDeclarations = 55, RULE_comprehensionDeclaration = 56, 
		RULE_relationId = 57, RULE_variable = 58, RULE_integer = 59, RULE_mult = 60, 
		RULE_unrestrictedName = 61, RULE_identifier = 62, RULE_upper = 63, RULE_lower = 64, 
		RULE_signed = 65;
	public static final String[] ruleNames = {
		"problem", "options", "option", "universe", "relations", "relation", "tupleSet", 
		"tuple", "module", "packageImport", "ePackage", "eClassifier", "eClass", 
		"eStructuralFeature", "eAttribute", "eReference", "eOperation", "eGenericException", 
		"eGenericSuperType", "eParameter", "eMultiplicity", "eDataType", "eEnum", 
		"eEnumLiteral", "eAnnotation", "eDetail", "eModelElement", "eNamedElement", 
		"eTypedElement", "eModelElementRef", "templateSignature", "eTypeParameter", 
		"eGenericTypeArgument", "eGenericType", "eGenericElementType", "eGenericWildcard", 
		"pathName", "segment", "ePrimitiveType", "body", "invariant", "precondition", 
		"postcondition", "initial", "derivation", "visibilityKind", "atom", "arity", 
		"formula", "expression", "intExpression", "quantifierDeclarations", "quantifierDeclaration", 
		"letDeclarations", "letDeclaration", "comprehensionDeclarations", "comprehensionDeclaration", 
		"relationId", "variable", "integer", "mult", "unrestrictedName", "identifier", 
		"upper", "lower", "signed"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'options'", "'{'", "','", "'}'", "'symmetry_breaking'", "':'", 
		"'bit_width'", "'skolem_depth'", "'sharing'", "'universe'", "'['", "']'", 
		"'relations'", "'..'", "'('", "')'", "'module'", "';'", "'import'", "'package'", 
		"'='", "'abstract'", "'class'", "'interface'", "'extends'", "'static'", 
		"'model'", "'ghost'", "'transient'", "'volatile'", "'readonly'", "'attribute'", 
		"'derived'", "'id'", "'ordered'", "'!ordered'", "'unique'", "'!unique'", 
		"'unsettable'", "'!unsettable'", "'property'", "'#'", "'composes'", "'resolve'", 
		"'!resolve'", "'key'", "'operation'", "'throws'", "'*'", "'+'", "'?'", 
		"'|?'", "'|1'", "'primitive'", "'datatype'", "'serializable'", "'!serializable'", 
		"'enum'", "'literal'", "'annotation'", "'reference'", "'<'", "'>'", "'&'", 
		"'super'", "'::'", "'@'", "'.'", "'Boolean'", "'Integer'", "'String'", 
		"'Real'", "'UnlimitedNatural'", "'body'", "'callable'", "'invariant'", 
		"'precondition'", "'requires'", "'postcondition'", "'ensures'", "'initial'", 
		"'derivation'", "'public'", "'protected'", "'private'", "'no'", "'lone'", 
		"'one'", "'some'", "'!'", "'not'", "'in'", "'<='", "'>='", "'sum'", "'|'", 
		"'acyclic'", "'function'", "'->'", "'ord'", "'&&'", "'and'", "'||'", "'or'", 
		"'=>'", "'if'", "'implies'", "'<=>'", "'iff'", "'all'", "'let'", "'true'", 
		"'false'", "'~'", "'^'", "'-'", "'++'", "'then'", "'else'", "'iden'", 
		"'none'", "'univ'", "'ints'", "'plus'", "'minus'", "'mul'", "'/'", "'div'", 
		"'%'", "'modulo'", "'disj'", "'set'", "'definition'", "'ensure'", "'require'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "INT", "IDENTIFIER", "DOUBLE_QUOTED_STRING", "SINGLE_QUOTED_STRING", 
		"ML_SINGLE_QUOTED_STRING", "MULTILINE_COMMENT", "SINGLELINE_COMMENT", 
		"WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AlloyInEcore.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	public java.util.List<String> atoms = new java.util.ArrayList<String>();
	public java.util.List<kodkod.ast.Formula> formulas = new java.util.ArrayList<kodkod.ast.Formula>();
	public java.util.Map<String, kodkod.ast.Relation> relations = new java.util.HashMap<String, kodkod.ast.Relation>();
	public kodkod.instance.Universe universe = null;
	public kodkod.instance.Bounds bounds = null;

	private String getLocation() { return "["+ getCurrentToken().getLine()+ ","+ getCurrentToken().getCharPositionInLine()+ "]";}
	private String context = null;

	private void printUniverse() {
	    //System.out.println(universe);
	}
	private void printBounds() {
	    //System.out.println(bounds);
	}

	//ECORE BEGINS

	public void saveResource(EPackage root){
	    ResourceSet metaResourceSet = new ResourceSetImpl();
	    metaResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new XMLResourceFactoryImpl());
	    Resource metaResource = metaResourceSet.createResource(URI.createURI(this.pathName + this.fileName + ".ecore"));
	    metaResource.getContents().add(root);
	    try {
	        metaResource.save(null);
	    } catch (java.io.IOException e) {
	        e.printStackTrace();
	    }
	    module.printTree();
	}

	private String getContextText(ParserRuleContext ctx){
	    return getTokenStream().getTokenSource().getInputStream().toString().substring(ctx.start.getStartIndex(),ctx.stop.getStopIndex());
	}

	public AlloyInEcoreParser(TokenStream input, String filename, String path){
	    this(input);
	    this.fileName = filename;
	    this.pathName = path;
	}

	private String fileName;
	private String pathName;

	public Module module;

	Document document = new Document(this);

	private EcoreFactory eFactory = EcoreFactory.eINSTANCE;

	private void signalParsingCompletion() {
	    document.checkConstraints();
	}

	private void createEAnnotation(EModelElement owner, final String source) {
	    if (owner.getEAnnotation(source) != null)
	        return;
	    final EAnnotation eAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
	    eAnnotation.setSource(source);
	    owner.getEAnnotations().add(eAnnotation);
	}

	private java.util.Stack<Element> owners = new java.util.Stack<>();


	public AlloyInEcoreParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProblemContext extends ParserRuleContext {
		public FormulaContext formula;
		public List<FormulaContext> formulas = new ArrayList<FormulaContext>();
		public UniverseContext universe() {
			return getRuleContext(UniverseContext.class,0);
		}
		public RelationsContext relations() {
			return getRuleContext(RelationsContext.class,0);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ProblemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterProblem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitProblem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitProblem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProblemContext problem() throws RecognitionException {
		ProblemContext _localctx = new ProblemContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_problem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(132);
				options();
				}
			}

			setState(135);
			universe();
			printUniverse();
			setState(137);
			relations();
			printBounds();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
				{
				{
				setState(139);
				((ProblemContext)_localctx).formula = formula(0);
				((ProblemContext)_localctx).formulas.add(((ProblemContext)_localctx).formula);
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsContext extends ParserRuleContext {
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public OptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionsContext options() throws RecognitionException {
		OptionsContext _localctx = new OptionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__0);
			setState(146);
			match(T__1);
			setState(147);
			option();
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(148);
				match(T__2);
				setState(149);
				option();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionContext extends ParserRuleContext {
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
	 
		public OptionContext() { }
		public void copyFrom(OptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SymmetryBreakingContext extends OptionContext {
		public Token key;
		public IntegerContext value;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SymmetryBreakingContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSymmetryBreaking(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSymmetryBreaking(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSymmetryBreaking(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitWidthContext extends OptionContext {
		public Token key;
		public IntegerContext value;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public BitWidthContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterBitWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitBitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitBitWidth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkolemDepthContext extends OptionContext {
		public Token key;
		public IntegerContext value;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SkolemDepthContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSkolemDepth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSkolemDepth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSkolemDepth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SharingContext extends OptionContext {
		public Token key;
		public IntegerContext value;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SharingContext(OptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSharing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSharing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSharing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_option);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new SymmetryBreakingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((SymmetryBreakingContext)_localctx).key = match(T__4);
				setState(158);
				match(T__5);
				setState(159);
				((SymmetryBreakingContext)_localctx).value = integer();
				}
				break;
			case T__6:
				_localctx = new BitWidthContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				((BitWidthContext)_localctx).key = match(T__6);
				setState(161);
				match(T__5);
				setState(162);
				((BitWidthContext)_localctx).value = integer();
				}
				break;
			case T__7:
				_localctx = new SkolemDepthContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				((SkolemDepthContext)_localctx).key = match(T__7);
				setState(164);
				match(T__5);
				setState(165);
				((SkolemDepthContext)_localctx).value = integer();
				}
				break;
			case T__8:
				_localctx = new SharingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				((SharingContext)_localctx).key = match(T__8);
				setState(167);
				match(T__5);
				setState(168);
				((SharingContext)_localctx).value = integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UniverseContext extends ParserRuleContext {
		public AtomContext atom;
		public List<AtomContext> atoms = new ArrayList<AtomContext>();
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public UniverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterUniverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitUniverse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitUniverse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniverseContext universe() throws RecognitionException {
		UniverseContext _localctx = new UniverseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_universe);
		context="universe";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__9);
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(172);
				match(T__1);
				{
				setState(173);
				((UniverseContext)_localctx).atom = atom();
				((UniverseContext)_localctx).atoms.add(((UniverseContext)_localctx).atom);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(174);
					match(T__2);
					setState(175);
					((UniverseContext)_localctx).atom = atom();
					((UniverseContext)_localctx).atoms.add(((UniverseContext)_localctx).atom);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(181);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				{
				setState(183);
				match(T__10);
				{
				setState(184);
				((UniverseContext)_localctx).atom = atom();
				((UniverseContext)_localctx).atoms.add(((UniverseContext)_localctx).atom);
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(185);
					match(T__2);
					setState(186);
					((UniverseContext)_localctx).atom = atom();
					((UniverseContext)_localctx).atoms.add(((UniverseContext)_localctx).atom);
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(192);
				match(T__11);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			    //System.out.println("universe:");
			    for (AtomContext atom : ((UniverseContext)_localctx).atoms) {
			        String s = atom.getText();
			        //System.out.println(s);
			        if (atoms.contains(s)) {
			            notifyErrorListeners(atom.getStart(),"duplicated atom found: '"+ s + "'", (RecognitionException)null);
			        }
			        else {atoms.add(s);}
			    }
			    this.universe = new kodkod.instance.Universe(this.atoms);
			    this.bounds = new kodkod.instance.Bounds(this.universe);
			    context = null;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationsContext extends ParserRuleContext {
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public RelationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterRelations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitRelations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitRelations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationsContext relations() throws RecognitionException {
		RelationsContext _localctx = new RelationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_relations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(T__12);
			setState(199);
			match(T__1);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(200);
				relation();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(T__3);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public IdentifierContext name;
		public IdentifierContext identifier;
		public ArityContext arity;
		public TupleSetContext lowerBound;
		public TupleSetContext upperBound;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArityContext arity() {
			return getRuleContext(ArityContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TupleSetContext> tupleSet() {
			return getRuleContexts(TupleSetContext.class);
		}
		public TupleSetContext tupleSet(int i) {
			return getRuleContext(TupleSetContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_relation);
		context="relations";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(209);
			((RelationContext)_localctx).name = ((RelationContext)_localctx).identifier = identifier();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(210);
				((RelationContext)_localctx).arity = arity();
				}
			}

			setState(213);
			match(T__5);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
				{
				setState(214);
				expression(0);
				}
			}

			setState(217);
			match(T__10);
			{
			setState(218);
			((RelationContext)_localctx).lowerBound = tupleSet();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(219);
				match(T__2);
				setState(220);
				((RelationContext)_localctx).upperBound = tupleSet();
				}
			}

			}
			setState(223);
			match(T__11);
			}

			    String name = (((RelationContext)_localctx).identifier!=null?_input.getText(((RelationContext)_localctx).identifier.start,((RelationContext)_localctx).identifier.stop):null);
			    //System.out.println("relation " + name);
			    if (relations.containsKey(name)) {
			        notifyErrorListeners(((RelationContext)_localctx).name.getStart(), "duplicated relation found: '"+ name + "'", (RecognitionException)null);
			    }
			    kodkod.ast.Relation relation = null;
			    int arity = 0;
			    if ((((RelationContext)_localctx).arity!=null?_input.getText(((RelationContext)_localctx).arity.start,((RelationContext)_localctx).arity.stop):null) != null && !(((RelationContext)_localctx).arity!=null?_input.getText(((RelationContext)_localctx).arity.start,((RelationContext)_localctx).arity.stop):null).isEmpty()) {arity = Integer.parseInt((((RelationContext)_localctx).arity!=null?_input.getText(((RelationContext)_localctx).arity.start,((RelationContext)_localctx).arity.stop):null));}

			    kodkod.instance.TupleSet lowerBound = null;
			    java.util.List<kodkod.instance.Tuple> tuplesInLowerBound = new java.util.ArrayList<kodkod.instance.Tuple>();
			    if (((RelationContext)_localctx).lowerBound != null && !((RelationContext)_localctx).lowerBound.tuples.isEmpty()){
			        if (arity == 0) {arity = ((RelationContext)_localctx).lowerBound.tuples.get(0).atoms.size();}
			        for (TupleContext tuple : ((RelationContext)_localctx).lowerBound.tuples) {
			            java.util.List<String> atomsInTuple = new java.util.ArrayList<String>();
			            for (AtomContext atom : tuple.atoms) {
			                if (atom.getText() == null || atom.getText().isEmpty()) continue;
			                if (this.atoms.contains(atom.getText())) atomsInTuple.add(atom.getText());
			            }
			            if (!atomsInTuple.isEmpty() && atomsInTuple.size() == arity) {
			                tuplesInLowerBound.add(this.universe.factory().tuple(atomsInTuple));
			            }
			        }
			        lowerBound = this.universe.factory().setOf(tuplesInLowerBound);
			        //System.out.println("lb: " +lowerBound);
			    }

			    kodkod.instance.TupleSet upperBound = null;
			    java.util.List<kodkod.instance.Tuple> tuplesInUpperBound = new java.util.ArrayList<kodkod.instance.Tuple>();
			    if (((RelationContext)_localctx).upperBound != null && !((RelationContext)_localctx).upperBound.tuples.isEmpty()){
			        if (lowerBound == null && arity == 0) {arity = ((RelationContext)_localctx).upperBound.tuples.get(0).atoms.size();}
			        for (TupleContext tuple : ((RelationContext)_localctx).upperBound.tuples) {
			            java.util.List<String> atomsInTuple = new java.util.ArrayList<String>();
			            for (AtomContext atom : tuple.atoms) {
			                if (atom.getText() == null || atom.getText().isEmpty()) continue;
			                if (this.atoms.contains(atom.getText())) atomsInTuple.add(atom.getText());
			            }
			            if (!atomsInTuple.isEmpty() && atomsInTuple.size() == arity) {
			                tuplesInUpperBound.add(this.universe.factory().tuple(atomsInTuple));
			            }
			        }
			        upperBound = this.universe.factory().setOf(tuplesInUpperBound);
			        //System.out.println("up: " +upperBound);
			    }

			    if (lowerBound == null && upperBound == null && arity == 0) {arity = 1;}

			    if (lowerBound == null) {lowerBound = this.universe.factory().noneOf(arity);}

			    //System.out.println(arity);
			    if (arity == 0) {
			        notifyErrorListeners(((RelationContext)_localctx).arity.getStart(), "0 arity is detected on relation: '"+ name + "'", (RecognitionException)null);
			    } else if (arity > 0) {
			        relation = kodkod.ast.Relation.nary(name, arity);
			    }

			    if (upperBound == null) {this.bounds.boundExactly(relation, lowerBound);}
			    else {this.bounds.bound(relation, lowerBound, upperBound);}
			    this.relations.put(name, relation);

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleSetContext extends ParserRuleContext {
		public TupleContext tuple;
		public List<TupleContext> tuples = new ArrayList<TupleContext>();
		public TupleContext left;
		public Token range;
		public TupleContext right;
		public List<TupleContext> tuple() {
			return getRuleContexts(TupleContext.class);
		}
		public TupleContext tuple(int i) {
			return getRuleContext(TupleContext.class,i);
		}
		public TupleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTupleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTupleSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTupleSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleSetContext tupleSet() throws RecognitionException {
		TupleSetContext _localctx = new TupleSetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tupleSet);
		int _la;
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				match(T__1);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10 || _la==T__14) {
					{
					setState(228);
					((TupleSetContext)_localctx).tuple = tuple();
					((TupleSetContext)_localctx).tuples.add(((TupleSetContext)_localctx).tuple);
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(229);
						match(T__2);
						setState(230);
						((TupleSetContext)_localctx).tuple = tuple();
						((TupleSetContext)_localctx).tuples.add(((TupleSetContext)_localctx).tuple);
						}
						}
						setState(235);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(238);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(T__10);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10 || _la==T__14) {
					{
					setState(240);
					((TupleSetContext)_localctx).tuple = tuple();
					((TupleSetContext)_localctx).tuples.add(((TupleSetContext)_localctx).tuple);
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(241);
						match(T__2);
						setState(242);
						((TupleSetContext)_localctx).tuple = tuple();
						((TupleSetContext)_localctx).tuples.add(((TupleSetContext)_localctx).tuple);
						}
						}
						setState(247);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(250);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(T__1);
				setState(252);
				((TupleSetContext)_localctx).left = tuple();
				setState(253);
				((TupleSetContext)_localctx).range = match(T__13);
				setState(254);
				((TupleSetContext)_localctx).right = tuple();
				setState(255);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(257);
				match(T__10);
				setState(258);
				((TupleSetContext)_localctx).left = tuple();
				setState(259);
				((TupleSetContext)_localctx).range = match(T__13);
				setState(260);
				((TupleSetContext)_localctx).right = tuple();
				setState(261);
				match(T__11);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleContext extends ParserRuleContext {
		public AtomContext atom;
		public List<AtomContext> atoms = new ArrayList<AtomContext>();
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public TupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTuple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TupleContext tuple() throws RecognitionException {
		TupleContext _localctx = new TupleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tuple);
		int _la;
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(T__14);
				setState(266);
				((TupleContext)_localctx).atom = atom();
				((TupleContext)_localctx).atoms.add(((TupleContext)_localctx).atom);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(267);
					match(T__2);
					setState(268);
					((TupleContext)_localctx).atom = atom();
					((TupleContext)_localctx).atoms.add(((TupleContext)_localctx).atom);
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
				match(T__15);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__10);
				setState(277);
				((TupleContext)_localctx).atom = atom();
				((TupleContext)_localctx).atoms.add(((TupleContext)_localctx).atom);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(278);
					match(T__2);
					setState(279);
					((TupleContext)_localctx).atom = atom();
					((TupleContext)_localctx).atoms.add(((TupleContext)_localctx).atom);
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(T__11);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModuleContext extends ParserRuleContext {
		public EAnnotation element;
		public IdentifierContext name;
		public PackageImportContext packageImport;
		public List<PackageImportContext> ownedPackageImport = new ArrayList<PackageImportContext>();
		public EPackageContext ownedPackage;
		public EPackageContext ePackage;
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public EPackageContext ePackage() {
			return getRuleContext(EPackageContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PackageImportContext> packageImport() {
			return getRuleContexts(PackageImportContext.class);
		}
		public PackageImportContext packageImport(int i) {
			return getRuleContext(PackageImportContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_module);
		module = new Module(_localctx); ((ModuleContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.MODULE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(289);
				options();
				}
			}


			setState(297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(293);
				match(T__16);
				setState(294);
				((ModuleContext)_localctx).name = identifier();
				setState(295);
				match(T__17);
				}
			}

			_localctx.element.getDetails().put("name", (((ModuleContext)_localctx).name!=null?_input.getText(((ModuleContext)_localctx).name.start,((ModuleContext)_localctx).name.stop):null));
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__18) {
				{
				{
				setState(300);
				((ModuleContext)_localctx).packageImport = packageImport(module);
				((ModuleContext)_localctx).ownedPackageImport.add(((ModuleContext)_localctx).packageImport);
				}
				}
				setState(305);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(306);
			((ModuleContext)_localctx).ownedPackage = ((ModuleContext)_localctx).ePackage = ePackage(module);
			((ModuleContext)_localctx).ePackage.element.getEAnnotations().add(_localctx.element);
			}
			for(PackageImportContext ctx: _localctx.ownedPackageImport) {((ModuleContext)_localctx).ePackage.element.getEAnnotations().add(ctx.element);}
			}
			_ctx.stop = _input.LT(-1);
			signalParsingCompletion(); saveResource(((ModuleContext)_localctx).ownedPackage.element);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageImportContext extends ParserRuleContext {
		public Module owner;
		public EAnnotation element;
		public EObject object;
		public IdentifierContext name;
		public Token ownedPathName;
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageImportContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PackageImportContext(ParserRuleContext parent, int invokingState, Module owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_packageImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterPackageImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitPackageImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitPackageImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageImportContext packageImport(Module owner) throws RecognitionException {
		PackageImportContext _localctx = new PackageImportContext(_ctx, getState(), owner);
		enterRule(_localctx, 18, RULE_packageImport);
		((PackageImportContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.IMPORT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(311);
			match(T__18);
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(312);
				((PackageImportContext)_localctx).name = identifier();
				setState(313);
				match(T__5);
				}
			}

			setState(317);
			((PackageImportContext)_localctx).ownedPathName = match(SINGLE_QUOTED_STRING);
			setState(318);
			match(T__17);
			_localctx.element.getDetails().put((((PackageImportContext)_localctx).name!=null?_input.getText(((PackageImportContext)_localctx).name.start,((PackageImportContext)_localctx).name.stop):null), ((PackageImportContext)_localctx).ownedPathName != null ? ((PackageImportContext)_localctx).ownedPathName.getText().replace("'", "") : null);
			}
			_ctx.stop = _input.LT(-1);

			if (((PackageImportContext)_localctx).ownedPathName != null) {
			    if (((PackageImportContext)_localctx).ownedPathName.getText().replace("'", "").equals(EcorePackage.eNS_URI)) {
			        ((PackageImportContext)_localctx).object =  EcorePackage.eINSTANCE;
			        _localctx.owner.addOwnedElement(new EcoreImport(_localctx.object, _localctx));
			    } else {
			        try {((PackageImportContext)_localctx).object =  ModelIO.getRootObject(((PackageImportContext)_localctx).ownedPathName.getText().replace("'", ""));}
			        catch (final IOException e) { }
			        if (_localctx.object == null) notifyErrorListeners(((PackageImportContext)_localctx).ownedPathName, "Import could not be resolved!", null);
			        else _localctx.owner.addOwnedElement(new Import(_localctx.object, _localctx));
			    }
			}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EPackageContext extends ParserRuleContext {
		public Element owner;
		public EPackage element;
		public Package current;
		public VisibilityKindContext visibility;
		public UnrestrictedNameContext name;
		public IdentifierContext nsPrefix;
		public Token nsURI;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public EPackageContext ePackage;
		public List<EPackageContext> eSubPackages = new ArrayList<EPackageContext>();
		public EClassifierContext eClassifier;
		public List<EClassifierContext> eClassifiers = new ArrayList<EClassifierContext>();
		public InvariantContext invariant;
		public List<InvariantContext> eConstraints = new ArrayList<InvariantContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<EPackageContext> ePackage() {
			return getRuleContexts(EPackageContext.class);
		}
		public EPackageContext ePackage(int i) {
			return getRuleContext(EPackageContext.class,i);
		}
		public List<EClassifierContext> eClassifier() {
			return getRuleContexts(EClassifierContext.class);
		}
		public EClassifierContext eClassifier(int i) {
			return getRuleContext(EClassifierContext.class,i);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public EPackageContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EPackageContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_ePackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EPackageContext ePackage(Element owner) throws RecognitionException {
		EPackageContext _localctx = new EPackageContext(_ctx, getState(), owner);
		enterRule(_localctx, 20, RULE_ePackage);
		((EPackageContext)_localctx).element =  eFactory.createEPackage();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (T__82 - 83)) | (1L << (T__83 - 83)) | (1L << (T__84 - 83)))) != 0)) {
				{
				setState(321);
				((EPackageContext)_localctx).visibility = visibilityKind();
				}
			}

			if(_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EPackageContext)_localctx).visibility.element);
			setState(325);
			match(T__19);
			setState(326);
			((EPackageContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EPackageContext)_localctx).name!=null?_input.getText(((EPackageContext)_localctx).name.start,((EPackageContext)_localctx).name.stop):null));
			((EPackageContext)_localctx).current =  new Package(_localctx.element, _localctx);
			{
			setState(329);
			match(T__5);
			setState(330);
			((EPackageContext)_localctx).nsPrefix = identifier();
			}
			{
			setState(332);
			match(T__20);
			setState(333);
			((EPackageContext)_localctx).nsURI = match(SINGLE_QUOTED_STRING);
			}
			_localctx.element.setNsPrefix((((EPackageContext)_localctx).nsPrefix!=null?_input.getText(((EPackageContext)_localctx).nsPrefix.start,((EPackageContext)_localctx).nsPrefix.stop):null)); if(((EPackageContext)_localctx).nsURI != null) _localctx.element.setNsURI(((EPackageContext)_localctx).nsURI.getText().replace("'", ""));
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(336);
				match(T__1);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__59))) != 0) || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (T__74 - 75)) | (1L << (T__75 - 75)) | (1L << (T__82 - 75)) | (1L << (T__83 - 75)) | (1L << (T__84 - 75)))) != 0)) {
					{
					setState(349);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(337);
						((EPackageContext)_localctx).eAnnotation = ((EPackageContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EPackageContext)_localctx).ownedAnnotations.add(((EPackageContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EPackageContext)_localctx).eAnnotation.element);
						}
						break;
					case 2:
						{
						setState(340);
						((EPackageContext)_localctx).ePackage = ((EPackageContext)_localctx).ePackage = ePackage(_localctx.current);
						((EPackageContext)_localctx).eSubPackages.add(((EPackageContext)_localctx).ePackage);
						_localctx.element.getESubpackages().add(((EPackageContext)_localctx).ePackage.element);
						}
						break;
					case 3:
						{
						setState(343);
						((EPackageContext)_localctx).eClassifier = ((EPackageContext)_localctx).eClassifier = eClassifier(_localctx.current);
						((EPackageContext)_localctx).eClassifiers.add(((EPackageContext)_localctx).eClassifier);
						if (((EPackageContext)_localctx).eClassifier.element != null) _localctx.element.getEClassifiers().add(((EPackageContext)_localctx).eClassifier.element);
						}
						break;
					case 4:
						{
						setState(346);
						((EPackageContext)_localctx).invariant = ((EPackageContext)_localctx).invariant = invariant(_localctx.current);
						((EPackageContext)_localctx).eConstraints.add(((EPackageContext)_localctx).invariant);
						_localctx.element.getEAnnotations().add(((EPackageContext)_localctx).invariant.element);
						}
						break;
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(354);
				match(T__3);
				}
				}
				break;
			case T__17:
				{
				setState(355);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EClassifierContext extends ParserRuleContext {
		public Element owner;
		public EClassifier element;
		public EClassContext eClass;
		public EDataTypeContext eDataType;
		public EEnumContext eEnum;
		public EClassContext eClass() {
			return getRuleContext(EClassContext.class,0);
		}
		public EDataTypeContext eDataType() {
			return getRuleContext(EDataTypeContext.class,0);
		}
		public EEnumContext eEnum() {
			return getRuleContext(EEnumContext.class,0);
		}
		public EClassifierContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EClassifierContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eClassifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEClassifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEClassifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEClassifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EClassifierContext eClassifier(Element owner) throws RecognitionException {
		EClassifierContext _localctx = new EClassifierContext(_ctx, getState(), owner);
		enterRule(_localctx, 22, RULE_eClassifier);
		try {
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				((EClassifierContext)_localctx).eClass = eClass(_localctx.owner);
				((EClassifierContext)_localctx).element =  ((EClassifierContext)_localctx).eClass.element;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				((EClassifierContext)_localctx).eDataType = eDataType(_localctx.owner);
				((EClassifierContext)_localctx).element =  ((EClassifierContext)_localctx).eDataType.element;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				((EClassifierContext)_localctx).eEnum = eEnum(_localctx.owner);
				((EClassifierContext)_localctx).element =  ((EClassifierContext)_localctx).eEnum.element;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EClassContext extends ParserRuleContext {
		public Element owner;
		public EClass element;
		public Class current;
		public VisibilityKindContext visibility;
		public Token isAbstract;
		public Token isClass;
		public Token isInterface;
		public UnrestrictedNameContext name;
		public TemplateSignatureContext ownedSignature;
		public TemplateSignatureContext templateSignature;
		public EGenericSuperTypeContext eGenericSuperType;
		public List<EGenericSuperTypeContext> eSuperTypes = new ArrayList<EGenericSuperTypeContext>();
		public Token instanceClassName;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public EOperationContext eOperation;
		public List<EOperationContext> eOperations = new ArrayList<EOperationContext>();
		public EStructuralFeatureContext eStructuralFeature;
		public List<EStructuralFeatureContext> eStructuralFeatures = new ArrayList<EStructuralFeatureContext>();
		public InvariantContext invariant;
		public List<InvariantContext> eConstraints = new ArrayList<InvariantContext>();
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public TemplateSignatureContext templateSignature() {
			return getRuleContext(TemplateSignatureContext.class,0);
		}
		public List<EGenericSuperTypeContext> eGenericSuperType() {
			return getRuleContexts(EGenericSuperTypeContext.class);
		}
		public EGenericSuperTypeContext eGenericSuperType(int i) {
			return getRuleContext(EGenericSuperTypeContext.class,i);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<EOperationContext> eOperation() {
			return getRuleContexts(EOperationContext.class);
		}
		public EOperationContext eOperation(int i) {
			return getRuleContext(EOperationContext.class,i);
		}
		public List<EStructuralFeatureContext> eStructuralFeature() {
			return getRuleContexts(EStructuralFeatureContext.class);
		}
		public EStructuralFeatureContext eStructuralFeature(int i) {
			return getRuleContext(EStructuralFeatureContext.class,i);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public EClassContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EClassContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EClassContext eClass(Element owner) throws RecognitionException {
		EClassContext _localctx = new EClassContext(_ctx, getState(), owner);
		enterRule(_localctx, 24, RULE_eClass);
		((EClassContext)_localctx).element =  eFactory.createEClass();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (T__82 - 83)) | (1L << (T__83 - 83)) | (1L << (T__84 - 83)))) != 0)) {
				{
				setState(369);
				((EClassContext)_localctx).visibility = visibilityKind();
				}
			}

			if(_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EClassContext)_localctx).visibility.element);
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
			case T__22:
				{
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__21) {
					{
					setState(373);
					((EClassContext)_localctx).isAbstract = match(T__21);
					}
				}

				setState(376);
				((EClassContext)_localctx).isClass = match(T__22);
				}
				break;
			case T__23:
				{
				setState(377);
				((EClassContext)_localctx).isInterface = match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.element.setAbstract(((EClassContext)_localctx).isAbstract!=null); if (((EClassContext)_localctx).isInterface!=null) {_localctx.element.setInterface(true);_localctx.element.setAbstract(true);}
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(381);
				((EClassContext)_localctx).name = unrestrictedName();
				}
				break;
			}
			if (_localctx.name == null) {notifyErrorListeners("missing Class name");} else {_localctx.element.setName((((EClassContext)_localctx).name!=null?_input.getText(((EClassContext)_localctx).name.start,((EClassContext)_localctx).name.stop):null));}
			if (((EClassContext)_localctx).isInterface!=null) ((EClassContext)_localctx).current =  new Interface(_localctx.element, _localctx); else ((EClassContext)_localctx).current =  new Class(_localctx.element, _localctx);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(386);
				((EClassContext)_localctx).ownedSignature = ((EClassContext)_localctx).templateSignature = templateSignature(_localctx.current);
				}
			}

			if(_localctx.templateSignature != null) _localctx.element.getETypeParameters().addAll(((EClassContext)_localctx).templateSignature.typeParameters);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(390);
				match(T__24);
				setState(391);
				((EClassContext)_localctx).eGenericSuperType = eGenericSuperType(_localctx.current);
				((EClassContext)_localctx).eSuperTypes.add(((EClassContext)_localctx).eGenericSuperType);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(392);
					match(T__2);
					setState(393);
					((EClassContext)_localctx).eGenericSuperType = eGenericSuperType(_localctx.current);
					((EClassContext)_localctx).eSuperTypes.add(((EClassContext)_localctx).eGenericSuperType);
					}
					}
					setState(398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}


			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(402);
				match(T__5);
				setState(403);
				((EClassContext)_localctx).instanceClassName = match(SINGLE_QUOTED_STRING);
				}
			}

			if(((EClassContext)_localctx).instanceClassName != null) _localctx.element.setInstanceClassName(((EClassContext)_localctx).instanceClassName.getText().replace("'", ""));
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(407);
				match(T__1);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__26 - 26)) | (1L << (T__27 - 26)) | (1L << (T__28 - 26)) | (1L << (T__29 - 26)) | (1L << (T__30 - 26)) | (1L << (T__31 - 26)) | (1L << (T__40 - 26)) | (1L << (T__46 - 26)) | (1L << (T__59 - 26)) | (1L << (T__74 - 26)) | (1L << (T__75 - 26)) | (1L << (T__82 - 26)) | (1L << (T__83 - 26)) | (1L << (T__84 - 26)))) != 0)) {
					{
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						setState(408);
						((EClassContext)_localctx).eAnnotation = ((EClassContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EClassContext)_localctx).ownedAnnotations.add(((EClassContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EClassContext)_localctx).eAnnotation.element);
						}
						break;
					case 2:
						{
						setState(411);
						((EClassContext)_localctx).eOperation = ((EClassContext)_localctx).eOperation = eOperation(_localctx.current);
						((EClassContext)_localctx).eOperations.add(((EClassContext)_localctx).eOperation);
						_localctx.element.getEOperations().add(((EClassContext)_localctx).eOperation.element);
						}
						break;
					case 3:
						{
						setState(414);
						((EClassContext)_localctx).eStructuralFeature = ((EClassContext)_localctx).eStructuralFeature = eStructuralFeature(_localctx.current);
						((EClassContext)_localctx).eStructuralFeatures.add(((EClassContext)_localctx).eStructuralFeature);
						if (((EClassContext)_localctx).eStructuralFeature.element != null) _localctx.element.getEStructuralFeatures().add(((EClassContext)_localctx).eStructuralFeature.element);
						}
						break;
					case 4:
						{
						setState(417);
						((EClassContext)_localctx).invariant = ((EClassContext)_localctx).invariant = invariant(_localctx.current);
						((EClassContext)_localctx).eConstraints.add(((EClassContext)_localctx).invariant);
						_localctx.element.getEAnnotations().add(((EClassContext)_localctx).invariant.element);
						}
						break;
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(425);
				match(T__3);
				}
				}
				break;
			case T__17:
				{
				setState(426);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EStructuralFeatureContext extends ParserRuleContext {
		public Element owner;
		public EStructuralFeature element;
		public EAttributeContext eAttribute;
		public EReferenceContext eReference;
		public EAttributeContext eAttribute() {
			return getRuleContext(EAttributeContext.class,0);
		}
		public EReferenceContext eReference() {
			return getRuleContext(EReferenceContext.class,0);
		}
		public EStructuralFeatureContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EStructuralFeatureContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eStructuralFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEStructuralFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEStructuralFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEStructuralFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EStructuralFeatureContext eStructuralFeature(Element owner) throws RecognitionException {
		EStructuralFeatureContext _localctx = new EStructuralFeatureContext(_ctx, getState(), owner);
		enterRule(_localctx, 26, RULE_eStructuralFeature);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				((EStructuralFeatureContext)_localctx).eAttribute = eAttribute(_localctx.owner);
				((EStructuralFeatureContext)_localctx).element =  ((EStructuralFeatureContext)_localctx).eAttribute.element;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				((EStructuralFeatureContext)_localctx).eReference = eReference(_localctx.owner);
				((EStructuralFeatureContext)_localctx).element =  ((EStructuralFeatureContext)_localctx).eReference.element;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EAttributeContext extends ParserRuleContext {
		public Element owner;
		public EAttribute element;
		public Attribute current;
		public VisibilityKindContext visibility;
		public Token s26;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s27;
		public Token s28;
		public Token s29;
		public Token s30;
		public Token s31;
		public UnrestrictedNameContext name;
		public EGenericElementTypeContext eAttributeType;
		public EMultiplicityContext ownedMultiplicity;
		public Token defaultValue;
		public Token s33;
		public Token s34;
		public Token s35;
		public Token s36;
		public Token s37;
		public Token s38;
		public Token s39;
		public Token s40;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public DerivationContext ownedDerivation;
		public DerivationContext derivation;
		public InitialContext ownedInitial;
		public InitialContext initial;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public EGenericElementTypeContext eGenericElementType() {
			return getRuleContext(EGenericElementTypeContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public EMultiplicityContext eMultiplicity() {
			return getRuleContext(EMultiplicityContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public DerivationContext derivation() {
			return getRuleContext(DerivationContext.class,0);
		}
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public EAttributeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EAttributeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EAttributeContext eAttribute(Element owner) throws RecognitionException {
		EAttributeContext _localctx = new EAttributeContext(_ctx, getState(), owner);
		enterRule(_localctx, 28, RULE_eAttribute);
		((EAttributeContext)_localctx).element =  eFactory.createEAttribute();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (T__82 - 83)) | (1L << (T__83 - 83)) | (1L << (T__84 - 83)))) != 0)) {
				{
				setState(437);
				((EAttributeContext)_localctx).visibility = visibilityKind();
				}
			}

			if (_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EAttributeContext)_localctx).visibility.element);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(441);
				((EAttributeContext)_localctx).s26 = match(T__25);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s26);
				}
			}

			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(444);
				((EAttributeContext)_localctx).s27 = match(T__26);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s27);
				}
				break;
			case T__27:
				{
				setState(445);
				((EAttributeContext)_localctx).s28 = match(T__27);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s28);
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__31:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(448);
				((EAttributeContext)_localctx).s29 = match(T__28);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s29);
				}
			}

			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(451);
				((EAttributeContext)_localctx).s30 = match(T__29);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s30);
				}
			}

			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(454);
				((EAttributeContext)_localctx).s31 = match(T__30);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s31);
				}
			}

			setState(457);
			match(T__31);
			setState(458);
			((EAttributeContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EAttributeContext)_localctx).name!=null?_input.getText(((EAttributeContext)_localctx).name.start,((EAttributeContext)_localctx).name.stop):null));
			((EAttributeContext)_localctx).current =  new Attribute(_localctx.element, _localctx);
			setState(461);
			match(T__5);
			setState(462);
			((EAttributeContext)_localctx).eAttributeType = eGenericElementType(_localctx.current);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(463);
				((EAttributeContext)_localctx).ownedMultiplicity = eMultiplicity(_localctx.current, (ETypedElement)_localctx.element);
				}
			}

			if(_localctx.ownedMultiplicity == null) {_localctx.element.setLowerBound(1);} 
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(467);
				match(T__20);
				setState(468);
				((EAttributeContext)_localctx).defaultValue = match(SINGLE_QUOTED_STRING);
				}
			}

			if(((EAttributeContext)_localctx).defaultValue != null) _localctx.element.setDefaultValueLiteral(((EAttributeContext)_localctx).defaultValue.getText().replace("'", ""));
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(472);
				match(T__1);
				setState(486); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(481);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__32:
						{
						setState(473);
						((EAttributeContext)_localctx).s33 = match(T__32);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s33);
						}
						break;
					case T__33:
						{
						setState(474);
						((EAttributeContext)_localctx).s34 = match(T__33);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s34);
						}
						break;
					case T__34:
						{
						setState(475);
						((EAttributeContext)_localctx).s35 = match(T__34);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s35);
						}
						break;
					case T__35:
						{
						setState(476);
						((EAttributeContext)_localctx).s36 = match(T__35);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s36);
						}
						break;
					case T__36:
						{
						setState(477);
						((EAttributeContext)_localctx).s37 = match(T__36);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(478);
						((EAttributeContext)_localctx).s38 = match(T__37);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s38);
						}
						break;
					case T__38:
						{
						setState(479);
						((EAttributeContext)_localctx).s39 = match(T__38);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s39);
						}
						break;
					case T__39:
						{
						setState(480);
						((EAttributeContext)_localctx).s40 = match(T__39);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s40);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(483);
						match(T__2);
						}
					}

					}
					}
					setState(488); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) );
				setState(490);
				match(T__3);
				}
				break;
			}
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(493);
				match(T__1);
				{
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(494);
						((EAttributeContext)_localctx).eAnnotation = ((EAttributeContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EAttributeContext)_localctx).ownedAnnotations.add(((EAttributeContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EAttributeContext)_localctx).eAnnotation.element);
						}
						} 
					}
					setState(501);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(508);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__81:
					{
					setState(502);
					((EAttributeContext)_localctx).ownedDerivation = ((EAttributeContext)_localctx).derivation = derivation(_localctx.current);
					_localctx.element.getEAnnotations().add(((EAttributeContext)_localctx).derivation.element);
					}
					break;
				case T__80:
					{
					setState(505);
					((EAttributeContext)_localctx).ownedInitial = ((EAttributeContext)_localctx).initial = initial(_localctx.current);
					_localctx.element.getEAnnotations().add(((EAttributeContext)_localctx).initial.element);
					}
					break;
				case T__3:
				case T__59:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__59) {
					{
					{
					setState(510);
					((EAttributeContext)_localctx).eAnnotation = ((EAttributeContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
					((EAttributeContext)_localctx).ownedAnnotations.add(((EAttributeContext)_localctx).eAnnotation);
					_localctx.element.getEAnnotations().add(((EAttributeContext)_localctx).eAnnotation.element);
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(518);
				match(T__3);
				}
				}
				break;
			case T__17:
				{
				setState(519);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			for(String s: ((EAttributeContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "static":     createEAnnotation(_localctx.element, AnnotationSources.STATIC); break;
			            case "model":      createEAnnotation(_localctx.element, AnnotationSources.MODEL); break;
			            case "ghost":      createEAnnotation(_localctx.element, AnnotationSources.GHOST); break;
			            case "transient":  _localctx.element.setTransient(true); break;
			            case "volatile":   _localctx.element.setVolatile(true); break;
			            case "readonly":   _localctx.element.setChangeable(false); break;
			            case "derived":    _localctx.element.setDerived(true); break;
			            case "ordered":    int u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setOrdered(true); break;
			            case "!unique":    u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setUnique(false); break;
			            case "unsettable": _localctx.element.setUnsettable(true); break;
			            case "id":         _localctx.element.setID(true); break;}}
			    
			}
			_ctx.stop = _input.LT(-1);

			owner.addOwnedElement(_localctx.current);
			if (_localctx.eAttributeType != null) {
			    EObject genericElementType = _localctx.eAttributeType.element;
			    if (genericElementType instanceof EClassifier) { _localctx.element.setEType((EClassifier) genericElementType);}
			    else if (genericElementType instanceof EGenericType) { _localctx.element.setEGenericType((EGenericType) genericElementType);}
			}

		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EReferenceContext extends ParserRuleContext {
		public Element owner;
		public EReference element;
		public Reference current;
		public VisibilityKindContext visibility;
		public Token s26;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s27;
		public Token s28;
		public Token s29;
		public Token s30;
		public Token s31;
		public UnrestrictedNameContext name;
		public UnrestrictedNameContext eOpposite;
		public EGenericElementTypeContext eReferenceType;
		public EMultiplicityContext ownedMultiplicity;
		public Token defaultValue;
		public Token s43;
		public Token s33;
		public Token s35;
		public Token s36;
		public Token s37;
		public Token s38;
		public Token s44;
		public Token s45;
		public Token s39;
		public Token s40;
		public UnrestrictedNameContext unrestrictedName;
		public List<UnrestrictedNameContext> referredKeys = new ArrayList<UnrestrictedNameContext>();
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public DerivationContext ownedDerivation;
		public DerivationContext derivation;
		public InitialContext ownedInitial;
		public InitialContext initial;
		public List<UnrestrictedNameContext> unrestrictedName() {
			return getRuleContexts(UnrestrictedNameContext.class);
		}
		public UnrestrictedNameContext unrestrictedName(int i) {
			return getRuleContext(UnrestrictedNameContext.class,i);
		}
		public EGenericElementTypeContext eGenericElementType() {
			return getRuleContext(EGenericElementTypeContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public EMultiplicityContext eMultiplicity() {
			return getRuleContext(EMultiplicityContext.class,0);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public DerivationContext derivation() {
			return getRuleContext(DerivationContext.class,0);
		}
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public EReferenceContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EReferenceContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EReferenceContext eReference(Element owner) throws RecognitionException {
		EReferenceContext _localctx = new EReferenceContext(_ctx, getState(), owner);
		enterRule(_localctx, 30, RULE_eReference);
		((EReferenceContext)_localctx).element =  eFactory.createEReference();
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (T__82 - 83)) | (1L << (T__83 - 83)) | (1L << (T__84 - 83)))) != 0)) {
				{
				setState(524);
				((EReferenceContext)_localctx).visibility = visibilityKind();
				}
			}

			if (_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EReferenceContext)_localctx).visibility.element);
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(528);
				((EReferenceContext)_localctx).s26 = match(T__25);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s26);
				}
			}

			setState(533);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(531);
				((EReferenceContext)_localctx).s27 = match(T__26);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s27);
				}
				break;
			case T__27:
				{
				setState(532);
				((EReferenceContext)_localctx).s28 = match(T__27);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s28);
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__40:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(535);
				((EReferenceContext)_localctx).s29 = match(T__28);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s29);
				}
			}

			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(538);
				((EReferenceContext)_localctx).s30 = match(T__29);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s30);
				}
			}

			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30) {
				{
				setState(541);
				((EReferenceContext)_localctx).s31 = match(T__30);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s31);
				}
			}

			setState(544);
			match(T__40);
			setState(545);
			((EReferenceContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EReferenceContext)_localctx).name!=null?_input.getText(((EReferenceContext)_localctx).name.start,((EReferenceContext)_localctx).name.stop):null));
			((EReferenceContext)_localctx).current =  new Reference(_localctx.element, _localctx);
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__41) {
				{
				setState(548);
				match(T__41);
				setState(549);
				((EReferenceContext)_localctx).eOpposite = unrestrictedName();
				}
			}


			{
			setState(553);
			match(T__5);
			setState(554);
			((EReferenceContext)_localctx).eReferenceType = eGenericElementType(_localctx.current);
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(555);
				((EReferenceContext)_localctx).ownedMultiplicity = eMultiplicity(_localctx.current, (ETypedElement) _localctx.element);
				}
			}

			}
			if (_localctx.ownedMultiplicity == null) {_localctx.element.setLowerBound(1);} 
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(559);
				match(T__20);
				setState(560);
				((EReferenceContext)_localctx).defaultValue = match(SINGLE_QUOTED_STRING);
				}
			}

			if(((EReferenceContext)_localctx).defaultValue != null) _localctx.element.setDefaultValueLiteral(((EReferenceContext)_localctx).defaultValue.getText().replace("'", ""));
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(564);
				match(T__1);
				setState(580); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(575);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__42:
						{
						setState(565);
						((EReferenceContext)_localctx).s43 = match(T__42);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s43);
						}
						break;
					case T__32:
						{
						setState(566);
						((EReferenceContext)_localctx).s33 = match(T__32);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s33);
						}
						break;
					case T__34:
						{
						setState(567);
						((EReferenceContext)_localctx).s35 = match(T__34);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s35);
						}
						break;
					case T__35:
						{
						setState(568);
						((EReferenceContext)_localctx).s36 = match(T__35);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s36);
						}
						break;
					case T__36:
						{
						setState(569);
						((EReferenceContext)_localctx).s37 = match(T__36);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(570);
						((EReferenceContext)_localctx).s38 = match(T__37);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s38);
						}
						break;
					case T__43:
						{
						setState(571);
						((EReferenceContext)_localctx).s44 = match(T__43);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s44);
						}
						break;
					case T__44:
						{
						setState(572);
						((EReferenceContext)_localctx).s45 = match(T__44);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s45);
						}
						break;
					case T__38:
						{
						setState(573);
						((EReferenceContext)_localctx).s39 = match(T__38);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s39);
						}
						break;
					case T__39:
						{
						setState(574);
						((EReferenceContext)_localctx).s40 = match(T__39);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s40);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(577);
						match(T__2);
						}
					}

					}
					}
					setState(582); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__42) | (1L << T__43) | (1L << T__44))) != 0) );
				setState(584);
				match(T__3);
				}
				break;
			}
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(587);
				match(T__1);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(588);
					match(T__45);
					setState(589);
					((EReferenceContext)_localctx).unrestrictedName = unrestrictedName();
					((EReferenceContext)_localctx).referredKeys.add(((EReferenceContext)_localctx).unrestrictedName);
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(590);
						match(T__2);
						setState(591);
						((EReferenceContext)_localctx).unrestrictedName = unrestrictedName();
						((EReferenceContext)_localctx).referredKeys.add(((EReferenceContext)_localctx).unrestrictedName);
						}
						}
						setState(596);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(597);
					match(T__17);
					}
				}

				{
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(601);
						((EReferenceContext)_localctx).eAnnotation = ((EReferenceContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EReferenceContext)_localctx).ownedAnnotations.add(((EReferenceContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EReferenceContext)_localctx).eAnnotation.element);
						}
						} 
					}
					setState(608);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				}
				setState(615);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__81:
					{
					setState(609);
					((EReferenceContext)_localctx).ownedDerivation = ((EReferenceContext)_localctx).derivation = derivation(_localctx.current);
					_localctx.element.getEAnnotations().add(((EReferenceContext)_localctx).derivation.element);
					}
					break;
				case T__80:
					{
					setState(612);
					((EReferenceContext)_localctx).ownedInitial = ((EReferenceContext)_localctx).initial = initial(_localctx.current);
					_localctx.element.getEAnnotations().add(((EReferenceContext)_localctx).initial.element);
					}
					break;
				case T__3:
				case T__59:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__59) {
					{
					{
					setState(617);
					((EReferenceContext)_localctx).eAnnotation = ((EReferenceContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
					((EReferenceContext)_localctx).ownedAnnotations.add(((EReferenceContext)_localctx).eAnnotation);
					_localctx.element.getEAnnotations().add(((EReferenceContext)_localctx).eAnnotation.element);
					}
					}
					setState(624);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(625);
				match(T__3);
				}
				}
				break;
			case T__17:
				{
				setState(626);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			for(String s: ((EReferenceContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "static":    createEAnnotation(_localctx.element, AnnotationSources.STATIC); break;
			            case "model":     createEAnnotation(_localctx.element, AnnotationSources.MODEL); break;
			            case "ghost":     createEAnnotation(_localctx.element, AnnotationSources.GHOST); break;
			            case "transient": _localctx.element.setTransient(true); break;
			            case "volatile":  _localctx.element.setVolatile(true); break;
			            case "readonly":  _localctx.element.setChangeable(false); break;
			            case "unsettable":_localctx.element.setUnsettable(true); break;
			            case "derived":   _localctx.element.setDerived(true); break;
			            case "ordered":   int u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setOrdered(true); break;
			            case "!unique":   u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setUnique(false); break;
			            case "composes":  _localctx.element.setContainment(true); break;
			            case "!resolve":  _localctx.element.setResolveProxies(false); break;
			            default: break;}}
			    
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EOperationContext extends ParserRuleContext {
		public Element owner;
		public EOperation element;
		public Operation current;
		public VisibilityKindContext visibility;
		public Token s26;
		public List<Token> qualifier = new ArrayList<Token>();
		public TemplateSignatureContext ownedSignature;
		public TemplateSignatureContext templateSignature;
		public UnrestrictedNameContext name;
		public EParameterContext eParameter;
		public List<EParameterContext> eParameters = new ArrayList<EParameterContext>();
		public EGenericElementTypeContext eReturnType;
		public EGenericElementTypeContext eGenericElementType;
		public EMultiplicityContext ownedMultiplicity;
		public EGenericExceptionContext eGenericException;
		public List<EGenericExceptionContext> ownedException = new ArrayList<EGenericExceptionContext>();
		public Token s35;
		public Token s36;
		public Token s37;
		public Token s38;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public PreconditionContext precondition;
		public List<PreconditionContext> ownedPreconditions = new ArrayList<PreconditionContext>();
		public BodyContext body;
		public List<BodyContext> ownedBodyExpression = new ArrayList<BodyContext>();
		public PostconditionContext postcondition;
		public List<PostconditionContext> ownedPostconditions = new ArrayList<PostconditionContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public TemplateSignatureContext templateSignature() {
			return getRuleContext(TemplateSignatureContext.class,0);
		}
		public EGenericElementTypeContext eGenericElementType() {
			return getRuleContext(EGenericElementTypeContext.class,0);
		}
		public List<EGenericExceptionContext> eGenericException() {
			return getRuleContexts(EGenericExceptionContext.class);
		}
		public EGenericExceptionContext eGenericException(int i) {
			return getRuleContext(EGenericExceptionContext.class,i);
		}
		public List<EParameterContext> eParameter() {
			return getRuleContexts(EParameterContext.class);
		}
		public EParameterContext eParameter(int i) {
			return getRuleContext(EParameterContext.class,i);
		}
		public EMultiplicityContext eMultiplicity() {
			return getRuleContext(EMultiplicityContext.class,0);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<PreconditionContext> precondition() {
			return getRuleContexts(PreconditionContext.class);
		}
		public PreconditionContext precondition(int i) {
			return getRuleContext(PreconditionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public List<PostconditionContext> postcondition() {
			return getRuleContexts(PostconditionContext.class);
		}
		public PostconditionContext postcondition(int i) {
			return getRuleContext(PostconditionContext.class,i);
		}
		public EOperationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EOperationContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EOperationContext eOperation(Element owner) throws RecognitionException {
		EOperationContext _localctx = new EOperationContext(_ctx, getState(), owner);
		enterRule(_localctx, 32, RULE_eOperation);
		((EOperationContext)_localctx).element =  eFactory.createEOperation(); ((EOperationContext)_localctx).current =  new Operation(_localctx.element, _localctx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (T__82 - 83)) | (1L << (T__83 - 83)) | (1L << (T__84 - 83)))) != 0)) {
				{
				setState(631);
				((EOperationContext)_localctx).visibility = visibilityKind();
				}
			}

			if (_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EOperationContext)_localctx).visibility.element);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(635);
				((EOperationContext)_localctx).s26 = match(T__25);
				((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s26);
				}
			}

			setState(638);
			match(T__46);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(639);
				((EOperationContext)_localctx).ownedSignature = ((EOperationContext)_localctx).templateSignature = templateSignature(_localctx.current);
				}
			}

			if(_localctx.templateSignature != null) _localctx.element.getETypeParameters().addAll(((EOperationContext)_localctx).templateSignature.typeParameters);
			setState(643);
			((EOperationContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EOperationContext)_localctx).name!=null?_input.getText(((EOperationContext)_localctx).name.start,((EOperationContext)_localctx).name.stop):null));
			{
			setState(645);
			match(T__14);
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
				{
				setState(646);
				((EOperationContext)_localctx).eParameter = eParameter(_localctx.current);
				((EOperationContext)_localctx).eParameters.add(((EOperationContext)_localctx).eParameter);
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(647);
					match(T__2);
					setState(648);
					((EOperationContext)_localctx).eParameter = eParameter(_localctx.current);
					((EOperationContext)_localctx).eParameters.add(((EOperationContext)_localctx).eParameter);
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(656);
			match(T__15);
			}
			for (EParameterContext ctx: ((EOperationContext)_localctx).eParameters){_localctx.element.getEParameters().add(ctx.element);}
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(659);
				match(T__5);
				setState(660);
				((EOperationContext)_localctx).eReturnType = ((EOperationContext)_localctx).eGenericElementType = eGenericElementType(_localctx.current);
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(661);
					((EOperationContext)_localctx).ownedMultiplicity = eMultiplicity(_localctx.current, (ETypedElement) _localctx.element);
					}
				}

				}
			}

			if (_localctx.ownedMultiplicity == null) {_localctx.element.setLowerBound(1);} 
			 if (_localctx.eReturnType != null) _localctx.element.setEGenericType(((EOperationContext)_localctx).eGenericElementType.element);
			setState(677);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__47) {
				{
				setState(668);
				match(T__47);
				setState(669);
				((EOperationContext)_localctx).eGenericException = eGenericException(_localctx.current);
				((EOperationContext)_localctx).ownedException.add(((EOperationContext)_localctx).eGenericException);
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(670);
					match(T__2);
					setState(671);
					((EOperationContext)_localctx).eGenericException = eGenericException(_localctx.current);
					((EOperationContext)_localctx).ownedException.add(((EOperationContext)_localctx).eGenericException);
					}
					}
					setState(676);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			 for(EGenericExceptionContext e: ((EOperationContext)_localctx).ownedException) _localctx.element.getEGenericExceptions().add(e.element);
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(680);
				match(T__1);
				setState(690); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(685);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__34:
						{
						setState(681);
						((EOperationContext)_localctx).s35 = match(T__34);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s35);
						}
						break;
					case T__35:
						{
						setState(682);
						((EOperationContext)_localctx).s36 = match(T__35);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s36);
						}
						break;
					case T__36:
						{
						setState(683);
						((EOperationContext)_localctx).s37 = match(T__36);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(684);
						((EOperationContext)_localctx).s38 = match(T__37);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s38);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(688);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(687);
						match(T__2);
						}
					}

					}
					}
					setState(692); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0) );
				setState(694);
				match(T__3);
				}
				break;
			}
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(697);
				match(T__1);
				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__73 - 60)) | (1L << (T__76 - 60)) | (1L << (T__77 - 60)) | (1L << (T__78 - 60)) | (1L << (T__79 - 60)))) != 0)) {
					{
					setState(710);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__59:
						{
						setState(698);
						((EOperationContext)_localctx).eAnnotation = ((EOperationContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EOperationContext)_localctx).ownedAnnotations.add(((EOperationContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EOperationContext)_localctx).eAnnotation.element);
						}
						break;
					case T__76:
					case T__77:
						{
						setState(701);
						((EOperationContext)_localctx).precondition = ((EOperationContext)_localctx).precondition = precondition(_localctx.current);
						((EOperationContext)_localctx).ownedPreconditions.add(((EOperationContext)_localctx).precondition);
						_localctx.element.getEAnnotations().add(((EOperationContext)_localctx).precondition.element);
						}
						break;
					case T__73:
						{
						setState(704);
						((EOperationContext)_localctx).body = ((EOperationContext)_localctx).body = body(_localctx.current);
						((EOperationContext)_localctx).ownedBodyExpression.add(((EOperationContext)_localctx).body);
						_localctx.element.getEAnnotations().add(((EOperationContext)_localctx).body.element);
						}
						break;
					case T__78:
					case T__79:
						{
						setState(707);
						((EOperationContext)_localctx).postcondition = ((EOperationContext)_localctx).postcondition = postcondition(_localctx.current);
						((EOperationContext)_localctx).ownedPostconditions.add(((EOperationContext)_localctx).postcondition);
						_localctx.element.getEAnnotations().add(((EOperationContext)_localctx).postcondition.element);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(715);
				match(T__3);
				}
				}
				break;
			case T__17:
				{
				setState(716);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			for(String s: ((EOperationContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "static":   createEAnnotation(_localctx.element, AnnotationSources.STATIC); break;
			            case "ordered":  int u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setOrdered(true); break;
			            case "!unique":  u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setUnique(false); break;}}
			    
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericExceptionContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public GenericException current;
		public EGenericTypeContext eGenericType;
		public EGenericTypeContext eGenericType() {
			return getRuleContext(EGenericTypeContext.class,0);
		}
		public EGenericExceptionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericExceptionContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericException; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericException(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericException(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericExceptionContext eGenericException(Element owner) throws RecognitionException {
		EGenericExceptionContext _localctx = new EGenericExceptionContext(_ctx, getState(), owner);
		enterRule(_localctx, 34, RULE_eGenericException);
		((EGenericExceptionContext)_localctx).current =  new GenericException(_localctx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			((EGenericExceptionContext)_localctx).eGenericType = eGenericType(_localctx.current);
			((EGenericExceptionContext)_localctx).element =  ((EGenericExceptionContext)_localctx).eGenericType.element;
			}
			_ctx.stop = _input.LT(-1);
			_localctx.current.setEObject(_localctx.element); _localctx.owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericSuperTypeContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public GenericSuperType current;
		public EGenericTypeContext eGenericType;
		public EGenericTypeContext eGenericType() {
			return getRuleContext(EGenericTypeContext.class,0);
		}
		public EGenericSuperTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericSuperTypeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericSuperType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericSuperType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericSuperType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericSuperType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericSuperTypeContext eGenericSuperType(Element owner) throws RecognitionException {
		EGenericSuperTypeContext _localctx = new EGenericSuperTypeContext(_ctx, getState(), owner);
		enterRule(_localctx, 36, RULE_eGenericSuperType);
		((EGenericSuperTypeContext)_localctx).current =  new GenericSuperType(_localctx.element, _localctx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			((EGenericSuperTypeContext)_localctx).eGenericType = eGenericType(_localctx.current);
			((EGenericSuperTypeContext)_localctx).element =  ((EGenericSuperTypeContext)_localctx).eGenericType.element;
			}
			_ctx.stop = _input.LT(-1);
			_localctx.current.setEObject(_localctx.element); _localctx.owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EParameterContext extends ParserRuleContext {
		public Element owner;
		public EParameter element;
		public Parameter current;
		public UnrestrictedNameContext name;
		public EGenericElementTypeContext eParameterType;
		public EMultiplicityContext ownedMultiplicity;
		public Token s35;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s36;
		public Token s37;
		public Token s38;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public EGenericElementTypeContext eGenericElementType() {
			return getRuleContext(EGenericElementTypeContext.class,0);
		}
		public EMultiplicityContext eMultiplicity() {
			return getRuleContext(EMultiplicityContext.class,0);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public EParameterContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EParameterContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EParameterContext eParameter(Element owner) throws RecognitionException {
		EParameterContext _localctx = new EParameterContext(_ctx, getState(), owner);
		enterRule(_localctx, 38, RULE_eParameter);
		((EParameterContext)_localctx).element =  eFactory.createEParameter();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			((EParameterContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EParameterContext)_localctx).name!=null?_input.getText(((EParameterContext)_localctx).name.start,((EParameterContext)_localctx).name.stop):null));
			((EParameterContext)_localctx).current =  new Parameter(_localctx.element, _localctx);
			setState(730);
			match(T__5);
			setState(731);
			((EParameterContext)_localctx).eParameterType = eGenericElementType(_localctx.current);
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(732);
				((EParameterContext)_localctx).ownedMultiplicity = eMultiplicity(_localctx.current, (ETypedElement) _localctx.element);
				}
			}

			if (_localctx.ownedMultiplicity == null) {_localctx.element.setLowerBound(1);} 
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(736);
				match(T__1);
				setState(746); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(741);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__34:
						{
						setState(737);
						((EParameterContext)_localctx).s35 = match(T__34);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s35);
						}
						break;
					case T__35:
						{
						setState(738);
						((EParameterContext)_localctx).s36 = match(T__35);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s36);
						}
						break;
					case T__36:
						{
						setState(739);
						((EParameterContext)_localctx).s37 = match(T__36);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(740);
						((EParameterContext)_localctx).s38 = match(T__37);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s38);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(743);
						match(T__2);
						}
					}

					}
					}
					setState(748); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0) );
				setState(750);
				match(T__3);
				}
				break;
			}
			setState(762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(753);
				match(T__1);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__59) {
					{
					{
					setState(754);
					((EParameterContext)_localctx).eAnnotation = ((EParameterContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
					((EParameterContext)_localctx).ownedAnnotations.add(((EParameterContext)_localctx).eAnnotation);
					}
					}
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.element.getEAnnotations().add(((EParameterContext)_localctx).eAnnotation.element);
				setState(761);
				match(T__3);
				}
			}

			for(String s: ((EParameterContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "ordered":  int u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setOrdered(true);break;
			            case "!unique":  u = _localctx.element.getUpperBound(); if (u > 1 || u == -1) _localctx.element.setUnique(false);break;}}
				
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EMultiplicityContext extends ParserRuleContext {
		public Element owner;
		public ETypedElement element;
		public int l = 1;
		public int u = 1;
		public LowerContext lowerBound;
		public UpperContext upperBound;
		public Token stringBound;
		public Token nullable;
		public LowerContext lower() {
			return getRuleContext(LowerContext.class,0);
		}
		public UpperContext upper() {
			return getRuleContext(UpperContext.class,0);
		}
		public EMultiplicityContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EMultiplicityContext(ParserRuleContext parent, int invokingState, Element owner, ETypedElement element) {
			super(parent, invokingState);
			this.owner = owner;
			this.element = element;
		}
		@Override public int getRuleIndex() { return RULE_eMultiplicity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEMultiplicity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEMultiplicity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEMultiplicity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EMultiplicityContext eMultiplicity(Element owner,ETypedElement element) throws RecognitionException {
		EMultiplicityContext _localctx = new EMultiplicityContext(_ctx, getState(), owner, element);
		enterRule(_localctx, 40, RULE_eMultiplicity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(T__10);
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(767);
				((EMultiplicityContext)_localctx).lowerBound = lower();
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(768);
					match(T__13);
					setState(769);
					((EMultiplicityContext)_localctx).upperBound = upper();
					}
				}

				}
				break;
			case T__48:
			case T__49:
			case T__50:
				{
				setState(772);
				((EMultiplicityContext)_localctx).stringBound = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__49) | (1L << T__50))) != 0)) ) {
					((EMultiplicityContext)_localctx).stringBound = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(777);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				{
				setState(775);
				((EMultiplicityContext)_localctx).nullable = match(T__51);
				}
				break;
			case T__52:
				{
				setState(776);
				match(T__52);
				}
				break;
			case T__11:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(779);
			match(T__11);

				if (_localctx.stringBound != null) {
				    switch (_localctx.stringBound.getText()) {
			            case "*": ((EMultiplicityContext)_localctx).l =  0; ((EMultiplicityContext)_localctx).u =  -1; break;
			            case "+": ((EMultiplicityContext)_localctx).l =  1; ((EMultiplicityContext)_localctx).u =  -1; break;
			            case "?": ((EMultiplicityContext)_localctx).l =  0; ((EMultiplicityContext)_localctx).u =   1; break;
			            default: break;
			        }
			    } else {
			        try { ((EMultiplicityContext)_localctx).l =  Integer.valueOf((((EMultiplicityContext)_localctx).lowerBound!=null?_input.getText(((EMultiplicityContext)_localctx).lowerBound.start,((EMultiplicityContext)_localctx).lowerBound.stop):null)); } catch (NumberFormatException ex) {System.out.println(Arrays.toString(ex.getStackTrace()));}
			        if (_localctx.upperBound != null) {
			            if (_localctx.upperBound.getText().equals("*")) ((EMultiplicityContext)_localctx).u =  -1;
			            else try {((EMultiplicityContext)_localctx).u =  Integer.valueOf((((EMultiplicityContext)_localctx).upperBound!=null?_input.getText(((EMultiplicityContext)_localctx).upperBound.start,((EMultiplicityContext)_localctx).upperBound.stop):null));} catch (NumberFormatException ex){System.out.println(Arrays.toString(ex.getStackTrace()));}
			        } else { ((EMultiplicityContext)_localctx).u =  _localctx.l;}
			    }
			    if ((_localctx.u > 1 || _localctx.u == -1) && _localctx.nullable != null) createEAnnotation(_localctx.element, AnnotationSources.NULLABLE);
				
			}
			_ctx.stop = _input.LT(-1);
			_localctx.element.setLowerBound(_localctx.l); _localctx.element.setUpperBound(_localctx.u); _localctx.owner.addOwnedElement(new Multiplicity(_localctx));
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EDataTypeContext extends ParserRuleContext {
		public Element owner;
		public EDataType element;
		public DataType current;
		public VisibilityKindContext visibility;
		public Token s54;
		public List<Token> qualifier = new ArrayList<Token>();
		public UnrestrictedNameContext name;
		public TemplateSignatureContext ownedSignature;
		public TemplateSignatureContext templateSignature;
		public Token instanceClassName;
		public Token s56;
		public Token s57;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public InvariantContext invariant;
		public List<InvariantContext> ownedConstraints = new ArrayList<InvariantContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public TemplateSignatureContext templateSignature() {
			return getRuleContext(TemplateSignatureContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public EDataTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EDataTypeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EDataTypeContext eDataType(Element owner) throws RecognitionException {
		EDataTypeContext _localctx = new EDataTypeContext(_ctx, getState(), owner);
		enterRule(_localctx, 42, RULE_eDataType);
		((EDataTypeContext)_localctx).element =  eFactory.createEDataType();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(783);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (T__82 - 83)) | (1L << (T__83 - 83)) | (1L << (T__84 - 83)))) != 0)) {
				{
				setState(782);
				((EDataTypeContext)_localctx).visibility = visibilityKind();
				}
			}

			if (_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EDataTypeContext)_localctx).visibility.element);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__53) {
				{
				setState(786);
				((EDataTypeContext)_localctx).s54 = match(T__53);
				((EDataTypeContext)_localctx).qualifier.add(((EDataTypeContext)_localctx).s54);
				}
			}

			setState(789);
			match(T__54);
			setState(790);
			((EDataTypeContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EDataTypeContext)_localctx).name!=null?_input.getText(((EDataTypeContext)_localctx).name.start,((EDataTypeContext)_localctx).name.stop):null));
			((EDataTypeContext)_localctx).current =  new DataType(_localctx.element, _localctx);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(793);
				((EDataTypeContext)_localctx).ownedSignature = ((EDataTypeContext)_localctx).templateSignature = templateSignature(_localctx.current);
				}
			}

			if(_localctx.templateSignature != null) _localctx.element.getETypeParameters().addAll(((EDataTypeContext)_localctx).templateSignature.typeParameters);
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(797);
				match(T__5);
				setState(798);
				((EDataTypeContext)_localctx).instanceClassName = match(SINGLE_QUOTED_STRING);
				}
			}

			if(((EDataTypeContext)_localctx).instanceClassName != null) _localctx.element.setInstanceClassName(((EDataTypeContext)_localctx).instanceClassName.getText().replace("'", ""));
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(802);
				match(T__1);
				setState(805);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__55:
					{
					setState(803);
					((EDataTypeContext)_localctx).s56 = match(T__55);
					((EDataTypeContext)_localctx).qualifier.add(((EDataTypeContext)_localctx).s56);
					}
					break;
				case T__56:
					{
					setState(804);
					((EDataTypeContext)_localctx).s57 = match(T__56);
					((EDataTypeContext)_localctx).qualifier.add(((EDataTypeContext)_localctx).s57);
					}
					break;
				case T__3:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(807);
				match(T__3);
				}
				break;
			}
			setState(824);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(810);
				match(T__1);
				setState(819);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (T__59 - 60)) | (1L << (T__74 - 60)) | (1L << (T__75 - 60)))) != 0)) {
					{
					setState(817);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__59:
						{
						setState(811);
						((EDataTypeContext)_localctx).eAnnotation = ((EDataTypeContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EDataTypeContext)_localctx).ownedAnnotations.add(((EDataTypeContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EDataTypeContext)_localctx).eAnnotation.element);
						}
						break;
					case T__74:
					case T__75:
						{
						setState(814);
						((EDataTypeContext)_localctx).invariant = ((EDataTypeContext)_localctx).invariant = invariant(_localctx.current);
						((EDataTypeContext)_localctx).ownedConstraints.add(((EDataTypeContext)_localctx).invariant);
						_localctx.element.getEAnnotations().add(((EDataTypeContext)_localctx).invariant.element);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(821);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(822);
				match(T__3);
				}
				}
				break;
			case T__17:
				{
				setState(823);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			for(String s: ((EDataTypeContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "primitive":     createEAnnotation(_localctx.element, AnnotationSources.DATATYPE_PRIMITIVE);break;
			            case "!serializable": _localctx.element.setSerializable(false); break; }}
			    
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EEnumContext extends ParserRuleContext {
		public Element owner;
		public EEnum element;
		public Enum current;
		public VisibilityKindContext visibility;
		public UnrestrictedNameContext name;
		public TemplateSignatureContext ownedSignature;
		public TemplateSignatureContext templateSignature;
		public Token instanceClassName;
		public Token s56;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s57;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public EEnumLiteralContext eEnumLiteral;
		public List<EEnumLiteralContext> ownedLiteral = new ArrayList<EEnumLiteralContext>();
		public InvariantContext invariant;
		public List<InvariantContext> ownedConstraint = new ArrayList<InvariantContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public TemplateSignatureContext templateSignature() {
			return getRuleContext(TemplateSignatureContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<EEnumLiteralContext> eEnumLiteral() {
			return getRuleContexts(EEnumLiteralContext.class);
		}
		public EEnumLiteralContext eEnumLiteral(int i) {
			return getRuleContext(EEnumLiteralContext.class,i);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public EEnumContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EEnumContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EEnumContext eEnum(Element owner) throws RecognitionException {
		EEnumContext _localctx = new EEnumContext(_ctx, getState(), owner);
		enterRule(_localctx, 44, RULE_eEnum);
		((EEnumContext)_localctx).element =  eFactory.createEEnum();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (T__82 - 83)) | (1L << (T__83 - 83)) | (1L << (T__84 - 83)))) != 0)) {
				{
				setState(828);
				((EEnumContext)_localctx).visibility = visibilityKind();
				}
			}

			if (_localctx.visibility != null) _localctx.element.getEAnnotations().add(((EEnumContext)_localctx).visibility.element);
			setState(832);
			match(T__57);
			setState(833);
			((EEnumContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((EEnumContext)_localctx).name!=null?_input.getText(((EEnumContext)_localctx).name.start,((EEnumContext)_localctx).name.stop):null));
			((EEnumContext)_localctx).current =  new Enum(_localctx.element, _localctx);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(836);
				((EEnumContext)_localctx).ownedSignature = ((EEnumContext)_localctx).templateSignature = templateSignature(_localctx.current);
				}
			}

			if(_localctx.templateSignature != null) _localctx.element.getETypeParameters().addAll(((EEnumContext)_localctx).templateSignature.typeParameters);
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(840);
				match(T__5);
				setState(841);
				((EEnumContext)_localctx).instanceClassName = match(SINGLE_QUOTED_STRING);
				}
			}

			if(((EEnumContext)_localctx).instanceClassName != null) _localctx.element.setInstanceClassName(((EEnumContext)_localctx).instanceClassName.getText().replace("'", ""));
			setState(851);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(845);
				match(T__1);
				setState(848);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__55:
					{
					setState(846);
					((EEnumContext)_localctx).s56 = match(T__55);
					((EEnumContext)_localctx).qualifier.add(((EEnumContext)_localctx).s56);
					}
					break;
				case T__56:
					{
					setState(847);
					((EEnumContext)_localctx).s57 = match(T__56);
					((EEnumContext)_localctx).qualifier.add(((EEnumContext)_localctx).s57);
					}
					break;
				case T__3:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(850);
				match(T__3);
				}
				break;
			}
			setState(870);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(853);
				match(T__1);
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(863);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
					case 1:
						{
						setState(854);
						((EEnumContext)_localctx).eAnnotation = ((EEnumContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EEnumContext)_localctx).ownedAnnotations.add(((EEnumContext)_localctx).eAnnotation);
						_localctx.element.getEAnnotations().add(((EEnumContext)_localctx).eAnnotation.element);
						}
						break;
					case 2:
						{
						setState(857);
						((EEnumContext)_localctx).eEnumLiteral = ((EEnumContext)_localctx).eEnumLiteral = eEnumLiteral(_localctx.current);
						((EEnumContext)_localctx).ownedLiteral.add(((EEnumContext)_localctx).eEnumLiteral);
						_localctx.element.getELiterals().add(((EEnumContext)_localctx).eEnumLiteral.element);
						}
						break;
					case 3:
						{
						setState(860);
						((EEnumContext)_localctx).invariant = ((EEnumContext)_localctx).invariant = invariant(_localctx.current);
						((EEnumContext)_localctx).ownedConstraint.add(((EEnumContext)_localctx).invariant);
						_localctx.element.getEAnnotations().add(((EEnumContext)_localctx).invariant.element);
						}
						break;
					}
					}
					setState(867);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(868);
				match(T__3);
				}
				}
				break;
			case T__17:
				{
				setState(869);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			for(String s: ((EEnumContext)_localctx).qualifier.stream().map(Token::getText).distinct().collect(Collectors.toList())){
			        switch (s) {
			            case "!serializable": _localctx.element.setSerializable(false); break;}}
			    
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EEnumLiteralContext extends ParserRuleContext {
		public Element owner;
		public EEnumLiteral element;
		public EnumLiteral current;
		public UnrestrictedNameContext name;
		public SignedContext value;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public SignedContext signed() {
			return getRuleContext(SignedContext.class,0);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public EEnumLiteralContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EEnumLiteralContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eEnumLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEEnumLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEEnumLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEEnumLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EEnumLiteralContext eEnumLiteral(Element owner) throws RecognitionException {
		EEnumLiteralContext _localctx = new EEnumLiteralContext(_ctx, getState(), owner);
		enterRule(_localctx, 46, RULE_eEnumLiteral);
		((EEnumLiteralContext)_localctx).element =  eFactory.createEEnumLiteral();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				{
				setState(874);
				match(T__58);
				setState(875);
				((EEnumLiteralContext)_localctx).name = unrestrictedName();
				}
				}
				break;
			case 2:
				{
				setState(876);
				((EEnumLiteralContext)_localctx).name = unrestrictedName();
				}
				break;
			}
			_localctx.element.setName((((EEnumLiteralContext)_localctx).name!=null?_input.getText(((EEnumLiteralContext)_localctx).name.start,((EEnumLiteralContext)_localctx).name.stop):null));
			((EEnumLiteralContext)_localctx).current =  new EnumLiteral(_localctx.element, _localctx);
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(881);
				match(T__20);
				setState(882);
				((EEnumLiteralContext)_localctx).value = signed();
				}
			}

			 
			setState(896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(886);
				match(T__1);
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__59) {
					{
					{
					setState(887);
					((EEnumLiteralContext)_localctx).eAnnotation = ((EEnumLiteralContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
					((EEnumLiteralContext)_localctx).ownedAnnotations.add(((EEnumLiteralContext)_localctx).eAnnotation);
					}
					}
					setState(892);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				_localctx.element.getEAnnotations().add(((EEnumLiteralContext)_localctx).eAnnotation.element);
				setState(894);
				match(T__3);
				}
				}
				break;
			case T__17:
				{
				setState(895);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EAnnotationContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public Annotation current;
		public Token source;
		public EDetailContext eDetail;
		public List<EDetailContext> ownedDetails = new ArrayList<EDetailContext>();
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public EModelElementContext eModelElement;
		public List<EModelElementContext> ownedContents = new ArrayList<EModelElementContext>();
		public EModelElementRefContext eModelElementRef;
		public List<EModelElementRefContext> ownedReferences = new ArrayList<EModelElementRefContext>();
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public List<EDetailContext> eDetail() {
			return getRuleContexts(EDetailContext.class);
		}
		public EDetailContext eDetail(int i) {
			return getRuleContext(EDetailContext.class,i);
		}
		public List<EAnnotationContext> eAnnotation() {
			return getRuleContexts(EAnnotationContext.class);
		}
		public EAnnotationContext eAnnotation(int i) {
			return getRuleContext(EAnnotationContext.class,i);
		}
		public List<EModelElementContext> eModelElement() {
			return getRuleContexts(EModelElementContext.class);
		}
		public EModelElementContext eModelElement(int i) {
			return getRuleContext(EModelElementContext.class,i);
		}
		public List<EModelElementRefContext> eModelElementRef() {
			return getRuleContexts(EModelElementRefContext.class);
		}
		public EModelElementRefContext eModelElementRef(int i) {
			return getRuleContext(EModelElementRefContext.class,i);
		}
		public EAnnotationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EAnnotationContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEAnnotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EAnnotationContext eAnnotation(Element owner) throws RecognitionException {
		EAnnotationContext _localctx = new EAnnotationContext(_ctx, getState(), owner);
		enterRule(_localctx, 48, RULE_eAnnotation);
		((EAnnotationContext)_localctx).element =  eFactory.createEAnnotation();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(T__59);
			setState(900);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_QUOTED_STRING) {
				{
				setState(899);
				((EAnnotationContext)_localctx).source = match(SINGLE_QUOTED_STRING);
				}
			}

			_localctx.element.setSource(((EAnnotationContext)_localctx).source != null ? ((EAnnotationContext)_localctx).source.getText().replace("'", "") : null);
			((EAnnotationContext)_localctx).current =  new Annotation(_localctx.element, _localctx);
			setState(915);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(904);
				match(T__14);
				setState(905);
				((EAnnotationContext)_localctx).eDetail = eDetail(_localctx.current);
				((EAnnotationContext)_localctx).ownedDetails.add(((EAnnotationContext)_localctx).eDetail);
				setState(910);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(906);
					match(T__2);
					setState(907);
					((EAnnotationContext)_localctx).eDetail = eDetail(_localctx.current);
					((EAnnotationContext)_localctx).ownedDetails.add(((EAnnotationContext)_localctx).eDetail);
					}
					}
					setState(912);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(913);
				match(T__15);
				}
			}

			for (EDetailContext ctx: ((EAnnotationContext)_localctx).ownedDetails) _localctx.element.getDetails().put(ctx.k, ctx.v);
			setState(935);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(918);
				match(T__1);
				setState(928); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(928);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
					case 1:
						{
						setState(919);
						((EAnnotationContext)_localctx).eAnnotation = ((EAnnotationContext)_localctx).eAnnotation = eAnnotation(_localctx.current);
						((EAnnotationContext)_localctx).ownedAnnotations.add(((EAnnotationContext)_localctx).eAnnotation);
						if(((EAnnotationContext)_localctx).eAnnotation.element != null) _localctx.element.getEAnnotations().add(((EAnnotationContext)_localctx).eAnnotation.element);
						}
						break;
					case 2:
						{
						setState(922);
						((EAnnotationContext)_localctx).eModelElement = ((EAnnotationContext)_localctx).eModelElement = eModelElement(_localctx.current);
						((EAnnotationContext)_localctx).ownedContents.add(((EAnnotationContext)_localctx).eModelElement);
						if(((EAnnotationContext)_localctx).eModelElement.element != null) _localctx.element.getContents().add(((EAnnotationContext)_localctx).eModelElement.element);
						}
						break;
					case 3:
						{
						setState(925);
						((EAnnotationContext)_localctx).eModelElementRef = ((EAnnotationContext)_localctx).eModelElementRef = eModelElementRef(_localctx.current);
						((EAnnotationContext)_localctx).ownedReferences.add(((EAnnotationContext)_localctx).eModelElementRef);
						if(((EAnnotationContext)_localctx).eModelElementRef.element != null) _localctx.element.getReferences().add(((EAnnotationContext)_localctx).eModelElementRef.element);
						}
						break;
					}
					}
					setState(930); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__82 - 74)) | (1L << (T__83 - 74)) | (1L << (T__84 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (IDENTIFIER - 74)))) != 0) );
				setState(932);
				match(T__3);
				}
				}
				break;
			case T__17:
				{
				setState(934);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EDetailContext extends ParserRuleContext {
		public Element owner;
		public String k;
		public String v;
		public AnnotationDetail current;
		public Token key;
		public Token value;
		public List<TerminalNode> SINGLE_QUOTED_STRING() { return getTokens(AlloyInEcoreParser.SINGLE_QUOTED_STRING); }
		public TerminalNode SINGLE_QUOTED_STRING(int i) {
			return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, i);
		}
		public TerminalNode ML_SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.ML_SINGLE_QUOTED_STRING, 0); }
		public EDetailContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EDetailContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eDetail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEDetail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EDetailContext eDetail(Element owner) throws RecognitionException {
		EDetailContext _localctx = new EDetailContext(_ctx, getState(), owner);
		enterRule(_localctx, 50, RULE_eDetail);
		((EDetailContext)_localctx).current =  new AnnotationDetail(_localctx);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_QUOTED_STRING) {
				{
				setState(937);
				((EDetailContext)_localctx).key = match(SINGLE_QUOTED_STRING);
				}
			}

			setState(940);
			match(T__20);
			setState(942);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_QUOTED_STRING || _la==ML_SINGLE_QUOTED_STRING) {
				{
				setState(941);
				((EDetailContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==SINGLE_QUOTED_STRING || _la==ML_SINGLE_QUOTED_STRING) ) {
					((EDetailContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			((EDetailContext)_localctx).k =  ((EDetailContext)_localctx).key != null ? ((EDetailContext)_localctx).key.getText().replace("'", "") : null; ((EDetailContext)_localctx).v =  ((EDetailContext)_localctx).value != null ? ((EDetailContext)_localctx).value.getText().replace("'", "") : null; 
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EModelElementContext extends ParserRuleContext {
		public Element owner;
		public EModelElement element;
		public EAnnotationContext eAnnotation;
		public ENamedElementContext eNamedElement;
		public EAnnotationContext eAnnotation() {
			return getRuleContext(EAnnotationContext.class,0);
		}
		public ENamedElementContext eNamedElement() {
			return getRuleContext(ENamedElementContext.class,0);
		}
		public EModelElementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EModelElementContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eModelElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEModelElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEModelElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEModelElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EModelElementContext eModelElement(Element owner) throws RecognitionException {
		EModelElementContext _localctx = new EModelElementContext(_ctx, getState(), owner);
		enterRule(_localctx, 52, RULE_eModelElement);
		try {
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				((EModelElementContext)_localctx).eAnnotation = eAnnotation(_localctx.owner);
				((EModelElementContext)_localctx).element =  ((EModelElementContext)_localctx).eAnnotation.element;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(949);
				((EModelElementContext)_localctx).eNamedElement = eNamedElement(_localctx.owner);
				((EModelElementContext)_localctx).element =  ((EModelElementContext)_localctx).eNamedElement.element;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ENamedElementContext extends ParserRuleContext {
		public Element owner;
		public ENamedElement element;
		public ETypedElementContext eTypedElement;
		public EClassifierContext eClassifier;
		public EPackageContext ePackage;
		public EEnumLiteralContext eEnumLiteral;
		public ETypedElementContext eTypedElement() {
			return getRuleContext(ETypedElementContext.class,0);
		}
		public EClassifierContext eClassifier() {
			return getRuleContext(EClassifierContext.class,0);
		}
		public EPackageContext ePackage() {
			return getRuleContext(EPackageContext.class,0);
		}
		public EEnumLiteralContext eEnumLiteral() {
			return getRuleContext(EEnumLiteralContext.class,0);
		}
		public ENamedElementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ENamedElementContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eNamedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterENamedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitENamedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitENamedElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ENamedElementContext eNamedElement(Element owner) throws RecognitionException {
		ENamedElementContext _localctx = new ENamedElementContext(_ctx, getState(), owner);
		enterRule(_localctx, 54, RULE_eNamedElement);
		try {
			setState(966);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				((ENamedElementContext)_localctx).eTypedElement = eTypedElement(_localctx.owner);
				((ENamedElementContext)_localctx).element =  ((ENamedElementContext)_localctx).eTypedElement.element;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(957);
				((ENamedElementContext)_localctx).eClassifier = eClassifier(_localctx.owner);
				((ENamedElementContext)_localctx).element =  ((ENamedElementContext)_localctx).eClassifier.element;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(960);
				((ENamedElementContext)_localctx).ePackage = ePackage(_localctx.owner);
				((ENamedElementContext)_localctx).element =  ((ENamedElementContext)_localctx).ePackage.element;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(963);
				((ENamedElementContext)_localctx).eEnumLiteral = eEnumLiteral(_localctx.owner);
				((ENamedElementContext)_localctx).element =  ((ENamedElementContext)_localctx).eEnumLiteral.element;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ETypedElementContext extends ParserRuleContext {
		public Element owner;
		public ETypedElement element;
		public EOperationContext eOperation;
		public EParameterContext eParameter;
		public EStructuralFeatureContext eStructuralFeature;
		public EOperationContext eOperation() {
			return getRuleContext(EOperationContext.class,0);
		}
		public EParameterContext eParameter() {
			return getRuleContext(EParameterContext.class,0);
		}
		public EStructuralFeatureContext eStructuralFeature() {
			return getRuleContext(EStructuralFeatureContext.class,0);
		}
		public ETypedElementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ETypedElementContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eTypedElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterETypedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitETypedElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitETypedElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ETypedElementContext eTypedElement(Element owner) throws RecognitionException {
		ETypedElementContext _localctx = new ETypedElementContext(_ctx, getState(), owner);
		enterRule(_localctx, 56, RULE_eTypedElement);
		try {
			setState(977);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				((ETypedElementContext)_localctx).eOperation = eOperation(_localctx.owner);
				((ETypedElementContext)_localctx).element =  ((ETypedElementContext)_localctx).eOperation.element;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				((ETypedElementContext)_localctx).eParameter = eParameter(_localctx.owner);
				((ETypedElementContext)_localctx).element =  ((ETypedElementContext)_localctx).eParameter.element;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(974);
				((ETypedElementContext)_localctx).eStructuralFeature = eStructuralFeature(_localctx.owner);
				((ETypedElementContext)_localctx).element =  ((ETypedElementContext)_localctx).eStructuralFeature.element;
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EModelElementRefContext extends ParserRuleContext {
		public Element owner;
		public EObject element;
		public AnnotationReference current;
		public PathNameContext ownedPathName;
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public EModelElementRefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EModelElementRefContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eModelElementRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEModelElementRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEModelElementRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEModelElementRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EModelElementRefContext eModelElementRef(Element owner) throws RecognitionException {
		EModelElementRefContext _localctx = new EModelElementRefContext(_ctx, getState(), owner);
		enterRule(_localctx, 58, RULE_eModelElementRef);
		((EModelElementRefContext)_localctx).current =  new AnnotationReference(_localctx);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(T__60);
			setState(980);
			((EModelElementRefContext)_localctx).ownedPathName = pathName(_localctx.current);
			setState(981);
			match(T__17);
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current); if (((EModelElementRefContext)_localctx).ownedPathName.element != null) _localctx.current.setEObject(((EModelElementRefContext)_localctx).element =  ((EModelElementRefContext)_localctx).ownedPathName.element);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplateSignatureContext extends ParserRuleContext {
		public Element owner;
		public List<ETypeParameter> typeParameters;
		public ETypeParameterContext eTypeParameter;
		public List<ETypeParameterContext> ownedTypeParameters = new ArrayList<ETypeParameterContext>();
		public List<ETypeParameterContext> eTypeParameter() {
			return getRuleContexts(ETypeParameterContext.class);
		}
		public ETypeParameterContext eTypeParameter(int i) {
			return getRuleContext(ETypeParameterContext.class,i);
		}
		public TemplateSignatureContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TemplateSignatureContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_templateSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTemplateSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTemplateSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTemplateSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateSignatureContext templateSignature(Element owner) throws RecognitionException {
		TemplateSignatureContext _localctx = new TemplateSignatureContext(_ctx, getState(), owner);
		enterRule(_localctx, 60, RULE_templateSignature);
		((TemplateSignatureContext)_localctx).typeParameters =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			match(T__61);
			setState(984);
			((TemplateSignatureContext)_localctx).eTypeParameter = eTypeParameter(_localctx.owner);
			((TemplateSignatureContext)_localctx).ownedTypeParameters.add(((TemplateSignatureContext)_localctx).eTypeParameter);
			setState(989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(985);
				match(T__2);
				setState(986);
				((TemplateSignatureContext)_localctx).eTypeParameter = eTypeParameter(_localctx.owner);
				((TemplateSignatureContext)_localctx).ownedTypeParameters.add(((TemplateSignatureContext)_localctx).eTypeParameter);
				}
				}
				setState(991);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(992);
			match(T__62);
			}
			_ctx.stop = _input.LT(-1);
			for(ETypeParameterContext ctx: ((TemplateSignatureContext)_localctx).ownedTypeParameters) _localctx.typeParameters.add(ctx.element);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ETypeParameterContext extends ParserRuleContext {
		public Element owner;
		public ETypeParameter element;
		public TypeParameter current;
		public UnrestrictedNameContext name;
		public EGenericTypeContext eGenericType;
		public List<EGenericTypeContext> ownedEBounds = new ArrayList<EGenericTypeContext>();
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public List<EGenericTypeContext> eGenericType() {
			return getRuleContexts(EGenericTypeContext.class);
		}
		public EGenericTypeContext eGenericType(int i) {
			return getRuleContext(EGenericTypeContext.class,i);
		}
		public ETypeParameterContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ETypeParameterContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eTypeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterETypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitETypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitETypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ETypeParameterContext eTypeParameter(Element owner) throws RecognitionException {
		ETypeParameterContext _localctx = new ETypeParameterContext(_ctx, getState(), owner);
		enterRule(_localctx, 62, RULE_eTypeParameter);
		((ETypeParameterContext)_localctx).element =  eFactory.createETypeParameter();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			((ETypeParameterContext)_localctx).name = unrestrictedName();
			_localctx.element.setName((((ETypeParameterContext)_localctx).name!=null?_input.getText(((ETypeParameterContext)_localctx).name.start,((ETypeParameterContext)_localctx).name.stop):null));
			((ETypeParameterContext)_localctx).current =  new TypeParameter(_localctx.element, _localctx);
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(997);
				match(T__24);
				setState(998);
				((ETypeParameterContext)_localctx).eGenericType = eGenericType(_localctx.current);
				((ETypeParameterContext)_localctx).ownedEBounds.add(((ETypeParameterContext)_localctx).eGenericType);
				setState(1003);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__63) {
					{
					{
					setState(999);
					match(T__63);
					setState(1000);
					((ETypeParameterContext)_localctx).eGenericType = eGenericType(_localctx.current);
					((ETypeParameterContext)_localctx).ownedEBounds.add(((ETypeParameterContext)_localctx).eGenericType);
					}
					}
					setState(1005);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			for(EGenericTypeContext ctx: ((ETypeParameterContext)_localctx).ownedEBounds) _localctx.element.getEBounds().add(ctx.element);
			}
			_ctx.stop = _input.LT(-1);
			owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericTypeArgumentContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public GenericTypeArgument current;
		public EGenericTypeContext eGenericType;
		public EGenericWildcardContext eGenericWildcard;
		public EGenericTypeContext eGenericType() {
			return getRuleContext(EGenericTypeContext.class,0);
		}
		public EGenericWildcardContext eGenericWildcard() {
			return getRuleContext(EGenericWildcardContext.class,0);
		}
		public EGenericTypeArgumentContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericTypeArgumentContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericTypeArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericTypeArgumentContext eGenericTypeArgument(Element owner) throws RecognitionException {
		EGenericTypeArgumentContext _localctx = new EGenericTypeArgumentContext(_ctx, getState(), owner);
		enterRule(_localctx, 64, RULE_eGenericTypeArgument);
		((EGenericTypeArgumentContext)_localctx).current =  new GenericTypeArgument(_localctx);
		try {
			setState(1016);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__38:
			case T__40:
			case T__42:
			case T__43:
			case T__45:
			case T__46:
			case T__47:
			case T__53:
			case T__54:
			case T__55:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__78:
			case T__80:
			case T__81:
			case T__132:
			case T__133:
			case T__134:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				((EGenericTypeArgumentContext)_localctx).eGenericType = eGenericType(_localctx.current);
				((EGenericTypeArgumentContext)_localctx).element =  ((EGenericTypeArgumentContext)_localctx).eGenericType.element;
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				((EGenericTypeArgumentContext)_localctx).eGenericWildcard = eGenericWildcard(_localctx.current);
				((EGenericTypeArgumentContext)_localctx).element =  ((EGenericTypeArgumentContext)_localctx).eGenericWildcard.element;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			_localctx.current.setEObject(_localctx.element); _localctx.owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericTypeContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public Element current;
		public PathNameContext ownedPathName;
		public EGenericTypeArgumentContext eGenericTypeArgument;
		public List<EGenericTypeArgumentContext> ownedETypeArguments = new ArrayList<EGenericTypeArgumentContext>();
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public List<EGenericTypeArgumentContext> eGenericTypeArgument() {
			return getRuleContexts(EGenericTypeArgumentContext.class);
		}
		public EGenericTypeArgumentContext eGenericTypeArgument(int i) {
			return getRuleContext(EGenericTypeArgumentContext.class,i);
		}
		public EGenericTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericTypeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericTypeContext eGenericType(Element owner) throws RecognitionException {
		EGenericTypeContext _localctx = new EGenericTypeContext(_ctx, getState(), owner);
		enterRule(_localctx, 66, RULE_eGenericType);
		((EGenericTypeContext)_localctx).element =  eFactory.createEGenericType(); if (_localctx.parent instanceof ETypeParameterContext) ((EGenericTypeContext)_localctx).current =  new GenericType(_localctx.element, _localctx); else ((EGenericTypeContext)_localctx).current =  _localctx.owner;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			((EGenericTypeContext)_localctx).ownedPathName = pathName(_localctx.current);
			setState(1030);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__61) {
				{
				setState(1019);
				match(T__61);
				setState(1020);
				((EGenericTypeContext)_localctx).eGenericTypeArgument = eGenericTypeArgument(_localctx.current);
				((EGenericTypeContext)_localctx).ownedETypeArguments.add(((EGenericTypeContext)_localctx).eGenericTypeArgument);
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1021);
					match(T__2);
					setState(1022);
					((EGenericTypeContext)_localctx).eGenericTypeArgument = eGenericTypeArgument(_localctx.current);
					((EGenericTypeContext)_localctx).ownedETypeArguments.add(((EGenericTypeContext)_localctx).eGenericTypeArgument);
					}
					}
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1028);
				match(T__62);
				}
			}

			}
			_ctx.stop = _input.LT(-1);
			if (_localctx.parent instanceof ETypeParameterContext)  owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericElementTypeContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public GenericElementType current;
		public EPrimitiveTypeContext ePrimitiveType;
		public EGenericTypeContext eGenericType;
		public EPrimitiveTypeContext ePrimitiveType() {
			return getRuleContext(EPrimitiveTypeContext.class,0);
		}
		public EGenericTypeContext eGenericType() {
			return getRuleContext(EGenericTypeContext.class,0);
		}
		public EGenericElementTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericElementTypeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericElementType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericElementType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericElementType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericElementType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericElementTypeContext eGenericElementType(Element owner) throws RecognitionException {
		EGenericElementTypeContext _localctx = new EGenericElementTypeContext(_ctx, getState(), owner);
		enterRule(_localctx, 68, RULE_eGenericElementType);
		((EGenericElementTypeContext)_localctx).current =  new GenericElementType(_localctx);
		try {
			setState(1038);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__68:
			case T__69:
			case T__70:
			case T__71:
			case T__72:
				enterOuterAlt(_localctx, 1);
				{
				setState(1032);
				((EGenericElementTypeContext)_localctx).ePrimitiveType = ePrimitiveType(_localctx.current);
				((EGenericElementTypeContext)_localctx).element =  ((EGenericElementTypeContext)_localctx).ePrimitiveType.element;
				}
				break;
			case T__16:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__38:
			case T__40:
			case T__42:
			case T__43:
			case T__45:
			case T__46:
			case T__47:
			case T__53:
			case T__54:
			case T__55:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__78:
			case T__80:
			case T__81:
			case T__132:
			case T__133:
			case T__134:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1035);
				((EGenericElementTypeContext)_localctx).eGenericType = eGenericType(_localctx.current);
				((EGenericElementTypeContext)_localctx).element =  ((EGenericElementTypeContext)_localctx).eGenericType.element;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			_localctx.current.setEObject(_localctx.element); _localctx.owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EGenericWildcardContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public GenericWildcard current;
		public Token bound;
		public EGenericTypeContext ownedExtend;
		public EGenericTypeContext eGenericType;
		public EGenericTypeContext eGenericType() {
			return getRuleContext(EGenericTypeContext.class,0);
		}
		public EGenericWildcardContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EGenericWildcardContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_eGenericWildcard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEGenericWildcard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEGenericWildcard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEGenericWildcard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EGenericWildcardContext eGenericWildcard(Element owner) throws RecognitionException {
		EGenericWildcardContext _localctx = new EGenericWildcardContext(_ctx, getState(), owner);
		enterRule(_localctx, 70, RULE_eGenericWildcard);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			match(T__50);
			((EGenericWildcardContext)_localctx).element =  eFactory.createEGenericType(); ((EGenericWildcardContext)_localctx).current =  new GenericWildcard(_localctx.element, _localctx); owner.addOwnedElement(_localctx.current);
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24 || _la==T__64) {
				{
				setState(1042);
				((EGenericWildcardContext)_localctx).bound = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__64) ) {
					((EGenericWildcardContext)_localctx).bound = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1043);
				((EGenericWildcardContext)_localctx).ownedExtend = ((EGenericWildcardContext)_localctx).eGenericType = eGenericType(_localctx.current);
				if (((EGenericWildcardContext)_localctx).bound.equals("extends")) _localctx.element.setEUpperBound(((EGenericWildcardContext)_localctx).eGenericType.element); else _localctx.element.setELowerBound(((EGenericWildcardContext)_localctx).eGenericType.element);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PathNameContext extends ParserRuleContext {
		public Element owner;
		public EObject element;
		public UnrestrictedNameContext firstSegment;
		public SegmentContext segment;
		public List<SegmentContext> midSegments = new ArrayList<SegmentContext>();
		public SegmentContext lastSegment;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public List<SegmentContext> segment() {
			return getRuleContexts(SegmentContext.class);
		}
		public SegmentContext segment(int i) {
			return getRuleContext(SegmentContext.class,i);
		}
		public PathNameContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PathNameContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_pathName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterPathName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitPathName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitPathName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathNameContext pathName(Element owner) throws RecognitionException {
		PathNameContext _localctx = new PathNameContext(_ctx, getState(), owner);
		enterRule(_localctx, 72, RULE_pathName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			((PathNameContext)_localctx).firstSegment = unrestrictedName();
			setState(1056);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1052);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1049);
						((PathNameContext)_localctx).segment = segment();
						((PathNameContext)_localctx).midSegments.add(((PathNameContext)_localctx).segment);
						}
						} 
					}
					setState(1054);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				}
				setState(1055);
				((PathNameContext)_localctx).lastSegment = segment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SegmentContext extends ParserRuleContext {
		public UnrestrictedNameContext name;
		public IntegerContext index;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public SegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSegment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSegment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SegmentContext segment() throws RecognitionException {
		SegmentContext _localctx = new SegmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(T__65);
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__66) {
				{
				setState(1059);
				match(T__66);
				}
			}

			setState(1062);
			((SegmentContext)_localctx).name = unrestrictedName();
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1063);
				match(T__67);
				setState(1064);
				((SegmentContext)_localctx).index = integer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EPrimitiveTypeContext extends ParserRuleContext {
		public Element owner;
		public EGenericType element;
		public PrimitiveType current;
		public EPrimitiveTypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EPrimitiveTypeContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_ePrimitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EPrimitiveTypeContext ePrimitiveType(Element owner) throws RecognitionException {
		EPrimitiveTypeContext _localctx = new EPrimitiveTypeContext(_ctx, getState(), owner);
		enterRule(_localctx, 76, RULE_ePrimitiveType);
		try {
			setState(1077);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__68:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				match(T__68);
				((EPrimitiveTypeContext)_localctx).element =  eFactory.createEGenericType(); _localctx.element.setEClassifier(EcorePackage.eINSTANCE.getEBoolean());
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 2);
				{
				setState(1069);
				match(T__69);
				((EPrimitiveTypeContext)_localctx).element =  eFactory.createEGenericType(); _localctx.element.setEClassifier(EcorePackage.eINSTANCE.getEInt());
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 3);
				{
				setState(1071);
				match(T__70);
				((EPrimitiveTypeContext)_localctx).element =  eFactory.createEGenericType(); _localctx.element.setEClassifier(EcorePackage.eINSTANCE.getEString());
				}
				break;
			case T__71:
				enterOuterAlt(_localctx, 4);
				{
				setState(1073);
				match(T__71);
				((EPrimitiveTypeContext)_localctx).element =  eFactory.createEGenericType(); _localctx.element.setEClassifier(EcorePackage.eINSTANCE.getEBigDecimal());
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 5);
				{
				setState(1075);
				match(T__72);
				((EPrimitiveTypeContext)_localctx).element =  eFactory.createEGenericType(); _localctx.element.setEClassifier(EcorePackage.eINSTANCE.getEBigInteger());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			((EPrimitiveTypeContext)_localctx).current =  new PrimitiveType(_localctx.element, _localctx); owner.addOwnedElement(_localctx.current);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public Body current;
		public IdentifierContext name;
		public ExpressionContext ownedExpression;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BodyContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body(Element owner) throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState(), owner);
		enterRule(_localctx, 78, RULE_body);
		((BodyContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.BODY); ((BodyContext)_localctx).current =  new Body(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(T__73);
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1080);
				((BodyContext)_localctx).name = identifier();
				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((BodyContext)_localctx).name!=null?_input.getText(((BodyContext)_localctx).name.start,((BodyContext)_localctx).name.stop):null)); 
			setState(1090);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1084);
				match(T__5);
				setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1085);
					((BodyContext)_localctx).ownedExpression = expression(0);
					}
				}

				setState(1088);
				match(T__17);
				}
				}
				break;
			case T__17:
				{
				setState(1089);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedExpression!=null) _localctx.element.getDetails().put("expression", getContextText(_localctx.expression())); 
			}
			_ctx.stop = _input.LT(-1);
			if (!owners.empty()) owners.pop();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvariantContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public Invariant current;
		public Token isCallable;
		public IdentifierContext name;
		public Token message;
		public FormulaContext ownedSpecification;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.DOUBLE_QUOTED_STRING, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public InvariantContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InvariantContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_invariant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterInvariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitInvariant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitInvariant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InvariantContext invariant(Element owner) throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState(), owner);
		enterRule(_localctx, 80, RULE_invariant);
		((InvariantContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.INVARIANT); ((InvariantContext)_localctx).current =  new Invariant(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__74) {
				{
				setState(1094);
				((InvariantContext)_localctx).isCallable = match(T__74);
				}
			}

			_localctx.element.getDetails().put("callable", ((InvariantContext)_localctx).isCallable != null ? "true" : "false");
			setState(1098);
			match(T__75);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1099);
				((InvariantContext)_localctx).name = identifier();
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(1100);
					match(T__14);
					setState(1101);
					((InvariantContext)_localctx).message = match(DOUBLE_QUOTED_STRING);
					setState(1102);
					match(T__15);
					}
				}

				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((InvariantContext)_localctx).name!=null?_input.getText(((InvariantContext)_localctx).name.start,((InvariantContext)_localctx).name.stop):null)); if(((InvariantContext)_localctx).message!=null) _localctx.element.getDetails().put("message", (((InvariantContext)_localctx).message!=null?((InvariantContext)_localctx).message.getText():null).replace("\"", ""));
			setState(1114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1108);
				match(T__5);
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1109);
					((InvariantContext)_localctx).ownedSpecification = formula(0);
					}
				}

				setState(1112);
				match(T__17);
				}
				}
				break;
			case T__17:
				{
				setState(1113);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedSpecification!=null) {_localctx.element.getDetails().put("formula", getContextText(_localctx.formula())); _localctx.current.addOwnedElement(((InvariantContext)_localctx).ownedSpecification.element);}
			}
			_ctx.stop = _input.LT(-1);
			if (!owners.empty()) owners.pop();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreconditionContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public PreCondition current;
		public IdentifierContext name;
		public Token message;
		public FormulaContext ownedSpecification;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.DOUBLE_QUOTED_STRING, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public PreconditionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PreconditionContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_precondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterPrecondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitPrecondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitPrecondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreconditionContext precondition(Element owner) throws RecognitionException {
		PreconditionContext _localctx = new PreconditionContext(_ctx, getState(), owner);
		enterRule(_localctx, 82, RULE_precondition);
		((PreconditionContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.PRECONDITION); ((PreconditionContext)_localctx).current =  new PreCondition(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118);
			_la = _input.LA(1);
			if ( !(_la==T__76 || _la==T__77) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1119);
				((PreconditionContext)_localctx).name = identifier();
				setState(1123);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(1120);
					match(T__14);
					setState(1121);
					((PreconditionContext)_localctx).message = match(DOUBLE_QUOTED_STRING);
					setState(1122);
					match(T__15);
					}
				}

				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((PreconditionContext)_localctx).name!=null?_input.getText(((PreconditionContext)_localctx).name.start,((PreconditionContext)_localctx).name.stop):null)); if(((PreconditionContext)_localctx).message!=null) _localctx.element.getDetails().put("message", (((PreconditionContext)_localctx).message!=null?((PreconditionContext)_localctx).message.getText():null).replace("\"", ""));
			setState(1135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1128);
				match(T__5);
				owners.push(_localctx.current);
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1130);
					((PreconditionContext)_localctx).ownedSpecification = formula(0);
					}
				}

				setState(1133);
				match(T__17);
				}
				}
				break;
			case T__17:
				{
				setState(1134);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedSpecification!=null) _localctx.element.getDetails().put("formula", getContextText(_localctx.formula())); 
			}
			_ctx.stop = _input.LT(-1);
			if (!owners.empty()) owners.pop();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostconditionContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public PostCondition current;
		public IdentifierContext name;
		public Token message;
		public FormulaContext ownedSpecification;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.DOUBLE_QUOTED_STRING, 0); }
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public PostconditionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PostconditionContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_postcondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterPostcondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitPostcondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitPostcondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostconditionContext postcondition(Element owner) throws RecognitionException {
		PostconditionContext _localctx = new PostconditionContext(_ctx, getState(), owner);
		enterRule(_localctx, 84, RULE_postcondition);
		((PostconditionContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.POSTCONDITION); ((PostconditionContext)_localctx).current =  new PostCondition(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			_la = _input.LA(1);
			if ( !(_la==T__78 || _la==T__79) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1140);
				((PostconditionContext)_localctx).name = identifier();
				setState(1144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(1141);
					match(T__14);
					setState(1142);
					((PostconditionContext)_localctx).message = match(DOUBLE_QUOTED_STRING);
					setState(1143);
					match(T__15);
					}
				}

				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((PostconditionContext)_localctx).name!=null?_input.getText(((PostconditionContext)_localctx).name.start,((PostconditionContext)_localctx).name.stop):null)); if(((PostconditionContext)_localctx).message!=null) _localctx.element.getDetails().put("message", (((PostconditionContext)_localctx).message!=null?((PostconditionContext)_localctx).message.getText():null).replace("\"", ""));
			setState(1156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1149);
				match(T__5);
				owners.push(_localctx.current);
				setState(1152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1151);
					((PostconditionContext)_localctx).ownedSpecification = formula(0);
					}
				}

				setState(1154);
				match(T__17);
				}
				}
				break;
			case T__17:
				{
				setState(1155);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedSpecification!=null) _localctx.element.getDetails().put("formula", getContextText(_localctx.formula())); 
			}
			_ctx.stop = _input.LT(-1);
			if (!owners.empty()) owners.pop();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitialContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public Initial current;
		public IdentifierContext name;
		public ExpressionContext ownedExpression;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InitialContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_initial; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitInitial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitInitial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialContext initial(Element owner) throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState(), owner);
		enterRule(_localctx, 86, RULE_initial);
		((InitialContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.INITIAL); ((InitialContext)_localctx).current =  new Initial(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			match(T__80);
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1161);
				((InitialContext)_localctx).name = identifier();
				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((InitialContext)_localctx).name!=null?_input.getText(((InitialContext)_localctx).name.start,((InitialContext)_localctx).name.stop):null));
			setState(1171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1165);
				match(T__5);
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1166);
					((InitialContext)_localctx).ownedExpression = expression(0);
					}
				}

				setState(1169);
				match(T__17);
				}
				}
				break;
			case T__17:
				{
				setState(1170);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedExpression!=null) _localctx.element.getDetails().put("expression", getContextText(_localctx.expression())); 
			}
			_ctx.stop = _input.LT(-1);
			if (!owners.empty()) owners.pop();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DerivationContext extends ParserRuleContext {
		public Element owner;
		public EAnnotation element;
		public Derivation current;
		public IdentifierContext name;
		public ExpressionContext ownedExpression;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DerivationContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DerivationContext(ParserRuleContext parent, int invokingState, Element owner) {
			super(parent, invokingState);
			this.owner = owner;
		}
		@Override public int getRuleIndex() { return RULE_derivation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterDerivation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitDerivation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitDerivation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivationContext derivation(Element owner) throws RecognitionException {
		DerivationContext _localctx = new DerivationContext(_ctx, getState(), owner);
		enterRule(_localctx, 88, RULE_derivation);
		((DerivationContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.DERIVATION); ((DerivationContext)_localctx).current =  new Derivation(_localctx); _localctx.owner.addOwnedElement(_localctx.current);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(T__81);
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(1176);
				((DerivationContext)_localctx).name = identifier();
				}
			}

			if(_localctx.name!=null) _localctx.element.getDetails().put("name", (((DerivationContext)_localctx).name!=null?_input.getText(((DerivationContext)_localctx).name.start,((DerivationContext)_localctx).name.stop):null));
			setState(1186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(1180);
				match(T__5);
				setState(1182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
					{
					setState(1181);
					((DerivationContext)_localctx).ownedExpression = expression(0);
					}
				}

				setState(1184);
				match(T__17);
				}
				}
				break;
			case T__17:
				{
				setState(1185);
				match(T__17);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if(_localctx.ownedExpression!=null) _localctx.element.getDetails().put("expression", getContextText(_localctx.expression())); 
			}
			_ctx.stop = _input.LT(-1);
			if (!owners.empty()) owners.pop();
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VisibilityKindContext extends ParserRuleContext {
		public EAnnotation element;
		public Token qualifier;
		public VisibilityKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visibilityKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterVisibilityKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitVisibilityKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitVisibilityKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisibilityKindContext visibilityKind() throws RecognitionException {
		VisibilityKindContext _localctx = new VisibilityKindContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_visibilityKind);
		((VisibilityKindContext)_localctx).element =  eFactory.createEAnnotation(); _localctx.element.setSource(AnnotationSources.VISIBILITY);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__82:
				{
				setState(1190);
				((VisibilityKindContext)_localctx).qualifier = match(T__82);
				}
				break;
			case T__83:
				{
				setState(1191);
				((VisibilityKindContext)_localctx).qualifier = match(T__83);
				}
				break;
			case T__84:
				{
				setState(1192);
				((VisibilityKindContext)_localctx).qualifier = match(T__84);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.element.getDetails().put("visibility", (((VisibilityKindContext)_localctx).qualifier!=null?((VisibilityKindContext)_localctx).qualifier.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(AlloyInEcoreParser.IDENTIFIER, 0); }
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_atom);
		try {
			setState(1200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1197);
				((AtomContext)_localctx).id = match(IDENTIFIER);

				    if (context != null && !context.isEmpty() && !context.equals("universe")) {
				        //System.out.print("atom found: " + (((AtomContext)_localctx).id!=null?((AtomContext)_localctx).id.getText():null) + "-> ");
				        if ( atoms.contains((((AtomContext)_localctx).id!=null?((AtomContext)_localctx).id.getText():null)) ) {
				            //System.out.println("defined");
				        } else {
				            notifyErrorListeners(_localctx.getStart(), "undefined atom found: '" + (((AtomContext)_localctx).id!=null?((AtomContext)_localctx).id.getText():null) + "'", (RecognitionException)null);
				        }
				    }

				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1199);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArityContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public ArityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterArity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitArity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitArity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArityContext arity() throws RecognitionException {
		ArityContext _localctx = new ArityContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_arity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormulaContext extends ParserRuleContext {
		public Formula element;
		public int var = 0;
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	 
		public FormulaContext() { }
		public void copyFrom(FormulaContext ctx) {
			super.copyFrom(ctx);
			this.element = ctx.element;
			this.var = ctx.var;
		}
	}
	public static class NoContext extends FormulaContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomeContext extends FormulaContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SomeContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForOneContext extends FormulaContext {
		public FormulaContext formula;
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ForOneContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterForOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitForOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitForOne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumDeclarationContext extends FormulaContext {
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public SumDeclarationContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForAllContext extends FormulaContext {
		public FormulaContext formula;
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ForAllContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterForAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitForAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitForAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoneContext extends FormulaContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoneContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LtContext extends FormulaContext {
		public IntExpressionContext ileft;
		public Token not;
		public IntExpressionContext iright;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public LtContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForSomeContext extends FormulaContext {
		public FormulaContext formula;
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ForSomeContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterForSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitForSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitForSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends FormulaContext {
		public Token op;
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public NotContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class F_paranthesisContext extends FormulaContext {
		public FormulaContext formula;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public F_paranthesisContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterF_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitF_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitF_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends FormulaContext {
		public FormulaContext fleft;
		public Token op;
		public FormulaContext fright;
		public FormulaContext formula;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public AndContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionContext extends FormulaContext {
		public RelationIdContext rel;
		public ExpressionContext domain;
		public Token partial;
		public ExpressionContext range;
		public RelationIdContext relationId() {
			return getRuleContext(RelationIdContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GteContext extends FormulaContext {
		public IntExpressionContext ileft;
		public Token not;
		public IntExpressionContext iright;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public GteContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterGte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitGte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitGte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AcyclicContext extends FormulaContext {
		public RelationIdContext relationId() {
			return getRuleContext(RelationIdContext.class,0);
		}
		public AcyclicContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterAcyclic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitAcyclic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitAcyclic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetContext extends FormulaContext {
		public FormulaContext formula;
		public LetDeclarationsContext letDeclarations() {
			return getRuleContext(LetDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public LetContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LteContext extends FormulaContext {
		public IntExpressionContext ileft;
		public Token not;
		public IntExpressionContext iright;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public LteContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLte(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLte(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends FormulaContext {
		public FormulaContext fleft;
		public Token op;
		public FormulaContext fright;
		public FormulaContext formula;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public OrContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InContext extends FormulaContext {
		public ExpressionContext left;
		public Token not;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneContext extends FormulaContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OneContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitOne(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends FormulaContext {
		public FalseContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IffContext extends FormulaContext {
		public FormulaContext fleft;
		public Token op;
		public FormulaContext fright;
		public FormulaContext formula;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public IffContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqContext extends FormulaContext {
		public IntExpressionContext ileft;
		public Token not;
		public IntExpressionContext iright;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public EqContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GtContext extends FormulaContext {
		public IntExpressionContext ileft;
		public Token not;
		public IntExpressionContext iright;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public GtContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterGt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitGt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitGt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends FormulaContext {
		public ExpressionContext left;
		public Token not;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForLoneContext extends FormulaContext {
		public FormulaContext formula;
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ForLoneContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterForLone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitForLone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitForLone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TotalOrderContext extends FormulaContext {
		public RelationIdContext rel;
		public RelationIdContext ordered;
		public RelationIdContext first;
		public RelationIdContext last;
		public List<RelationIdContext> relationId() {
			return getRuleContexts(RelationIdContext.class);
		}
		public RelationIdContext relationId(int i) {
			return getRuleContext(RelationIdContext.class,i);
		}
		public TotalOrderContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTotalOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTotalOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTotalOrder(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends FormulaContext {
		public TrueContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForNoContext extends FormulaContext {
		public FormulaContext formula;
		public QuantifierDeclarationsContext quantifierDeclarations() {
			return getRuleContext(QuantifierDeclarationsContext.class,0);
		}
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ForNoContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterForNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitForNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitForNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpliesContext extends FormulaContext {
		public FormulaContext fleft;
		public Token op;
		public FormulaContext fright;
		public FormulaContext formula;
		public List<FormulaContext> formula() {
			return getRuleContexts(FormulaContext.class);
		}
		public FormulaContext formula(int i) {
			return getRuleContext(FormulaContext.class,i);
		}
		public ImpliesContext(FormulaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterImplies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitImplies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitImplies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormulaContext formula() throws RecognitionException {
		return formula(0);
	}

	private FormulaContext formula(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FormulaContext _localctx = new FormulaContext(_ctx, _parentState);
		FormulaContext _prevctx = _localctx;
		int _startState = 96;
		enterRecursionRule(_localctx, 96, RULE_formula, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				_localctx = new NoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1205);
				match(T__85);
				setState(1206);
				expression(0);
				((NoContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 2:
				{
				_localctx = new LoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1209);
				match(T__86);
				setState(1210);
				expression(0);
				((LoneContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 3:
				{
				_localctx = new OneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1213);
				match(T__87);
				setState(1214);
				expression(0);
				((OneContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 4:
				{
				_localctx = new SomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1217);
				match(T__88);
				setState(1218);
				expression(0);
				((SomeContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 5:
				{
				_localctx = new InContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1221);
				((InContext)_localctx).left = expression(0);
				setState(1223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__89 || _la==T__90) {
					{
					setState(1222);
					((InContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__89 || _la==T__90) ) {
						((InContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1225);
				match(T__91);
				setState(1226);
				((InContext)_localctx).right = expression(0);
				((InContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 6:
				{
				_localctx = new EqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1229);
				((EqualContext)_localctx).left = expression(0);
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__89 || _la==T__90) {
					{
					setState(1230);
					((EqualContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__89 || _la==T__90) ) {
						((EqualContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1233);
				match(T__20);
				setState(1234);
				((EqualContext)_localctx).right = expression(0);
				((EqualContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 7:
				{
				_localctx = new EqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1237);
				((EqContext)_localctx).ileft = intExpression(0);
				setState(1239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__89 || _la==T__90) {
					{
					setState(1238);
					((EqContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__89 || _la==T__90) ) {
						((EqContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1241);
				match(T__20);
				setState(1242);
				((EqContext)_localctx).iright = intExpression(0);
				((EqContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 8:
				{
				_localctx = new LtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1245);
				((LtContext)_localctx).ileft = intExpression(0);
				setState(1247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__89 || _la==T__90) {
					{
					setState(1246);
					((LtContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__89 || _la==T__90) ) {
						((LtContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1249);
				match(T__61);
				setState(1250);
				((LtContext)_localctx).iright = intExpression(0);
				((LtContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 9:
				{
				_localctx = new LteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1253);
				((LteContext)_localctx).ileft = intExpression(0);
				setState(1255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__89 || _la==T__90) {
					{
					setState(1254);
					((LteContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__89 || _la==T__90) ) {
						((LteContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1257);
				match(T__92);
				setState(1258);
				((LteContext)_localctx).iright = intExpression(0);
				((LteContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 10:
				{
				_localctx = new GtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1261);
				((GtContext)_localctx).ileft = intExpression(0);
				setState(1263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__89 || _la==T__90) {
					{
					setState(1262);
					((GtContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__89 || _la==T__90) ) {
						((GtContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1265);
				match(T__62);
				setState(1266);
				((GtContext)_localctx).iright = intExpression(0);
				((GtContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 11:
				{
				_localctx = new GteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1269);
				((GteContext)_localctx).ileft = intExpression(0);
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__89 || _la==T__90) {
					{
					setState(1270);
					((GteContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__89 || _la==T__90) ) {
						((GteContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1273);
				match(T__93);
				setState(1274);
				((GteContext)_localctx).iright = intExpression(0);
				((GteContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 12:
				{
				_localctx = new SumDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1277);
				match(T__94);
				setState(1278);
				quantifierDeclarations();
				setState(1279);
				match(T__95);
				setState(1280);
				intExpression(0);
				}
				((SumDeclarationContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 13:
				{
				_localctx = new AcyclicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1284);
				match(T__96);
				setState(1285);
				match(T__10);
				setState(1286);
				relationId();
				setState(1287);
				match(T__11);
				((AcyclicContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 14:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1290);
				match(T__97);
				setState(1291);
				match(T__10);
				setState(1292);
				((FunctionContext)_localctx).rel = relationId();
				setState(1293);
				match(T__5);
				setState(1294);
				((FunctionContext)_localctx).domain = expression(0);
				setState(1295);
				match(T__98);
				setState(1300);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__14:
				case T__16:
				case T__18:
				case T__19:
				case T__21:
				case T__22:
				case T__23:
				case T__24:
				case T__25:
				case T__26:
				case T__28:
				case T__29:
				case T__30:
				case T__31:
				case T__32:
				case T__33:
				case T__34:
				case T__36:
				case T__38:
				case T__40:
				case T__42:
				case T__43:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__53:
				case T__54:
				case T__55:
				case T__57:
				case T__58:
				case T__59:
				case T__60:
				case T__73:
				case T__74:
				case T__75:
				case T__76:
				case T__78:
				case T__80:
				case T__81:
				case T__87:
				case T__104:
				case T__105:
				case T__113:
				case T__114:
				case T__119:
				case T__120:
				case T__121:
				case T__122:
				case T__132:
				case T__133:
				case T__134:
				case IDENTIFIER:
					{
					setState(1297);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__87) {
						{
						setState(1296);
						match(T__87);
						}
					}

					}
					break;
				case T__86:
					{
					setState(1299);
					((FunctionContext)_localctx).partial = match(T__86);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1302);
				((FunctionContext)_localctx).range = expression(0);
				setState(1303);
				match(T__11);
				((FunctionContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 15:
				{
				_localctx = new TotalOrderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1306);
				match(T__99);
				setState(1307);
				match(T__10);
				setState(1308);
				((TotalOrderContext)_localctx).rel = relationId();
				setState(1309);
				match(T__2);
				setState(1310);
				((TotalOrderContext)_localctx).ordered = relationId();
				setState(1311);
				match(T__2);
				setState(1312);
				((TotalOrderContext)_localctx).first = relationId();
				setState(1313);
				match(T__2);
				setState(1314);
				((TotalOrderContext)_localctx).last = relationId();
				setState(1315);
				match(T__11);
				((TotalOrderContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 16:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1318);
				((NotContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__89 || _la==T__90) ) {
					((NotContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1319);
				((NotContext)_localctx).formula = formula(14);
				((NotContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 17:
				{
				_localctx = new ForAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1322);
				match(T__109);
				setState(1323);
				quantifierDeclarations();
				setState(1344);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__95:
					{
					setState(1324);
					match(T__95);
					setState(1334);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
					case 1:
						{
						setState(1325);
						((ForAllContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1326);
						match(T__1);
						setState(1330);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
							{
							{
							setState(1327);
							((ForAllContext)_localctx).formula = formula(0);
							}
							}
							setState(1332);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1333);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1336);
					match(T__1);
					setState(1340);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
						{
						{
						setState(1337);
						((ForAllContext)_localctx).formula = formula(0);
						}
						}
						setState(1342);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1343);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((ForAllContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 18:
				{
				_localctx = new ForSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1348);
				match(T__88);
				setState(1349);
				quantifierDeclarations();
				setState(1370);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__95:
					{
					setState(1350);
					match(T__95);
					setState(1360);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
					case 1:
						{
						setState(1351);
						((ForSomeContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1352);
						match(T__1);
						setState(1356);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
							{
							{
							setState(1353);
							((ForSomeContext)_localctx).formula = formula(0);
							}
							}
							setState(1358);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1359);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1362);
					match(T__1);
					setState(1366);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
						{
						{
						setState(1363);
						((ForSomeContext)_localctx).formula = formula(0);
						}
						}
						setState(1368);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1369);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((ForSomeContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 19:
				{
				_localctx = new ForNoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1374);
				match(T__85);
				setState(1375);
				quantifierDeclarations();
				setState(1396);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__95:
					{
					setState(1376);
					match(T__95);
					setState(1386);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
					case 1:
						{
						setState(1377);
						((ForNoContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1378);
						match(T__1);
						setState(1382);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
							{
							{
							setState(1379);
							((ForNoContext)_localctx).formula = formula(0);
							}
							}
							setState(1384);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1385);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1388);
					match(T__1);
					setState(1392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
						{
						{
						setState(1389);
						((ForNoContext)_localctx).formula = formula(0);
						}
						}
						setState(1394);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1395);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((ForNoContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 20:
				{
				_localctx = new ForOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1400);
				match(T__87);
				setState(1401);
				quantifierDeclarations();
				setState(1422);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__95:
					{
					setState(1402);
					match(T__95);
					setState(1412);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						setState(1403);
						((ForOneContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1404);
						match(T__1);
						setState(1408);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
							{
							{
							setState(1405);
							((ForOneContext)_localctx).formula = formula(0);
							}
							}
							setState(1410);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1411);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1414);
					match(T__1);
					setState(1418);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
						{
						{
						setState(1415);
						((ForOneContext)_localctx).formula = formula(0);
						}
						}
						setState(1420);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1421);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((ForOneContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 21:
				{
				_localctx = new ForLoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1426);
				match(T__86);
				setState(1427);
				quantifierDeclarations();
				setState(1448);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__95:
					{
					setState(1428);
					match(T__95);
					setState(1438);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
					case 1:
						{
						setState(1429);
						((ForLoneContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1430);
						match(T__1);
						setState(1434);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
							{
							{
							setState(1431);
							((ForLoneContext)_localctx).formula = formula(0);
							}
							}
							setState(1436);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1437);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1440);
					match(T__1);
					setState(1444);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
						{
						{
						setState(1441);
						((ForLoneContext)_localctx).formula = formula(0);
						}
						}
						setState(1446);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1447);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((ForLoneContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 22:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				{
				setState(1452);
				match(T__110);
				setState(1453);
				letDeclarations();
				setState(1474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__95:
					{
					setState(1454);
					match(T__95);
					setState(1464);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
					case 1:
						{
						setState(1455);
						((LetContext)_localctx).formula = formula(0);
						}
						break;
					case 2:
						{
						setState(1456);
						match(T__1);
						setState(1460);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
							{
							{
							setState(1457);
							((LetContext)_localctx).formula = formula(0);
							}
							}
							setState(1462);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1463);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1466);
					match(T__1);
					setState(1470);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__14) | (1L << T__16) | (1L << T__18) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (T__73 - 74)) | (1L << (T__74 - 74)) | (1L << (T__75 - 74)) | (1L << (T__76 - 74)) | (1L << (T__78 - 74)) | (1L << (T__80 - 74)) | (1L << (T__81 - 74)) | (1L << (T__85 - 74)) | (1L << (T__86 - 74)) | (1L << (T__87 - 74)) | (1L << (T__88 - 74)) | (1L << (T__89 - 74)) | (1L << (T__90 - 74)) | (1L << (T__94 - 74)) | (1L << (T__96 - 74)) | (1L << (T__97 - 74)) | (1L << (T__99 - 74)) | (1L << (T__104 - 74)) | (1L << (T__105 - 74)) | (1L << (T__109 - 74)) | (1L << (T__110 - 74)) | (1L << (T__111 - 74)) | (1L << (T__112 - 74)) | (1L << (T__113 - 74)) | (1L << (T__114 - 74)) | (1L << (T__115 - 74)) | (1L << (T__119 - 74)) | (1L << (T__120 - 74)) | (1L << (T__121 - 74)) | (1L << (T__122 - 74)) | (1L << (T__132 - 74)) | (1L << (T__133 - 74)) | (1L << (T__134 - 74)) | (1L << (INT - 74)) | (1L << (IDENTIFIER - 74)))) != 0)) {
						{
						{
						setState(1467);
						((LetContext)_localctx).formula = formula(0);
						}
						}
						setState(1472);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1473);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				((LetContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 23:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1478);
				match(T__111);
				((TrueContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 24:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1480);
				match(T__112);
				((FalseContext)_localctx).element =  Formula.create(_localctx);
				}
				break;
			case 25:
				{
				_localctx = new F_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1482);
				match(T__14);
				setState(1483);
				((F_paranthesisContext)_localctx).formula = formula(0);
				setState(1484);
				match(T__15);
				((F_paranthesisContext)_localctx).element =  ((F_paranthesisContext)_localctx).formula.element;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1509);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new FormulaContext(_parentctx, _parentState));
						((AndContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1489);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1490);
						((AndContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__100 || _la==T__101) ) {
							((AndContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1491);
						((AndContext)_localctx).fright = ((AndContext)_localctx).formula = formula(14);
						((AndContext)_localctx).element =  Formula.create(_localctx);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new FormulaContext(_parentctx, _parentState));
						((OrContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1494);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1495);
						((OrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__102 || _la==T__103) ) {
							((OrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1496);
						((OrContext)_localctx).fright = ((OrContext)_localctx).formula = formula(13);
						((OrContext)_localctx).element =  Formula.create(_localctx);
						}
						break;
					case 3:
						{
						_localctx = new ImpliesContext(new FormulaContext(_parentctx, _parentState));
						((ImpliesContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1499);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1500);
						((ImpliesContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (T__104 - 105)) | (1L << (T__105 - 105)) | (1L << (T__106 - 105)))) != 0)) ) {
							((ImpliesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1501);
						((ImpliesContext)_localctx).fright = ((ImpliesContext)_localctx).formula = formula(11);
						((ImpliesContext)_localctx).element =  Formula.create(_localctx);
						}
						break;
					case 4:
						{
						_localctx = new IffContext(new FormulaContext(_parentctx, _parentState));
						((IffContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1504);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1505);
						((IffContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__107 || _la==T__108) ) {
							((IffContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1506);
						((IffContext)_localctx).fright = ((IffContext)_localctx).formula = formula(10);
						((IffContext)_localctx).element =  Formula.create(_localctx);
						}
						break;
					}
					} 
				}
				setState(1513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression element;
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this.element = ctx.element;
		}
	}
	public static class ProductContext extends ExpressionContext {
		public ExpressionContext left;
		public MultContext leftMult;
		public MultContext rightMult;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<MultContext> mult() {
			return getRuleContexts(MultContext.class);
		}
		public MultContext mult(int i) {
			return getRuleContext(MultContext.class,i);
		}
		public ProductContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitProduct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NoneContext extends ExpressionContext {
		public NoneContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitNone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public UnionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitUnion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComprehensionContext extends ExpressionContext {
		public ComprehensionDeclarationsContext comprehensionDeclarations() {
			return getRuleContext(ComprehensionDeclarationsContext.class,0);
		}
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public ComprehensionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitComprehension(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnivContext extends ExpressionContext {
		public UnivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterUniv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitUniv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitUniv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReflexiveContext extends ExpressionContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReflexiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterReflexive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitReflexive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitReflexive(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class E_paranthesisContext extends ExpressionContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public E_paranthesisContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterE_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitE_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitE_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdenContext extends ExpressionContext {
		public IdenContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIden(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIden(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIden(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntsContext extends ExpressionContext {
		public IntsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterInts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitInts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitInts(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntersectionContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IntersectionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIntersection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIntersection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIntersection(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifferenceContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DifferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterDifference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitDifference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitDifference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransposeContext extends ExpressionContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TransposeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTranspose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTranspose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTranspose(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public JoinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverrideContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverrideContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterOverride(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitOverride(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitOverride(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfExpressionContext extends ExpressionContext {
		public Token op;
		public FormulaContext condition;
		public ExpressionContext thenExpr;
		public ExpressionContext expression;
		public ExpressionContext elseExpr;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IfExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIfExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIfExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClosureContext extends ExpressionContext {
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ClosureContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterClosure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitClosure(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitClosure(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeRefContext extends ExpressionContext {
		public PathNameContext pathName() {
			return getRuleContext(PathNameContext.class,0);
		}
		public TypeRefContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterTypeRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitTypeRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitTypeRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoxJoinContext extends ExpressionContext {
		public ExpressionContext right;
		public ExpressionContext left;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoxJoinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterBoxJoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitBoxJoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitBoxJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1558);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__113:
				{
				_localctx = new TransposeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1515);
				match(T__113);
				setState(1516);
				((TransposeContext)_localctx).expression = expression(18);
				((TransposeContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__114:
				{
				_localctx = new ClosureContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1519);
				match(T__114);
				setState(1520);
				((ClosureContext)_localctx).expression = expression(17);
				((ClosureContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__48:
				{
				_localctx = new ReflexiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1523);
				match(T__48);
				setState(1524);
				((ReflexiveContext)_localctx).expression = expression(16);
				((ReflexiveContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__1:
				{
				_localctx = new ComprehensionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1527);
				match(T__1);
				setState(1528);
				comprehensionDeclarations();
				setState(1529);
				match(T__95);
				setState(1530);
				formula(0);
				setState(1531);
				match(T__3);
				((ComprehensionContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__104:
			case T__105:
				{
				_localctx = new IfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1534);
				((IfExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__104 || _la==T__105) ) {
					((IfExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1535);
				((IfExpressionContext)_localctx).condition = formula(0);
				setState(1536);
				match(T__117);
				setState(1537);
				((IfExpressionContext)_localctx).thenExpr = ((IfExpressionContext)_localctx).expression = expression(0);
				setState(1538);
				match(T__118);
				setState(1539);
				((IfExpressionContext)_localctx).elseExpr = ((IfExpressionContext)_localctx).expression = expression(7);
				((IfExpressionContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__119:
				{
				_localctx = new IdenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1542);
				match(T__119);
				((IdenContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__120:
				{
				_localctx = new NoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1544);
				match(T__120);
				((NoneContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__121:
				{
				_localctx = new UnivContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1546);
				match(T__121);
				((UnivContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__122:
				{
				_localctx = new IntsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1548);
				match(T__122);
				((IntsContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			case T__14:
				{
				_localctx = new E_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1550);
				match(T__14);
				setState(1551);
				((E_paranthesisContext)_localctx).expression = expression(0);
				setState(1552);
				match(T__15);
				((E_paranthesisContext)_localctx).element =  ((E_paranthesisContext)_localctx).expression.element;
				}
				break;
			case T__16:
			case T__18:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__24:
			case T__25:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__36:
			case T__38:
			case T__40:
			case T__42:
			case T__43:
			case T__45:
			case T__46:
			case T__47:
			case T__53:
			case T__54:
			case T__55:
			case T__57:
			case T__58:
			case T__59:
			case T__60:
			case T__73:
			case T__74:
			case T__75:
			case T__76:
			case T__78:
			case T__80:
			case T__81:
			case T__132:
			case T__133:
			case T__134:
			case IDENTIFIER:
				{
				_localctx = new TypeRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1555);
				pathName(_localctx.element);
				((TypeRefContext)_localctx).element =  Expression.create(_localctx);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1602);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						_localctx = new UnionContext(new ExpressionContext(_parentctx, _parentState));
						((UnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1560);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1561);
						match(T__49);
						setState(1562);
						((UnionContext)_localctx).right = ((UnionContext)_localctx).expression = expression(16);
						((UnionContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((IntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1565);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1566);
						match(T__63);
						setState(1567);
						((IntersectionContext)_localctx).right = ((IntersectionContext)_localctx).expression = expression(15);
						((IntersectionContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 3:
						{
						_localctx = new DifferenceContext(new ExpressionContext(_parentctx, _parentState));
						((DifferenceContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1570);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1571);
						match(T__115);
						setState(1572);
						((DifferenceContext)_localctx).right = ((DifferenceContext)_localctx).expression = expression(14);
						((DifferenceContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 4:
						{
						_localctx = new JoinContext(new ExpressionContext(_parentctx, _parentState));
						((JoinContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1575);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1576);
						match(T__67);
						setState(1577);
						((JoinContext)_localctx).right = ((JoinContext)_localctx).expression = expression(13);
						((JoinContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 5:
						{
						_localctx = new ProductContext(new ExpressionContext(_parentctx, _parentState));
						((ProductContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1580);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1582);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)) | (1L << (T__131 - 87)))) != 0)) {
							{
							setState(1581);
							((ProductContext)_localctx).leftMult = mult();
							}
						}

						setState(1584);
						match(T__98);
						setState(1586);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)) | (1L << (T__131 - 87)))) != 0)) {
							{
							setState(1585);
							((ProductContext)_localctx).rightMult = mult();
							}
						}

						setState(1588);
						((ProductContext)_localctx).right = ((ProductContext)_localctx).expression = expression(10);
						((ProductContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 6:
						{
						_localctx = new OverrideContext(new ExpressionContext(_parentctx, _parentState));
						((OverrideContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1591);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1592);
						match(T__116);
						setState(1593);
						((OverrideContext)_localctx).right = ((OverrideContext)_localctx).expression = expression(10);
						((OverrideContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					case 7:
						{
						_localctx = new BoxJoinContext(new ExpressionContext(_parentctx, _parentState));
						((BoxJoinContext)_localctx).right = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1596);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1597);
						match(T__10);
						setState(1598);
						((BoxJoinContext)_localctx).left = ((BoxJoinContext)_localctx).expression = expression(0);
						setState(1599);
						match(T__11);
						((BoxJoinContext)_localctx).element =  Expression.create(_localctx);
						}
						break;
					}
					} 
				}
				setState(1606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,210,_ctx);
			}
			}
			_ctx.stop = _input.LT(-1);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntExpressionContext extends ParserRuleContext {
		public IntExpression element;
		public IntExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intExpression; }
	 
		public IntExpressionContext() { }
		public void copyFrom(IntExpressionContext ctx) {
			super.copyFrom(ctx);
			this.element = ctx.element;
		}
	}
	public static class MinusContext extends IntExpressionContext {
		public IntExpressionContext ileft;
		public IntExpressionContext iright;
		public IntExpressionContext intExpression;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public MinusContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntConstantContext extends IntExpressionContext {
		public Token sign;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IntConstantContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIntConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIntConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIntConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class I_paranthesisContext extends IntExpressionContext {
		public IntExpressionContext intExpression;
		public IntExpressionContext intExpression() {
			return getRuleContext(IntExpressionContext.class,0);
		}
		public I_paranthesisContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterI_paranthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitI_paranthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitI_paranthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfIntExpressionContext extends IntExpressionContext {
		public Token op;
		public FormulaContext condition;
		public IntExpressionContext thenExpr;
		public IntExpressionContext intExpression;
		public IntExpressionContext elseExpr;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public IfIntExpressionContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIfIntExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIfIntExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIfIntExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CountContext extends IntExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CountContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitCount(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumContext extends IntExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SumContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideContext extends IntExpressionContext {
		public IntExpressionContext ileft;
		public IntExpressionContext iright;
		public IntExpressionContext intExpression;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public DivideContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterDivide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitDivide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyContext extends IntExpressionContext {
		public IntExpressionContext ileft;
		public IntExpressionContext iright;
		public IntExpressionContext intExpression;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public MultiplyContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterMultiply(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitMultiply(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends IntExpressionContext {
		public IntExpressionContext ileft;
		public IntExpressionContext iright;
		public IntExpressionContext intExpression;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public ModuloContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterModulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitModulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends IntExpressionContext {
		public IntExpressionContext ileft;
		public IntExpressionContext iright;
		public IntExpressionContext intExpression;
		public List<IntExpressionContext> intExpression() {
			return getRuleContexts(IntExpressionContext.class);
		}
		public IntExpressionContext intExpression(int i) {
			return getRuleContext(IntExpressionContext.class,i);
		}
		public PlusContext(IntExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitPlus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntExpressionContext intExpression() throws RecognitionException {
		return intExpression(0);
	}

	private IntExpressionContext intExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntExpressionContext _localctx = new IntExpressionContext(_ctx, _parentState);
		IntExpressionContext _prevctx = _localctx;
		int _startState = 100;
		enterRecursionRule(_localctx, 100, RULE_intExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1635);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__104:
			case T__105:
				{
				_localctx = new IfIntExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1608);
				((IfIntExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__104 || _la==T__105) ) {
					((IfIntExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1609);
				((IfIntExpressionContext)_localctx).condition = formula(0);
				setState(1610);
				match(T__117);
				setState(1611);
				((IfIntExpressionContext)_localctx).thenExpr = ((IfIntExpressionContext)_localctx).intExpression = intExpression(0);
				setState(1612);
				match(T__118);
				setState(1613);
				((IfIntExpressionContext)_localctx).elseExpr = ((IfIntExpressionContext)_localctx).intExpression = intExpression(10);
				((IfIntExpressionContext)_localctx).element =  IntExpression.create(_localctx);
				}
				break;
			case T__94:
				{
				_localctx = new SumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1616);
				match(T__94);
				setState(1617);
				expression(0);
				((SumContext)_localctx).element =  IntExpression.create(_localctx);
				}
				break;
			case T__41:
				{
				_localctx = new CountContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1620);
				match(T__41);
				setState(1621);
				expression(0);
				((CountContext)_localctx).element =  IntExpression.create(_localctx);
				}
				break;
			case T__115:
			case INT:
				{
				_localctx = new IntConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__115) {
					{
					setState(1624);
					((IntConstantContext)_localctx).sign = match(T__115);
					}
				}

				setState(1627);
				integer();
				((IntConstantContext)_localctx).element =  IntExpression.create(_localctx);
				}
				break;
			case T__14:
				{
				_localctx = new I_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1630);
				match(T__14);
				setState(1631);
				((I_paranthesisContext)_localctx).intExpression = intExpression(0);
				setState(1632);
				match(T__15);
				((I_paranthesisContext)_localctx).element =  ((I_paranthesisContext)_localctx).intExpression.element;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1664);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1662);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new IntExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpression);
						setState(1637);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1638);
						_la = _input.LA(1);
						if ( !(_la==T__49 || _la==T__123) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1639);
						((PlusContext)_localctx).iright = ((PlusContext)_localctx).intExpression = intExpression(8);
						((PlusContext)_localctx).element =  IntExpression.create(_localctx);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new IntExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpression);
						setState(1642);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1643);
						_la = _input.LA(1);
						if ( !(_la==T__115 || _la==T__124) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1644);
						((MinusContext)_localctx).iright = ((MinusContext)_localctx).intExpression = intExpression(7);
						((MinusContext)_localctx).element =  IntExpression.create(_localctx);
						}
						break;
					case 3:
						{
						_localctx = new MultiplyContext(new IntExpressionContext(_parentctx, _parentState));
						((MultiplyContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpression);
						setState(1647);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1648);
						_la = _input.LA(1);
						if ( !(_la==T__48 || _la==T__125) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1649);
						((MultiplyContext)_localctx).iright = ((MultiplyContext)_localctx).intExpression = intExpression(6);
						((MultiplyContext)_localctx).element =  IntExpression.create(_localctx);
						}
						break;
					case 4:
						{
						_localctx = new DivideContext(new IntExpressionContext(_parentctx, _parentState));
						((DivideContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpression);
						setState(1652);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1653);
						_la = _input.LA(1);
						if ( !(_la==T__126 || _la==T__127) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1654);
						((DivideContext)_localctx).iright = ((DivideContext)_localctx).intExpression = intExpression(5);
						((DivideContext)_localctx).element =  IntExpression.create(_localctx);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new IntExpressionContext(_parentctx, _parentState));
						((ModuloContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intExpression);
						setState(1657);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1658);
						_la = _input.LA(1);
						if ( !(_la==T__128 || _la==T__129) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1659);
						((ModuloContext)_localctx).iright = ((ModuloContext)_localctx).intExpression = intExpression(4);
						((ModuloContext)_localctx).element =  IntExpression.create(_localctx);
						}
						break;
					}
					} 
				}
				setState(1666);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QuantifierDeclarationsContext extends ParserRuleContext {
		public List<QuantifierDeclaration> elements;
		public List<QuantifierDeclarationContext> quantifierDeclaration() {
			return getRuleContexts(QuantifierDeclarationContext.class);
		}
		public QuantifierDeclarationContext quantifierDeclaration(int i) {
			return getRuleContext(QuantifierDeclarationContext.class,i);
		}
		public QuantifierDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifierDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterQuantifierDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitQuantifierDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitQuantifierDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierDeclarationsContext quantifierDeclarations() throws RecognitionException {
		QuantifierDeclarationsContext _localctx = new QuantifierDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_quantifierDeclarations);
		((QuantifierDeclarationsContext)_localctx).elements =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667);
			quantifierDeclaration();
			setState(1672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1668);
				match(T__2);
				setState(1669);
				quantifierDeclaration();
				}
				}
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);
			for(QuantifierDeclarationContext ctx: _localctx.quantifierDeclaration()) _localctx.elements.add(ctx.element);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuantifierDeclarationContext extends ParserRuleContext {
		public QuantifierDeclaration element;
		public QuantifierDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifierDeclaration; }
	 
		public QuantifierDeclarationContext() { }
		public void copyFrom(QuantifierDeclarationContext ctx) {
			super.copyFrom(ctx);
			this.element = ctx.element;
		}
	}
	public static class OneOfContext extends QuantifierDeclarationContext {
		public Token disj;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public OneOfContext(QuantifierDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterOneOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitOneOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitOneOf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomeOfContext extends QuantifierDeclarationContext {
		public Token disj;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public SomeOfContext(QuantifierDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSomeOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSomeOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSomeOf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoneOfContext extends QuantifierDeclarationContext {
		public Token disj;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public LoneOfContext(QuantifierDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLoneOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLoneOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLoneOf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOfContext extends QuantifierDeclarationContext {
		public Token disj;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public SetOfContext(QuantifierDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSetOf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSetOf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSetOf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierDeclarationContext quantifierDeclaration() throws RecognitionException {
		QuantifierDeclarationContext _localctx = new QuantifierDeclarationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_quantifierDeclaration);
		int _la;
		try {
			setState(1741);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
			case 1:
				_localctx = new OneOfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__130) {
					{
					setState(1675);
					((OneOfContext)_localctx).disj = match(T__130);
					}
				}

				setState(1678);
				((OneOfContext)_localctx).variable = variable();
				((OneOfContext)_localctx).vars.add(((OneOfContext)_localctx).variable);
				setState(1683);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1679);
					match(T__2);
					setState(1680);
					((OneOfContext)_localctx).variable = variable();
					((OneOfContext)_localctx).vars.add(((OneOfContext)_localctx).variable);
					}
					}
					setState(1685);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1686);
				match(T__5);
				setState(1688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__87) {
					{
					setState(1687);
					match(T__87);
					}
				}

				setState(1690);
				expression(0);
				((OneOfContext)_localctx).element =  QuantifierDeclaration.create(_localctx);
				}
				break;
			case 2:
				_localctx = new LoneOfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__130) {
					{
					setState(1693);
					((LoneOfContext)_localctx).disj = match(T__130);
					}
				}

				setState(1696);
				((LoneOfContext)_localctx).variable = variable();
				((LoneOfContext)_localctx).vars.add(((LoneOfContext)_localctx).variable);
				setState(1701);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1697);
					match(T__2);
					setState(1698);
					((LoneOfContext)_localctx).variable = variable();
					((LoneOfContext)_localctx).vars.add(((LoneOfContext)_localctx).variable);
					}
					}
					setState(1703);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1704);
				match(T__5);
				setState(1705);
				match(T__86);
				setState(1706);
				expression(0);
				((LoneOfContext)_localctx).element =  QuantifierDeclaration.create(_localctx);
				}
				break;
			case 3:
				_localctx = new SomeOfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__130) {
					{
					setState(1709);
					((SomeOfContext)_localctx).disj = match(T__130);
					}
				}

				setState(1712);
				((SomeOfContext)_localctx).variable = variable();
				((SomeOfContext)_localctx).vars.add(((SomeOfContext)_localctx).variable);
				setState(1717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1713);
					match(T__2);
					setState(1714);
					((SomeOfContext)_localctx).variable = variable();
					((SomeOfContext)_localctx).vars.add(((SomeOfContext)_localctx).variable);
					}
					}
					setState(1719);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1720);
				match(T__5);
				setState(1721);
				match(T__88);
				setState(1722);
				expression(0);
				((SomeOfContext)_localctx).element =  QuantifierDeclaration.create(_localctx);
				}
				break;
			case 4:
				_localctx = new SetOfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__130) {
					{
					setState(1725);
					((SetOfContext)_localctx).disj = match(T__130);
					}
				}

				setState(1728);
				((SetOfContext)_localctx).variable = variable();
				((SetOfContext)_localctx).vars.add(((SetOfContext)_localctx).variable);
				setState(1733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1729);
					match(T__2);
					setState(1730);
					((SetOfContext)_localctx).variable = variable();
					((SetOfContext)_localctx).vars.add(((SetOfContext)_localctx).variable);
					}
					}
					setState(1735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1736);
				match(T__5);
				setState(1737);
				match(T__131);
				setState(1738);
				expression(0);
				((SetOfContext)_localctx).element =  QuantifierDeclaration.create(_localctx);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetDeclarationsContext extends ParserRuleContext {
		public List<LetDeclaration> elements;
		public List<LetDeclarationContext> letDeclaration() {
			return getRuleContexts(LetDeclarationContext.class);
		}
		public LetDeclarationContext letDeclaration(int i) {
			return getRuleContext(LetDeclarationContext.class,i);
		}
		public LetDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLetDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLetDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLetDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclarationsContext letDeclarations() throws RecognitionException {
		LetDeclarationsContext _localctx = new LetDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_letDeclarations);
		((LetDeclarationsContext)_localctx).elements =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			letDeclaration();
			setState(1748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1744);
				match(T__2);
				setState(1745);
				letDeclaration();
				}
				}
				setState(1750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);
			for(LetDeclarationContext ctx: _localctx.letDeclaration()) _localctx.elements.add(ctx.element);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetDeclarationContext extends ParserRuleContext {
		public LetDeclaration element;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public LetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclarationContext letDeclaration() throws RecognitionException {
		LetDeclarationContext _localctx = new LetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_letDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			((LetDeclarationContext)_localctx).variable = variable();
			((LetDeclarationContext)_localctx).vars.add(((LetDeclarationContext)_localctx).variable);
			setState(1756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1752);
				match(T__2);
				setState(1753);
				((LetDeclarationContext)_localctx).variable = variable();
				((LetDeclarationContext)_localctx).vars.add(((LetDeclarationContext)_localctx).variable);
				}
				}
				setState(1758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1759);
			match(T__20);
			setState(1760);
			((LetDeclarationContext)_localctx).expression = expression(0);
			((LetDeclarationContext)_localctx).element =  new LetDeclaration(_localctx);  for(VariableContext ctx: _localctx.variable()) _localctx.element.addOwnedElements(ctx.element);  _localctx.element.addOwnedElements(((LetDeclarationContext)_localctx).expression.element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComprehensionDeclarationsContext extends ParserRuleContext {
		public List<ComprehensionDeclaration> elements;
		public List<ComprehensionDeclarationContext> comprehensionDeclaration() {
			return getRuleContexts(ComprehensionDeclarationContext.class);
		}
		public ComprehensionDeclarationContext comprehensionDeclaration(int i) {
			return getRuleContext(ComprehensionDeclarationContext.class,i);
		}
		public ComprehensionDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehensionDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterComprehensionDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitComprehensionDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitComprehensionDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComprehensionDeclarationsContext comprehensionDeclarations() throws RecognitionException {
		ComprehensionDeclarationsContext _localctx = new ComprehensionDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_comprehensionDeclarations);
		((ComprehensionDeclarationsContext)_localctx).elements =  new ArrayList<>();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			comprehensionDeclaration();
			setState(1768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1764);
				match(T__2);
				setState(1765);
				comprehensionDeclaration();
				}
				}
				setState(1770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			_ctx.stop = _input.LT(-1);
			for(ComprehensionDeclarationContext ctx: _localctx.comprehensionDeclaration()) _localctx.elements.add(ctx.element);
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComprehensionDeclarationContext extends ParserRuleContext {
		public ComprehensionDeclaration element;
		public Token disj;
		public VariableContext variable;
		public List<VariableContext> vars = new ArrayList<VariableContext>();
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ComprehensionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehensionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterComprehensionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitComprehensionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitComprehensionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComprehensionDeclarationContext comprehensionDeclaration() throws RecognitionException {
		ComprehensionDeclarationContext _localctx = new ComprehensionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comprehensionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__130) {
				{
				setState(1771);
				((ComprehensionDeclarationContext)_localctx).disj = match(T__130);
				}
			}

			{
			setState(1774);
			((ComprehensionDeclarationContext)_localctx).variable = variable();
			((ComprehensionDeclarationContext)_localctx).vars.add(((ComprehensionDeclarationContext)_localctx).variable);
			setState(1779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1775);
				match(T__2);
				setState(1776);
				((ComprehensionDeclarationContext)_localctx).variable = variable();
				((ComprehensionDeclarationContext)_localctx).vars.add(((ComprehensionDeclarationContext)_localctx).variable);
				}
				}
				setState(1781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1782);
			match(T__5);
			setState(1784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__87) {
				{
				setState(1783);
				match(T__87);
				}
			}

			setState(1786);
			((ComprehensionDeclarationContext)_localctx).expression = expression(0);
			}
			((ComprehensionDeclarationContext)_localctx).element =  new ComprehensionDeclaration(_localctx); for(VariableContext ctx: _localctx.variable()) _localctx.element.addOwnedElements(ctx.element); _localctx.element.addOwnedElements(((ComprehensionDeclarationContext)_localctx).expression.element);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationIdContext extends ParserRuleContext {
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public RelationIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterRelationId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitRelationId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitRelationId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationIdContext relationId() throws RecognitionException {
		RelationIdContext _localctx = new RelationIdContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_relationId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			unrestrictedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public Variable element;
		public UnrestrictedNameContext unrestrictedName() {
			return getRuleContext(UnrestrictedNameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			unrestrictedName();
			((VariableContext)_localctx).element =  new Variable(_localctx);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1795);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_mult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (T__86 - 87)) | (1L << (T__87 - 87)) | (1L << (T__88 - 87)) | (1L << (T__131 - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnrestrictedNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnrestrictedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unrestrictedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterUnrestrictedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitUnrestrictedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitUnrestrictedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnrestrictedNameContext unrestrictedName() throws RecognitionException {
		UnrestrictedNameContext _localctx = new UnrestrictedNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unrestrictedName);
		try {
			setState(1841);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1799);
				identifier();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(1800);
				match(T__21);
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 3);
				{
				setState(1801);
				match(T__31);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 4);
				{
				setState(1802);
				match(T__73);
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 5);
				{
				setState(1803);
				match(T__74);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 6);
				{
				setState(1804);
				match(T__22);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 7);
				{
				setState(1805);
				match(T__42);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 8);
				{
				setState(1806);
				match(T__54);
				}
				break;
			case T__132:
				enterOuterAlt(_localctx, 9);
				{
				setState(1807);
				match(T__132);
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 10);
				{
				setState(1808);
				match(T__81);
				}
				break;
			case T__32:
				enterOuterAlt(_localctx, 11);
				{
				setState(1809);
				match(T__32);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 12);
				{
				setState(1810);
				match(T__57);
				}
				break;
			case T__133:
				enterOuterAlt(_localctx, 13);
				{
				setState(1811);
				match(T__133);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 14);
				{
				setState(1812);
				match(T__24);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 15);
				{
				setState(1813);
				match(T__33);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 16);
				{
				setState(1814);
				match(T__18);
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 17);
				{
				setState(1815);
				match(T__80);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 18);
				{
				setState(1816);
				match(T__23);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 19);
				{
				setState(1817);
				match(T__45);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 20);
				{
				setState(1818);
				match(T__16);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 21);
				{
				setState(1819);
				match(T__46);
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 22);
				{
				setState(1820);
				match(T__34);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 23);
				{
				setState(1821);
				match(T__19);
				}
				break;
			case T__78:
				enterOuterAlt(_localctx, 24);
				{
				setState(1822);
				match(T__78);
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 25);
				{
				setState(1823);
				match(T__76);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 26);
				{
				setState(1824);
				match(T__53);
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 27);
				{
				setState(1825);
				match(T__40);
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 28);
				{
				setState(1826);
				match(T__30);
				}
				break;
			case T__60:
				enterOuterAlt(_localctx, 29);
				{
				setState(1827);
				match(T__60);
				}
				break;
			case T__134:
				enterOuterAlt(_localctx, 30);
				{
				setState(1828);
				match(T__134);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 31);
				{
				setState(1829);
				match(T__43);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 32);
				{
				setState(1830);
				match(T__25);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 33);
				{
				setState(1831);
				match(T__47);
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 34);
				{
				setState(1832);
				match(T__28);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 35);
				{
				setState(1833);
				match(T__36);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 36);
				{
				setState(1834);
				match(T__38);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 37);
				{
				setState(1835);
				match(T__29);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 38);
				{
				setState(1836);
				match(T__75);
				}
				break;
			case T__58:
				enterOuterAlt(_localctx, 39);
				{
				setState(1837);
				match(T__58);
				}
				break;
			case T__55:
				enterOuterAlt(_localctx, 40);
				{
				setState(1838);
				match(T__55);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 41);
				{
				setState(1839);
				match(T__59);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 42);
				{
				setState(1840);
				match(T__26);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AlloyInEcoreParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1843);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpperContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public UpperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterUpper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitUpper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitUpper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpperContext upper() throws RecognitionException {
		UpperContext _localctx = new UpperContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_upper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			_la = _input.LA(1);
			if ( !(_la==T__48 || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LowerContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public LowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lower; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LowerContext lower() throws RecognitionException {
		LowerContext _localctx = new LowerContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_lower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignedContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(AlloyInEcoreParser.INT, 0); }
		public SignedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterSigned(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitSigned(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitSigned(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedContext signed() throws RecognitionException {
		SignedContext _localctx = new SignedContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_signed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1850);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__115) {
				{
				setState(1849);
				match(T__115);
				}
			}

			setState(1852);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 48:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		case 49:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 50:
			return intExpression_sempred((IntExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean formula_sempred(FormulaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 10);
		case 9:
			return precpred(_ctx, 9);
		case 10:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean intExpression_sempred(IntExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 7);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u0091\u0741\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\3\2\5\2\u0088\n\2\3\2\3\2\3\2\3\2"+
		"\3\2\7\2\u008f\n\2\f\2\16\2\u0092\13\2\3\3\3\3\3\3\3\3\3\3\7\3\u0099\n"+
		"\3\f\3\16\3\u009c\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u00ac\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u00b3\n\5\f\5\16\5\u00b6"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00be\n\5\f\5\16\5\u00c1\13\5\3\5\3"+
		"\5\5\5\u00c5\n\5\3\5\3\5\3\6\3\6\3\6\7\6\u00cc\n\6\f\6\16\6\u00cf\13\6"+
		"\3\6\3\6\3\6\3\7\3\7\5\7\u00d6\n\7\3\7\3\7\5\7\u00da\n\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00e0\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00ea\n\b\f\b\16"+
		"\b\u00ed\13\b\5\b\u00ef\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u00f6\n\b\f\b\16\b"+
		"\u00f9\13\b\5\b\u00fb\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u010a\n\b\3\t\3\t\3\t\3\t\7\t\u0110\n\t\f\t\16\t\u0113\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u011b\n\t\f\t\16\t\u011e\13\t\3\t\3\t\5"+
		"\t\u0122\n\t\3\n\5\n\u0125\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u012c\n\n\3\n\3"+
		"\n\7\n\u0130\n\n\f\n\16\n\u0133\13\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\5\13\u013e\n\13\3\13\3\13\3\13\3\13\3\f\5\f\u0145\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u0160\n\f\f\f\16\f\u0163\13\f\3\f\3\f\5\f\u0167"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0172\n\r\3\16\5\16\u0175"+
		"\n\16\3\16\3\16\5\16\u0179\n\16\3\16\3\16\5\16\u017d\n\16\3\16\3\16\5"+
		"\16\u0181\n\16\3\16\3\16\3\16\5\16\u0186\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u018d\n\16\f\16\16\16\u0190\13\16\5\16\u0192\n\16\3\16\3\16\3\16"+
		"\5\16\u0197\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\7\16\u01a7\n\16\f\16\16\16\u01aa\13\16\3\16\3\16\5\16"+
		"\u01ae\n\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01b6\n\17\3\20\5\20\u01b9"+
		"\n\20\3\20\3\20\5\20\u01bd\n\20\3\20\3\20\5\20\u01c1\n\20\3\20\5\20\u01c4"+
		"\n\20\3\20\5\20\u01c7\n\20\3\20\5\20\u01ca\n\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u01d3\n\20\3\20\3\20\3\20\5\20\u01d8\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01e4\n\20\3\20\5\20\u01e7"+
		"\n\20\6\20\u01e9\n\20\r\20\16\20\u01ea\3\20\5\20\u01ee\n\20\3\20\3\20"+
		"\3\20\3\20\7\20\u01f4\n\20\f\20\16\20\u01f7\13\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u01ff\n\20\3\20\3\20\3\20\7\20\u0204\n\20\f\20\16\20\u0207"+
		"\13\20\3\20\3\20\5\20\u020b\n\20\3\20\3\20\3\21\5\21\u0210\n\21\3\21\3"+
		"\21\5\21\u0214\n\21\3\21\3\21\5\21\u0218\n\21\3\21\5\21\u021b\n\21\3\21"+
		"\5\21\u021e\n\21\3\21\5\21\u0221\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0229\n\21\3\21\3\21\3\21\3\21\5\21\u022f\n\21\3\21\3\21\3\21\5\21"+
		"\u0234\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u0242\n\21\3\21\5\21\u0245\n\21\6\21\u0247\n\21\r\21\16\21\u0248"+
		"\3\21\5\21\u024c\n\21\3\21\3\21\3\21\3\21\3\21\7\21\u0253\n\21\f\21\16"+
		"\21\u0256\13\21\3\21\3\21\5\21\u025a\n\21\3\21\3\21\3\21\7\21\u025f\n"+
		"\21\f\21\16\21\u0262\13\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u026a\n"+
		"\21\3\21\3\21\3\21\7\21\u026f\n\21\f\21\16\21\u0272\13\21\3\21\3\21\5"+
		"\21\u0276\n\21\3\21\3\21\3\22\5\22\u027b\n\22\3\22\3\22\5\22\u027f\n\22"+
		"\3\22\3\22\5\22\u0283\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u028c"+
		"\n\22\f\22\16\22\u028f\13\22\5\22\u0291\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u0299\n\22\5\22\u029b\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7"+
		"\22\u02a3\n\22\f\22\16\22\u02a6\13\22\5\22\u02a8\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u02b0\n\22\3\22\5\22\u02b3\n\22\6\22\u02b5\n\22\r\22"+
		"\16\22\u02b6\3\22\5\22\u02ba\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\7\22\u02c9\n\22\f\22\16\22\u02cc\13\22\3"+
		"\22\3\22\5\22\u02d0\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u02e0\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u02e8\n\25\3\25\5\25\u02eb\n\25\6\25\u02ed\n\25\r\25\16\25\u02ee"+
		"\3\25\5\25\u02f2\n\25\3\25\3\25\7\25\u02f6\n\25\f\25\16\25\u02f9\13\25"+
		"\3\25\3\25\5\25\u02fd\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0305\n"+
		"\26\3\26\5\26\u0308\n\26\3\26\3\26\5\26\u030c\n\26\3\26\3\26\3\26\3\27"+
		"\5\27\u0312\n\27\3\27\3\27\5\27\u0316\n\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u031d\n\27\3\27\3\27\3\27\5\27\u0322\n\27\3\27\3\27\3\27\3\27\5\27"+
		"\u0328\n\27\3\27\5\27\u032b\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7"+
		"\27\u0334\n\27\f\27\16\27\u0337\13\27\3\27\3\27\5\27\u033b\n\27\3\27\3"+
		"\27\3\30\5\30\u0340\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0348\n\30"+
		"\3\30\3\30\3\30\5\30\u034d\n\30\3\30\3\30\3\30\3\30\5\30\u0353\n\30\3"+
		"\30\5\30\u0356\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u0362\n\30\f\30\16\30\u0365\13\30\3\30\3\30\5\30\u0369\n\30\3\30"+
		"\3\30\3\31\3\31\3\31\5\31\u0370\n\31\3\31\3\31\3\31\3\31\5\31\u0376\n"+
		"\31\3\31\3\31\3\31\7\31\u037b\n\31\f\31\16\31\u037e\13\31\3\31\3\31\3"+
		"\31\5\31\u0383\n\31\3\32\3\32\5\32\u0387\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\7\32\u038f\n\32\f\32\16\32\u0392\13\32\3\32\3\32\5\32\u0396\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\6\32\u03a3\n\32"+
		"\r\32\16\32\u03a4\3\32\3\32\3\32\5\32\u03aa\n\32\3\33\5\33\u03ad\n\33"+
		"\3\33\3\33\5\33\u03b1\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u03bb\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u03c9\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u03d4"+
		"\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u03de\n \f \16 \u03e1\13 \3 "+
		"\3 \3!\3!\3!\3!\3!\3!\3!\7!\u03ec\n!\f!\16!\u03ef\13!\5!\u03f1\n!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03fb\n\"\3#\3#\3#\3#\3#\7#\u0402\n#\f#"+
		"\16#\u0405\13#\3#\3#\5#\u0409\n#\3$\3$\3$\3$\3$\3$\5$\u0411\n$\3%\3%\3"+
		"%\3%\3%\3%\5%\u0419\n%\3&\3&\7&\u041d\n&\f&\16&\u0420\13&\3&\5&\u0423"+
		"\n&\3\'\3\'\5\'\u0427\n\'\3\'\3\'\3\'\5\'\u042c\n\'\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\5(\u0438\n(\3)\3)\5)\u043c\n)\3)\3)\3)\5)\u0441\n)\3)\3)"+
		"\5)\u0445\n)\3)\3)\3*\5*\u044a\n*\3*\3*\3*\3*\3*\3*\5*\u0452\n*\5*\u0454"+
		"\n*\3*\3*\3*\5*\u0459\n*\3*\3*\5*\u045d\n*\3*\3*\3+\3+\3+\3+\3+\5+\u0466"+
		"\n+\5+\u0468\n+\3+\3+\3+\3+\5+\u046e\n+\3+\3+\5+\u0472\n+\3+\3+\3,\3,"+
		"\3,\3,\3,\5,\u047b\n,\5,\u047d\n,\3,\3,\3,\3,\5,\u0483\n,\3,\3,\5,\u0487"+
		"\n,\3,\3,\3-\3-\5-\u048d\n-\3-\3-\3-\5-\u0492\n-\3-\3-\5-\u0496\n-\3-"+
		"\3-\3.\3.\5.\u049c\n.\3.\3.\3.\5.\u04a1\n.\3.\3.\5.\u04a5\n.\3.\3.\3/"+
		"\3/\3/\5/\u04ac\n/\3/\3/\3\60\3\60\3\60\5\60\u04b3\n\60\3\61\3\61\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u04ca\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u04d2\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u04da\n\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u04e2\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62"+
		"\u04ea\n\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u04f2\n\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\5\62\u04fa\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\5\62\u0514\n\62\3\62\5\62\u0517\n\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0533\n\62\f\62\16\62"+
		"\u0536\13\62\3\62\5\62\u0539\n\62\3\62\3\62\7\62\u053d\n\62\f\62\16\62"+
		"\u0540\13\62\3\62\5\62\u0543\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\7\62\u054d\n\62\f\62\16\62\u0550\13\62\3\62\5\62\u0553\n\62\3\62\3"+
		"\62\7\62\u0557\n\62\f\62\16\62\u055a\13\62\3\62\5\62\u055d\n\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0567\n\62\f\62\16\62\u056a\13"+
		"\62\3\62\5\62\u056d\n\62\3\62\3\62\7\62\u0571\n\62\f\62\16\62\u0574\13"+
		"\62\3\62\5\62\u0577\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62"+
		"\u0581\n\62\f\62\16\62\u0584\13\62\3\62\5\62\u0587\n\62\3\62\3\62\7\62"+
		"\u058b\n\62\f\62\16\62\u058e\13\62\3\62\5\62\u0591\n\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\7\62\u059b\n\62\f\62\16\62\u059e\13\62\3\62"+
		"\5\62\u05a1\n\62\3\62\3\62\7\62\u05a5\n\62\f\62\16\62\u05a8\13\62\3\62"+
		"\5\62\u05ab\n\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u05b5\n"+
		"\62\f\62\16\62\u05b8\13\62\3\62\5\62\u05bb\n\62\3\62\3\62\7\62\u05bf\n"+
		"\62\f\62\16\62\u05c2\13\62\3\62\5\62\u05c5\n\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u05d2\n\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\7\62\u05e8\n\62\f\62\16\62\u05eb\13\62\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0619"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0631\n\63\3\63\3\63"+
		"\5\63\u0635\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\7\63\u0645\n\63\f\63\16\63\u0648\13\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u065c\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0666"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u0681"+
		"\n\64\f\64\16\64\u0684\13\64\3\65\3\65\3\65\7\65\u0689\n\65\f\65\16\65"+
		"\u068c\13\65\3\66\5\66\u068f\n\66\3\66\3\66\3\66\7\66\u0694\n\66\f\66"+
		"\16\66\u0697\13\66\3\66\3\66\5\66\u069b\n\66\3\66\3\66\3\66\3\66\5\66"+
		"\u06a1\n\66\3\66\3\66\3\66\7\66\u06a6\n\66\f\66\16\66\u06a9\13\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u06b1\n\66\3\66\3\66\3\66\7\66\u06b6\n"+
		"\66\f\66\16\66\u06b9\13\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u06c1\n"+
		"\66\3\66\3\66\3\66\7\66\u06c6\n\66\f\66\16\66\u06c9\13\66\3\66\3\66\3"+
		"\66\3\66\3\66\5\66\u06d0\n\66\3\67\3\67\3\67\7\67\u06d5\n\67\f\67\16\67"+
		"\u06d8\13\67\38\38\38\78\u06dd\n8\f8\168\u06e0\138\38\38\38\38\39\39\3"+
		"9\79\u06e9\n9\f9\169\u06ec\139\3:\5:\u06ef\n:\3:\3:\3:\7:\u06f4\n:\f:"+
		"\16:\u06f7\13:\3:\3:\5:\u06fb\n:\3:\3:\3:\3:\3;\3;\3<\3<\3<\3=\3=\3>\3"+
		">\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3"+
		"?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0734\n"+
		"?\3@\3@\3A\3A\3B\3B\3C\5C\u073d\nC\3C\3C\3C\2\5bdfD\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj"+
		"lnprtvxz|~\u0080\u0082\u0084\2\24\3\2\63\65\3\2\u008d\u008e\4\2\33\33"+
		"CC\3\2OP\3\2QR\3\2\\]\3\2gh\3\2ij\3\2km\3\2no\3\2kl\4\2\64\64~~\4\2vv"+
		"\177\177\4\2\63\63\u0080\u0080\3\2\u0081\u0082\3\2\u0083\u0084\4\2Y[\u0086"+
		"\u0086\4\2\63\63\u008a\u008a\u086c\2\u0087\3\2\2\2\4\u0093\3\2\2\2\6\u00ab"+
		"\3\2\2\2\b\u00ad\3\2\2\2\n\u00c8\3\2\2\2\f\u00d3\3\2\2\2\16\u0109\3\2"+
		"\2\2\20\u0121\3\2\2\2\22\u0124\3\2\2\2\24\u0139\3\2\2\2\26\u0144\3\2\2"+
		"\2\30\u0171\3\2\2\2\32\u0174\3\2\2\2\34\u01b5\3\2\2\2\36\u01b8\3\2\2\2"+
		" \u020f\3\2\2\2\"\u027a\3\2\2\2$\u02d3\3\2\2\2&\u02d6\3\2\2\2(\u02d9\3"+
		"\2\2\2*\u0300\3\2\2\2,\u0311\3\2\2\2.\u033f\3\2\2\2\60\u036f\3\2\2\2\62"+
		"\u0384\3\2\2\2\64\u03ac\3\2\2\2\66\u03ba\3\2\2\28\u03c8\3\2\2\2:\u03d3"+
		"\3\2\2\2<\u03d5\3\2\2\2>\u03d9\3\2\2\2@\u03e4\3\2\2\2B\u03fa\3\2\2\2D"+
		"\u03fc\3\2\2\2F\u0410\3\2\2\2H\u0412\3\2\2\2J\u041a\3\2\2\2L\u0424\3\2"+
		"\2\2N\u0437\3\2\2\2P\u0439\3\2\2\2R\u0449\3\2\2\2T\u0460\3\2\2\2V\u0475"+
		"\3\2\2\2X\u048a\3\2\2\2Z\u0499\3\2\2\2\\\u04ab\3\2\2\2^\u04b2\3\2\2\2"+
		"`\u04b4\3\2\2\2b\u05d1\3\2\2\2d\u0618\3\2\2\2f\u0665\3\2\2\2h\u0685\3"+
		"\2\2\2j\u06cf\3\2\2\2l\u06d1\3\2\2\2n\u06d9\3\2\2\2p\u06e5\3\2\2\2r\u06ee"+
		"\3\2\2\2t\u0700\3\2\2\2v\u0702\3\2\2\2x\u0705\3\2\2\2z\u0707\3\2\2\2|"+
		"\u0733\3\2\2\2~\u0735\3\2\2\2\u0080\u0737\3\2\2\2\u0082\u0739\3\2\2\2"+
		"\u0084\u073c\3\2\2\2\u0086\u0088\5\4\3\2\u0087\u0086\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\5\b\5\2\u008a\u008b\b\2\1\2\u008b"+
		"\u008c\5\n\6\2\u008c\u0090\b\2\1\2\u008d\u008f\5b\62\2\u008e\u008d\3\2"+
		"\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\3\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0094\7\3\2\2\u0094\u0095\7\4\2\2"+
		"\u0095\u009a\5\6\4\2\u0096\u0097\7\5\2\2\u0097\u0099\5\6\4\2\u0098\u0096"+
		"\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\6\2\2\u009e\5\3\2\2\2"+
		"\u009f\u00a0\7\7\2\2\u00a0\u00a1\7\b\2\2\u00a1\u00ac\5x=\2\u00a2\u00a3"+
		"\7\t\2\2\u00a3\u00a4\7\b\2\2\u00a4\u00ac\5x=\2\u00a5\u00a6\7\n\2\2\u00a6"+
		"\u00a7\7\b\2\2\u00a7\u00ac\5x=\2\u00a8\u00a9\7\13\2\2\u00a9\u00aa\7\b"+
		"\2\2\u00aa\u00ac\5x=\2\u00ab\u009f\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a5"+
		"\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\7\3\2\2\2\u00ad\u00c4\7\f\2\2\u00ae"+
		"\u00af\7\4\2\2\u00af\u00b4\5^\60\2\u00b0\u00b1\7\5\2\2\u00b1\u00b3\5^"+
		"\60\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\6"+
		"\2\2\u00b8\u00c5\3\2\2\2\u00b9\u00ba\7\r\2\2\u00ba\u00bf\5^\60\2\u00bb"+
		"\u00bc\7\5\2\2\u00bc\u00be\5^\60\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2"+
		"\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\7\16\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00ae\3"+
		"\2\2\2\u00c4\u00b9\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\b\5\1\2\u00c7"+
		"\t\3\2\2\2\u00c8\u00c9\7\17\2\2\u00c9\u00cd\7\4\2\2\u00ca\u00cc\5\f\7"+
		"\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce"+
		"\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\6\2\2\u00d1"+
		"\u00d2\b\6\1\2\u00d2\13\3\2\2\2\u00d3\u00d5\5~@\2\u00d4\u00d6\5`\61\2"+
		"\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9"+
		"\7\b\2\2\u00d8\u00da\5d\63\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db\u00dc\7\r\2\2\u00dc\u00df\5\16\b\2\u00dd\u00de\7"+
		"\5\2\2\u00de\u00e0\5\16\b\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e2\7\16\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b"+
		"\7\1\2\u00e4\r\3\2\2\2\u00e5\u00ee\7\4\2\2\u00e6\u00eb\5\20\t\2\u00e7"+
		"\u00e8\7\5\2\2\u00e8\u00ea\5\20\t\2\u00e9\u00e7\3\2\2\2\u00ea\u00ed\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u010a\7\6\2\2\u00f1\u00fa\7\r\2\2\u00f2\u00f7\5\20\t\2\u00f3"+
		"\u00f4\7\5\2\2\u00f4\u00f6\5\20\t\2\u00f5\u00f3\3\2\2\2\u00f6\u00f9\3"+
		"\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u010a\7\16\2\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\5\20\t\2\u00ff"+
		"\u0100\7\20\2\2\u0100\u0101\5\20\t\2\u0101\u0102\7\6\2\2\u0102\u010a\3"+
		"\2\2\2\u0103\u0104\7\r\2\2\u0104\u0105\5\20\t\2\u0105\u0106\7\20\2\2\u0106"+
		"\u0107\5\20\t\2\u0107\u0108\7\16\2\2\u0108\u010a\3\2\2\2\u0109\u00e5\3"+
		"\2\2\2\u0109\u00f1\3\2\2\2\u0109\u00fd\3\2\2\2\u0109\u0103\3\2\2\2\u010a"+
		"\17\3\2\2\2\u010b\u010c\7\21\2\2\u010c\u0111\5^\60\2\u010d\u010e\7\5\2"+
		"\2\u010e\u0110\5^\60\2\u010f\u010d\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f"+
		"\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0115\7\22\2\2\u0115\u0122\3\2\2\2\u0116\u0117\7\r\2\2\u0117\u011c\5"+
		"^\60\2\u0118\u0119\7\5\2\2\u0119\u011b\5^\60\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2"+
		"\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7\16\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u010b\3\2\2\2\u0121\u0116\3\2\2\2\u0122\21\3\2\2\2\u0123\u0125\5\4\3"+
		"\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u012b"+
		"\b\n\1\2\u0127\u0128\7\23\2\2\u0128\u0129\5~@\2\u0129\u012a\7\24\2\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u0131\b\n\1\2\u012e\u0130\5\24\13\2\u012f\u012e\3\2\2\2\u0130"+
		"\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5\26\f\2\u0135\u0136\b\n\1\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\b\n\1\2\u0138\23\3\2\2\2\u0139\u013d\7\25\2"+
		"\2\u013a\u013b\5~@\2\u013b\u013c\7\b\2\2\u013c\u013e\3\2\2\2\u013d\u013a"+
		"\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\u008d\2"+
		"\2\u0140\u0141\7\24\2\2\u0141\u0142\b\13\1\2\u0142\25\3\2\2\2\u0143\u0145"+
		"\5\\/\2\u0144\u0143\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0147\b\f\1\2\u0147\u0148\7\26\2\2\u0148\u0149\5|?\2\u0149\u014a\b\f"+
		"\1\2\u014a\u014b\b\f\1\2\u014b\u014c\7\b\2\2\u014c\u014d\5~@\2\u014d\u014e"+
		"\3\2\2\2\u014e\u014f\7\27\2\2\u014f\u0150\7\u008d\2\2\u0150\u0151\3\2"+
		"\2\2\u0151\u0166\b\f\1\2\u0152\u0161\7\4\2\2\u0153\u0154\5\62\32\2\u0154"+
		"\u0155\b\f\1\2\u0155\u0160\3\2\2\2\u0156\u0157\5\26\f\2\u0157\u0158\b"+
		"\f\1\2\u0158\u0160\3\2\2\2\u0159\u015a\5\30\r\2\u015a\u015b\b\f\1\2\u015b"+
		"\u0160\3\2\2\2\u015c\u015d\5R*\2\u015d\u015e\b\f\1\2\u015e\u0160\3\2\2"+
		"\2\u015f\u0153\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0159\3\2\2\2\u015f\u015c"+
		"\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0167\7\6\2\2\u0165\u0167\7\24"+
		"\2\2\u0166\u0152\3\2\2\2\u0166\u0165\3\2\2\2\u0167\27\3\2\2\2\u0168\u0169"+
		"\5\32\16\2\u0169\u016a\b\r\1\2\u016a\u0172\3\2\2\2\u016b\u016c\5,\27\2"+
		"\u016c\u016d\b\r\1\2\u016d\u0172\3\2\2\2\u016e\u016f\5.\30\2\u016f\u0170"+
		"\b\r\1\2\u0170\u0172\3\2\2\2\u0171\u0168\3\2\2\2\u0171\u016b\3\2\2\2\u0171"+
		"\u016e\3\2\2\2\u0172\31\3\2\2\2\u0173\u0175\5\\/\2\u0174\u0173\3\2\2\2"+
		"\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u017c\b\16\1\2\u0177\u0179"+
		"\7\30\2\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2"+
		"\u017a\u017d\7\31\2\2\u017b\u017d\7\32\2\2\u017c\u0178\3\2\2\2\u017c\u017b"+
		"\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0180\b\16\1\2\u017f\u0181\5|?\2\u0180"+
		"\u017f\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\b\16"+
		"\1\2\u0183\u0185\b\16\1\2\u0184\u0186\5> \2\u0185\u0184\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0191\b\16\1\2\u0188\u0189\7"+
		"\33\2\2\u0189\u018e\5&\24\2\u018a\u018b\7\5\2\2\u018b\u018d\5&\24\2\u018c"+
		"\u018a\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0188\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0196\b\16\1\2\u0194\u0195\7"+
		"\b\2\2\u0195\u0197\7\u008d\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2"+
		"\u0197\u0198\3\2\2\2\u0198\u01ad\b\16\1\2\u0199\u01a8\7\4\2\2\u019a\u019b"+
		"\5\62\32\2\u019b\u019c\b\16\1\2\u019c\u01a7\3\2\2\2\u019d\u019e\5\"\22"+
		"\2\u019e\u019f\b\16\1\2\u019f\u01a7\3\2\2\2\u01a0\u01a1\5\34\17\2\u01a1"+
		"\u01a2\b\16\1\2\u01a2\u01a7\3\2\2\2\u01a3\u01a4\5R*\2\u01a4\u01a5\b\16"+
		"\1\2\u01a5\u01a7\3\2\2\2\u01a6\u019a\3\2\2\2\u01a6\u019d\3\2\2\2\u01a6"+
		"\u01a0\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2"+
		"\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ae\7\6\2\2\u01ac\u01ae\7\24\2\2\u01ad\u0199\3\2\2\2\u01ad\u01ac\3"+
		"\2\2\2\u01ae\33\3\2\2\2\u01af\u01b0\5\36\20\2\u01b0\u01b1\b\17\1\2\u01b1"+
		"\u01b6\3\2\2\2\u01b2\u01b3\5 \21\2\u01b3\u01b4\b\17\1\2\u01b4\u01b6\3"+
		"\2\2\2\u01b5\u01af\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b6\35\3\2\2\2\u01b7"+
		"\u01b9\5\\/\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01ba\u01bc\b\20\1\2\u01bb\u01bd\7\34\2\2\u01bc\u01bb\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01c1\7\35\2\2\u01bf\u01c1\7"+
		"\36\2\2\u01c0\u01be\3\2\2\2\u01c0\u01bf\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1"+
		"\u01c3\3\2\2\2\u01c2\u01c4\7\37\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3"+
		"\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c7\7 \2\2\u01c6\u01c5\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01ca\7!\2\2\u01c9\u01c8\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7\"\2\2\u01cc"+
		"\u01cd\5|?\2\u01cd\u01ce\b\20\1\2\u01ce\u01cf\b\20\1\2\u01cf\u01d0\7\b"+
		"\2\2\u01d0\u01d2\5F$\2\u01d1\u01d3\5*\26\2\u01d2\u01d1\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d7\b\20\1\2\u01d5\u01d6\7\27\2\2"+
		"\u01d6\u01d8\7\u008d\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01ed\b\20\1\2\u01da\u01e8\7\4\2\2\u01db\u01e4\7"+
		"#\2\2\u01dc\u01e4\7$\2\2\u01dd\u01e4\7%\2\2\u01de\u01e4\7&\2\2\u01df\u01e4"+
		"\7\'\2\2\u01e0\u01e4\7(\2\2\u01e1\u01e4\7)\2\2\u01e2\u01e4\7*\2\2\u01e3"+
		"\u01db\3\2\2\2\u01e3\u01dc\3\2\2\2\u01e3\u01dd\3\2\2\2\u01e3\u01de\3\2"+
		"\2\2\u01e3\u01df\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3"+
		"\u01e2\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5\u01e7\7\5\2\2\u01e6\u01e5\3\2"+
		"\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e3\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ee\7\6\2\2\u01ed\u01da\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee"+
		"\u020a\3\2\2\2\u01ef\u01f5\7\4\2\2\u01f0\u01f1\5\62\32\2\u01f1\u01f2\b"+
		"\20\1\2\u01f2\u01f4\3\2\2\2\u01f3\u01f0\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01fe\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f8\u01f9\5Z.\2\u01f9\u01fa\b\20\1\2\u01fa\u01ff\3\2\2\2\u01fb"+
		"\u01fc\5X-\2\u01fc\u01fd\b\20\1\2\u01fd\u01ff\3\2\2\2\u01fe\u01f8\3\2"+
		"\2\2\u01fe\u01fb\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0205\3\2\2\2\u0200"+
		"\u0201\5\62\32\2\u0201\u0202\b\20\1\2\u0202\u0204\3\2\2\2\u0203\u0200"+
		"\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0208\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020b\7\6\2\2\u0209\u020b\7\24"+
		"\2\2\u020a\u01ef\3\2\2\2\u020a\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u020d\b\20\1\2\u020d\37\3\2\2\2\u020e\u0210\5\\/\2\u020f\u020e\3\2\2"+
		"\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\b\21\1\2\u0212"+
		"\u0214\7\34\2\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0217\3"+
		"\2\2\2\u0215\u0218\7\35\2\2\u0216\u0218\7\36\2\2\u0217\u0215\3\2\2\2\u0217"+
		"\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u021b\7\37"+
		"\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c"+
		"\u021e\7 \2\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2"+
		"\2\2\u021f\u0221\7!\2\2\u0220\u021f\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0222\3\2\2\2\u0222\u0223\7+\2\2\u0223\u0224\5|?\2\u0224\u0225\b\21\1"+
		"\2\u0225\u0228\b\21\1\2\u0226\u0227\7,\2\2\u0227\u0229\5|?\2\u0228\u0226"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\b\21\1\2"+
		"\u022b\u022c\7\b\2\2\u022c\u022e\5F$\2\u022d\u022f\5*\26\2\u022e\u022d"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0233\b\21\1\2"+
		"\u0231\u0232\7\27\2\2\u0232\u0234\7\u008d\2\2\u0233\u0231\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u024b\b\21\1\2\u0236\u0246\7"+
		"\4\2\2\u0237\u0242\7-\2\2\u0238\u0242\7#\2\2\u0239\u0242\7%\2\2\u023a"+
		"\u0242\7&\2\2\u023b\u0242\7\'\2\2\u023c\u0242\7(\2\2\u023d\u0242\7.\2"+
		"\2\u023e\u0242\7/\2\2\u023f\u0242\7)\2\2\u0240\u0242\7*\2\2\u0241\u0237"+
		"\3\2\2\2\u0241\u0238\3\2\2\2\u0241\u0239\3\2\2\2\u0241\u023a\3\2\2\2\u0241"+
		"\u023b\3\2\2\2\u0241\u023c\3\2\2\2\u0241\u023d\3\2\2\2\u0241\u023e\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0241\u0240\3\2\2\2\u0242\u0244\3\2\2\2\u0243"+
		"\u0245\7\5\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2"+
		"\2\2\u0246\u0241\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u0246\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\7\6\2\2\u024b\u0236\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c\u0275\3\2\2\2\u024d\u0259\7\4\2\2\u024e"+
		"\u024f\7\60\2\2\u024f\u0254\5|?\2\u0250\u0251\7\5\2\2\u0251\u0253\5|?"+
		"\2\u0252\u0250\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255"+
		"\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u0258\7\24\2\2"+
		"\u0258\u025a\3\2\2\2\u0259\u024e\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u0260"+
		"\3\2\2\2\u025b\u025c\5\62\32\2\u025c\u025d\b\21\1\2\u025d\u025f\3\2\2"+
		"\2\u025e\u025b\3\2\2\2\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261"+
		"\3\2\2\2\u0261\u0269\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0264\5Z.\2\u0264"+
		"\u0265\b\21\1\2\u0265\u026a\3\2\2\2\u0266\u0267\5X-\2\u0267\u0268\b\21"+
		"\1\2\u0268\u026a\3\2\2\2\u0269\u0263\3\2\2\2\u0269\u0266\3\2\2\2\u0269"+
		"\u026a\3\2\2\2\u026a\u0270\3\2\2\2\u026b\u026c\5\62\32\2\u026c\u026d\b"+
		"\21\1\2\u026d\u026f\3\2\2\2\u026e\u026b\3\2\2\2\u026f\u0272\3\2\2\2\u0270"+
		"\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0273\3\2\2\2\u0272\u0270\3\2"+
		"\2\2\u0273\u0276\7\6\2\2\u0274\u0276\7\24\2\2\u0275\u024d\3\2\2\2\u0275"+
		"\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278\b\21\1\2\u0278!\3\2\2\2"+
		"\u0279\u027b\5\\/\2\u027a\u0279\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027c\u027e\b\22\1\2\u027d\u027f\7\34\2\2\u027e\u027d\3\2\2\2"+
		"\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0282\7\61\2\2\u0281\u0283"+
		"\5> \2\u0282\u0281\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0284\3\2\2\2\u0284"+
		"\u0285\b\22\1\2\u0285\u0286\5|?\2\u0286\u0287\b\22\1\2\u0287\u0290\7\21"+
		"\2\2\u0288\u028d\5(\25\2\u0289\u028a\7\5\2\2\u028a\u028c\5(\25\2\u028b"+
		"\u0289\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028e\3\2"+
		"\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u0290\u0288\3\2\2\2\u0290"+
		"\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\7\22\2\2\u0293\u0294\3"+
		"\2\2\2\u0294\u029a\b\22\1\2\u0295\u0296\7\b\2\2\u0296\u0298\5F$\2\u0297"+
		"\u0299\5*\26\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029b\3\2"+
		"\2\2\u029a\u0295\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u029d\b\22\1\2\u029d\u02a7\b\22\1\2\u029e\u029f\7\62\2\2\u029f\u02a4"+
		"\5$\23\2\u02a0\u02a1\7\5\2\2\u02a1\u02a3\5$\23\2\u02a2\u02a0\3\2\2\2\u02a3"+
		"\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a8\3\2"+
		"\2\2\u02a6\u02a4\3\2\2\2\u02a7\u029e\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8"+
		"\u02a9\3\2\2\2\u02a9\u02b9\b\22\1\2\u02aa\u02b4\7\4\2\2\u02ab\u02b0\7"+
		"%\2\2\u02ac\u02b0\7&\2\2\u02ad\u02b0\7\'\2\2\u02ae\u02b0\7(\2\2\u02af"+
		"\u02ab\3\2\2\2\u02af\u02ac\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02ae\3\2"+
		"\2\2\u02b0\u02b2\3\2\2\2\u02b1\u02b3\7\5\2\2\u02b2\u02b1\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02af\3\2\2\2\u02b5\u02b6\3\2"+
		"\2\2\u02b6\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02ba\7\6\2\2\u02b9\u02aa\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02cf\3\2"+
		"\2\2\u02bb\u02ca\7\4\2\2\u02bc\u02bd\5\62\32\2\u02bd\u02be\b\22\1\2\u02be"+
		"\u02c9\3\2\2\2\u02bf\u02c0\5T+\2\u02c0\u02c1\b\22\1\2\u02c1\u02c9\3\2"+
		"\2\2\u02c2\u02c3\5P)\2\u02c3\u02c4\b\22\1\2\u02c4\u02c9\3\2\2\2\u02c5"+
		"\u02c6\5V,\2\u02c6\u02c7\b\22\1\2\u02c7\u02c9\3\2\2\2\u02c8\u02bc\3\2"+
		"\2\2\u02c8\u02bf\3\2\2\2\u02c8\u02c2\3\2\2\2\u02c8\u02c5\3\2\2\2\u02c9"+
		"\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2"+
		"\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02d0\7\6\2\2\u02ce\u02d0\7\24\2\2\u02cf"+
		"\u02bb\3\2\2\2\u02cf\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u02d2\b\22"+
		"\1\2\u02d2#\3\2\2\2\u02d3\u02d4\5D#\2\u02d4\u02d5\b\23\1\2\u02d5%\3\2"+
		"\2\2\u02d6\u02d7\5D#\2\u02d7\u02d8\b\24\1\2\u02d8\'\3\2\2\2\u02d9\u02da"+
		"\5|?\2\u02da\u02db\b\25\1\2\u02db\u02dc\b\25\1\2\u02dc\u02dd\7\b\2\2\u02dd"+
		"\u02df\5F$\2\u02de\u02e0\5*\26\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2"+
		"\2\u02e0\u02e1\3\2\2\2\u02e1\u02f1\b\25\1\2\u02e2\u02ec\7\4\2\2\u02e3"+
		"\u02e8\7%\2\2\u02e4\u02e8\7&\2\2\u02e5\u02e8\7\'\2\2\u02e6\u02e8\7(\2"+
		"\2\u02e7\u02e3\3\2\2\2\u02e7\u02e4\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6"+
		"\3\2\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02eb\7\5\2\2\u02ea\u02e9\3\2\2\2\u02ea"+
		"\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02e7\3\2\2\2\u02ed\u02ee\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0"+
		"\u02f2\7\6\2\2\u02f1\u02e2\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02fc\3\2"+
		"\2\2\u02f3\u02f7\7\4\2\2\u02f4\u02f6\5\62\32\2\u02f5\u02f4\3\2\2\2\u02f6"+
		"\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fa\3\2"+
		"\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fb\b\25\1\2\u02fb\u02fd\7\6\2\2\u02fc"+
		"\u02f3\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u02ff\b\25"+
		"\1\2\u02ff)\3\2\2\2\u0300\u0307\7\r\2\2\u0301\u0304\5\u0082B\2\u0302\u0303"+
		"\7\20\2\2\u0303\u0305\5\u0080A\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2"+
		"\2\u0305\u0308\3\2\2\2\u0306\u0308\t\2\2\2\u0307\u0301\3\2\2\2\u0307\u0306"+
		"\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u030c\7\66\2\2\u030a\u030c\7\67\2\2"+
		"\u030b\u0309\3\2\2\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030d"+
		"\3\2\2\2\u030d\u030e\7\16\2\2\u030e\u030f\b\26\1\2\u030f+\3\2\2\2\u0310"+
		"\u0312\5\\/\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2"+
		"\2\2\u0313\u0315\b\27\1\2\u0314\u0316\78\2\2\u0315\u0314\3\2\2\2\u0315"+
		"\u0316\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\79\2\2\u0318\u0319\5|?"+
		"\2\u0319\u031a\b\27\1\2\u031a\u031c\b\27\1\2\u031b\u031d\5> \2\u031c\u031b"+
		"\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0321\b\27\1\2"+
		"\u031f\u0320\7\b\2\2\u0320\u0322\7\u008d\2\2\u0321\u031f\3\2\2\2\u0321"+
		"\u0322\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u032a\b\27\1\2\u0324\u0327\7"+
		"\4\2\2\u0325\u0328\7:\2\2\u0326\u0328\7;\2\2\u0327\u0325\3\2\2\2\u0327"+
		"\u0326\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0329\3\2\2\2\u0329\u032b\7\6"+
		"\2\2\u032a\u0324\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u033a\3\2\2\2\u032c"+
		"\u0335\7\4\2\2\u032d\u032e\5\62\32\2\u032e\u032f\b\27\1\2\u032f\u0334"+
		"\3\2\2\2\u0330\u0331\5R*\2\u0331\u0332\b\27\1\2\u0332\u0334\3\2\2\2\u0333"+
		"\u032d\3\2\2\2\u0333\u0330\3\2\2\2\u0334\u0337\3\2\2\2\u0335\u0333\3\2"+
		"\2\2\u0335\u0336\3\2\2\2\u0336\u0338\3\2\2\2\u0337\u0335\3\2\2\2\u0338"+
		"\u033b\7\6\2\2\u0339\u033b\7\24\2\2\u033a\u032c\3\2\2\2\u033a\u0339\3"+
		"\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\b\27\1\2\u033d-\3\2\2\2\u033e\u0340"+
		"\5\\/\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0342\b\30\1\2\u0342\u0343\7<\2\2\u0343\u0344\5|?\2\u0344\u0345\b\30"+
		"\1\2\u0345\u0347\b\30\1\2\u0346\u0348\5> \2\u0347\u0346\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034c\b\30\1\2\u034a\u034b\7"+
		"\b\2\2\u034b\u034d\7\u008d\2\2\u034c\u034a\3\2\2\2\u034c\u034d\3\2\2\2"+
		"\u034d\u034e\3\2\2\2\u034e\u0355\b\30\1\2\u034f\u0352\7\4\2\2\u0350\u0353"+
		"\7:\2\2\u0351\u0353\7;\2\2\u0352\u0350\3\2\2\2\u0352\u0351\3\2\2\2\u0352"+
		"\u0353\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0356\7\6\2\2\u0355\u034f\3\2"+
		"\2\2\u0355\u0356\3\2\2\2\u0356\u0368\3\2\2\2\u0357\u0363\7\4\2\2\u0358"+
		"\u0359\5\62\32\2\u0359\u035a\b\30\1\2\u035a\u0362\3\2\2\2\u035b\u035c"+
		"\5\60\31\2\u035c\u035d\b\30\1\2\u035d\u0362\3\2\2\2\u035e\u035f\5R*\2"+
		"\u035f\u0360\b\30\1\2\u0360\u0362\3\2\2\2\u0361\u0358\3\2\2\2\u0361\u035b"+
		"\3\2\2\2\u0361\u035e\3\2\2\2\u0362\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363"+
		"\u0364\3\2\2\2\u0364\u0366\3\2\2\2\u0365\u0363\3\2\2\2\u0366\u0369\7\6"+
		"\2\2\u0367\u0369\7\24\2\2\u0368\u0357\3\2\2\2\u0368\u0367\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036a\u036b\b\30\1\2\u036b/\3\2\2\2\u036c\u036d\7=\2\2"+
		"\u036d\u0370\5|?\2\u036e\u0370\5|?\2\u036f\u036c\3\2\2\2\u036f\u036e\3"+
		"\2\2\2\u0370\u0371\3\2\2\2\u0371\u0372\b\31\1\2\u0372\u0375\b\31\1\2\u0373"+
		"\u0374\7\27\2\2\u0374\u0376\5\u0084C\2\u0375\u0373\3\2\2\2\u0375\u0376"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0382\b\31\1\2\u0378\u037c\7\4\2\2"+
		"\u0379\u037b\5\62\32\2\u037a\u0379\3\2\2\2\u037b\u037e\3\2\2\2\u037c\u037a"+
		"\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f\3\2\2\2\u037e\u037c\3\2\2\2\u037f"+
		"\u0380\b\31\1\2\u0380\u0383\7\6\2\2\u0381\u0383\7\24\2\2\u0382\u0378\3"+
		"\2\2\2\u0382\u0381\3\2\2\2\u0383\61\3\2\2\2\u0384\u0386\7>\2\2\u0385\u0387"+
		"\7\u008d\2\2\u0386\u0385\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\3\2\2"+
		"\2\u0388\u0389\b\32\1\2\u0389\u0395\b\32\1\2\u038a\u038b\7\21\2\2\u038b"+
		"\u0390\5\64\33\2\u038c\u038d\7\5\2\2\u038d\u038f\5\64\33\2\u038e\u038c"+
		"\3\2\2\2\u038f\u0392\3\2\2\2\u0390\u038e\3\2\2\2\u0390\u0391\3\2\2\2\u0391"+
		"\u0393\3\2\2\2\u0392\u0390\3\2\2\2\u0393\u0394\7\22\2\2\u0394\u0396\3"+
		"\2\2\2\u0395\u038a\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0397\3\2\2\2\u0397"+
		"\u03a9\b\32\1\2\u0398\u03a2\7\4\2\2\u0399\u039a\5\62\32\2\u039a\u039b"+
		"\b\32\1\2\u039b\u03a3\3\2\2\2\u039c\u039d\5\66\34\2\u039d\u039e\b\32\1"+
		"\2\u039e\u03a3\3\2\2\2\u039f\u03a0\5<\37\2\u03a0\u03a1\b\32\1\2\u03a1"+
		"\u03a3\3\2\2\2\u03a2\u0399\3\2\2\2\u03a2\u039c\3\2\2\2\u03a2\u039f\3\2"+
		"\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a2\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u03a6\3\2\2\2\u03a6\u03a7\7\6\2\2\u03a7\u03aa\3\2\2\2\u03a8\u03aa\7\24"+
		"\2\2\u03a9\u0398\3\2\2\2\u03a9\u03a8\3\2\2\2\u03aa\63\3\2\2\2\u03ab\u03ad"+
		"\7\u008d\2\2\u03ac\u03ab\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03ae\3\2\2"+
		"\2\u03ae\u03b0\7\27\2\2\u03af\u03b1\t\3\2\2\u03b0\u03af\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b3\b\33\1\2\u03b3\65\3\2\2"+
		"\2\u03b4\u03b5\5\62\32\2\u03b5\u03b6\b\34\1\2\u03b6\u03bb\3\2\2\2\u03b7"+
		"\u03b8\58\35\2\u03b8\u03b9\b\34\1\2\u03b9\u03bb\3\2\2\2\u03ba\u03b4\3"+
		"\2\2\2\u03ba\u03b7\3\2\2\2\u03bb\67\3\2\2\2\u03bc\u03bd\5:\36\2\u03bd"+
		"\u03be\b\35\1\2\u03be\u03c9\3\2\2\2\u03bf\u03c0\5\30\r\2\u03c0\u03c1\b"+
		"\35\1\2\u03c1\u03c9\3\2\2\2\u03c2\u03c3\5\26\f\2\u03c3\u03c4\b\35\1\2"+
		"\u03c4\u03c9\3\2\2\2\u03c5\u03c6\5\60\31\2\u03c6\u03c7\b\35\1\2\u03c7"+
		"\u03c9\3\2\2\2\u03c8\u03bc\3\2\2\2\u03c8\u03bf\3\2\2\2\u03c8\u03c2\3\2"+
		"\2\2\u03c8\u03c5\3\2\2\2\u03c99\3\2\2\2\u03ca\u03cb\5\"\22\2\u03cb\u03cc"+
		"\b\36\1\2\u03cc\u03d4\3\2\2\2\u03cd\u03ce\5(\25\2\u03ce\u03cf\b\36\1\2"+
		"\u03cf\u03d4\3\2\2\2\u03d0\u03d1\5\34\17\2\u03d1\u03d2\b\36\1\2\u03d2"+
		"\u03d4\3\2\2\2\u03d3\u03ca\3\2\2\2\u03d3\u03cd\3\2\2\2\u03d3\u03d0\3\2"+
		"\2\2\u03d4;\3\2\2\2\u03d5\u03d6\7?\2\2\u03d6\u03d7\5J&\2\u03d7\u03d8\7"+
		"\24\2\2\u03d8=\3\2\2\2\u03d9\u03da\7@\2\2\u03da\u03df\5@!\2\u03db\u03dc"+
		"\7\5\2\2\u03dc\u03de\5@!\2\u03dd\u03db\3\2\2\2\u03de\u03e1\3\2\2\2\u03df"+
		"\u03dd\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e2\3\2\2\2\u03e1\u03df\3\2"+
		"\2\2\u03e2\u03e3\7A\2\2\u03e3?\3\2\2\2\u03e4\u03e5\5|?\2\u03e5\u03e6\b"+
		"!\1\2\u03e6\u03f0\b!\1\2\u03e7\u03e8\7\33\2\2\u03e8\u03ed\5D#\2\u03e9"+
		"\u03ea\7B\2\2\u03ea\u03ec\5D#\2\u03eb\u03e9\3\2\2\2\u03ec\u03ef\3\2\2"+
		"\2\u03ed\u03eb\3\2\2\2\u03ed\u03ee\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed"+
		"\3\2\2\2\u03f0\u03e7\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2"+
		"\u03f3\b!\1\2\u03f3A\3\2\2\2\u03f4\u03f5\5D#\2\u03f5\u03f6\b\"\1\2\u03f6"+
		"\u03fb\3\2\2\2\u03f7\u03f8\5H%\2\u03f8\u03f9\b\"\1\2\u03f9\u03fb\3\2\2"+
		"\2\u03fa\u03f4\3\2\2\2\u03fa\u03f7\3\2\2\2\u03fbC\3\2\2\2\u03fc\u0408"+
		"\5J&\2\u03fd\u03fe\7@\2\2\u03fe\u0403\5B\"\2\u03ff\u0400\7\5\2\2\u0400"+
		"\u0402\5B\"\2\u0401\u03ff\3\2\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2"+
		"\2\2\u0403\u0404\3\2\2\2\u0404\u0406\3\2\2\2\u0405\u0403\3\2\2\2\u0406"+
		"\u0407\7A\2\2\u0407\u0409\3\2\2\2\u0408\u03fd\3\2\2\2\u0408\u0409\3\2"+
		"\2\2\u0409E\3\2\2\2\u040a\u040b\5N(\2\u040b\u040c\b$\1\2\u040c\u0411\3"+
		"\2\2\2\u040d\u040e\5D#\2\u040e\u040f\b$\1\2\u040f\u0411\3\2\2\2\u0410"+
		"\u040a\3\2\2\2\u0410\u040d\3\2\2\2\u0411G\3\2\2\2\u0412\u0413\7\65\2\2"+
		"\u0413\u0418\b%\1\2\u0414\u0415\t\4\2\2\u0415\u0416\5D#\2\u0416\u0417"+
		"\b%\1\2\u0417\u0419\3\2\2\2\u0418\u0414\3\2\2\2\u0418\u0419\3\2\2\2\u0419"+
		"I\3\2\2\2\u041a\u0422\5|?\2\u041b\u041d\5L\'\2\u041c\u041b\3\2\2\2\u041d"+
		"\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0421\3\2"+
		"\2\2\u0420\u041e\3\2\2\2\u0421\u0423\5L\'\2\u0422\u041e\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423K\3\2\2\2\u0424\u0426\7D\2\2\u0425\u0427\7E\2\2\u0426"+
		"\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u042b\5|"+
		"?\2\u0429\u042a\7F\2\2\u042a\u042c\5x=\2\u042b\u0429\3\2\2\2\u042b\u042c"+
		"\3\2\2\2\u042cM\3\2\2\2\u042d\u042e\7G\2\2\u042e\u0438\b(\1\2\u042f\u0430"+
		"\7H\2\2\u0430\u0438\b(\1\2\u0431\u0432\7I\2\2\u0432\u0438\b(\1\2\u0433"+
		"\u0434\7J\2\2\u0434\u0438\b(\1\2\u0435\u0436\7K\2\2\u0436\u0438\b(\1\2"+
		"\u0437\u042d\3\2\2\2\u0437\u042f\3\2\2\2\u0437\u0431\3\2\2\2\u0437\u0433"+
		"\3\2\2\2\u0437\u0435\3\2\2\2\u0438O\3\2\2\2\u0439\u043b\7L\2\2\u043a\u043c"+
		"\5~@\2\u043b\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043d\3\2\2\2\u043d"+
		"\u0444\b)\1\2\u043e\u0440\7\b\2\2\u043f\u0441\5d\63\2\u0440\u043f\3\2"+
		"\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0445\7\24\2\2\u0443"+
		"\u0445\7\24\2\2\u0444\u043e\3\2\2\2\u0444\u0443\3\2\2\2\u0445\u0446\3"+
		"\2\2\2\u0446\u0447\b)\1\2\u0447Q\3\2\2\2\u0448\u044a\7M\2\2\u0449\u0448"+
		"\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\b*\1\2\u044c"+
		"\u0453\7N\2\2\u044d\u0451\5~@\2\u044e\u044f\7\21\2\2\u044f\u0450\7\u008c"+
		"\2\2\u0450\u0452\7\22\2\2\u0451\u044e\3\2\2\2\u0451\u0452\3\2\2\2\u0452"+
		"\u0454\3\2\2\2\u0453\u044d\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\3\2"+
		"\2\2\u0455\u045c\b*\1\2\u0456\u0458\7\b\2\2\u0457\u0459\5b\62\2\u0458"+
		"\u0457\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045d\7\24"+
		"\2\2\u045b\u045d\7\24\2\2\u045c\u0456\3\2\2\2\u045c\u045b\3\2\2\2\u045d"+
		"\u045e\3\2\2\2\u045e\u045f\b*\1\2\u045fS\3\2\2\2\u0460\u0467\t\5\2\2\u0461"+
		"\u0465\5~@\2\u0462\u0463\7\21\2\2\u0463\u0464\7\u008c\2\2\u0464\u0466"+
		"\7\22\2\2\u0465\u0462\3\2\2\2\u0465\u0466\3\2\2\2\u0466\u0468\3\2\2\2"+
		"\u0467\u0461\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u0471"+
		"\b+\1\2\u046a\u046b\7\b\2\2\u046b\u046d\b+\1\2\u046c\u046e\5b\62\2\u046d"+
		"\u046c\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0472\7\24"+
		"\2\2\u0470\u0472\7\24\2\2\u0471\u046a\3\2\2\2\u0471\u0470\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u0474\b+\1\2\u0474U\3\2\2\2\u0475\u047c\t\6\2\2\u0476"+
		"\u047a\5~@\2\u0477\u0478\7\21\2\2\u0478\u0479\7\u008c\2\2\u0479\u047b"+
		"\7\22\2\2\u047a\u0477\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047d\3\2\2\2"+
		"\u047c\u0476\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u0486"+
		"\b,\1\2\u047f\u0480\7\b\2\2\u0480\u0482\b,\1\2\u0481\u0483\5b\62\2\u0482"+
		"\u0481\3\2\2\2\u0482\u0483\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0487\7\24"+
		"\2\2\u0485\u0487\7\24\2\2\u0486\u047f\3\2\2\2\u0486\u0485\3\2\2\2\u0487"+
		"\u0488\3\2\2\2\u0488\u0489\b,\1\2\u0489W\3\2\2\2\u048a\u048c\7S\2\2\u048b"+
		"\u048d\5~@\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2"+
		"\2\u048e\u0495\b-\1\2\u048f\u0491\7\b\2\2\u0490\u0492\5d\63\2\u0491\u0490"+
		"\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0496\7\24\2\2"+
		"\u0494\u0496\7\24\2\2\u0495\u048f\3\2\2\2\u0495\u0494\3\2\2\2\u0496\u0497"+
		"\3\2\2\2\u0497\u0498\b-\1\2\u0498Y\3\2\2\2\u0499\u049b\7T\2\2\u049a\u049c"+
		"\5~@\2\u049b\u049a\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u049d\3\2\2\2\u049d"+
		"\u04a4\b.\1\2\u049e\u04a0\7\b\2\2\u049f\u04a1\5d\63\2\u04a0\u049f\3\2"+
		"\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a5\7\24\2\2\u04a3"+
		"\u04a5\7\24\2\2\u04a4\u049e\3\2\2\2\u04a4\u04a3\3\2\2\2\u04a5\u04a6\3"+
		"\2\2\2\u04a6\u04a7\b.\1\2\u04a7[\3\2\2\2\u04a8\u04ac\7U\2\2\u04a9\u04ac"+
		"\7V\2\2\u04aa\u04ac\7W\2\2\u04ab\u04a8\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab"+
		"\u04aa\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\b/\1\2\u04ae]\3\2\2\2\u04af"+
		"\u04b0\7\u008b\2\2\u04b0\u04b3\b\60\1\2\u04b1\u04b3\7\u008a\2\2\u04b2"+
		"\u04af\3\2\2\2\u04b2\u04b1\3\2\2\2\u04b3_\3\2\2\2\u04b4\u04b5\7\u008a"+
		"\2\2\u04b5a\3\2\2\2\u04b6\u04b7\b\62\1\2\u04b7\u04b8\7X\2\2\u04b8\u04b9"+
		"\5d\63\2\u04b9\u04ba\b\62\1\2\u04ba\u05d2\3\2\2\2\u04bb\u04bc\7Y\2\2\u04bc"+
		"\u04bd\5d\63\2\u04bd\u04be\b\62\1\2\u04be\u05d2\3\2\2\2\u04bf\u04c0\7"+
		"Z\2\2\u04c0\u04c1\5d\63\2\u04c1\u04c2\b\62\1\2\u04c2\u05d2\3\2\2\2\u04c3"+
		"\u04c4\7[\2\2\u04c4\u04c5\5d\63\2\u04c5\u04c6\b\62\1\2\u04c6\u05d2\3\2"+
		"\2\2\u04c7\u04c9\5d\63\2\u04c8\u04ca\t\7\2\2\u04c9\u04c8\3\2\2\2\u04c9"+
		"\u04ca\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\7^\2\2\u04cc\u04cd\5d\63"+
		"\2\u04cd\u04ce\b\62\1\2\u04ce\u05d2\3\2\2\2\u04cf\u04d1\5d\63\2\u04d0"+
		"\u04d2\t\7\2\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\3\2"+
		"\2\2\u04d3\u04d4\7\27\2\2\u04d4\u04d5\5d\63\2\u04d5\u04d6\b\62\1\2\u04d6"+
		"\u05d2\3\2\2\2\u04d7\u04d9\5f\64\2\u04d8\u04da\t\7\2\2\u04d9\u04d8\3\2"+
		"\2\2\u04d9\u04da\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dc\7\27\2\2\u04dc"+
		"\u04dd\5f\64\2\u04dd\u04de\b\62\1\2\u04de\u05d2\3\2\2\2\u04df\u04e1\5"+
		"f\64\2\u04e0\u04e2\t\7\2\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u04e3\3\2\2\2\u04e3\u04e4\7@\2\2\u04e4\u04e5\5f\64\2\u04e5\u04e6\b\62"+
		"\1\2\u04e6\u05d2\3\2\2\2\u04e7\u04e9\5f\64\2\u04e8\u04ea\t\7\2\2\u04e9"+
		"\u04e8\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u04eb\3\2\2\2\u04eb\u04ec\7_"+
		"\2\2\u04ec\u04ed\5f\64\2\u04ed\u04ee\b\62\1\2\u04ee\u05d2\3\2\2\2\u04ef"+
		"\u04f1\5f\64\2\u04f0\u04f2\t\7\2\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2"+
		"\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f4\7A\2\2\u04f4\u04f5\5f\64\2\u04f5"+
		"\u04f6\b\62\1\2\u04f6\u05d2\3\2\2\2\u04f7\u04f9\5f\64\2\u04f8\u04fa\t"+
		"\7\2\2\u04f9\u04f8\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb"+
		"\u04fc\7`\2\2\u04fc\u04fd\5f\64\2\u04fd\u04fe\b\62\1\2\u04fe\u05d2\3\2"+
		"\2\2\u04ff\u0500\7a\2\2\u0500\u0501\5h\65\2\u0501\u0502\7b\2\2\u0502\u0503"+
		"\5f\64\2\u0503\u0504\3\2\2\2\u0504\u0505\b\62\1\2\u0505\u05d2\3\2\2\2"+
		"\u0506\u0507\7c\2\2\u0507\u0508\7\r\2\2\u0508\u0509\5t;\2\u0509\u050a"+
		"\7\16\2\2\u050a\u050b\b\62\1\2\u050b\u05d2\3\2\2\2\u050c\u050d\7d\2\2"+
		"\u050d\u050e\7\r\2\2\u050e\u050f\5t;\2\u050f\u0510\7\b\2\2\u0510\u0511"+
		"\5d\63\2\u0511\u0516\7e\2\2\u0512\u0514\7Z\2\2\u0513\u0512\3\2\2\2\u0513"+
		"\u0514\3\2\2\2\u0514\u0517\3\2\2\2\u0515\u0517\7Y\2\2\u0516\u0513\3\2"+
		"\2\2\u0516\u0515\3\2\2\2\u0517\u0518\3\2\2\2\u0518\u0519\5d\63\2\u0519"+
		"\u051a\7\16\2\2\u051a\u051b\b\62\1\2\u051b\u05d2\3\2\2\2\u051c\u051d\7"+
		"f\2\2\u051d\u051e\7\r\2\2\u051e\u051f\5t;\2\u051f\u0520\7\5\2\2\u0520"+
		"\u0521\5t;\2\u0521\u0522\7\5\2\2\u0522\u0523\5t;\2\u0523\u0524\7\5\2\2"+
		"\u0524\u0525\5t;\2\u0525\u0526\7\16\2\2\u0526\u0527\b\62\1\2\u0527\u05d2"+
		"\3\2\2\2\u0528\u0529\t\7\2\2\u0529\u052a\5b\62\20\u052a\u052b\b\62\1\2"+
		"\u052b\u05d2\3\2\2\2\u052c\u052d\7p\2\2\u052d\u0542\5h\65\2\u052e\u0538"+
		"\7b\2\2\u052f\u0539\5b\62\2\u0530\u0534\7\4\2\2\u0531\u0533\5b\62\2\u0532"+
		"\u0531\3\2\2\2\u0533\u0536\3\2\2\2\u0534\u0532\3\2\2\2\u0534\u0535\3\2"+
		"\2\2\u0535\u0537\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0539\7\6\2\2\u0538"+
		"\u052f\3\2\2\2\u0538\u0530\3\2\2\2\u0539\u0543\3\2\2\2\u053a\u053e\7\4"+
		"\2\2\u053b\u053d\5b\62\2\u053c\u053b\3\2\2\2\u053d\u0540\3\2\2\2\u053e"+
		"\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f\u0541\3\2\2\2\u0540\u053e\3\2"+
		"\2\2\u0541\u0543\7\6\2\2\u0542\u052e\3\2\2\2\u0542\u053a\3\2\2\2\u0543"+
		"\u0544\3\2\2\2\u0544\u0545\b\62\1\2\u0545\u05d2\3\2\2\2\u0546\u0547\7"+
		"[\2\2\u0547\u055c\5h\65\2\u0548\u0552\7b\2\2\u0549\u0553\5b\62\2\u054a"+
		"\u054e\7\4\2\2\u054b\u054d\5b\62\2\u054c\u054b\3\2\2\2\u054d\u0550\3\2"+
		"\2\2\u054e\u054c\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0551\3\2\2\2\u0550"+
		"\u054e\3\2\2\2\u0551\u0553\7\6\2\2\u0552\u0549\3\2\2\2\u0552\u054a\3\2"+
		"\2\2\u0553\u055d\3\2\2\2\u0554\u0558\7\4\2\2\u0555\u0557\5b\62\2\u0556"+
		"\u0555\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2"+
		"\2\2\u0559\u055b\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u055d\7\6\2\2\u055c"+
		"\u0548\3\2\2\2\u055c\u0554\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\b\62"+
		"\1\2\u055f\u05d2\3\2\2\2\u0560\u0561\7X\2\2\u0561\u0576\5h\65\2\u0562"+
		"\u056c\7b\2\2\u0563\u056d\5b\62\2\u0564\u0568\7\4\2\2\u0565\u0567\5b\62"+
		"\2\u0566\u0565\3\2\2\2\u0567\u056a\3\2\2\2\u0568\u0566\3\2\2\2\u0568\u0569"+
		"\3\2\2\2\u0569\u056b\3\2\2\2\u056a\u0568\3\2\2\2\u056b\u056d\7\6\2\2\u056c"+
		"\u0563\3\2\2\2\u056c\u0564\3\2\2\2\u056d\u0577\3\2\2\2\u056e\u0572\7\4"+
		"\2\2\u056f\u0571\5b\62\2\u0570\u056f\3\2\2\2\u0571\u0574\3\2\2\2\u0572"+
		"\u0570\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u0575\3\2\2\2\u0574\u0572\3\2"+
		"\2\2\u0575\u0577\7\6\2\2\u0576\u0562\3\2\2\2\u0576\u056e\3\2\2\2\u0577"+
		"\u0578\3\2\2\2\u0578\u0579\b\62\1\2\u0579\u05d2\3\2\2\2\u057a\u057b\7"+
		"Z\2\2\u057b\u0590\5h\65\2\u057c\u0586\7b\2\2\u057d\u0587\5b\62\2\u057e"+
		"\u0582\7\4\2\2\u057f\u0581\5b\62\2\u0580\u057f\3\2\2\2\u0581\u0584\3\2"+
		"\2\2\u0582\u0580\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0585\3\2\2\2\u0584"+
		"\u0582\3\2\2\2\u0585\u0587\7\6\2\2\u0586\u057d\3\2\2\2\u0586\u057e\3\2"+
		"\2\2\u0587\u0591\3\2\2\2\u0588\u058c\7\4\2\2\u0589\u058b\5b\62\2\u058a"+
		"\u0589\3\2\2\2\u058b\u058e\3\2\2\2\u058c\u058a\3\2\2\2\u058c\u058d\3\2"+
		"\2\2\u058d\u058f\3\2\2\2\u058e\u058c\3\2\2\2\u058f\u0591\7\6\2\2\u0590"+
		"\u057c\3\2\2\2\u0590\u0588\3\2\2\2\u0591\u0592\3\2\2\2\u0592\u0593\b\62"+
		"\1\2\u0593\u05d2\3\2\2\2\u0594\u0595\7Y\2\2\u0595\u05aa\5h\65\2\u0596"+
		"\u05a0\7b\2\2\u0597\u05a1\5b\62\2\u0598\u059c\7\4\2\2\u0599\u059b\5b\62"+
		"\2\u059a\u0599\3\2\2\2\u059b\u059e\3\2\2\2\u059c\u059a\3\2\2\2\u059c\u059d"+
		"\3\2\2\2\u059d\u059f\3\2\2\2\u059e\u059c\3\2\2\2\u059f\u05a1\7\6\2\2\u05a0"+
		"\u0597\3\2\2\2\u05a0\u0598\3\2\2\2\u05a1\u05ab\3\2\2\2\u05a2\u05a6\7\4"+
		"\2\2\u05a3\u05a5\5b\62\2\u05a4\u05a3\3\2\2\2\u05a5\u05a8\3\2\2\2\u05a6"+
		"\u05a4\3\2\2\2\u05a6\u05a7\3\2\2\2\u05a7\u05a9\3\2\2\2\u05a8\u05a6\3\2"+
		"\2\2\u05a9\u05ab\7\6\2\2\u05aa\u0596\3\2\2\2\u05aa\u05a2\3\2\2\2\u05ab"+
		"\u05ac\3\2\2\2\u05ac\u05ad\b\62\1\2\u05ad\u05d2\3\2\2\2\u05ae\u05af\7"+
		"q\2\2\u05af\u05c4\5l\67\2\u05b0\u05ba\7b\2\2\u05b1\u05bb\5b\62\2\u05b2"+
		"\u05b6\7\4\2\2\u05b3\u05b5\5b\62\2\u05b4\u05b3\3\2\2\2\u05b5\u05b8\3\2"+
		"\2\2\u05b6\u05b4\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8"+
		"\u05b6\3\2\2\2\u05b9\u05bb\7\6\2\2\u05ba\u05b1\3\2\2\2\u05ba\u05b2\3\2"+
		"\2\2\u05bb\u05c5\3\2\2\2\u05bc\u05c0\7\4\2\2\u05bd\u05bf\5b\62\2\u05be"+
		"\u05bd\3\2\2\2\u05bf\u05c2\3\2\2\2\u05c0\u05be\3\2\2\2\u05c0\u05c1\3\2"+
		"\2\2\u05c1\u05c3\3\2\2\2\u05c2\u05c0\3\2\2\2\u05c3\u05c5\7\6\2\2\u05c4"+
		"\u05b0\3\2\2\2\u05c4\u05bc\3\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c7\b\62"+
		"\1\2\u05c7\u05d2\3\2\2\2\u05c8\u05c9\7r\2\2\u05c9\u05d2\b\62\1\2\u05ca"+
		"\u05cb\7s\2\2\u05cb\u05d2\b\62\1\2\u05cc\u05cd\7\21\2\2\u05cd\u05ce\5"+
		"b\62\2\u05ce\u05cf\7\22\2\2\u05cf\u05d0\b\62\1\2\u05d0\u05d2\3\2\2\2\u05d1"+
		"\u04b6\3\2\2\2\u05d1\u04bb\3\2\2\2\u05d1\u04bf\3\2\2\2\u05d1\u04c3\3\2"+
		"\2\2\u05d1\u04c7\3\2\2\2\u05d1\u04cf\3\2\2\2\u05d1\u04d7\3\2\2\2\u05d1"+
		"\u04df\3\2\2\2\u05d1\u04e7\3\2\2\2\u05d1\u04ef\3\2\2\2\u05d1\u04f7\3\2"+
		"\2\2\u05d1\u04ff\3\2\2\2\u05d1\u0506\3\2\2\2\u05d1\u050c\3\2\2\2\u05d1"+
		"\u051c\3\2\2\2\u05d1\u0528\3\2\2\2\u05d1\u052c\3\2\2\2\u05d1\u0546\3\2"+
		"\2\2\u05d1\u0560\3\2\2\2\u05d1\u057a\3\2\2\2\u05d1\u0594\3\2\2\2\u05d1"+
		"\u05ae\3\2\2\2\u05d1\u05c8\3\2\2\2\u05d1\u05ca\3\2\2\2\u05d1\u05cc\3\2"+
		"\2\2\u05d2\u05e9\3\2\2\2\u05d3\u05d4\f\17\2\2\u05d4\u05d5\t\b\2\2\u05d5"+
		"\u05d6\5b\62\20\u05d6\u05d7\b\62\1\2\u05d7\u05e8\3\2\2\2\u05d8\u05d9\f"+
		"\16\2\2\u05d9\u05da\t\t\2\2\u05da\u05db\5b\62\17\u05db\u05dc\b\62\1\2"+
		"\u05dc\u05e8\3\2\2\2\u05dd\u05de\f\r\2\2\u05de\u05df\t\n\2\2\u05df\u05e0"+
		"\5b\62\r\u05e0\u05e1\b\62\1\2\u05e1\u05e8\3\2\2\2\u05e2\u05e3\f\f\2\2"+
		"\u05e3\u05e4\t\13\2\2\u05e4\u05e5\5b\62\f\u05e5\u05e6\b\62\1\2\u05e6\u05e8"+
		"\3\2\2\2\u05e7\u05d3\3\2\2\2\u05e7\u05d8\3\2\2\2\u05e7\u05dd\3\2\2\2\u05e7"+
		"\u05e2\3\2\2\2\u05e8\u05eb\3\2\2\2\u05e9\u05e7\3\2\2\2\u05e9\u05ea\3\2"+
		"\2\2\u05eac\3\2\2\2\u05eb\u05e9\3\2\2\2\u05ec\u05ed\b\63\1\2\u05ed\u05ee"+
		"\7t\2\2\u05ee\u05ef\5d\63\24\u05ef\u05f0\b\63\1\2\u05f0\u0619\3\2\2\2"+
		"\u05f1\u05f2\7u\2\2\u05f2\u05f3\5d\63\23\u05f3\u05f4\b\63\1\2\u05f4\u0619"+
		"\3\2\2\2\u05f5\u05f6\7\63\2\2\u05f6\u05f7\5d\63\22\u05f7\u05f8\b\63\1"+
		"\2\u05f8\u0619\3\2\2\2\u05f9\u05fa\7\4\2\2\u05fa\u05fb\5p9\2\u05fb\u05fc"+
		"\7b\2\2\u05fc\u05fd\5b\62\2\u05fd\u05fe\7\6\2\2\u05fe\u05ff\b\63\1\2\u05ff"+
		"\u0619\3\2\2\2\u0600\u0601\t\f\2\2\u0601\u0602\5b\62\2\u0602\u0603\7x"+
		"\2\2\u0603\u0604\5d\63\2\u0604\u0605\7y\2\2\u0605\u0606\5d\63\t\u0606"+
		"\u0607\b\63\1\2\u0607\u0619\3\2\2\2\u0608\u0609\7z\2\2\u0609\u0619\b\63"+
		"\1\2\u060a\u060b\7{\2\2\u060b\u0619\b\63\1\2\u060c\u060d\7|\2\2\u060d"+
		"\u0619\b\63\1\2\u060e\u060f\7}\2\2\u060f\u0619\b\63\1\2\u0610\u0611\7"+
		"\21\2\2\u0611\u0612\5d\63\2\u0612\u0613\7\22\2\2\u0613\u0614\b\63\1\2"+
		"\u0614\u0619\3\2\2\2\u0615\u0616\5J&\2\u0616\u0617\b\63\1\2\u0617\u0619"+
		"\3\2\2\2\u0618\u05ec\3\2\2\2\u0618\u05f1\3\2\2\2\u0618\u05f5\3\2\2\2\u0618"+
		"\u05f9\3\2\2\2\u0618\u0600\3\2\2\2\u0618\u0608\3\2\2\2\u0618\u060a\3\2"+
		"\2\2\u0618\u060c\3\2\2\2\u0618\u060e\3\2\2\2\u0618\u0610\3\2\2\2\u0618"+
		"\u0615\3\2\2\2\u0619\u0646\3\2\2\2\u061a\u061b\f\21\2\2\u061b\u061c\7"+
		"\64\2\2\u061c\u061d\5d\63\22\u061d\u061e\b\63\1\2\u061e\u0645\3\2\2\2"+
		"\u061f\u0620\f\20\2\2\u0620\u0621\7B\2\2\u0621\u0622\5d\63\21\u0622\u0623"+
		"\b\63\1\2\u0623\u0645\3\2\2\2\u0624\u0625\f\17\2\2\u0625\u0626\7v\2\2"+
		"\u0626\u0627\5d\63\20\u0627\u0628\b\63\1\2\u0628\u0645\3\2\2\2\u0629\u062a"+
		"\f\16\2\2\u062a\u062b\7F\2\2\u062b\u062c\5d\63\17\u062c\u062d\b\63\1\2"+
		"\u062d\u0645\3\2\2\2\u062e\u0630\f\f\2\2\u062f\u0631\5z>\2\u0630\u062f"+
		"\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\3\2\2\2\u0632\u0634\7e\2\2\u0633"+
		"\u0635\5z>\2\u0634\u0633\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0636\3\2\2"+
		"\2\u0636\u0637\5d\63\f\u0637\u0638\b\63\1\2\u0638\u0645\3\2\2\2\u0639"+
		"\u063a\f\13\2\2\u063a\u063b\7w\2\2\u063b\u063c\5d\63\f\u063c\u063d\b\63"+
		"\1\2\u063d\u0645\3\2\2\2\u063e\u063f\f\r\2\2\u063f\u0640\7\r\2\2\u0640"+
		"\u0641\5d\63\2\u0641\u0642\7\16\2\2\u0642\u0643\b\63\1\2\u0643\u0645\3"+
		"\2\2\2\u0644\u061a\3\2\2\2\u0644\u061f\3\2\2\2\u0644\u0624\3\2\2\2\u0644"+
		"\u0629\3\2\2\2\u0644\u062e\3\2\2\2\u0644\u0639\3\2\2\2\u0644\u063e\3\2"+
		"\2\2\u0645\u0648\3\2\2\2\u0646\u0644\3\2\2\2\u0646\u0647\3\2\2\2\u0647"+
		"e\3\2\2\2\u0648\u0646\3\2\2\2\u0649\u064a\b\64\1\2\u064a\u064b\t\f\2\2"+
		"\u064b\u064c\5b\62\2\u064c\u064d\7x\2\2\u064d\u064e\5f\64\2\u064e\u064f"+
		"\7y\2\2\u064f\u0650\5f\64\f\u0650\u0651\b\64\1\2\u0651\u0666\3\2\2\2\u0652"+
		"\u0653\7a\2\2\u0653\u0654\5d\63\2\u0654\u0655\b\64\1\2\u0655\u0666\3\2"+
		"\2\2\u0656\u0657\7,\2\2\u0657\u0658\5d\63\2\u0658\u0659\b\64\1\2\u0659"+
		"\u0666\3\2\2\2\u065a\u065c\7v\2\2\u065b\u065a\3\2\2\2\u065b\u065c\3\2"+
		"\2\2\u065c\u065d\3\2\2\2\u065d\u065e\5x=\2\u065e\u065f\b\64\1\2\u065f"+
		"\u0666\3\2\2\2\u0660\u0661\7\21\2\2\u0661\u0662\5f\64\2\u0662\u0663\7"+
		"\22\2\2\u0663\u0664\b\64\1\2\u0664\u0666\3\2\2\2\u0665\u0649\3\2\2\2\u0665"+
		"\u0652\3\2\2\2\u0665\u0656\3\2\2\2\u0665\u065b\3\2\2\2\u0665\u0660\3\2"+
		"\2\2\u0666\u0682\3\2\2\2\u0667\u0668\f\t\2\2\u0668\u0669\t\r\2\2\u0669"+
		"\u066a\5f\64\n\u066a\u066b\b\64\1\2\u066b\u0681\3\2\2\2\u066c\u066d\f"+
		"\b\2\2\u066d\u066e\t\16\2\2\u066e\u066f\5f\64\t\u066f\u0670\b\64\1\2\u0670"+
		"\u0681\3\2\2\2\u0671\u0672\f\7\2\2\u0672\u0673\t\17\2\2\u0673\u0674\5"+
		"f\64\b\u0674\u0675\b\64\1\2\u0675\u0681\3\2\2\2\u0676\u0677\f\6\2\2\u0677"+
		"\u0678\t\20\2\2\u0678\u0679\5f\64\7\u0679\u067a\b\64\1\2\u067a\u0681\3"+
		"\2\2\2\u067b\u067c\f\5\2\2\u067c\u067d\t\21\2\2\u067d\u067e\5f\64\6\u067e"+
		"\u067f\b\64\1\2\u067f\u0681\3\2\2\2\u0680\u0667\3\2\2\2\u0680\u066c\3"+
		"\2\2\2\u0680\u0671\3\2\2\2\u0680\u0676\3\2\2\2\u0680\u067b\3\2\2\2\u0681"+
		"\u0684\3\2\2\2\u0682\u0680\3\2\2\2\u0682\u0683\3\2\2\2\u0683g\3\2\2\2"+
		"\u0684\u0682\3\2\2\2\u0685\u068a\5j\66\2\u0686\u0687\7\5\2\2\u0687\u0689"+
		"\5j\66\2\u0688\u0686\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688\3\2\2\2\u068a"+
		"\u068b\3\2\2\2\u068bi\3\2\2\2\u068c\u068a\3\2\2\2\u068d\u068f\7\u0085"+
		"\2\2\u068e\u068d\3\2\2\2\u068e\u068f\3\2\2\2\u068f\u0690\3\2\2\2\u0690"+
		"\u0695\5v<\2\u0691\u0692\7\5\2\2\u0692\u0694\5v<\2\u0693\u0691\3\2\2\2"+
		"\u0694\u0697\3\2\2\2\u0695\u0693\3\2\2\2\u0695\u0696\3\2\2\2\u0696\u0698"+
		"\3\2\2\2\u0697\u0695\3\2\2\2\u0698\u069a\7\b\2\2\u0699\u069b\7Z\2\2\u069a"+
		"\u0699\3\2\2\2\u069a\u069b\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069d\5d"+
		"\63\2\u069d\u069e\b\66\1\2\u069e\u06d0\3\2\2\2\u069f\u06a1\7\u0085\2\2"+
		"\u06a0\u069f\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a7"+
		"\5v<\2\u06a3\u06a4\7\5\2\2\u06a4\u06a6\5v<\2\u06a5\u06a3\3\2\2\2\u06a6"+
		"\u06a9\3\2\2\2\u06a7\u06a5\3\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06aa\3\2"+
		"\2\2\u06a9\u06a7\3\2\2\2\u06aa\u06ab\7\b\2\2\u06ab\u06ac\7Y\2\2\u06ac"+
		"\u06ad\5d\63\2\u06ad\u06ae\b\66\1\2\u06ae\u06d0\3\2\2\2\u06af\u06b1\7"+
		"\u0085\2\2\u06b0\u06af\3\2\2\2\u06b0\u06b1\3\2\2\2\u06b1\u06b2\3\2\2\2"+
		"\u06b2\u06b7\5v<\2\u06b3\u06b4\7\5\2\2\u06b4\u06b6\5v<\2\u06b5\u06b3\3"+
		"\2\2\2\u06b6\u06b9\3\2\2\2\u06b7\u06b5\3\2\2\2\u06b7\u06b8\3\2\2\2\u06b8"+
		"\u06ba\3\2\2\2\u06b9\u06b7\3\2\2\2\u06ba\u06bb\7\b\2\2\u06bb\u06bc\7["+
		"\2\2\u06bc\u06bd\5d\63\2\u06bd\u06be\b\66\1\2\u06be\u06d0\3\2\2\2\u06bf"+
		"\u06c1\7\u0085\2\2\u06c0\u06bf\3\2\2\2\u06c0\u06c1\3\2\2\2\u06c1\u06c2"+
		"\3\2\2\2\u06c2\u06c7\5v<\2\u06c3\u06c4\7\5\2\2\u06c4\u06c6\5v<\2\u06c5"+
		"\u06c3\3\2\2\2\u06c6\u06c9\3\2\2\2\u06c7\u06c5\3\2\2\2\u06c7\u06c8\3\2"+
		"\2\2\u06c8\u06ca\3\2\2\2\u06c9\u06c7\3\2\2\2\u06ca\u06cb\7\b\2\2\u06cb"+
		"\u06cc\7\u0086\2\2\u06cc\u06cd\5d\63\2\u06cd\u06ce\b\66\1\2\u06ce\u06d0"+
		"\3\2\2\2\u06cf\u068e\3\2\2\2\u06cf\u06a0\3\2\2\2\u06cf\u06b0\3\2\2\2\u06cf"+
		"\u06c0\3\2\2\2\u06d0k\3\2\2\2\u06d1\u06d6\5n8\2\u06d2\u06d3\7\5\2\2\u06d3"+
		"\u06d5\5n8\2\u06d4\u06d2\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d4\3\2\2"+
		"\2\u06d6\u06d7\3\2\2\2\u06d7m\3\2\2\2\u06d8\u06d6\3\2\2\2\u06d9\u06de"+
		"\5v<\2\u06da\u06db\7\5\2\2\u06db\u06dd\5v<\2\u06dc\u06da\3\2\2\2\u06dd"+
		"\u06e0\3\2\2\2\u06de\u06dc\3\2\2\2\u06de\u06df\3\2\2\2\u06df\u06e1\3\2"+
		"\2\2\u06e0\u06de\3\2\2\2\u06e1\u06e2\7\27\2\2\u06e2\u06e3\5d\63\2\u06e3"+
		"\u06e4\b8\1\2\u06e4o\3\2\2\2\u06e5\u06ea\5r:\2\u06e6\u06e7\7\5\2\2\u06e7"+
		"\u06e9\5r:\2\u06e8\u06e6\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8\3\2\2"+
		"\2\u06ea\u06eb\3\2\2\2\u06ebq\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ed\u06ef"+
		"\7\u0085\2\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f0\3\2\2"+
		"\2\u06f0\u06f5\5v<\2\u06f1\u06f2\7\5\2\2\u06f2\u06f4\5v<\2\u06f3\u06f1"+
		"\3\2\2\2\u06f4\u06f7\3\2\2\2\u06f5\u06f3\3\2\2\2\u06f5\u06f6\3\2\2\2\u06f6"+
		"\u06f8\3\2\2\2\u06f7\u06f5\3\2\2\2\u06f8\u06fa\7\b\2\2\u06f9\u06fb\7Z"+
		"\2\2\u06fa\u06f9\3\2\2\2\u06fa\u06fb\3\2\2\2\u06fb\u06fc\3\2\2\2\u06fc"+
		"\u06fd\5d\63\2\u06fd\u06fe\3\2\2\2\u06fe\u06ff\b:\1\2\u06ffs\3\2\2\2\u0700"+
		"\u0701\5|?\2\u0701u\3\2\2\2\u0702\u0703\5|?\2\u0703\u0704\b<\1\2\u0704"+
		"w\3\2\2\2\u0705\u0706\7\u008a\2\2\u0706y\3\2\2\2\u0707\u0708\t\22\2\2"+
		"\u0708{\3\2\2\2\u0709\u0734\5~@\2\u070a\u0734\7\30\2\2\u070b\u0734\7\""+
		"\2\2\u070c\u0734\7L\2\2\u070d\u0734\7M\2\2\u070e\u0734\7\31\2\2\u070f"+
		"\u0734\7-\2\2\u0710\u0734\79\2\2\u0711\u0734\7\u0087\2\2\u0712\u0734\7"+
		"T\2\2\u0713\u0734\7#\2\2\u0714\u0734\7<\2\2\u0715\u0734\7\u0088\2\2\u0716"+
		"\u0734\7\33\2\2\u0717\u0734\7$\2\2\u0718\u0734\7\25\2\2\u0719\u0734\7"+
		"S\2\2\u071a\u0734\7\32\2\2\u071b\u0734\7\60\2\2\u071c\u0734\7\23\2\2\u071d"+
		"\u0734\7\61\2\2\u071e\u0734\7%\2\2\u071f\u0734\7\26\2\2\u0720\u0734\7"+
		"Q\2\2\u0721\u0734\7O\2\2\u0722\u0734\78\2\2\u0723\u0734\7+\2\2\u0724\u0734"+
		"\7!\2\2\u0725\u0734\7?\2\2\u0726\u0734\7\u0089\2\2\u0727\u0734\7.\2\2"+
		"\u0728\u0734\7\34\2\2\u0729\u0734\7\62\2\2\u072a\u0734\7\37\2\2\u072b"+
		"\u0734\7\'\2\2\u072c\u0734\7)\2\2\u072d\u0734\7 \2\2\u072e\u0734\7N\2"+
		"\2\u072f\u0734\7=\2\2\u0730\u0734\7:\2\2\u0731\u0734\7>\2\2\u0732\u0734"+
		"\7\35\2\2\u0733\u0709\3\2\2\2\u0733\u070a\3\2\2\2\u0733\u070b\3\2\2\2"+
		"\u0733\u070c\3\2\2\2\u0733\u070d\3\2\2\2\u0733\u070e\3\2\2\2\u0733\u070f"+
		"\3\2\2\2\u0733\u0710\3\2\2\2\u0733\u0711\3\2\2\2\u0733\u0712\3\2\2\2\u0733"+
		"\u0713\3\2\2\2\u0733\u0714\3\2\2\2\u0733\u0715\3\2\2\2\u0733\u0716\3\2"+
		"\2\2\u0733\u0717\3\2\2\2\u0733\u0718\3\2\2\2\u0733\u0719\3\2\2\2\u0733"+
		"\u071a\3\2\2\2\u0733\u071b\3\2\2\2\u0733\u071c\3\2\2\2\u0733\u071d\3\2"+
		"\2\2\u0733\u071e\3\2\2\2\u0733\u071f\3\2\2\2\u0733\u0720\3\2\2\2\u0733"+
		"\u0721\3\2\2\2\u0733\u0722\3\2\2\2\u0733\u0723\3\2\2\2\u0733\u0724\3\2"+
		"\2\2\u0733\u0725\3\2\2\2\u0733\u0726\3\2\2\2\u0733\u0727\3\2\2\2\u0733"+
		"\u0728\3\2\2\2\u0733\u0729\3\2\2\2\u0733\u072a\3\2\2\2\u0733\u072b\3\2"+
		"\2\2\u0733\u072c\3\2\2\2\u0733\u072d\3\2\2\2\u0733\u072e\3\2\2\2\u0733"+
		"\u072f\3\2\2\2\u0733\u0730\3\2\2\2\u0733\u0731\3\2\2\2\u0733\u0732\3\2"+
		"\2\2\u0734}\3\2\2\2\u0735\u0736\7\u008b\2\2\u0736\177\3\2\2\2\u0737\u0738"+
		"\t\23\2\2\u0738\u0081\3\2\2\2\u0739\u073a\7\u008a\2\2\u073a\u0083\3\2"+
		"\2\2\u073b\u073d\7v\2\2\u073c\u073b\3\2\2\2\u073c\u073d\3\2\2\2\u073d"+
		"\u073e\3\2\2\2\u073e\u073f\7\u008a\2\2\u073f\u0085\3\2\2\2\u00ec\u0087"+
		"\u0090\u009a\u00ab\u00b4\u00bf\u00c4\u00cd\u00d5\u00d9\u00df\u00eb\u00ee"+
		"\u00f7\u00fa\u0109\u0111\u011c\u0121\u0124\u012b\u0131\u013d\u0144\u015f"+
		"\u0161\u0166\u0171\u0174\u0178\u017c\u0180\u0185\u018e\u0191\u0196\u01a6"+
		"\u01a8\u01ad\u01b5\u01b8\u01bc\u01c0\u01c3\u01c6\u01c9\u01d2\u01d7\u01e3"+
		"\u01e6\u01ea\u01ed\u01f5\u01fe\u0205\u020a\u020f\u0213\u0217\u021a\u021d"+
		"\u0220\u0228\u022e\u0233\u0241\u0244\u0248\u024b\u0254\u0259\u0260\u0269"+
		"\u0270\u0275\u027a\u027e\u0282\u028d\u0290\u0298\u029a\u02a4\u02a7\u02af"+
		"\u02b2\u02b6\u02b9\u02c8\u02ca\u02cf\u02df\u02e7\u02ea\u02ee\u02f1\u02f7"+
		"\u02fc\u0304\u0307\u030b\u0311\u0315\u031c\u0321\u0327\u032a\u0333\u0335"+
		"\u033a\u033f\u0347\u034c\u0352\u0355\u0361\u0363\u0368\u036f\u0375\u037c"+
		"\u0382\u0386\u0390\u0395\u03a2\u03a4\u03a9\u03ac\u03b0\u03ba\u03c8\u03d3"+
		"\u03df\u03ed\u03f0\u03fa\u0403\u0408\u0410\u0418\u041e\u0422\u0426\u042b"+
		"\u0437\u043b\u0440\u0444\u0449\u0451\u0453\u0458\u045c\u0465\u0467\u046d"+
		"\u0471\u047a\u047c\u0482\u0486\u048c\u0491\u0495\u049b\u04a0\u04a4\u04ab"+
		"\u04b2\u04c9\u04d1\u04d9\u04e1\u04e9\u04f1\u04f9\u0513\u0516\u0534\u0538"+
		"\u053e\u0542\u054e\u0552\u0558\u055c\u0568\u056c\u0572\u0576\u0582\u0586"+
		"\u058c\u0590\u059c\u05a0\u05a6\u05aa\u05b6\u05ba\u05c0\u05c4\u05d1\u05e7"+
		"\u05e9\u0618\u0630\u0634\u0644\u0646\u065b\u0665\u0680\u0682\u068a\u068e"+
		"\u0695\u069a\u06a0\u06a7\u06b0\u06b7\u06c0\u06c7\u06cf\u06d6\u06de\u06ea"+
		"\u06ee\u06f5\u06fa\u0733\u073c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}