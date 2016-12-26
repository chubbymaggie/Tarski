// Generated from /home/ferhat/IdeaProjects/eu.modelwriter.core.alloyinecore/src/eu/modelwriter/core/alloyinecore/recognizer/AlloyInEcore.g4 by ANTLR 4.6
package eu.modelwriter.core.alloyinecore.recognizer;

import eu.modelwriter.core.alloyinecore.structure.*;

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
		INT=132, IDENTIFIER=133, DOUBLE_QUOTED_STRING=134, SINGLE_QUOTED_STRING=135, 
		ML_SINGLE_QUOTED_STRING=136, MULTILINE_COMMENT=137, SINGLELINE_COMMENT=138, 
		WS=139;
	public static final int
		RULE_problem = 0, RULE_options = 1, RULE_option = 2, RULE_universe = 3, 
		RULE_relations = 4, RULE_relation = 5, RULE_tupleSet = 6, RULE_tuple = 7, 
		RULE_module = 8, RULE_packageImport = 9, RULE_ePackage = 10, RULE_eClassifier = 11, 
		RULE_eClass = 12, RULE_eStructuralFeature = 13, RULE_eAttribute = 14, 
		RULE_eReference = 15, RULE_eOperation = 16, RULE_eParameter = 17, RULE_eType = 18, 
		RULE_eMultiplicity = 19, RULE_eDataType = 20, RULE_ePrimitiveType = 21, 
		RULE_eEnum = 22, RULE_eEnumLiteral = 23, RULE_eAnnotation = 24, RULE_eDetail = 25, 
		RULE_eModelElement = 26, RULE_eNamedElement = 27, RULE_eTypedElement = 28, 
		RULE_eModelElementRef = 29, RULE_templateSignature = 30, RULE_body = 31, 
		RULE_invariant = 32, RULE_precondition = 33, RULE_postcondition = 34, 
		RULE_visibilityKind = 35, RULE_atom = 36, RULE_arity = 37, RULE_formula = 38, 
		RULE_expression = 39, RULE_intexpression = 40, RULE_decls = 41, RULE_decl = 42, 
		RULE_letDecls = 43, RULE_letDecl = 44, RULE_comprehensionDecls = 45, RULE_comprehensionDecl = 46, 
		RULE_relationId = 47, RULE_variableId = 48, RULE_integer = 49, RULE_qualifiedName = 50, 
		RULE_identifier = 51, RULE_upper = 52, RULE_lower = 53, RULE_signed = 54;
	public static final String[] ruleNames = {
		"problem", "options", "option", "universe", "relations", "relation", "tupleSet", 
		"tuple", "module", "packageImport", "ePackage", "eClassifier", "eClass", 
		"eStructuralFeature", "eAttribute", "eReference", "eOperation", "eParameter", 
		"eType", "eMultiplicity", "eDataType", "ePrimitiveType", "eEnum", "eEnumLiteral", 
		"eAnnotation", "eDetail", "eModelElement", "eNamedElement", "eTypedElement", 
		"eModelElementRef", "templateSignature", "body", "invariant", "precondition", 
		"postcondition", "visibilityKind", "atom", "arity", "formula", "expression", 
		"intexpression", "decls", "decl", "letDecls", "letDecl", "comprehensionDecls", 
		"comprehensionDecl", "relationId", "variableId", "integer", "qualifiedName", 
		"identifier", "upper", "lower", "signed"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'options'", "'{'", "','", "'}'", "'symmetry_breaking'", "':'", 
		"'bit_width'", "'skolem_depth'", "'sharing'", "'universe'", "'['", "']'", 
		"'relations'", "'..'", "'('", "')'", "'module'", "'import'", "';'", "'package'", 
		"'='", "'abstract'", "'class'", "'interface'", "'extends'", "'static'", 
		"'model'", "'ghost'", "'transient'", "'volatile'", "'nullable'", "'!nullable'", 
		"'readonly'", "'attribute'", "'derived'", "'id'", "'ordered'", "'!ordered'", 
		"'unique'", "'!unique'", "'unsettable'", "'!unsettable'", "'initial'", 
		"'derivation'", "'property'", "'#'", "'composes'", "'resolve'", "'!resolve'", 
		"'key'", "'operation'", "'throws'", "'*'", "'+'", "'?'", "'|?'", "'|1'", 
		"'primitive'", "'datatype'", "'serializable'", "'!serializable'", "'Boolean'", 
		"'Integer'", "'String'", "'Real'", "'UnlimitedNatural'", "'enum'", "'literal'", 
		"'annotation'", "'reference'", "'<'", "'>'", "'body'", "'callable'", "'invariant'", 
		"'precondition'", "'requires'", "'postcondition'", "'ensures'", "'public'", 
		"'protected'", "'private'", "'no'", "'lone'", "'one'", "'some'", "'!'", 
		"'not'", "'in'", "'<='", "'>='", "'sum'", "'|'", "'acyclic'", "'function'", 
		"'->'", "'ord'", "'&&'", "'and'", "'||'", "'or'", "'=>'", "'if'", "'<=>'", 
		"'iff'", "'all'", "'let'", "'true'", "'false'", "'~'", "'^'", "'&'", "'-'", 
		"'.'", "'set'", "'++'", "'then'", "'else'", "'iden'", "'none'", "'univ'", 
		"'ints'", "'plus'", "'minus'", "'mul'", "'/'", "'div'", "'%'", "'modulo'", 
		"'disj'", "'::'"
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
		"INT", "IDENTIFIER", "DOUBLE_QUOTED_STRING", "SINGLE_QUOTED_STRING", "ML_SINGLE_QUOTED_STRING", 
		"MULTILINE_COMMENT", "SINGLELINE_COMMENT", "WS"
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


	public java.util.Stack<String> declarations = new java.util.Stack<String>();
	public java.util.List<String> atoms = new java.util.ArrayList<String>();
	public java.util.List<kodkod.ast.Formula> formulas = new java.util.ArrayList<kodkod.ast.Formula>();
	public java.util.Map<String, kodkod.ast.Relation> relations = new java.util.HashMap<String, kodkod.ast.Relation>();
	public kodkod.instance.Universe universe = null;
	public kodkod.instance.Bounds bounds = null;

	private boolean isRelation() {
	//System.out.println("isRelation? " + this.relations.containsKey(getCurrentToken().getText()) + ": " + getCurrentToken().getText());
	return this.relations.containsKey(getCurrentToken().getText()); }
	private String getLocation() { return "["+ getCurrentToken().getLine()+ ","+ getCurrentToken().getCharPositionInLine()+ "]";}
	private String context = null;
	private int declareVariables(java.util.List<VariableIdContext> vars, int var) {
	    //System.out.println("Quantifier context: ");
	    for (VariableIdContext vc : vars) {
	        String s = vc.getText();
	        declarations.add(s);
	        var++;
	        //System.out.println(s);
	    }
	    return var;
	}
	private void printUniverse() {
	    //System.out.println(universe);
	}
	private void printBounds() {
	    //System.out.println(bounds);
	}


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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(110);
				options();
				}
			}

			setState(113);
			universe();
			printUniverse();
			setState(115);
			relations();
			printBounds();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(117);
					((ProblemContext)_localctx).formula = formula(0);
					((ProblemContext)_localctx).formulas.add(((ProblemContext)_localctx).formula);
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}


			    //System.out.println("declarations= "+declarations);
			    declarations.clear();

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
			setState(126);
			match(T__0);
			setState(127);
			match(T__1);
			setState(128);
			option();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(129);
				match(T__2);
				setState(130);
				option();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
			setState(150);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				_localctx = new SymmetryBreakingContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((SymmetryBreakingContext)_localctx).key = match(T__4);
				setState(139);
				match(T__5);
				setState(140);
				((SymmetryBreakingContext)_localctx).value = integer();
				}
				break;
			case T__6:
				_localctx = new BitWidthContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((BitWidthContext)_localctx).key = match(T__6);
				setState(142);
				match(T__5);
				setState(143);
				((BitWidthContext)_localctx).value = integer();
				}
				break;
			case T__7:
				_localctx = new SkolemDepthContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				((SkolemDepthContext)_localctx).key = match(T__7);
				setState(145);
				match(T__5);
				setState(146);
				((SkolemDepthContext)_localctx).value = integer();
				}
				break;
			case T__8:
				_localctx = new SharingContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				((SharingContext)_localctx).key = match(T__8);
				setState(148);
				match(T__5);
				setState(149);
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
			setState(152);
			match(T__9);
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(153);
				match(T__1);
				{
				setState(154);
				((UniverseContext)_localctx).atom = atom();
				((UniverseContext)_localctx).atoms.add(((UniverseContext)_localctx).atom);
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(155);
					match(T__2);
					setState(156);
					((UniverseContext)_localctx).atom = atom();
					((UniverseContext)_localctx).atoms.add(((UniverseContext)_localctx).atom);
					}
					}
					setState(161);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(162);
				match(T__3);
				}
				}
				break;
			case T__10:
				{
				{
				setState(164);
				match(T__10);
				{
				setState(165);
				((UniverseContext)_localctx).atom = atom();
				((UniverseContext)_localctx).atoms.add(((UniverseContext)_localctx).atom);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(166);
					match(T__2);
					setState(167);
					((UniverseContext)_localctx).atom = atom();
					((UniverseContext)_localctx).atoms.add(((UniverseContext)_localctx).atom);
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(173);
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
			setState(179);
			match(T__12);
			setState(180);
			match(T__1);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(181);
				relation();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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
			setState(190);
			((RelationContext)_localctx).name = ((RelationContext)_localctx).identifier = identifier();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(191);
				((RelationContext)_localctx).arity = arity();
				}
			}

			setState(194);
			match(T__5);
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(195);
				expression(0);
				}
				break;
			}
			setState(198);
			match(T__10);
			{
			setState(199);
			((RelationContext)_localctx).lowerBound = tupleSet();
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(200);
				match(T__2);
				setState(201);
				((RelationContext)_localctx).upperBound = tupleSet();
				}
			}

			}
			setState(204);
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				match(T__1);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10 || _la==T__14) {
					{
					setState(209);
					((TupleSetContext)_localctx).tuple = tuple();
					((TupleSetContext)_localctx).tuples.add(((TupleSetContext)_localctx).tuple);
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(210);
						match(T__2);
						setState(211);
						((TupleSetContext)_localctx).tuple = tuple();
						((TupleSetContext)_localctx).tuples.add(((TupleSetContext)_localctx).tuple);
						}
						}
						setState(216);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(219);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(T__10);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10 || _la==T__14) {
					{
					setState(221);
					((TupleSetContext)_localctx).tuple = tuple();
					((TupleSetContext)_localctx).tuples.add(((TupleSetContext)_localctx).tuple);
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(222);
						match(T__2);
						setState(223);
						((TupleSetContext)_localctx).tuple = tuple();
						((TupleSetContext)_localctx).tuples.add(((TupleSetContext)_localctx).tuple);
						}
						}
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(231);
				match(T__11);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(T__1);
				setState(233);
				((TupleSetContext)_localctx).left = tuple();
				setState(234);
				((TupleSetContext)_localctx).range = match(T__13);
				setState(235);
				((TupleSetContext)_localctx).right = tuple();
				setState(236);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(T__10);
				setState(239);
				((TupleSetContext)_localctx).left = tuple();
				setState(240);
				((TupleSetContext)_localctx).range = match(T__13);
				setState(241);
				((TupleSetContext)_localctx).right = tuple();
				setState(242);
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
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(T__14);
				setState(247);
				((TupleContext)_localctx).atom = atom();
				((TupleContext)_localctx).atoms.add(((TupleContext)_localctx).atom);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(248);
					match(T__2);
					setState(249);
					((TupleContext)_localctx).atom = atom();
					((TupleContext)_localctx).atoms.add(((TupleContext)_localctx).atom);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				match(T__15);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				match(T__10);
				setState(258);
				((TupleContext)_localctx).atom = atom();
				((TupleContext)_localctx).atoms.add(((TupleContext)_localctx).atom);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(259);
					match(T__2);
					setState(260);
					((TupleContext)_localctx).atom = atom();
					((TupleContext)_localctx).atoms.add(((TupleContext)_localctx).atom);
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(266);
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
		public PackageImportContext packageImport;
		public List<PackageImportContext> ownedPackageImport = new ArrayList<PackageImportContext>();
		public EPackageContext ePackage;
		public List<EPackageContext> ownedPackage = new ArrayList<EPackageContext>();
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
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
		public List<EPackageContext> ePackage() {
			return getRuleContexts(EPackageContext.class);
		}
		public EPackageContext ePackage(int i) {
			return getRuleContext(EPackageContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(270);
				options();
				}
			}

			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(273);
				match(T__16);
				setState(274);
				identifier();
				}
			}

			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(277);
				((ModuleContext)_localctx).packageImport = packageImport();
				((ModuleContext)_localctx).ownedPackageImport.add(((ModuleContext)_localctx).packageImport);
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__79 - 20)) | (1L << (T__80 - 20)) | (1L << (T__81 - 20)))) != 0)) {
				{
				{
				setState(283);
				((ModuleContext)_localctx).ePackage = ePackage();
				((ModuleContext)_localctx).ownedPackage.add(((ModuleContext)_localctx).ePackage);
				}
				}
				setState(288);
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

	public static class PackageImportContext extends ParserRuleContext {
		public IdentifierContext name;
		public Token ownedPathName;
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PackageImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final PackageImportContext packageImport() throws RecognitionException {
		PackageImportContext _localctx = new PackageImportContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_packageImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(291);
			match(T__17);
			}
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(292);
				((PackageImportContext)_localctx).name = identifier();
				setState(293);
				match(T__5);
				}
			}

			setState(297);
			((PackageImportContext)_localctx).ownedPathName = match(SINGLE_QUOTED_STRING);
			setState(298);
			match(T__18);
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
		public VisibilityKindContext visibility;
		public IdentifierContext name;
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
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
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
		public EPackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EPackageContext ePackage() throws RecognitionException {
		EPackageContext _localctx = new EPackageContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ePackage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(300);
				((EPackageContext)_localctx).visibility = visibilityKind();
				}
			}

			setState(303);
			match(T__19);
			setState(304);
			((EPackageContext)_localctx).name = identifier();
			{
			setState(305);
			match(T__5);
			setState(306);
			((EPackageContext)_localctx).nsPrefix = identifier();
			}
			{
			setState(308);
			match(T__20);
			setState(309);
			((EPackageContext)_localctx).nsURI = match(SINGLE_QUOTED_STRING);
			}

			        eu.modelwriter.core.alloyinecore.structure.Package p =
			            Document.getInstance().create(_localctx);
			        Document.getInstance().packageStack.push(p);
			    
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(312);
				match(T__1);
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__21 - 20)) | (1L << (T__22 - 20)) | (1L << (T__23 - 20)) | (1L << (T__30 - 20)) | (1L << (T__31 - 20)) | (1L << (T__57 - 20)) | (1L << (T__58 - 20)) | (1L << (T__66 - 20)) | (1L << (T__68 - 20)) | (1L << (T__73 - 20)) | (1L << (T__74 - 20)) | (1L << (T__79 - 20)) | (1L << (T__80 - 20)) | (1L << (T__81 - 20)))) != 0)) {
					{
					setState(317);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						setState(313);
						((EPackageContext)_localctx).eAnnotation = eAnnotation();
						((EPackageContext)_localctx).ownedAnnotations.add(((EPackageContext)_localctx).eAnnotation);
						}
						break;
					case 2:
						{
						setState(314);
						((EPackageContext)_localctx).ePackage = ePackage();
						((EPackageContext)_localctx).eSubPackages.add(((EPackageContext)_localctx).ePackage);
						}
						break;
					case 3:
						{
						setState(315);
						((EPackageContext)_localctx).eClassifier = eClassifier();
						((EPackageContext)_localctx).eClassifiers.add(((EPackageContext)_localctx).eClassifier);
						}
						break;
					case 4:
						{
						setState(316);
						((EPackageContext)_localctx).invariant = invariant();
						((EPackageContext)_localctx).eConstraints.add(((EPackageContext)_localctx).invariant);
						}
						break;
					}
					}
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(322);
				match(T__3);
				}
				}
				break;
			case T__18:
				{
				setState(323);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        notifyErrorListeners(Document.getInstance().packageStack.peek().getToken(), "Package detected: '" + Document.getQualifiedName(Document.getInstance().packageStack.peek()) + "'", (RecognitionException)null);
			        Document.getInstance().packageStack.pop();
			    
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

	public static class EClassifierContext extends ParserRuleContext {
		public EClassContext eClass() {
			return getRuleContext(EClassContext.class,0);
		}
		public EDataTypeContext eDataType() {
			return getRuleContext(EDataTypeContext.class,0);
		}
		public EEnumContext eEnum() {
			return getRuleContext(EEnumContext.class,0);
		}
		public EClassifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EClassifierContext eClassifier() throws RecognitionException {
		EClassifierContext _localctx = new EClassifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eClassifier);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				eClass();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				eDataType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(330);
				eEnum();
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
		public VisibilityKindContext visibility;
		public Token isAbstract;
		public Token isClass;
		public Token isInterface;
		public IdentifierContext name;
		public QualifiedNameContext qualifiedName;
		public List<QualifiedNameContext> eSuperTypes = new ArrayList<QualifiedNameContext>();
		public Token instanceClassName;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public EOperationContext eOperation;
		public List<EOperationContext> eOperations = new ArrayList<EOperationContext>();
		public EStructuralFeatureContext eStructuralFeature;
		public List<EStructuralFeatureContext> eStructuralFeatures = new ArrayList<EStructuralFeatureContext>();
		public InvariantContext invariant;
		public List<InvariantContext> eConstraints = new ArrayList<InvariantContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
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
		public EClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EClassContext eClass() throws RecognitionException {
		EClassContext _localctx = new EClassContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_eClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(333);
				((EClassContext)_localctx).visibility = visibilityKind();
				}
			}

			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(336);
				((EClassContext)_localctx).isAbstract = match(T__21);
				}
			}

			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				{
				setState(339);
				((EClassContext)_localctx).isClass = match(T__22);
				}
				break;
			case T__23:
				{
				setState(340);
				((EClassContext)_localctx).isInterface = match(T__23);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(343);
			((EClassContext)_localctx).name = identifier();
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__24) {
				{
				setState(344);
				match(T__24);
				setState(345);
				((EClassContext)_localctx).qualifiedName = qualifiedName();
				((EClassContext)_localctx).eSuperTypes.add(((EClassContext)_localctx).qualifiedName);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(346);
					match(T__2);
					setState(347);
					((EClassContext)_localctx).qualifiedName = qualifiedName();
					((EClassContext)_localctx).eSuperTypes.add(((EClassContext)_localctx).qualifiedName);
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(355);
				match(T__5);
				setState(356);
				((EClassContext)_localctx).instanceClassName = match(SINGLE_QUOTED_STRING);
				}
			}


			        eu.modelwriter.core.alloyinecore.structure.Class c =
			            Document.getInstance().create(_localctx);
			        Document.getInstance().classifierStack.push(c);
			    
			setState(372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(360);
				match(T__1);
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (T__25 - 26)) | (1L << (T__26 - 26)) | (1L << (T__27 - 26)) | (1L << (T__28 - 26)) | (1L << (T__29 - 26)) | (1L << (T__30 - 26)) | (1L << (T__31 - 26)) | (1L << (T__32 - 26)) | (1L << (T__33 - 26)) | (1L << (T__44 - 26)) | (1L << (T__50 - 26)) | (1L << (T__68 - 26)) | (1L << (T__73 - 26)) | (1L << (T__74 - 26)) | (1L << (T__79 - 26)) | (1L << (T__80 - 26)) | (1L << (T__81 - 26)))) != 0)) {
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						setState(361);
						((EClassContext)_localctx).eAnnotation = eAnnotation();
						((EClassContext)_localctx).ownedAnnotations.add(((EClassContext)_localctx).eAnnotation);
						}
						break;
					case 2:
						{
						setState(362);
						((EClassContext)_localctx).eOperation = eOperation();
						((EClassContext)_localctx).eOperations.add(((EClassContext)_localctx).eOperation);
						}
						break;
					case 3:
						{
						setState(363);
						((EClassContext)_localctx).eStructuralFeature = eStructuralFeature();
						((EClassContext)_localctx).eStructuralFeatures.add(((EClassContext)_localctx).eStructuralFeature);
						}
						break;
					case 4:
						{
						setState(364);
						((EClassContext)_localctx).invariant = invariant();
						((EClassContext)_localctx).eConstraints.add(((EClassContext)_localctx).invariant);
						}
						break;
					}
					}
					setState(369);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(370);
				match(T__3);
				}
				}
				break;
			case T__18:
				{
				setState(371);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        notifyErrorListeners(Document.getInstance().classifierStack.peek().getToken(), "Class detected: '" + Document.getQualifiedName(Document.getInstance().classifierStack.peek()) + "'", (RecognitionException)null);
			        Document.getInstance().classifierStack.pop();
			    
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

	public static class EStructuralFeatureContext extends ParserRuleContext {
		public EAttributeContext eAttribute() {
			return getRuleContext(EAttributeContext.class,0);
		}
		public EReferenceContext eReference() {
			return getRuleContext(EReferenceContext.class,0);
		}
		public EStructuralFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EStructuralFeatureContext eStructuralFeature() throws RecognitionException {
		EStructuralFeatureContext _localctx = new EStructuralFeatureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_eStructuralFeature);
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				eAttribute();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				eReference();
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
		public VisibilityKindContext visibility;
		public Token s26;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s27;
		public Token s28;
		public Token s29;
		public Token s30;
		public Token s31;
		public Token s32;
		public Token s33;
		public IdentifierContext name;
		public Token defaultValue;
		public ETypeContext eAttributeType;
		public EMultiplicityContext multiplicity;
		public Token s35;
		public Token s36;
		public Token s37;
		public Token s38;
		public Token s39;
		public Token s40;
		public Token s41;
		public Token s42;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> ownedInitialExpression = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> ownedDerivedExpression = new ArrayList<ExpressionContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public ETypeContext eType() {
			return getRuleContext(ETypeContext.class,0);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EAttributeContext eAttribute() throws RecognitionException {
		EAttributeContext _localctx = new EAttributeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_eAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(380);
				((EAttributeContext)_localctx).visibility = visibilityKind();
				}
			}

			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(383);
				((EAttributeContext)_localctx).s26 = match(T__25);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s26);
				}
			}

			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(386);
				((EAttributeContext)_localctx).s27 = match(T__26);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s27);
				}
				break;
			case T__27:
				{
				setState(387);
				((EAttributeContext)_localctx).s28 = match(T__27);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s28);
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(390);
				((EAttributeContext)_localctx).s29 = match(T__28);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s29);
				}
			}

			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(393);
				((EAttributeContext)_localctx).s30 = match(T__29);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s30);
				}
			}

			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				{
				setState(396);
				((EAttributeContext)_localctx).s31 = match(T__30);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s31);
				}
				break;
			case T__31:
				{
				setState(397);
				((EAttributeContext)_localctx).s32 = match(T__31);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s32);
				}
				break;
			case T__32:
			case T__33:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(400);
				((EAttributeContext)_localctx).s33 = match(T__32);
				((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s33);
				}
			}

			setState(403);
			match(T__33);
			setState(404);
			((EAttributeContext)_localctx).name = identifier();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(405);
				match(T__20);
				setState(406);
				((EAttributeContext)_localctx).defaultValue = match(SINGLE_QUOTED_STRING);
				}
			}

			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(409);
				match(T__5);
				setState(410);
				((EAttributeContext)_localctx).eAttributeType = eType();
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(411);
					((EAttributeContext)_localctx).multiplicity = eMultiplicity();
					}
				}

				}
			}

			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(416);
				match(T__1);
				setState(430); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(425);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__34:
						{
						setState(417);
						((EAttributeContext)_localctx).s35 = match(T__34);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s35);
						}
						break;
					case T__35:
						{
						setState(418);
						((EAttributeContext)_localctx).s36 = match(T__35);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s36);
						}
						break;
					case T__36:
						{
						setState(419);
						((EAttributeContext)_localctx).s37 = match(T__36);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(420);
						((EAttributeContext)_localctx).s38 = match(T__37);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s38);
						}
						break;
					case T__38:
						{
						setState(421);
						((EAttributeContext)_localctx).s39 = match(T__38);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s39);
						}
						break;
					case T__39:
						{
						setState(422);
						((EAttributeContext)_localctx).s40 = match(T__39);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s40);
						}
						break;
					case T__40:
						{
						setState(423);
						((EAttributeContext)_localctx).s41 = match(T__40);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s41);
						}
						break;
					case T__41:
						{
						setState(424);
						((EAttributeContext)_localctx).s42 = match(T__41);
						((EAttributeContext)_localctx).qualifier.add(((EAttributeContext)_localctx).s42);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(428);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(427);
						match(T__2);
						}
					}

					}
					}
					setState(432); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0) );
				setState(434);
				match(T__3);
				}
				break;
			}
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(437);
				match(T__1);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__68 - 43)))) != 0)) {
					{
					setState(457);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__68:
						{
						setState(438);
						((EAttributeContext)_localctx).eAnnotation = eAnnotation();
						((EAttributeContext)_localctx).ownedAnnotations.add(((EAttributeContext)_localctx).eAnnotation);
						}
						break;
					case T__42:
						{
						{
						setState(439);
						match(T__42);
						setState(441);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(440);
							identifier();
							}
						}

						setState(443);
						match(T__5);
						setState(445);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
						case 1:
							{
							setState(444);
							((EAttributeContext)_localctx).expression = expression(0);
							((EAttributeContext)_localctx).ownedInitialExpression.add(((EAttributeContext)_localctx).expression);
							}
							break;
						}
						setState(447);
						match(T__18);
						}
						}
						break;
					case T__43:
						{
						{
						setState(448);
						match(T__43);
						setState(450);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(449);
							identifier();
							}
						}

						setState(452);
						match(T__5);
						setState(454);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
						case 1:
							{
							setState(453);
							((EAttributeContext)_localctx).expression = expression(0);
							((EAttributeContext)_localctx).ownedDerivedExpression.add(((EAttributeContext)_localctx).expression);
							}
							break;
						}
						setState(456);
						match(T__18);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(462);
				match(T__3);
				}
				}
				break;
			case T__18:
				{
				setState(463);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        eu.modelwriter.core.alloyinecore.structure.Attribute a =
			            Document.getInstance().create(_localctx);
			        notifyErrorListeners((((EAttributeContext)_localctx).name!=null?(((EAttributeContext)_localctx).name.start):null), "Attribute detected: '" + Document.getQualifiedName(a) + "'", (RecognitionException)null);
			    
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
		public VisibilityKindContext visibility;
		public Token s26;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s27;
		public Token s28;
		public Token s29;
		public Token s30;
		public Token s31;
		public Token s32;
		public Token s33;
		public IdentifierContext name;
		public QualifiedNameContext opposite;
		public ETypeContext eReferenceType;
		public EMultiplicityContext multiplicity;
		public Token defaultValue;
		public Token s47;
		public Token s35;
		public Token s37;
		public Token s38;
		public Token s39;
		public Token s40;
		public Token s48;
		public Token s49;
		public Token s41;
		public Token s42;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public QualifiedNameContext qualifiedName;
		public List<QualifiedNameContext> referredKeys = new ArrayList<QualifiedNameContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> ownedInitialExpression = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> ownedDerivedExpression = new ArrayList<ExpressionContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public ETypeContext eType() {
			return getRuleContext(ETypeContext.class,0);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EReferenceContext eReference() throws RecognitionException {
		EReferenceContext _localctx = new EReferenceContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(468);
				((EReferenceContext)_localctx).visibility = visibilityKind();
				}
			}

			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(471);
				((EReferenceContext)_localctx).s26 = match(T__25);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s26);
				}
			}

			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(474);
				((EReferenceContext)_localctx).s27 = match(T__26);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s27);
				}
				break;
			case T__27:
				{
				setState(475);
				((EReferenceContext)_localctx).s28 = match(T__27);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s28);
				}
				break;
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__44:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__28) {
				{
				setState(478);
				((EReferenceContext)_localctx).s29 = match(T__28);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s29);
				}
			}

			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29) {
				{
				setState(481);
				((EReferenceContext)_localctx).s30 = match(T__29);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s30);
				}
			}

			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				{
				setState(484);
				((EReferenceContext)_localctx).s31 = match(T__30);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s31);
				}
				break;
			case T__31:
				{
				setState(485);
				((EReferenceContext)_localctx).s32 = match(T__31);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s32);
				}
				break;
			case T__32:
			case T__44:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(488);
				((EReferenceContext)_localctx).s33 = match(T__32);
				((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s33);
				}
			}

			setState(491);
			match(T__44);
			setState(492);
			((EReferenceContext)_localctx).name = identifier();
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(493);
				match(T__45);
				setState(494);
				((EReferenceContext)_localctx).opposite = qualifiedName();
				}
			}

			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(497);
				match(T__5);
				setState(498);
				((EReferenceContext)_localctx).eReferenceType = eType();
				setState(500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(499);
					((EReferenceContext)_localctx).multiplicity = eMultiplicity();
					}
				}

				}
			}

			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(504);
				match(T__20);
				setState(505);
				((EReferenceContext)_localctx).defaultValue = match(SINGLE_QUOTED_STRING);
				}
			}

			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(508);
				match(T__1);
				setState(524); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(519);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__46:
						{
						setState(509);
						((EReferenceContext)_localctx).s47 = match(T__46);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s47);
						}
						break;
					case T__34:
						{
						setState(510);
						((EReferenceContext)_localctx).s35 = match(T__34);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s35);
						}
						break;
					case T__36:
						{
						setState(511);
						((EReferenceContext)_localctx).s37 = match(T__36);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(512);
						((EReferenceContext)_localctx).s38 = match(T__37);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s38);
						}
						break;
					case T__38:
						{
						setState(513);
						((EReferenceContext)_localctx).s39 = match(T__38);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s39);
						}
						break;
					case T__39:
						{
						setState(514);
						((EReferenceContext)_localctx).s40 = match(T__39);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s40);
						}
						break;
					case T__47:
						{
						setState(515);
						((EReferenceContext)_localctx).s48 = match(T__47);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s48);
						}
						break;
					case T__48:
						{
						setState(516);
						((EReferenceContext)_localctx).s49 = match(T__48);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s49);
						}
						break;
					case T__40:
						{
						setState(517);
						((EReferenceContext)_localctx).s41 = match(T__40);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s41);
						}
						break;
					case T__41:
						{
						setState(518);
						((EReferenceContext)_localctx).s42 = match(T__41);
						((EReferenceContext)_localctx).qualifier.add(((EReferenceContext)_localctx).s42);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(521);
						match(T__2);
						}
					}

					}
					}
					setState(526); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0) );
				setState(528);
				match(T__3);
				}
				break;
			}
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(531);
				match(T__1);
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__49 - 43)) | (1L << (T__68 - 43)))) != 0)) {
					{
					setState(562);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__68:
						{
						setState(532);
						((EReferenceContext)_localctx).eAnnotation = eAnnotation();
						((EReferenceContext)_localctx).ownedAnnotations.add(((EReferenceContext)_localctx).eAnnotation);
						}
						break;
					case T__49:
						{
						{
						setState(533);
						match(T__49);
						setState(534);
						((EReferenceContext)_localctx).qualifiedName = qualifiedName();
						((EReferenceContext)_localctx).referredKeys.add(((EReferenceContext)_localctx).qualifiedName);
						setState(539);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__2) {
							{
							{
							setState(535);
							match(T__2);
							setState(536);
							((EReferenceContext)_localctx).qualifiedName = qualifiedName();
							((EReferenceContext)_localctx).referredKeys.add(((EReferenceContext)_localctx).qualifiedName);
							}
							}
							setState(541);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(542);
						match(T__18);
						}
						}
						break;
					case T__42:
						{
						{
						setState(544);
						match(T__42);
						setState(546);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(545);
							identifier();
							}
						}

						setState(548);
						match(T__5);
						setState(550);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
						case 1:
							{
							setState(549);
							((EReferenceContext)_localctx).expression = expression(0);
							((EReferenceContext)_localctx).ownedInitialExpression.add(((EReferenceContext)_localctx).expression);
							}
							break;
						}
						setState(552);
						match(T__18);
						}
						}
						break;
					case T__43:
						{
						{
						setState(553);
						match(T__43);
						setState(555);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==IDENTIFIER) {
							{
							setState(554);
							identifier();
							}
						}

						setState(557);
						match(T__5);
						setState(559);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
						case 1:
							{
							setState(558);
							((EReferenceContext)_localctx).expression = expression(0);
							((EReferenceContext)_localctx).ownedDerivedExpression.add(((EReferenceContext)_localctx).expression);
							}
							break;
						}
						setState(561);
						match(T__18);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(566);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(567);
				match(T__3);
				}
				}
				break;
			case T__18:
				{
				setState(568);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

				    eu.modelwriter.core.alloyinecore.structure.Reference r =
			                Document.getInstance().create(_localctx);
			            notifyErrorListeners((((EReferenceContext)_localctx).name!=null?(((EReferenceContext)_localctx).name.start):null), "Reference detected: '" + Document.getQualifiedName(r) + "'", (RecognitionException)null);
				
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

	public static class EOperationContext extends ParserRuleContext {
		public VisibilityKindContext visibility;
		public Token s26;
		public List<Token> qualifier = new ArrayList<Token>();
		public IdentifierContext name;
		public EParameterContext eParameter;
		public List<EParameterContext> eParameters = new ArrayList<EParameterContext>();
		public ETypeContext returnType;
		public EMultiplicityContext multiplicity;
		public IdentifierContext identifier;
		public List<IdentifierContext> ownedException = new ArrayList<IdentifierContext>();
		public Token s37;
		public Token s38;
		public Token s39;
		public Token s40;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public PreconditionContext precondition;
		public List<PreconditionContext> ownedPreconditions = new ArrayList<PreconditionContext>();
		public BodyContext body;
		public List<BodyContext> ownedBodyExpression = new ArrayList<BodyContext>();
		public PostconditionContext postcondition;
		public List<PostconditionContext> ownedPostconditions = new ArrayList<PostconditionContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public List<EParameterContext> eParameter() {
			return getRuleContexts(EParameterContext.class);
		}
		public EParameterContext eParameter(int i) {
			return getRuleContext(EParameterContext.class,i);
		}
		public ETypeContext eType() {
			return getRuleContext(ETypeContext.class,0);
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
		public EOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EOperationContext eOperation() throws RecognitionException {
		EOperationContext _localctx = new EOperationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(573);
				((EOperationContext)_localctx).visibility = visibilityKind();
				}
			}

			setState(577);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(576);
				((EOperationContext)_localctx).s26 = match(T__25);
				((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s26);
				}
			}

			setState(579);
			match(T__50);
			setState(580);
			((EOperationContext)_localctx).name = identifier();
			setState(581);
			match(T__14);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__30 || _la==T__31 || _la==IDENTIFIER) {
				{
				setState(582);
				((EOperationContext)_localctx).eParameter = eParameter();
				((EOperationContext)_localctx).eParameters.add(((EOperationContext)_localctx).eParameter);
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(583);
					match(T__2);
					setState(584);
					((EOperationContext)_localctx).eParameter = eParameter();
					((EOperationContext)_localctx).eParameters.add(((EOperationContext)_localctx).eParameter);
					}
					}
					setState(589);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(592);
			match(T__15);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(593);
				match(T__5);
				setState(594);
				((EOperationContext)_localctx).returnType = eType();
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(595);
					((EOperationContext)_localctx).multiplicity = eMultiplicity();
					}
				}

				}
			}

			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__51) {
				{
				setState(600);
				match(T__51);
				setState(601);
				((EOperationContext)_localctx).identifier = identifier();
				((EOperationContext)_localctx).ownedException.add(((EOperationContext)_localctx).identifier);
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(602);
					match(T__2);
					setState(603);
					((EOperationContext)_localctx).identifier = identifier();
					((EOperationContext)_localctx).ownedException.add(((EOperationContext)_localctx).identifier);
					}
					}
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(611);
				match(T__1);
				setState(621); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(616);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__36:
						{
						setState(612);
						((EOperationContext)_localctx).s37 = match(T__36);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(613);
						((EOperationContext)_localctx).s38 = match(T__37);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s38);
						}
						break;
					case T__38:
						{
						setState(614);
						((EOperationContext)_localctx).s39 = match(T__38);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s39);
						}
						break;
					case T__39:
						{
						setState(615);
						((EOperationContext)_localctx).s40 = match(T__39);
						((EOperationContext)_localctx).qualifier.add(((EOperationContext)_localctx).s40);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(618);
						match(T__2);
						}
					}

					}
					}
					setState(623); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) );
				setState(625);
				match(T__3);
				}
				break;
			}
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(628);
				match(T__1);
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__72 - 69)) | (1L << (T__75 - 69)) | (1L << (T__76 - 69)) | (1L << (T__77 - 69)) | (1L << (T__78 - 69)))) != 0)) {
					{
					setState(633);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__68:
						{
						setState(629);
						((EOperationContext)_localctx).eAnnotation = eAnnotation();
						((EOperationContext)_localctx).ownedAnnotations.add(((EOperationContext)_localctx).eAnnotation);
						}
						break;
					case T__75:
					case T__76:
						{
						setState(630);
						((EOperationContext)_localctx).precondition = precondition();
						((EOperationContext)_localctx).ownedPreconditions.add(((EOperationContext)_localctx).precondition);
						}
						break;
					case T__72:
						{
						setState(631);
						((EOperationContext)_localctx).body = body();
						((EOperationContext)_localctx).ownedBodyExpression.add(((EOperationContext)_localctx).body);
						}
						break;
					case T__77:
					case T__78:
						{
						setState(632);
						((EOperationContext)_localctx).postcondition = postcondition();
						((EOperationContext)_localctx).ownedPostconditions.add(((EOperationContext)_localctx).postcondition);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(638);
				match(T__3);
				}
				}
				break;
			case T__18:
				{
				setState(639);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EParameterContext extends ParserRuleContext {
		public Token s31;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s32;
		public IdentifierContext name;
		public ETypeContext ownedType;
		public EMultiplicityContext ownedMultiplicity;
		public Token s37;
		public Token s38;
		public Token s39;
		public Token s40;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ETypeContext eType() {
			return getRuleContext(ETypeContext.class,0);
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
		public EParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EParameterContext eParameter() throws RecognitionException {
		EParameterContext _localctx = new EParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
				{
				setState(642);
				((EParameterContext)_localctx).s31 = match(T__30);
				((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s31);
				}
				break;
			case T__31:
				{
				setState(643);
				((EParameterContext)_localctx).s32 = match(T__31);
				((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s32);
				}
				break;
			case IDENTIFIER:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(646);
			((EParameterContext)_localctx).name = identifier();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(647);
				match(T__5);
				setState(648);
				((EParameterContext)_localctx).ownedType = eType();
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(649);
					((EParameterContext)_localctx).ownedMultiplicity = eMultiplicity();
					}
				}

				}
			}

			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(654);
				match(T__1);
				setState(664); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(659);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__36:
						{
						setState(655);
						((EParameterContext)_localctx).s37 = match(T__36);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s37);
						}
						break;
					case T__37:
						{
						setState(656);
						((EParameterContext)_localctx).s38 = match(T__37);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s38);
						}
						break;
					case T__38:
						{
						setState(657);
						((EParameterContext)_localctx).s39 = match(T__38);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s39);
						}
						break;
					case T__39:
						{
						setState(658);
						((EParameterContext)_localctx).s40 = match(T__39);
						((EParameterContext)_localctx).qualifier.add(((EParameterContext)_localctx).s40);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(662);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(661);
						match(T__2);
						}
					}

					}
					}
					setState(666); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39))) != 0) );
				setState(668);
				match(T__3);
				}
				break;
			}
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(671);
				match(T__1);
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__68) {
					{
					{
					setState(672);
					((EParameterContext)_localctx).eAnnotation = eAnnotation();
					((EParameterContext)_localctx).ownedAnnotations.add(((EParameterContext)_localctx).eAnnotation);
					}
					}
					setState(677);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(678);
				match(T__3);
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

	public static class ETypeContext extends ParserRuleContext {
		public EPrimitiveTypeContext ePrimitiveType() {
			return getRuleContext(EPrimitiveTypeContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ETypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterEType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitEType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitEType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ETypeContext eType() throws RecognitionException {
		ETypeContext _localctx = new ETypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eType);
		try {
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				ePrimitiveType();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				qualifiedName();
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

	public static class EMultiplicityContext extends ParserRuleContext {
		public LowerContext lowerBound;
		public UpperContext upperBound;
		public Token stringBounds;
		public Token isNullFree;
		public LowerContext lower() {
			return getRuleContext(LowerContext.class,0);
		}
		public UpperContext upper() {
			return getRuleContext(UpperContext.class,0);
		}
		public EMultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EMultiplicityContext eMultiplicity() throws RecognitionException {
		EMultiplicityContext _localctx = new EMultiplicityContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_eMultiplicity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(T__10);
			setState(692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(686);
				((EMultiplicityContext)_localctx).lowerBound = lower();
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(687);
					match(T__13);
					setState(688);
					((EMultiplicityContext)_localctx).upperBound = upper();
					}
				}

				}
				break;
			case T__52:
			case T__53:
			case T__54:
				{
				setState(691);
				((EMultiplicityContext)_localctx).stringBounds = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__53) | (1L << T__54))) != 0)) ) {
					((EMultiplicityContext)_localctx).stringBounds = (Token)_errHandler.recoverInline(this);
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
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				{
				setState(694);
				match(T__55);
				}
				break;
			case T__56:
				{
				setState(695);
				((EMultiplicityContext)_localctx).isNullFree = match(T__56);
				}
				break;
			case T__11:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(698);
			match(T__11);
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

	public static class EDataTypeContext extends ParserRuleContext {
		public VisibilityKindContext visibility;
		public Token isPrimitive;
		public Token s31;
		public List<Token> qualifier = new ArrayList<Token>();
		public Token s32;
		public IdentifierContext name;
		public TemplateSignatureContext ownedSignature;
		public Token instanceClassName;
		public Token isSerializable;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public InvariantContext invariant;
		public List<InvariantContext> ownedConstraints = new ArrayList<InvariantContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VisibilityKindContext visibilityKind() {
			return getRuleContext(VisibilityKindContext.class,0);
		}
		public TemplateSignatureContext templateSignature() {
			return getRuleContext(TemplateSignatureContext.class,0);
		}
		public TerminalNode SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, 0); }
		public EAnnotationContext eAnnotation() {
			return getRuleContext(EAnnotationContext.class,0);
		}
		public List<InvariantContext> invariant() {
			return getRuleContexts(InvariantContext.class);
		}
		public InvariantContext invariant(int i) {
			return getRuleContext(InvariantContext.class,i);
		}
		public EDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EDataTypeContext eDataType() throws RecognitionException {
		EDataTypeContext _localctx = new EDataTypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_eDataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(700);
				((EDataTypeContext)_localctx).visibility = visibilityKind();
				}
			}

			setState(708);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__57:
				{
				setState(703);
				((EDataTypeContext)_localctx).isPrimitive = match(T__57);
				}
				break;
			case T__30:
			case T__31:
				{
				setState(706);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__30:
					{
					setState(704);
					((EDataTypeContext)_localctx).s31 = match(T__30);
					((EDataTypeContext)_localctx).qualifier.add(((EDataTypeContext)_localctx).s31);
					}
					break;
				case T__31:
					{
					setState(705);
					((EDataTypeContext)_localctx).s32 = match(T__31);
					((EDataTypeContext)_localctx).qualifier.add(((EDataTypeContext)_localctx).s32);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__58:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(710);
			match(T__58);
			setState(711);
			((EDataTypeContext)_localctx).name = identifier();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__70) {
				{
				setState(712);
				((EDataTypeContext)_localctx).ownedSignature = templateSignature();
				}
			}

			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(715);
				match(T__5);
				setState(716);
				((EDataTypeContext)_localctx).instanceClassName = match(SINGLE_QUOTED_STRING);
				}
			}

			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(719);
				match(T__1);
				setState(722);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__59:
					{
					setState(720);
					((EDataTypeContext)_localctx).isSerializable = match(T__59);
					}
					break;
				case T__60:
					{
					setState(721);
					match(T__60);
					}
					break;
				case T__3:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(724);
				match(T__3);
				}
				break;
			}

			        eu.modelwriter.core.alloyinecore.structure.DataType t =
			            Document.getInstance().create(_localctx);
			        Document.getInstance().classifierStack.push(t);
			    
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__3:
			case T__73:
			case T__74:
				{
				setState(737);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(728);
					match(T__1);
					setState(729);
					((EDataTypeContext)_localctx).eAnnotation = eAnnotation();
					((EDataTypeContext)_localctx).ownedAnnotations.add(((EDataTypeContext)_localctx).eAnnotation);
					}
					break;
				case T__3:
				case T__73:
				case T__74:
					{
					setState(733);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__73 || _la==T__74) {
						{
						{
						setState(730);
						((EDataTypeContext)_localctx).invariant = invariant();
						((EDataTypeContext)_localctx).ownedConstraints.add(((EDataTypeContext)_localctx).invariant);
						}
						}
						setState(735);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(736);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__18:
				{
				setState(739);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        notifyErrorListeners(Document.getInstance().classifierStack.peek().getToken(), "DataType detected: '" + Document.getQualifiedName(Document.getInstance().classifierStack.peek()) + "'", (RecognitionException)null);
			        Document.getInstance().classifierStack.pop();
			    
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
		public EPrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EPrimitiveTypeContext ePrimitiveType() throws RecognitionException {
		EPrimitiveTypeContext _localctx = new EPrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ePrimitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			_la = _input.LA(1);
			if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (T__61 - 62)) | (1L << (T__62 - 62)) | (1L << (T__63 - 62)) | (1L << (T__64 - 62)) | (1L << (T__65 - 62)))) != 0)) ) {
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

	public static class EEnumContext extends ParserRuleContext {
		public VisibilityKindContext visibility;
		public IdentifierContext name;
		public TemplateSignatureContext ownedSignature;
		public Token instanceClassName;
		public Token isSerializable;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public EEnumLiteralContext eEnumLiteral;
		public List<EEnumLiteralContext> ownedLiteral = new ArrayList<EEnumLiteralContext>();
		public InvariantContext invariant;
		public List<InvariantContext> ownedConstraint = new ArrayList<InvariantContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		public EEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EEnumContext eEnum() throws RecognitionException {
		EEnumContext _localctx = new EEnumContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) {
				{
				setState(746);
				((EEnumContext)_localctx).visibility = visibilityKind();
				}
			}

			setState(749);
			match(T__66);
			setState(750);
			((EEnumContext)_localctx).name = identifier();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14 || _la==T__70) {
				{
				setState(751);
				((EEnumContext)_localctx).ownedSignature = templateSignature();
				}
			}

			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(754);
				match(T__5);
				setState(755);
				((EEnumContext)_localctx).instanceClassName = match(SINGLE_QUOTED_STRING);
				}
			}

			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
			case 1:
				{
				setState(758);
				match(T__1);
				setState(761);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__59:
					{
					setState(759);
					((EEnumContext)_localctx).isSerializable = match(T__59);
					}
					break;
				case T__60:
					{
					setState(760);
					match(T__60);
					}
					break;
				case T__3:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(763);
				match(T__3);
				}
				break;
			}

			        eu.modelwriter.core.alloyinecore.structure.Enum e =
			            Document.getInstance().create(_localctx);
			        Document.getInstance().classifierStack.push(e);
			    
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(767);
				match(T__1);
				setState(773);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (T__67 - 68)) | (1L << (T__68 - 68)) | (1L << (T__73 - 68)) | (1L << (T__74 - 68)))) != 0) || _la==IDENTIFIER) {
					{
					setState(771);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__68:
						{
						setState(768);
						((EEnumContext)_localctx).eAnnotation = eAnnotation();
						((EEnumContext)_localctx).ownedAnnotations.add(((EEnumContext)_localctx).eAnnotation);
						}
						break;
					case T__67:
					case IDENTIFIER:
						{
						setState(769);
						((EEnumContext)_localctx).eEnumLiteral = eEnumLiteral();
						((EEnumContext)_localctx).ownedLiteral.add(((EEnumContext)_localctx).eEnumLiteral);
						}
						break;
					case T__73:
					case T__74:
						{
						setState(770);
						((EEnumContext)_localctx).invariant = invariant();
						((EEnumContext)_localctx).ownedConstraint.add(((EEnumContext)_localctx).invariant);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(775);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(776);
				match(T__3);
				}
				}
				break;
			case T__18:
				{
				setState(777);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

			        notifyErrorListeners(Document.getInstance().classifierStack.peek().getToken(), "Enum detected: '" + Document.getQualifiedName(Document.getInstance().classifierStack.peek()) + "'", (RecognitionException)null);
			        Document.getInstance().classifierStack.pop();
			    
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

	public static class EEnumLiteralContext extends ParserRuleContext {
		public IdentifierContext name;
		public SignedContext value;
		public EAnnotationContext eAnnotation;
		public List<EAnnotationContext> ownedAnnotations = new ArrayList<EAnnotationContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
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
		public EEnumLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EEnumLiteralContext eEnumLiteral() throws RecognitionException {
		EEnumLiteralContext _localctx = new EEnumLiteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_eEnumLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__67:
				{
				{
				setState(782);
				match(T__67);
				setState(783);
				((EEnumLiteralContext)_localctx).name = identifier();
				}
				}
				break;
			case IDENTIFIER:
				{
				setState(784);
				((EEnumLiteralContext)_localctx).name = identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(787);
				match(T__20);
				setState(788);
				((EEnumLiteralContext)_localctx).value = signed();
				}
			}

			setState(800);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(791);
				match(T__1);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__68) {
					{
					{
					setState(792);
					((EEnumLiteralContext)_localctx).eAnnotation = eAnnotation();
					((EEnumLiteralContext)_localctx).ownedAnnotations.add(((EEnumLiteralContext)_localctx).eAnnotation);
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(798);
				match(T__3);
				}
				}
				break;
			case T__18:
				{
				setState(799);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EAnnotationContext extends ParserRuleContext {
		public Token name;
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
		public EAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EAnnotationContext eAnnotation() throws RecognitionException {
		EAnnotationContext _localctx = new EAnnotationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_eAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(T__68);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SINGLE_QUOTED_STRING) {
				{
				setState(803);
				((EAnnotationContext)_localctx).name = match(SINGLE_QUOTED_STRING);
				}
			}

			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(806);
				match(T__14);
				setState(807);
				((EAnnotationContext)_localctx).eDetail = eDetail();
				((EAnnotationContext)_localctx).ownedDetails.add(((EAnnotationContext)_localctx).eDetail);
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(808);
					match(T__2);
					setState(809);
					((EAnnotationContext)_localctx).eDetail = eDetail();
					((EAnnotationContext)_localctx).ownedDetails.add(((EAnnotationContext)_localctx).eDetail);
					}
					}
					setState(814);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(815);
				match(T__15);
				}
			}

			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				{
				setState(819);
				match(T__1);
				setState(823); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(823);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
					case 1:
						{
						setState(820);
						((EAnnotationContext)_localctx).eAnnotation = eAnnotation();
						((EAnnotationContext)_localctx).ownedAnnotations.add(((EAnnotationContext)_localctx).eAnnotation);
						}
						break;
					case 2:
						{
						setState(821);
						((EAnnotationContext)_localctx).eModelElement = eModelElement();
						((EAnnotationContext)_localctx).ownedContents.add(((EAnnotationContext)_localctx).eModelElement);
						}
						break;
					case 3:
						{
						setState(822);
						((EAnnotationContext)_localctx).eModelElementRef = eModelElementRef();
						((EAnnotationContext)_localctx).ownedReferences.add(((EAnnotationContext)_localctx).eModelElementRef);
						}
						break;
					}
					}
					setState(825); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & ((1L << (T__19 - 20)) | (1L << (T__21 - 20)) | (1L << (T__22 - 20)) | (1L << (T__23 - 20)) | (1L << (T__25 - 20)) | (1L << (T__26 - 20)) | (1L << (T__27 - 20)) | (1L << (T__28 - 20)) | (1L << (T__29 - 20)) | (1L << (T__30 - 20)) | (1L << (T__31 - 20)) | (1L << (T__32 - 20)) | (1L << (T__33 - 20)) | (1L << (T__44 - 20)) | (1L << (T__50 - 20)) | (1L << (T__57 - 20)) | (1L << (T__58 - 20)) | (1L << (T__66 - 20)) | (1L << (T__67 - 20)) | (1L << (T__68 - 20)) | (1L << (T__69 - 20)) | (1L << (T__79 - 20)) | (1L << (T__80 - 20)) | (1L << (T__81 - 20)))) != 0) || _la==IDENTIFIER );
				setState(827);
				match(T__3);
				}
				}
				break;
			case T__18:
				{
				setState(829);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EDetailContext extends ParserRuleContext {
		public Token name;
		public Token value;
		public List<TerminalNode> SINGLE_QUOTED_STRING() { return getTokens(AlloyInEcoreParser.SINGLE_QUOTED_STRING); }
		public TerminalNode SINGLE_QUOTED_STRING(int i) {
			return getToken(AlloyInEcoreParser.SINGLE_QUOTED_STRING, i);
		}
		public TerminalNode ML_SINGLE_QUOTED_STRING() { return getToken(AlloyInEcoreParser.ML_SINGLE_QUOTED_STRING, 0); }
		public EDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EDetailContext eDetail() throws RecognitionException {
		EDetailContext _localctx = new EDetailContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_eDetail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			((EDetailContext)_localctx).name = match(SINGLE_QUOTED_STRING);
			setState(833);
			match(T__20);
			setState(834);
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
		public EAnnotationContext eAnnotation() {
			return getRuleContext(EAnnotationContext.class,0);
		}
		public ENamedElementContext eNamedElement() {
			return getRuleContext(ENamedElementContext.class,0);
		}
		public EModelElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EModelElementContext eModelElement() throws RecognitionException {
		EModelElementContext _localctx = new EModelElementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_eModelElement);
		try {
			setState(838);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__68:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				eAnnotation();
				}
				break;
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__25:
			case T__26:
			case T__27:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__44:
			case T__50:
			case T__57:
			case T__58:
			case T__66:
			case T__67:
			case T__79:
			case T__80:
			case T__81:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				eNamedElement();
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

	public static class ENamedElementContext extends ParserRuleContext {
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
		public ENamedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ENamedElementContext eNamedElement() throws RecognitionException {
		ENamedElementContext _localctx = new ENamedElementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_eNamedElement);
		try {
			setState(844);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(840);
				eTypedElement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				eClassifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				ePackage();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(843);
				eEnumLiteral();
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
		public EOperationContext eOperation() {
			return getRuleContext(EOperationContext.class,0);
		}
		public EParameterContext eParameter() {
			return getRuleContext(EParameterContext.class,0);
		}
		public EStructuralFeatureContext eStructuralFeature() {
			return getRuleContext(EStructuralFeatureContext.class,0);
		}
		public ETypedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final ETypedElementContext eTypedElement() throws RecognitionException {
		ETypedElementContext _localctx = new ETypedElementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_eTypedElement);
		try {
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				eOperation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				eParameter();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(848);
				eStructuralFeature();
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
		public QualifiedNameContext ownedPathName;
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public EModelElementRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final EModelElementRefContext eModelElementRef() throws RecognitionException {
		EModelElementRefContext _localctx = new EModelElementRefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_eModelElementRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			match(T__69);
			setState(852);
			((EModelElementRefContext)_localctx).ownedPathName = qualifiedName();
			setState(853);
			match(T__18);
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

	public static class TemplateSignatureContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> ownedParameter = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TemplateSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final TemplateSignatureContext templateSignature() throws RecognitionException {
		TemplateSignatureContext _localctx = new TemplateSignatureContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_templateSignature);
		int _la;
		try {
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(855);
				match(T__14);
				setState(856);
				((TemplateSignatureContext)_localctx).identifier = identifier();
				((TemplateSignatureContext)_localctx).ownedParameter.add(((TemplateSignatureContext)_localctx).identifier);
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(857);
					match(T__2);
					setState(858);
					((TemplateSignatureContext)_localctx).identifier = identifier();
					((TemplateSignatureContext)_localctx).ownedParameter.add(((TemplateSignatureContext)_localctx).identifier);
					}
					}
					setState(863);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(864);
				match(T__15);
				}
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(866);
				match(T__70);
				setState(867);
				((TemplateSignatureContext)_localctx).identifier = identifier();
				((TemplateSignatureContext)_localctx).ownedParameter.add(((TemplateSignatureContext)_localctx).identifier);
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(868);
					match(T__2);
					setState(869);
					((TemplateSignatureContext)_localctx).identifier = identifier();
					((TemplateSignatureContext)_localctx).ownedParameter.add(((TemplateSignatureContext)_localctx).identifier);
					}
					}
					setState(874);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(875);
				match(T__71);
				}
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

	public static class BodyContext extends ParserRuleContext {
		public IdentifierContext name;
		public ExpressionContext ownedExpression;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(T__72);
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(880);
				((BodyContext)_localctx).name = identifier();
				}
			}

			setState(889);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(883);
				match(T__5);
				setState(885);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(884);
					((BodyContext)_localctx).ownedExpression = expression(0);
					}
					break;
				}
				setState(887);
				match(T__18);
				}
				}
				break;
			case T__18:
				{
				setState(888);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class InvariantContext extends ParserRuleContext {
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
		public InvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final InvariantContext invariant() throws RecognitionException {
		InvariantContext _localctx = new InvariantContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_invariant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__73) {
				{
				setState(891);
				((InvariantContext)_localctx).isCallable = match(T__73);
				}
			}

			setState(894);
			match(T__74);
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(895);
				((InvariantContext)_localctx).name = identifier();
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(896);
					match(T__14);
					setState(897);
					((InvariantContext)_localctx).message = match(DOUBLE_QUOTED_STRING);
					setState(898);
					match(T__15);
					}
				}

				}
			}

			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(903);
				match(T__5);
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(904);
					((InvariantContext)_localctx).ownedSpecification = formula(0);
					}
					break;
				}
				setState(907);
				match(T__18);
				}
				}
				break;
			case T__18:
				{
				setState(908);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PreconditionContext extends ParserRuleContext {
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
		public PreconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final PreconditionContext precondition() throws RecognitionException {
		PreconditionContext _localctx = new PreconditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_precondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_la = _input.LA(1);
			if ( !(_la==T__75 || _la==T__76) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(912);
				((PreconditionContext)_localctx).name = identifier();
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(913);
					match(T__14);
					setState(914);
					((PreconditionContext)_localctx).message = match(DOUBLE_QUOTED_STRING);
					setState(915);
					match(T__15);
					}
				}

				}
			}

			setState(926);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(920);
				match(T__5);
				setState(922);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
				case 1:
					{
					setState(921);
					((PreconditionContext)_localctx).ownedSpecification = formula(0);
					}
					break;
				}
				setState(924);
				match(T__18);
				}
				}
				break;
			case T__18:
				{
				setState(925);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PostconditionContext extends ParserRuleContext {
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
		public PostconditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
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

	public final PostconditionContext postcondition() throws RecognitionException {
		PostconditionContext _localctx = new PostconditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_postcondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(928);
			_la = _input.LA(1);
			if ( !(_la==T__77 || _la==T__78) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(935);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(929);
				((PostconditionContext)_localctx).name = identifier();
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(930);
					match(T__14);
					setState(931);
					((PostconditionContext)_localctx).message = match(DOUBLE_QUOTED_STRING);
					setState(932);
					match(T__15);
					}
				}

				}
			}

			setState(943);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				{
				setState(937);
				match(T__5);
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
				case 1:
					{
					setState(938);
					((PostconditionContext)_localctx).ownedSpecification = formula(0);
					}
					break;
				}
				setState(941);
				match(T__18);
				}
				}
				break;
			case T__18:
				{
				setState(942);
				match(T__18);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VisibilityKindContext extends ParserRuleContext {
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
		enterRule(_localctx, 70, RULE_visibilityKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (T__79 - 80)) | (1L << (T__80 - 80)) | (1L << (T__81 - 80)))) != 0)) ) {
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
		enterRule(_localctx, 72, RULE_atom);
		try {
			setState(950);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
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
				setState(949);
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
		enterRule(_localctx, 74, RULE_arity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(952);
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
		public int var = 0;;
		public FormulaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formula; }
	 
		public FormulaContext() { }
		public void copyFrom(FormulaContext ctx) {
			super.copyFrom(ctx);
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
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
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
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
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
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
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
		public IntexpressionContext ileft;
		public Token not;
		public IntexpressionContext iright;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
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
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
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
		public Token op;
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
		public IntexpressionContext ileft;
		public Token not;
		public IntexpressionContext iright;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
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
		public LetDeclsContext letDecls() {
			return getRuleContext(LetDeclsContext.class,0);
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
		public IntexpressionContext ileft;
		public Token not;
		public IntexpressionContext iright;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
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
		public IntexpressionContext ileft;
		public Token not;
		public IntexpressionContext iright;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
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
		public IntexpressionContext ileft;
		public Token not;
		public IntexpressionContext iright;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
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
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
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
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
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
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_formula, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
			case 1:
				{
				_localctx = new NoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(955);
				match(T__82);
				setState(956);
				expression(0);
				}
				break;
			case 2:
				{
				_localctx = new LoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(957);
				match(T__83);
				setState(958);
				expression(0);
				}
				break;
			case 3:
				{
				_localctx = new OneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(959);
				match(T__84);
				setState(960);
				expression(0);
				}
				break;
			case 4:
				{
				_localctx = new SomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(961);
				match(T__85);
				setState(962);
				expression(0);
				}
				break;
			case 5:
				{
				_localctx = new InContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(963);
				((InContext)_localctx).left = expression(0);
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__86 || _la==T__87) {
					{
					setState(964);
					((InContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__86 || _la==T__87) ) {
						((InContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(967);
				match(T__88);
				setState(968);
				((InContext)_localctx).right = expression(0);
				}
				break;
			case 6:
				{
				_localctx = new EqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(970);
				((EqualContext)_localctx).left = expression(0);
				setState(972);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__86 || _la==T__87) {
					{
					setState(971);
					((EqualContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__86 || _la==T__87) ) {
						((EqualContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(974);
				match(T__20);
				setState(975);
				((EqualContext)_localctx).right = expression(0);
				}
				break;
			case 7:
				{
				_localctx = new EqContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(977);
				((EqContext)_localctx).ileft = intexpression(0);
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__86 || _la==T__87) {
					{
					setState(978);
					((EqContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__86 || _la==T__87) ) {
						((EqContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(981);
				match(T__20);
				setState(982);
				((EqContext)_localctx).iright = intexpression(0);
				}
				break;
			case 8:
				{
				_localctx = new LtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(984);
				((LtContext)_localctx).ileft = intexpression(0);
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__86 || _la==T__87) {
					{
					setState(985);
					((LtContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__86 || _la==T__87) ) {
						((LtContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(988);
				match(T__70);
				setState(989);
				((LtContext)_localctx).iright = intexpression(0);
				}
				break;
			case 9:
				{
				_localctx = new LteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(991);
				((LteContext)_localctx).ileft = intexpression(0);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__86 || _la==T__87) {
					{
					setState(992);
					((LteContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__86 || _la==T__87) ) {
						((LteContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(995);
				match(T__89);
				setState(996);
				((LteContext)_localctx).iright = intexpression(0);
				}
				break;
			case 10:
				{
				_localctx = new GtContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(998);
				((GtContext)_localctx).ileft = intexpression(0);
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__86 || _la==T__87) {
					{
					setState(999);
					((GtContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__86 || _la==T__87) ) {
						((GtContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1002);
				match(T__71);
				setState(1003);
				((GtContext)_localctx).iright = intexpression(0);
				}
				break;
			case 11:
				{
				_localctx = new GteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1005);
				((GteContext)_localctx).ileft = intexpression(0);
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__86 || _la==T__87) {
					{
					setState(1006);
					((GteContext)_localctx).not = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__86 || _la==T__87) ) {
						((GteContext)_localctx).not = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1009);
				match(T__90);
				setState(1010);
				((GteContext)_localctx).iright = intexpression(0);
				}
				break;
			case 12:
				{
				_localctx = new SumDeclarationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				((FormulaContext)getInvokingContext(38)).var =  0;
				{
				setState(1013);
				match(T__91);
				setState(1014);
				decls();
				setState(1015);
				match(T__92);
				setState(1016);
				intexpression(0);
				}
				for (int i = 0; i < ((FormulaContext)getInvokingContext(38)).var; i++) declarations.pop();
				}
				break;
			case 13:
				{
				_localctx = new AcyclicContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1020);
				match(T__93);
				setState(1021);
				match(T__10);
				setState(1022);
				relationId();
				setState(1023);
				match(T__11);
				}
				break;
			case 14:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1025);
				match(T__94);
				setState(1026);
				match(T__10);
				setState(1027);
				((FunctionContext)_localctx).rel = relationId();
				setState(1028);
				match(T__5);
				setState(1029);
				((FunctionContext)_localctx).domain = expression(0);
				setState(1030);
				match(T__95);
				setState(1031);
				((FunctionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__83 || _la==T__84) ) {
					((FunctionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1032);
				((FunctionContext)_localctx).range = expression(0);
				setState(1033);
				match(T__11);
				}
				break;
			case 15:
				{
				_localctx = new TotalOrderContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1035);
				match(T__96);
				setState(1036);
				match(T__10);
				setState(1037);
				((TotalOrderContext)_localctx).rel = relationId();
				setState(1038);
				match(T__2);
				setState(1039);
				((TotalOrderContext)_localctx).ordered = relationId();
				setState(1040);
				match(T__2);
				setState(1041);
				((TotalOrderContext)_localctx).first = relationId();
				setState(1042);
				match(T__2);
				setState(1043);
				((TotalOrderContext)_localctx).last = relationId();
				setState(1044);
				match(T__11);
				}
				break;
			case 16:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1046);
				((NotContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__86 || _la==T__87) ) {
					((NotContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1047);
				formula(14);
				}
				break;
			case 17:
				{
				_localctx = new ForAllContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				((FormulaContext)getInvokingContext(38)).var =  0;
				{
				setState(1049);
				match(T__105);
				setState(1050);
				decls();
				setState(1071);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__92:
					{
					setState(1051);
					match(T__92);
					setState(1061);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
					case 1:
						{
						setState(1052);
						formula(0);
						}
						break;
					case 2:
						{
						setState(1053);
						match(T__1);
						setState(1057);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1054);
								formula(0);
								}
								} 
							}
							setState(1059);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,169,_ctx);
						}
						setState(1060);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1063);
					match(T__1);
					setState(1067);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1064);
							formula(0);
							}
							} 
						}
						setState(1069);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,171,_ctx);
					}
					setState(1070);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				for (int i = 0; i < ((FormulaContext)getInvokingContext(38)).var; i++) declarations.pop();
				}
				break;
			case 18:
				{
				_localctx = new ForSomeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				((FormulaContext)getInvokingContext(38)).var =  0;
				{
				setState(1076);
				match(T__85);
				setState(1077);
				decls();
				setState(1098);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__92:
					{
					setState(1078);
					match(T__92);
					setState(1088);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
					case 1:
						{
						setState(1079);
						formula(0);
						}
						break;
					case 2:
						{
						setState(1080);
						match(T__1);
						setState(1084);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1081);
								formula(0);
								}
								} 
							}
							setState(1086);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,173,_ctx);
						}
						setState(1087);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1090);
					match(T__1);
					setState(1094);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1091);
							formula(0);
							}
							} 
						}
						setState(1096);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,175,_ctx);
					}
					setState(1097);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				for (int i = 0; i < ((FormulaContext)getInvokingContext(38)).var; i++) declarations.pop();
				}
				break;
			case 19:
				{
				_localctx = new ForNoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				((FormulaContext)getInvokingContext(38)).var =  0;
				{
				setState(1103);
				match(T__82);
				setState(1104);
				decls();
				setState(1125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__92:
					{
					setState(1105);
					match(T__92);
					setState(1115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
					case 1:
						{
						setState(1106);
						formula(0);
						}
						break;
					case 2:
						{
						setState(1107);
						match(T__1);
						setState(1111);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1108);
								formula(0);
								}
								} 
							}
							setState(1113);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
						}
						setState(1114);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1117);
					match(T__1);
					setState(1121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1118);
							formula(0);
							}
							} 
						}
						setState(1123);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
					}
					setState(1124);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				for (int i = 0; i < ((FormulaContext)getInvokingContext(38)).var; i++) declarations.pop();
				}
				break;
			case 20:
				{
				_localctx = new ForOneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				((FormulaContext)getInvokingContext(38)).var =  0;
				{
				setState(1130);
				match(T__84);
				setState(1131);
				decls();
				setState(1152);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__92:
					{
					setState(1132);
					match(T__92);
					setState(1142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
					case 1:
						{
						setState(1133);
						formula(0);
						}
						break;
					case 2:
						{
						setState(1134);
						match(T__1);
						setState(1138);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1135);
								formula(0);
								}
								} 
							}
							setState(1140);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
						}
						setState(1141);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1144);
					match(T__1);
					setState(1148);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1145);
							formula(0);
							}
							} 
						}
						setState(1150);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
					}
					setState(1151);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				for (int i = 0; i < ((FormulaContext)getInvokingContext(38)).var; i++) declarations.pop();
				}
				break;
			case 21:
				{
				_localctx = new ForLoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				((FormulaContext)getInvokingContext(38)).var =  0;
				{
				setState(1157);
				match(T__83);
				setState(1158);
				decls();
				setState(1179);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__92:
					{
					setState(1159);
					match(T__92);
					setState(1169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
					case 1:
						{
						setState(1160);
						formula(0);
						}
						break;
					case 2:
						{
						setState(1161);
						match(T__1);
						setState(1165);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1162);
								formula(0);
								}
								} 
							}
							setState(1167);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
						}
						setState(1168);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1171);
					match(T__1);
					setState(1175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1172);
							formula(0);
							}
							} 
						}
						setState(1177);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,187,_ctx);
					}
					setState(1178);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				for (int i = 0; i < ((FormulaContext)getInvokingContext(38)).var; i++) declarations.pop();
				}
				break;
			case 22:
				{
				_localctx = new LetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				((FormulaContext)getInvokingContext(38)).var =  0;
				{
				setState(1184);
				match(T__106);
				setState(1185);
				letDecls();
				setState(1206);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__92:
					{
					setState(1186);
					match(T__92);
					setState(1196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
					case 1:
						{
						setState(1187);
						formula(0);
						}
						break;
					case 2:
						{
						setState(1188);
						match(T__1);
						setState(1192);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1189);
								formula(0);
								}
								} 
							}
							setState(1194);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,189,_ctx);
						}
						setState(1195);
						match(T__3);
						}
						break;
					}
					}
					break;
				case T__1:
					{
					setState(1198);
					match(T__1);
					setState(1202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(1199);
							formula(0);
							}
							} 
						}
						setState(1204);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,191,_ctx);
					}
					setState(1205);
					match(T__3);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				for (int i = 0; i < ((FormulaContext)getInvokingContext(38)).var; i++) declarations.pop();
				}
				break;
			case 23:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1210);
				match(T__107);
				}
				break;
			case 24:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1211);
				match(T__108);
				}
				break;
			case 25:
				{
				_localctx = new F_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1212);
				match(T__14);
				setState(1213);
				formula(0);
				setState(1214);
				match(T__15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1230);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
					case 1:
						{
						_localctx = new AndContext(new FormulaContext(_parentctx, _parentState));
						((AndContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1218);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1219);
						((AndContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__97 || _la==T__98) ) {
							((AndContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1220);
						((AndContext)_localctx).fright = formula(13);
						}
						break;
					case 2:
						{
						_localctx = new OrContext(new FormulaContext(_parentctx, _parentState));
						((OrContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1221);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1222);
						((OrContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__99 || _la==T__100) ) {
							((OrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1223);
						((OrContext)_localctx).fright = formula(12);
						}
						break;
					case 3:
						{
						_localctx = new ImpliesContext(new FormulaContext(_parentctx, _parentState));
						((ImpliesContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1224);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1225);
						((ImpliesContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__101 || _la==T__102) ) {
							((ImpliesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1226);
						((ImpliesContext)_localctx).fright = formula(11);
						}
						break;
					case 4:
						{
						_localctx = new IffContext(new FormulaContext(_parentctx, _parentState));
						((IffContext)_localctx).fleft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_formula);
						setState(1227);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1228);
						((IffContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__103 || _la==T__104) ) {
							((IffContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1229);
						((IffContext)_localctx).fright = formula(10);
						}
						break;
					}
					} 
				}
				setState(1234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,195,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProductContext extends ExpressionContext {
		public ExpressionContext left;
		public Token leftMult;
		public Token rightMult;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
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
	public static class VarContext extends ExpressionContext {
		public VariableIdContext variableId;
		public VariableIdContext variableId() {
			return getRuleContext(VariableIdContext.class,0);
		}
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitVar(this);
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
	public static class BoxjoinContext extends ExpressionContext {
		public ExpressionContext right;
		public ExpressionContext left;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoxjoinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterBoxjoin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitBoxjoin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitBoxjoin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComprehensionContext extends ExpressionContext {
		public ComprehensionDeclsContext comprehensionDecls() {
			return getRuleContext(ComprehensionDeclsContext.class,0);
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
	public static class RelContext extends ExpressionContext {
		public RelationIdContext relationId() {
			return getRuleContext(RelationIdContext.class,0);
		}
		public RelContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitRel(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DifferenceContext extends ExpressionContext {
		public ExpressionContext left;
		public ExpressionContext right;
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

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				_localctx = new TransposeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1236);
				match(T__109);
				setState(1237);
				expression(19);
				}
				break;
			case 2:
				{
				_localctx = new ClosureContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1238);
				match(T__110);
				setState(1239);
				expression(18);
				}
				break;
			case 3:
				{
				_localctx = new ReflexiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1240);
				match(T__52);
				setState(1241);
				expression(17);
				}
				break;
			case 4:
				{
				_localctx = new ComprehensionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				((FormulaContext)getInvokingContext(38)).var =  0;
				{
				setState(1243);
				match(T__1);
				setState(1244);
				comprehensionDecls();
				setState(1245);
				match(T__92);
				setState(1246);
				formula(0);
				setState(1247);
				match(T__3);
				}
				for (int i = 0; i < ((FormulaContext)getInvokingContext(38)).var; i++) declarations.pop();
				}
				break;
			case 5:
				{
				_localctx = new IfExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1251);
				((IfExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__101 || _la==T__102) ) {
					((IfExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1252);
				((IfExpressionContext)_localctx).condition = formula(0);
				setState(1253);
				match(T__116);
				setState(1254);
				((IfExpressionContext)_localctx).thenExpr = expression(0);
				setState(1255);
				match(T__117);
				setState(1256);
				((IfExpressionContext)_localctx).elseExpr = expression(8);
				}
				break;
			case 6:
				{
				_localctx = new IdenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1258);
				match(T__118);
				}
				break;
			case 7:
				{
				_localctx = new NoneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1259);
				match(T__119);
				}
				break;
			case 8:
				{
				_localctx = new UnivContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1260);
				match(T__120);
				}
				break;
			case 9:
				{
				_localctx = new IntsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1261);
				match(T__121);
				}
				break;
			case 10:
				{
				_localctx = new E_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1262);
				match(T__14);
				setState(1263);
				expression(0);
				setState(1264);
				match(T__15);
				}
				break;
			case 11:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1266);
				if (!(!isRelation())) throw new FailedPredicateException(this, "!isRelation()");
				setState(1267);
				((VarContext)_localctx).variableId = variableId();

				        //System.out.print("variable found: " + (((VarContext)_localctx).variableId!=null?_input.getText(((VarContext)_localctx).variableId.start,((VarContext)_localctx).variableId.stop):null) + "-> ");
				        String s = (((VarContext)_localctx).variableId!=null?_input.getText(((VarContext)_localctx).variableId.start,((VarContext)_localctx).variableId.stop):null);
				        if ( declarations.contains(s) ) {
				            //System.out.println("defined");
				        } else {
				            notifyErrorListeners(_localctx.getStart(), "undefined variable found: '"+ s + "'", (RecognitionException)null);
				        }
				      
				}
				break;
			case 12:
				{
				_localctx = new RelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1270);
				if (!(isRelation())) throw new FailedPredicateException(this, "isRelation()");
				setState(1271);
				relationId();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1303);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
					case 1:
						{
						_localctx = new UnionContext(new ExpressionContext(_parentctx, _parentState));
						((UnionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1274);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1275);
						match(T__53);
						setState(1276);
						((UnionContext)_localctx).right = expression(17);
						}
						break;
					case 2:
						{
						_localctx = new IntersectionContext(new ExpressionContext(_parentctx, _parentState));
						((IntersectionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1277);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1278);
						match(T__111);
						setState(1279);
						((IntersectionContext)_localctx).right = expression(16);
						}
						break;
					case 3:
						{
						_localctx = new DifferenceContext(new ExpressionContext(_parentctx, _parentState));
						((DifferenceContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1280);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1281);
						match(T__112);
						setState(1282);
						((DifferenceContext)_localctx).right = expression(15);
						}
						break;
					case 4:
						{
						_localctx = new JoinContext(new ExpressionContext(_parentctx, _parentState));
						((JoinContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1283);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1284);
						match(T__113);
						setState(1285);
						((JoinContext)_localctx).right = expression(14);
						}
						break;
					case 5:
						{
						_localctx = new ProductContext(new ExpressionContext(_parentctx, _parentState));
						((ProductContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1286);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1288);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (T__83 - 84)) | (1L << (T__84 - 84)) | (1L << (T__85 - 84)) | (1L << (T__114 - 84)))) != 0)) {
							{
							setState(1287);
							((ProductContext)_localctx).leftMult = _input.LT(1);
							_la = _input.LA(1);
							if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (T__83 - 84)) | (1L << (T__84 - 84)) | (1L << (T__85 - 84)) | (1L << (T__114 - 84)))) != 0)) ) {
								((ProductContext)_localctx).leftMult = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(1290);
						match(T__95);
						setState(1292);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
						case 1:
							{
							setState(1291);
							((ProductContext)_localctx).rightMult = _input.LT(1);
							_la = _input.LA(1);
							if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (T__83 - 84)) | (1L << (T__84 - 84)) | (1L << (T__85 - 84)) | (1L << (T__114 - 84)))) != 0)) ) {
								((ProductContext)_localctx).rightMult = (Token)_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						}
						setState(1294);
						((ProductContext)_localctx).right = expression(11);
						}
						break;
					case 6:
						{
						_localctx = new OverrideContext(new ExpressionContext(_parentctx, _parentState));
						((OverrideContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1295);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1296);
						match(T__115);
						setState(1297);
						((OverrideContext)_localctx).right = expression(11);
						}
						break;
					case 7:
						{
						_localctx = new BoxjoinContext(new ExpressionContext(_parentctx, _parentState));
						((BoxjoinContext)_localctx).right = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1298);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1299);
						match(T__10);
						setState(1300);
						((BoxjoinContext)_localctx).left = expression(0);
						setState(1301);
						match(T__11);
						}
						break;
					}
					} 
				}
				setState(1307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
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

	public static class IntexpressionContext extends ParserRuleContext {
		public IntexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intexpression; }
	 
		public IntexpressionContext() { }
		public void copyFrom(IntexpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusContext extends IntexpressionContext {
		public IntexpressionContext ileft;
		public IntexpressionContext iright;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public MinusContext(IntexpressionContext ctx) { copyFrom(ctx); }
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
	public static class IntConstantContext extends IntexpressionContext {
		public Token sign;
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IntConstantContext(IntexpressionContext ctx) { copyFrom(ctx); }
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
	public static class I_paranthesisContext extends IntexpressionContext {
		public IntexpressionContext intexpression() {
			return getRuleContext(IntexpressionContext.class,0);
		}
		public I_paranthesisContext(IntexpressionContext ctx) { copyFrom(ctx); }
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
	public static class IfIntExpressionContext extends IntexpressionContext {
		public Token op;
		public FormulaContext condition;
		public IntexpressionContext thenExpr;
		public IntexpressionContext elseExpr;
		public FormulaContext formula() {
			return getRuleContext(FormulaContext.class,0);
		}
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public IfIntExpressionContext(IntexpressionContext ctx) { copyFrom(ctx); }
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
	public static class CountContext extends IntexpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CountContext(IntexpressionContext ctx) { copyFrom(ctx); }
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
	public static class SumContext extends IntexpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SumContext(IntexpressionContext ctx) { copyFrom(ctx); }
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
	public static class DivideContext extends IntexpressionContext {
		public IntexpressionContext ileft;
		public IntexpressionContext iright;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public DivideContext(IntexpressionContext ctx) { copyFrom(ctx); }
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
	public static class MultiplyContext extends IntexpressionContext {
		public IntexpressionContext ileft;
		public IntexpressionContext iright;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public MultiplyContext(IntexpressionContext ctx) { copyFrom(ctx); }
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
	public static class ModuloContext extends IntexpressionContext {
		public IntexpressionContext ileft;
		public IntexpressionContext iright;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public ModuloContext(IntexpressionContext ctx) { copyFrom(ctx); }
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
	public static class PlusContext extends IntexpressionContext {
		public IntexpressionContext ileft;
		public IntexpressionContext iright;
		public List<IntexpressionContext> intexpression() {
			return getRuleContexts(IntexpressionContext.class);
		}
		public IntexpressionContext intexpression(int i) {
			return getRuleContext(IntexpressionContext.class,i);
		}
		public PlusContext(IntexpressionContext ctx) { copyFrom(ctx); }
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

	public final IntexpressionContext intexpression() throws RecognitionException {
		return intexpression(0);
	}

	private IntexpressionContext intexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IntexpressionContext _localctx = new IntexpressionContext(_ctx, _parentState);
		IntexpressionContext _prevctx = _localctx;
		int _startState = 80;
		enterRecursionRule(_localctx, 80, RULE_intexpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__101:
			case T__102:
				{
				_localctx = new IfIntExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1309);
				((IfIntExpressionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__101 || _la==T__102) ) {
					((IfIntExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1310);
				((IfIntExpressionContext)_localctx).condition = formula(0);
				setState(1311);
				match(T__116);
				setState(1312);
				((IfIntExpressionContext)_localctx).thenExpr = intexpression(0);
				setState(1313);
				match(T__117);
				setState(1314);
				((IfIntExpressionContext)_localctx).elseExpr = intexpression(10);
				}
				break;
			case T__91:
				{
				_localctx = new SumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1316);
				match(T__91);
				setState(1317);
				expression(0);
				}
				break;
			case T__45:
				{
				_localctx = new CountContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1318);
				match(T__45);
				setState(1319);
				expression(0);
				}
				break;
			case T__112:
			case INT:
				{
				_localctx = new IntConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__112) {
					{
					setState(1320);
					((IntConstantContext)_localctx).sign = match(T__112);
					}
				}

				setState(1323);
				integer();
				}
				break;
			case T__14:
				{
				_localctx = new I_paranthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1324);
				match(T__14);
				setState(1325);
				intexpression(0);
				setState(1326);
				match(T__15);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1347);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1345);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(new IntexpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intexpression);
						setState(1330);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1331);
						_la = _input.LA(1);
						if ( !(_la==T__53 || _la==T__122) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1332);
						((PlusContext)_localctx).iright = intexpression(8);
						}
						break;
					case 2:
						{
						_localctx = new MinusContext(new IntexpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intexpression);
						setState(1333);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1334);
						_la = _input.LA(1);
						if ( !(_la==T__112 || _la==T__123) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1335);
						((MinusContext)_localctx).iright = intexpression(7);
						}
						break;
					case 3:
						{
						_localctx = new MultiplyContext(new IntexpressionContext(_parentctx, _parentState));
						((MultiplyContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intexpression);
						setState(1336);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1337);
						_la = _input.LA(1);
						if ( !(_la==T__52 || _la==T__124) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1338);
						((MultiplyContext)_localctx).iright = intexpression(6);
						}
						break;
					case 4:
						{
						_localctx = new DivideContext(new IntexpressionContext(_parentctx, _parentState));
						((DivideContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intexpression);
						setState(1339);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1340);
						_la = _input.LA(1);
						if ( !(_la==T__125 || _la==T__126) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1341);
						((DivideContext)_localctx).iright = intexpression(5);
						}
						break;
					case 5:
						{
						_localctx = new ModuloContext(new IntexpressionContext(_parentctx, _parentState));
						((ModuloContext)_localctx).ileft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_intexpression);
						setState(1342);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1343);
						_la = _input.LA(1);
						if ( !(_la==T__127 || _la==T__128) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1344);
						((ModuloContext)_localctx).iright = intexpression(4);
						}
						break;
					}
					} 
				}
				setState(1349);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,204,_ctx);
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

	public static class DeclsContext extends ParserRuleContext {
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_decls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1350);
			decl();
			setState(1355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1351);
				match(T__2);
				setState(1352);
				decl();
				}
				}
				setState(1357);
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OneOfContext extends DeclContext {
		public Token disj;
		public VariableIdContext variableId;
		public List<VariableIdContext> vars = new ArrayList<VariableIdContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableIdContext> variableId() {
			return getRuleContexts(VariableIdContext.class);
		}
		public VariableIdContext variableId(int i) {
			return getRuleContext(VariableIdContext.class,i);
		}
		public OneOfContext(DeclContext ctx) { copyFrom(ctx); }
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
	public static class SomeOfContext extends DeclContext {
		public Token disj;
		public VariableIdContext variableId;
		public List<VariableIdContext> vars = new ArrayList<VariableIdContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableIdContext> variableId() {
			return getRuleContexts(VariableIdContext.class);
		}
		public VariableIdContext variableId(int i) {
			return getRuleContext(VariableIdContext.class,i);
		}
		public SomeOfContext(DeclContext ctx) { copyFrom(ctx); }
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
	public static class LoneOfContext extends DeclContext {
		public Token disj;
		public VariableIdContext variableId;
		public List<VariableIdContext> vars = new ArrayList<VariableIdContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableIdContext> variableId() {
			return getRuleContexts(VariableIdContext.class);
		}
		public VariableIdContext variableId(int i) {
			return getRuleContext(VariableIdContext.class,i);
		}
		public LoneOfContext(DeclContext ctx) { copyFrom(ctx); }
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
	public static class SetOfContext extends DeclContext {
		public Token disj;
		public VariableIdContext variableId;
		public List<VariableIdContext> vars = new ArrayList<VariableIdContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableIdContext> variableId() {
			return getRuleContexts(VariableIdContext.class);
		}
		public VariableIdContext variableId(int i) {
			return getRuleContext(VariableIdContext.class,i);
		}
		public SetOfContext(DeclContext ctx) { copyFrom(ctx); }
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

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_decl);
		int _la;
		try {
			setState(1424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				_localctx = new OneOfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__129) {
					{
					setState(1358);
					((OneOfContext)_localctx).disj = match(T__129);
					}
				}

				setState(1361);
				((OneOfContext)_localctx).variableId = variableId();
				((OneOfContext)_localctx).vars.add(((OneOfContext)_localctx).variableId);
				setState(1366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1362);
					match(T__2);
					setState(1363);
					((OneOfContext)_localctx).variableId = variableId();
					((OneOfContext)_localctx).vars.add(((OneOfContext)_localctx).variableId);
					}
					}
					setState(1368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1369);
				match(T__5);
				setState(1371);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1370);
					match(T__84);
					}
					break;
				}
				setState(1373);
				expression(0);
				((FormulaContext)getInvokingContext(38)).var =  declareVariables(((OneOfContext)_localctx).vars, ((FormulaContext)getInvokingContext(38)).var);
				}
				break;
			case 2:
				_localctx = new LoneOfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__129) {
					{
					setState(1376);
					((LoneOfContext)_localctx).disj = match(T__129);
					}
				}

				setState(1379);
				((LoneOfContext)_localctx).variableId = variableId();
				((LoneOfContext)_localctx).vars.add(((LoneOfContext)_localctx).variableId);
				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1380);
					match(T__2);
					setState(1381);
					((LoneOfContext)_localctx).variableId = variableId();
					((LoneOfContext)_localctx).vars.add(((LoneOfContext)_localctx).variableId);
					}
					}
					setState(1386);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1387);
				match(T__5);
				setState(1388);
				match(T__83);
				setState(1389);
				expression(0);
				((FormulaContext)getInvokingContext(38)).var =  declareVariables(((LoneOfContext)_localctx).vars, ((FormulaContext)getInvokingContext(38)).var);
				}
				break;
			case 3:
				_localctx = new SomeOfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__129) {
					{
					setState(1392);
					((SomeOfContext)_localctx).disj = match(T__129);
					}
				}

				setState(1395);
				((SomeOfContext)_localctx).variableId = variableId();
				((SomeOfContext)_localctx).vars.add(((SomeOfContext)_localctx).variableId);
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1396);
					match(T__2);
					setState(1397);
					((SomeOfContext)_localctx).variableId = variableId();
					((SomeOfContext)_localctx).vars.add(((SomeOfContext)_localctx).variableId);
					}
					}
					setState(1402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1403);
				match(T__5);
				setState(1404);
				match(T__85);
				setState(1405);
				expression(0);
				((FormulaContext)getInvokingContext(38)).var =  declareVariables(((SomeOfContext)_localctx).vars, ((FormulaContext)getInvokingContext(38)).var);
				}
				break;
			case 4:
				_localctx = new SetOfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__129) {
					{
					setState(1408);
					((SetOfContext)_localctx).disj = match(T__129);
					}
				}

				setState(1411);
				((SetOfContext)_localctx).variableId = variableId();
				((SetOfContext)_localctx).vars.add(((SetOfContext)_localctx).variableId);
				setState(1416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1412);
					match(T__2);
					setState(1413);
					((SetOfContext)_localctx).variableId = variableId();
					((SetOfContext)_localctx).vars.add(((SetOfContext)_localctx).variableId);
					}
					}
					setState(1418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1419);
				match(T__5);
				setState(1420);
				match(T__114);
				setState(1421);
				expression(0);
				((FormulaContext)getInvokingContext(38)).var =  declareVariables(((SetOfContext)_localctx).vars, ((FormulaContext)getInvokingContext(38)).var);
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

	public static class LetDeclsContext extends ParserRuleContext {
		public List<LetDeclContext> letDecl() {
			return getRuleContexts(LetDeclContext.class);
		}
		public LetDeclContext letDecl(int i) {
			return getRuleContext(LetDeclContext.class,i);
		}
		public LetDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLetDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLetDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLetDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclsContext letDecls() throws RecognitionException {
		LetDeclsContext _localctx = new LetDeclsContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_letDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1426);
			letDecl();
			setState(1431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1427);
				match(T__2);
				setState(1428);
				letDecl();
				}
				}
				setState(1433);
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

	public static class LetDeclContext extends ParserRuleContext {
		public VariableIdContext variableId;
		public List<VariableIdContext> vars = new ArrayList<VariableIdContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableIdContext> variableId() {
			return getRuleContexts(VariableIdContext.class);
		}
		public VariableIdContext variableId(int i) {
			return getRuleContext(VariableIdContext.class,i);
		}
		public LetDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterLetDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitLetDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitLetDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDeclContext letDecl() throws RecognitionException {
		LetDeclContext _localctx = new LetDeclContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_letDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1434);
			((LetDeclContext)_localctx).variableId = variableId();
			((LetDeclContext)_localctx).vars.add(((LetDeclContext)_localctx).variableId);
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1435);
				match(T__2);
				setState(1436);
				((LetDeclContext)_localctx).variableId = variableId();
				((LetDeclContext)_localctx).vars.add(((LetDeclContext)_localctx).variableId);
				}
				}
				setState(1441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1442);
			match(T__20);
			setState(1443);
			expression(0);
			}
			((FormulaContext)getInvokingContext(38)).var =  declareVariables(((LetDeclContext)_localctx).vars, ((FormulaContext)getInvokingContext(38)).var);
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

	public static class ComprehensionDeclsContext extends ParserRuleContext {
		public List<ComprehensionDeclContext> comprehensionDecl() {
			return getRuleContexts(ComprehensionDeclContext.class);
		}
		public ComprehensionDeclContext comprehensionDecl(int i) {
			return getRuleContext(ComprehensionDeclContext.class,i);
		}
		public ComprehensionDeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehensionDecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterComprehensionDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitComprehensionDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitComprehensionDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComprehensionDeclsContext comprehensionDecls() throws RecognitionException {
		ComprehensionDeclsContext _localctx = new ComprehensionDeclsContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_comprehensionDecls);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			comprehensionDecl();
			setState(1452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1448);
				match(T__2);
				setState(1449);
				comprehensionDecl();
				}
				}
				setState(1454);
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

	public static class ComprehensionDeclContext extends ParserRuleContext {
		public Token disj;
		public VariableIdContext variableId;
		public List<VariableIdContext> vars = new ArrayList<VariableIdContext>();
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableIdContext> variableId() {
			return getRuleContexts(VariableIdContext.class);
		}
		public VariableIdContext variableId(int i) {
			return getRuleContext(VariableIdContext.class,i);
		}
		public ComprehensionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehensionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterComprehensionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitComprehensionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitComprehensionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComprehensionDeclContext comprehensionDecl() throws RecognitionException {
		ComprehensionDeclContext _localctx = new ComprehensionDeclContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comprehensionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__129) {
				{
				setState(1455);
				((ComprehensionDeclContext)_localctx).disj = match(T__129);
				}
			}

			{
			setState(1458);
			((ComprehensionDeclContext)_localctx).variableId = variableId();
			((ComprehensionDeclContext)_localctx).vars.add(((ComprehensionDeclContext)_localctx).variableId);
			setState(1463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(1459);
				match(T__2);
				setState(1460);
				((ComprehensionDeclContext)_localctx).variableId = variableId();
				((ComprehensionDeclContext)_localctx).vars.add(((ComprehensionDeclContext)_localctx).variableId);
				}
				}
				setState(1465);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1466);
			match(T__5);
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				{
				setState(1467);
				match(T__84);
				}
				break;
			}
			setState(1470);
			expression(0);
			}
			((FormulaContext)getInvokingContext(38)).var =  declareVariables(((ComprehensionDeclContext)_localctx).vars, ((FormulaContext)getInvokingContext(38)).var);
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
		public TerminalNode IDENTIFIER() { return getToken(AlloyInEcoreParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 94, RULE_relationId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474);
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

	public static class VariableIdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(AlloyInEcoreParser.IDENTIFIER, 0); }
		public VariableIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterVariableId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitVariableId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitVariableId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableIdContext variableId() throws RecognitionException {
		VariableIdContext _localctx = new VariableIdContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
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
		enterRule(_localctx, 98, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1478);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public IdentifierContext firstPart;
		public IdentifierContext identifier;
		public List<IdentifierContext> midParts = new ArrayList<IdentifierContext>();
		public IdentifierContext classifier;
		public IdentifierContext structuralFeature;
		public IdentifierContext operation;
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlloyInEcoreListener ) ((AlloyInEcoreListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlloyInEcoreVisitor ) return ((AlloyInEcoreVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifiedName);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			((QualifiedNameContext)_localctx).firstPart = identifier();
			setState(1496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & ((1L << (T__95 - 96)) | (1L << (T__113 - 96)) | (1L << (T__130 - 96)))) != 0)) {
				{
				setState(1485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1481);
						match(T__113);
						setState(1482);
						((QualifiedNameContext)_localctx).identifier = identifier();
						((QualifiedNameContext)_localctx).midParts.add(((QualifiedNameContext)_localctx).identifier);
						}
						} 
					}
					setState(1487);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
				}
				setState(1494);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__113:
					{
					setState(1488);
					match(T__113);
					setState(1489);
					((QualifiedNameContext)_localctx).classifier = identifier();
					}
					break;
				case T__130:
					{
					setState(1490);
					match(T__130);
					setState(1491);
					((QualifiedNameContext)_localctx).structuralFeature = identifier();
					}
					break;
				case T__95:
					{
					setState(1492);
					match(T__95);
					setState(1493);
					((QualifiedNameContext)_localctx).operation = identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
		enterRule(_localctx, 102, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
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
		enterRule(_localctx, 104, RULE_upper);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1500);
			_la = _input.LA(1);
			if ( !(_la==T__52 || _la==INT) ) {
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
		enterRule(_localctx, 106, RULE_lower);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1502);
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
		enterRule(_localctx, 108, RULE_signed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__112) {
				{
				setState(1504);
				match(T__112);
				}
			}

			setState(1507);
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
		case 38:
			return formula_sempred((FormulaContext)_localctx, predIndex);
		case 39:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 40:
			return intexpression_sempred((IntexpressionContext)_localctx, predIndex);
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
			return !isRelation();
		case 5:
			return isRelation();
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean intexpression_sempred(IntexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 6);
		case 15:
			return precpred(_ctx, 5);
		case 16:
			return precpred(_ctx, 4);
		case 17:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u008d\u05e8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\5\2r\n\2\3\2\3\2\3\2\3\2\3"+
		"\2\7\2y\n\2\f\2\16\2|\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3\u0086\n"+
		"\3\f\3\16\3\u0089\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0099\n\4\3\5\3\5\3\5\3\5\3\5\7\5\u00a0\n\5\f\5\16\5\u00a3"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00ab\n\5\f\5\16\5\u00ae\13\5\3\5\3"+
		"\5\5\5\u00b2\n\5\3\5\3\5\3\6\3\6\3\6\7\6\u00b9\n\6\f\6\16\6\u00bc\13\6"+
		"\3\6\3\6\3\6\3\7\3\7\5\7\u00c3\n\7\3\7\3\7\5\7\u00c7\n\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00cd\n\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u00d7\n\b\f\b\16"+
		"\b\u00da\13\b\5\b\u00dc\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u00e3\n\b\f\b\16\b"+
		"\u00e6\13\b\5\b\u00e8\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00f7\n\b\3\t\3\t\3\t\3\t\7\t\u00fd\n\t\f\t\16\t\u0100\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0108\n\t\f\t\16\t\u010b\13\t\3\t\3\t\5"+
		"\t\u010f\n\t\3\n\5\n\u0112\n\n\3\n\3\n\5\n\u0116\n\n\3\n\7\n\u0119\n\n"+
		"\f\n\16\n\u011c\13\n\3\n\7\n\u011f\n\n\f\n\16\n\u0122\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\5\13\u012a\n\13\3\13\3\13\3\13\3\f\5\f\u0130\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0140\n\f\f\f\16"+
		"\f\u0143\13\f\3\f\3\f\5\f\u0147\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u014e\n\r"+
		"\3\16\5\16\u0151\n\16\3\16\5\16\u0154\n\16\3\16\3\16\5\16\u0158\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u015f\n\16\f\16\16\16\u0162\13\16\5\16\u0164"+
		"\n\16\3\16\3\16\5\16\u0168\n\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0170"+
		"\n\16\f\16\16\16\u0173\13\16\3\16\3\16\5\16\u0177\n\16\3\16\3\16\3\17"+
		"\3\17\5\17\u017d\n\17\3\20\5\20\u0180\n\20\3\20\5\20\u0183\n\20\3\20\3"+
		"\20\5\20\u0187\n\20\3\20\5\20\u018a\n\20\3\20\5\20\u018d\n\20\3\20\3\20"+
		"\5\20\u0191\n\20\3\20\5\20\u0194\n\20\3\20\3\20\3\20\3\20\5\20\u019a\n"+
		"\20\3\20\3\20\3\20\5\20\u019f\n\20\5\20\u01a1\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u01ac\n\20\3\20\5\20\u01af\n\20\6\20\u01b1"+
		"\n\20\r\20\16\20\u01b2\3\20\5\20\u01b6\n\20\3\20\3\20\3\20\3\20\5\20\u01bc"+
		"\n\20\3\20\3\20\5\20\u01c0\n\20\3\20\3\20\3\20\5\20\u01c5\n\20\3\20\3"+
		"\20\5\20\u01c9\n\20\3\20\7\20\u01cc\n\20\f\20\16\20\u01cf\13\20\3\20\3"+
		"\20\5\20\u01d3\n\20\3\20\3\20\3\21\5\21\u01d8\n\21\3\21\5\21\u01db\n\21"+
		"\3\21\3\21\5\21\u01df\n\21\3\21\5\21\u01e2\n\21\3\21\5\21\u01e5\n\21\3"+
		"\21\3\21\5\21\u01e9\n\21\3\21\5\21\u01ec\n\21\3\21\3\21\3\21\3\21\5\21"+
		"\u01f2\n\21\3\21\3\21\3\21\5\21\u01f7\n\21\5\21\u01f9\n\21\3\21\3\21\5"+
		"\21\u01fd\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u020a\n\21\3\21\5\21\u020d\n\21\6\21\u020f\n\21\r\21\16\21\u0210"+
		"\3\21\5\21\u0214\n\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u021c\n\21\f"+
		"\21\16\21\u021f\13\21\3\21\3\21\3\21\3\21\5\21\u0225\n\21\3\21\3\21\5"+
		"\21\u0229\n\21\3\21\3\21\3\21\5\21\u022e\n\21\3\21\3\21\5\21\u0232\n\21"+
		"\3\21\7\21\u0235\n\21\f\21\16\21\u0238\13\21\3\21\3\21\5\21\u023c\n\21"+
		"\3\21\3\21\3\22\5\22\u0241\n\22\3\22\5\22\u0244\n\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\7\22\u024c\n\22\f\22\16\22\u024f\13\22\5\22\u0251\n\22\3"+
		"\22\3\22\3\22\3\22\5\22\u0257\n\22\5\22\u0259\n\22\3\22\3\22\3\22\3\22"+
		"\7\22\u025f\n\22\f\22\16\22\u0262\13\22\5\22\u0264\n\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u026b\n\22\3\22\5\22\u026e\n\22\6\22\u0270\n\22\r\22\16"+
		"\22\u0271\3\22\5\22\u0275\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u027c\n\22"+
		"\f\22\16\22\u027f\13\22\3\22\3\22\5\22\u0283\n\22\3\23\3\23\5\23\u0287"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u028d\n\23\5\23\u028f\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u0296\n\23\3\23\5\23\u0299\n\23\6\23\u029b\n\23\r\23"+
		"\16\23\u029c\3\23\5\23\u02a0\n\23\3\23\3\23\7\23\u02a4\n\23\f\23\16\23"+
		"\u02a7\13\23\3\23\5\23\u02aa\n\23\3\24\3\24\5\24\u02ae\n\24\3\25\3\25"+
		"\3\25\3\25\5\25\u02b4\n\25\3\25\5\25\u02b7\n\25\3\25\3\25\5\25\u02bb\n"+
		"\25\3\25\3\25\3\26\5\26\u02c0\n\26\3\26\3\26\3\26\5\26\u02c5\n\26\5\26"+
		"\u02c7\n\26\3\26\3\26\3\26\5\26\u02cc\n\26\3\26\3\26\5\26\u02d0\n\26\3"+
		"\26\3\26\3\26\5\26\u02d5\n\26\3\26\5\26\u02d8\n\26\3\26\3\26\3\26\3\26"+
		"\7\26\u02de\n\26\f\26\16\26\u02e1\13\26\3\26\5\26\u02e4\n\26\3\26\5\26"+
		"\u02e7\n\26\3\26\3\26\3\27\3\27\3\30\5\30\u02ee\n\30\3\30\3\30\3\30\5"+
		"\30\u02f3\n\30\3\30\3\30\5\30\u02f7\n\30\3\30\3\30\3\30\5\30\u02fc\n\30"+
		"\3\30\5\30\u02ff\n\30\3\30\3\30\3\30\3\30\3\30\7\30\u0306\n\30\f\30\16"+
		"\30\u0309\13\30\3\30\3\30\5\30\u030d\n\30\3\30\3\30\3\31\3\31\3\31\5\31"+
		"\u0314\n\31\3\31\3\31\5\31\u0318\n\31\3\31\3\31\7\31\u031c\n\31\f\31\16"+
		"\31\u031f\13\31\3\31\3\31\5\31\u0323\n\31\3\32\3\32\5\32\u0327\n\32\3"+
		"\32\3\32\3\32\3\32\7\32\u032d\n\32\f\32\16\32\u0330\13\32\3\32\3\32\5"+
		"\32\u0334\n\32\3\32\3\32\3\32\3\32\6\32\u033a\n\32\r\32\16\32\u033b\3"+
		"\32\3\32\3\32\5\32\u0341\n\32\3\33\3\33\3\33\3\33\3\34\3\34\5\34\u0349"+
		"\n\34\3\35\3\35\3\35\3\35\5\35\u034f\n\35\3\36\3\36\3\36\5\36\u0354\n"+
		"\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \7 \u035e\n \f \16 \u0361\13 \3 \3"+
		" \3 \3 \3 \3 \7 \u0369\n \f \16 \u036c\13 \3 \3 \5 \u0370\n \3!\3!\5!"+
		"\u0374\n!\3!\3!\5!\u0378\n!\3!\3!\5!\u037c\n!\3\"\5\"\u037f\n\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u0386\n\"\5\"\u0388\n\"\3\"\3\"\5\"\u038c\n\"\3\"\3"+
		"\"\5\"\u0390\n\"\3#\3#\3#\3#\3#\5#\u0397\n#\5#\u0399\n#\3#\3#\5#\u039d"+
		"\n#\3#\3#\5#\u03a1\n#\3$\3$\3$\3$\3$\5$\u03a8\n$\5$\u03aa\n$\3$\3$\5$"+
		"\u03ae\n$\3$\3$\5$\u03b2\n$\3%\3%\3&\3&\3&\5&\u03b9\n&\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u03c8\n(\3(\3(\3(\3(\3(\5(\u03cf\n(\3(\3"+
		"(\3(\3(\3(\5(\u03d6\n(\3(\3(\3(\3(\3(\5(\u03dd\n(\3(\3(\3(\3(\3(\5(\u03e4"+
		"\n(\3(\3(\3(\3(\3(\5(\u03eb\n(\3(\3(\3(\3(\3(\5(\u03f2\n(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0422\n("+
		"\f(\16(\u0425\13(\3(\5(\u0428\n(\3(\3(\7(\u042c\n(\f(\16(\u042f\13(\3"+
		"(\5(\u0432\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u043d\n(\f(\16(\u0440\13("+
		"\3(\5(\u0443\n(\3(\3(\7(\u0447\n(\f(\16(\u044a\13(\3(\5(\u044d\n(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\7(\u0458\n(\f(\16(\u045b\13(\3(\5(\u045e\n(\3("+
		"\3(\7(\u0462\n(\f(\16(\u0465\13(\3(\5(\u0468\n(\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\7(\u0473\n(\f(\16(\u0476\13(\3(\5(\u0479\n(\3(\3(\7(\u047d\n(\f("+
		"\16(\u0480\13(\3(\5(\u0483\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u048e\n(\f"+
		"(\16(\u0491\13(\3(\5(\u0494\n(\3(\3(\7(\u0498\n(\f(\16(\u049b\13(\3(\5"+
		"(\u049e\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u04a9\n(\f(\16(\u04ac\13(\3("+
		"\5(\u04af\n(\3(\3(\7(\u04b3\n(\f(\16(\u04b6\13(\3(\5(\u04b9\n(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\5(\u04c3\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u04d1"+
		"\n(\f(\16(\u04d4\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u04fb"+
		"\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u050b\n)\3)\3)\5)\u050f"+
		"\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u051a\n)\f)\16)\u051d\13)\3*\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u052c\n*\3*\3*\3*\3*\3*\5*\u0533\n*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\7*\u0544\n*\f*\16*\u0547\13"+
		"*\3+\3+\3+\7+\u054c\n+\f+\16+\u054f\13+\3,\5,\u0552\n,\3,\3,\3,\7,\u0557"+
		"\n,\f,\16,\u055a\13,\3,\3,\5,\u055e\n,\3,\3,\3,\3,\5,\u0564\n,\3,\3,\3"+
		",\7,\u0569\n,\f,\16,\u056c\13,\3,\3,\3,\3,\3,\3,\5,\u0574\n,\3,\3,\3,"+
		"\7,\u0579\n,\f,\16,\u057c\13,\3,\3,\3,\3,\3,\3,\5,\u0584\n,\3,\3,\3,\7"+
		",\u0589\n,\f,\16,\u058c\13,\3,\3,\3,\3,\3,\5,\u0593\n,\3-\3-\3-\7-\u0598"+
		"\n-\f-\16-\u059b\13-\3.\3.\3.\7.\u05a0\n.\f.\16.\u05a3\13.\3.\3.\3.\3"+
		".\3.\3/\3/\3/\7/\u05ad\n/\f/\16/\u05b0\13/\3\60\5\60\u05b3\n\60\3\60\3"+
		"\60\3\60\7\60\u05b8\n\60\f\60\16\60\u05bb\13\60\3\60\3\60\5\60\u05bf\n"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\7"+
		"\64\u05ce\n\64\f\64\16\64\u05d1\13\64\3\64\3\64\3\64\3\64\3\64\3\64\5"+
		"\64\u05d9\n\64\5\64\u05db\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\58\u05e4"+
		"\n8\38\38\38\2\5NPR9\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjln\2\25\3\2\679\3\2@D\3\2\u0089\u008a"+
		"\3\2NO\3\2PQ\3\2RT\3\2YZ\3\2VW\3\2de\3\2fg\3\2hi\3\2jk\4\2VXuu\4\288}"+
		"}\4\2ss~~\4\2\67\67\177\177\3\2\u0080\u0081\3\2\u0082\u0083\4\2\67\67"+
		"\u0086\u0086\u06f1\2q\3\2\2\2\4\u0080\3\2\2\2\6\u0098\3\2\2\2\b\u009a"+
		"\3\2\2\2\n\u00b5\3\2\2\2\f\u00c0\3\2\2\2\16\u00f6\3\2\2\2\20\u010e\3\2"+
		"\2\2\22\u0111\3\2\2\2\24\u0125\3\2\2\2\26\u012f\3\2\2\2\30\u014d\3\2\2"+
		"\2\32\u0150\3\2\2\2\34\u017c\3\2\2\2\36\u017f\3\2\2\2 \u01d7\3\2\2\2\""+
		"\u0240\3\2\2\2$\u0286\3\2\2\2&\u02ad\3\2\2\2(\u02af\3\2\2\2*\u02bf\3\2"+
		"\2\2,\u02ea\3\2\2\2.\u02ed\3\2\2\2\60\u0313\3\2\2\2\62\u0324\3\2\2\2\64"+
		"\u0342\3\2\2\2\66\u0348\3\2\2\28\u034e\3\2\2\2:\u0353\3\2\2\2<\u0355\3"+
		"\2\2\2>\u036f\3\2\2\2@\u0371\3\2\2\2B\u037e\3\2\2\2D\u0391\3\2\2\2F\u03a2"+
		"\3\2\2\2H\u03b3\3\2\2\2J\u03b8\3\2\2\2L\u03ba\3\2\2\2N\u04c2\3\2\2\2P"+
		"\u04fa\3\2\2\2R\u0532\3\2\2\2T\u0548\3\2\2\2V\u0592\3\2\2\2X\u0594\3\2"+
		"\2\2Z\u059c\3\2\2\2\\\u05a9\3\2\2\2^\u05b2\3\2\2\2`\u05c4\3\2\2\2b\u05c6"+
		"\3\2\2\2d\u05c8\3\2\2\2f\u05ca\3\2\2\2h\u05dc\3\2\2\2j\u05de\3\2\2\2l"+
		"\u05e0\3\2\2\2n\u05e3\3\2\2\2pr\5\4\3\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2"+
		"st\5\b\5\2tu\b\2\1\2uv\5\n\6\2vz\b\2\1\2wy\5N(\2xw\3\2\2\2y|\3\2\2\2z"+
		"x\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\b\2\1\2~\177\b\2\1\2\177\3\3"+
		"\2\2\2\u0080\u0081\7\3\2\2\u0081\u0082\7\4\2\2\u0082\u0087\5\6\4\2\u0083"+
		"\u0084\7\5\2\2\u0084\u0086\5\6\4\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008b\7\6\2\2\u008b\5\3\2\2\2\u008c\u008d\7\7\2\2"+
		"\u008d\u008e\7\b\2\2\u008e\u0099\5d\63\2\u008f\u0090\7\t\2\2\u0090\u0091"+
		"\7\b\2\2\u0091\u0099\5d\63\2\u0092\u0093\7\n\2\2\u0093\u0094\7\b\2\2\u0094"+
		"\u0099\5d\63\2\u0095\u0096\7\13\2\2\u0096\u0097\7\b\2\2\u0097\u0099\5"+
		"d\63\2\u0098\u008c\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0092\3\2\2\2\u0098"+
		"\u0095\3\2\2\2\u0099\7\3\2\2\2\u009a\u00b1\7\f\2\2\u009b\u009c\7\4\2\2"+
		"\u009c\u00a1\5J&\2\u009d\u009e\7\5\2\2\u009e\u00a0\5J&\2\u009f\u009d\3"+
		"\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00b2\3\2"+
		"\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00ac\5J&\2\u00a8\u00a9\7\5\2\2\u00a9\u00ab"+
		"\5J&\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\16"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u009b\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b4\b\5\1\2\u00b4\t\3\2\2\2\u00b5\u00b6\7\17\2"+
		"\2\u00b6\u00ba\7\4\2\2\u00b7\u00b9\5\f\7\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\7\6\2\2\u00be\u00bf\b\6\1\2\u00bf\13\3\2\2"+
		"\2\u00c0\u00c2\5h\65\2\u00c1\u00c3\5L\'\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\7\b\2\2\u00c5\u00c7\5P)\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\r"+
		"\2\2\u00c9\u00cc\5\16\b\2\u00ca\u00cb\7\5\2\2\u00cb\u00cd\5\16\b\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7\16"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\7\1\2\u00d1\r\3\2\2\2\u00d2\u00db"+
		"\7\4\2\2\u00d3\u00d8\5\20\t\2\u00d4\u00d5\7\5\2\2\u00d5\u00d7\5\20\t\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00d3\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00f7\7\6\2\2\u00de\u00e7\7\r"+
		"\2\2\u00df\u00e4\5\20\t\2\u00e0\u00e1\7\5\2\2\u00e1\u00e3\5\20\t\2\u00e2"+
		"\u00e0\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2"+
		"\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00df\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f7\7\16\2\2\u00ea\u00eb\7"+
		"\4\2\2\u00eb\u00ec\5\20\t\2\u00ec\u00ed\7\20\2\2\u00ed\u00ee\5\20\t\2"+
		"\u00ee\u00ef\7\6\2\2\u00ef\u00f7\3\2\2\2\u00f0\u00f1\7\r\2\2\u00f1\u00f2"+
		"\5\20\t\2\u00f2\u00f3\7\20\2\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\7\16\2"+
		"\2\u00f5\u00f7\3\2\2\2\u00f6\u00d2\3\2\2\2\u00f6\u00de\3\2\2\2\u00f6\u00ea"+
		"\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f7\17\3\2\2\2\u00f8\u00f9\7\21\2\2\u00f9"+
		"\u00fe\5J&\2\u00fa\u00fb\7\5\2\2\u00fb\u00fd\5J&\2\u00fc\u00fa\3\2\2\2"+
		"\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101"+
		"\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7\22\2\2\u0102\u010f\3\2\2\2"+
		"\u0103\u0104\7\r\2\2\u0104\u0109\5J&\2\u0105\u0106\7\5\2\2\u0106\u0108"+
		"\5J&\2\u0107\u0105\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7\16"+
		"\2\2\u010d\u010f\3\2\2\2\u010e\u00f8\3\2\2\2\u010e\u0103\3\2\2\2\u010f"+
		"\21\3\2\2\2\u0110\u0112\5\4\3\2\u0111\u0110\3\2\2\2\u0111\u0112\3\2\2"+
		"\2\u0112\u0115\3\2\2\2\u0113\u0114\7\23\2\2\u0114\u0116\5h\65\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u011a\3\2\2\2\u0117\u0119\5\24"+
		"\13\2\u0118\u0117\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u0120\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u011f\5\26"+
		"\f\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\b\n"+
		"\1\2\u0124\23\3\2\2\2\u0125\u0129\7\24\2\2\u0126\u0127\5h\65\2\u0127\u0128"+
		"\7\b\2\2\u0128\u012a\3\2\2\2\u0129\u0126\3\2\2\2\u0129\u012a\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\7\u0089\2\2\u012c\u012d\7\25\2\2\u012d\25\3"+
		"\2\2\2\u012e\u0130\5H%\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\7\26\2\2\u0132\u0133\5h\65\2\u0133\u0134\7"+
		"\b\2\2\u0134\u0135\5h\65\2\u0135\u0136\3\2\2\2\u0136\u0137\7\27\2\2\u0137"+
		"\u0138\7\u0089\2\2\u0138\u0139\3\2\2\2\u0139\u0146\b\f\1\2\u013a\u0141"+
		"\7\4\2\2\u013b\u0140\5\62\32\2\u013c\u0140\5\26\f\2\u013d\u0140\5\30\r"+
		"\2\u013e\u0140\5B\"\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d"+
		"\3\2\2\2\u013f\u013e\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0144\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0147\7\6"+
		"\2\2\u0145\u0147\7\25\2\2\u0146\u013a\3\2\2\2\u0146\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148\u0149\b\f\1\2\u0149\27\3\2\2\2\u014a\u014e\5\32\16"+
		"\2\u014b\u014e\5*\26\2\u014c\u014e\5.\30\2\u014d\u014a\3\2\2\2\u014d\u014b"+
		"\3\2\2\2\u014d\u014c\3\2\2\2\u014e\31\3\2\2\2\u014f\u0151\5H%\2\u0150"+
		"\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2\2\2\u0152\u0154\7\30"+
		"\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0157\3\2\2\2\u0155"+
		"\u0158\7\31\2\2\u0156\u0158\7\32\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3"+
		"\2\2\2\u0158\u0159\3\2\2\2\u0159\u0163\5h\65\2\u015a\u015b\7\33\2\2\u015b"+
		"\u0160\5f\64\2\u015c\u015d\7\5\2\2\u015d\u015f\5f\64\2\u015e\u015c\3\2"+
		"\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u015a\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0167\3\2\2\2\u0165\u0166\7\b\2\2\u0166\u0168\7\u0089\2\2\u0167"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u0176\b\16"+
		"\1\2\u016a\u0171\7\4\2\2\u016b\u0170\5\62\32\2\u016c\u0170\5\"\22\2\u016d"+
		"\u0170\5\34\17\2\u016e\u0170\5B\"\2\u016f\u016b\3\2\2\2\u016f\u016c\3"+
		"\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2"+
		"\2\2\u0174\u0177\7\6\2\2\u0175\u0177\7\25\2\2\u0176\u016a\3\2\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\b\16\1\2\u0179\33\3\2\2"+
		"\2\u017a\u017d\5\36\20\2\u017b\u017d\5 \21\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017b\3\2\2\2\u017d\35\3\2\2\2\u017e\u0180\5H%\2\u017f\u017e\3\2\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u0183\7\34\2\2\u0182\u0181"+
		"\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0187\7\35\2\2"+
		"\u0185\u0187\7\36\2\2\u0186\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0189\3\2\2\2\u0188\u018a\7\37\2\2\u0189\u0188\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u018d\7 \2\2\u018c\u018b"+
		"\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u0191\7!\2\2\u018f"+
		"\u0191\7\"\2\2\u0190\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0193\3\2\2\2\u0192\u0194\7#\2\2\u0193\u0192\3\2\2\2\u0193"+
		"\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7$\2\2\u0196\u0199\5h\65"+
		"\2\u0197\u0198\7\27\2\2\u0198\u019a\7\u0089\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u01a0\3\2\2\2\u019b\u019c\7\b\2\2\u019c\u019e\5&"+
		"\24\2\u019d\u019f\5(\25\2\u019e\u019d\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\3\2\2\2\u01a0\u019b\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01b5\3\2"+
		"\2\2\u01a2\u01b0\7\4\2\2\u01a3\u01ac\7%\2\2\u01a4\u01ac\7&\2\2\u01a5\u01ac"+
		"\7\'\2\2\u01a6\u01ac\7(\2\2\u01a7\u01ac\7)\2\2\u01a8\u01ac\7*\2\2\u01a9"+
		"\u01ac\7+\2\2\u01aa\u01ac\7,\2\2\u01ab\u01a3\3\2\2\2\u01ab\u01a4\3\2\2"+
		"\2\u01ab\u01a5\3\2\2\2\u01ab\u01a6\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a8"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u01af\7\5\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2"+
		"\2\2\u01b0\u01ab\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\7\6\2\2\u01b5\u01a2\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01d2\3\2\2\2\u01b7\u01cd\7\4\2\2\u01b8"+
		"\u01cc\5\62\32\2\u01b9\u01bb\7-\2\2\u01ba\u01bc\5h\65\2\u01bb\u01ba\3"+
		"\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf\7\b\2\2\u01be"+
		"\u01c0\5P)\2\u01bf\u01be\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2"+
		"\2\u01c1\u01cc\7\25\2\2\u01c2\u01c4\7.\2\2\u01c3\u01c5\5h\65\2\u01c4\u01c3"+
		"\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\7\b\2\2\u01c7"+
		"\u01c9\5P)\2\u01c8\u01c7\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2"+
		"\2\u01ca\u01cc\7\25\2\2\u01cb\u01b8\3\2\2\2\u01cb\u01b9\3\2\2\2\u01cb"+
		"\u01c2\3\2\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2"+
		"\2\2\u01ce\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\7\6\2\2\u01d1"+
		"\u01d3\7\25\2\2\u01d2\u01b7\3\2\2\2\u01d2\u01d1\3\2\2\2\u01d3\u01d4\3"+
		"\2\2\2\u01d4\u01d5\b\20\1\2\u01d5\37\3\2\2\2\u01d6\u01d8\5H%\2\u01d7\u01d6"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01da\3\2\2\2\u01d9\u01db\7\34\2\2"+
		"\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01df"+
		"\7\35\2\2\u01dd\u01df\7\36\2\2\u01de\u01dc\3\2\2\2\u01de\u01dd\3\2\2\2"+
		"\u01de\u01df\3\2\2\2\u01df\u01e1\3\2\2\2\u01e0\u01e2\7\37\2\2\u01e1\u01e0"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\7 \2\2\u01e4"+
		"\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e9\7!"+
		"\2\2\u01e7\u01e9\7\"\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\7#\2\2\u01eb\u01ea\3\2"+
		"\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7/\2\2\u01ee"+
		"\u01f1\5h\65\2\u01ef\u01f0\7\60\2\2\u01f0\u01f2\5f\64\2\u01f1\u01ef\3"+
		"\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f8\3\2\2\2\u01f3\u01f4\7\b\2\2\u01f4"+
		"\u01f6\5&\24\2\u01f5\u01f7\5(\25\2\u01f6\u01f5\3\2\2\2\u01f6\u01f7\3\2"+
		"\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f3\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fc\3\2\2\2\u01fa\u01fb\7\27\2\2\u01fb\u01fd\7\u0089\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u0213\3\2\2\2\u01fe\u020e\7\4\2\2\u01ff"+
		"\u020a\7\61\2\2\u0200\u020a\7%\2\2\u0201\u020a\7\'\2\2\u0202\u020a\7("+
		"\2\2\u0203\u020a\7)\2\2\u0204\u020a\7*\2\2\u0205\u020a\7\62\2\2\u0206"+
		"\u020a\7\63\2\2\u0207\u020a\7+\2\2\u0208\u020a\7,\2\2\u0209\u01ff\3\2"+
		"\2\2\u0209\u0200\3\2\2\2\u0209\u0201\3\2\2\2\u0209\u0202\3\2\2\2\u0209"+
		"\u0203\3\2\2\2\u0209\u0204\3\2\2\2\u0209\u0205\3\2\2\2\u0209\u0206\3\2"+
		"\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u020c\3\2\2\2\u020b"+
		"\u020d\7\5\2\2\u020c\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2"+
		"\2\2\u020e\u0209\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u020e\3\2\2\2\u0210"+
		"\u0211\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0214\7\6\2\2\u0213\u01fe\3\2"+
		"\2\2\u0213\u0214\3\2\2\2\u0214\u023b\3\2\2\2\u0215\u0236\7\4\2\2\u0216"+
		"\u0235\5\62\32\2\u0217\u0218\7\64\2\2\u0218\u021d\5f\64\2\u0219\u021a"+
		"\7\5\2\2\u021a\u021c\5f\64\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021d\3\2"+
		"\2\2\u0220\u0221\7\25\2\2\u0221\u0235\3\2\2\2\u0222\u0224\7-\2\2\u0223"+
		"\u0225\5h\65\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\3\2"+
		"\2\2\u0226\u0228\7\b\2\2\u0227\u0229\5P)\2\u0228\u0227\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0235\7\25\2\2\u022b\u022d\7.\2\2\u022c"+
		"\u022e\5h\65\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2"+
		"\2\2\u022f\u0231\7\b\2\2\u0230\u0232\5P)\2\u0231\u0230\3\2\2\2\u0231\u0232"+
		"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\7\25\2\2\u0234\u0216\3\2\2\2"+
		"\u0234\u0217\3\2\2\2\u0234\u0222\3\2\2\2\u0234\u022b\3\2\2\2\u0235\u0238"+
		"\3\2\2\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238"+
		"\u0236\3\2\2\2\u0239\u023c\7\6\2\2\u023a\u023c\7\25\2\2\u023b\u0215\3"+
		"\2\2\2\u023b\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\b\21\1\2\u023e"+
		"!\3\2\2\2\u023f\u0241\5H%\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0243\3\2\2\2\u0242\u0244\7\34\2\2\u0243\u0242\3\2\2\2\u0243\u0244\3"+
		"\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\7\65\2\2\u0246\u0247\5h\65\2\u0247"+
		"\u0250\7\21\2\2\u0248\u024d\5$\23\2\u0249\u024a\7\5\2\2\u024a\u024c\5"+
		"$\23\2\u024b\u0249\3\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d"+
		"\u024e\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0248\3\2"+
		"\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0258\7\22\2\2\u0253"+
		"\u0254\7\b\2\2\u0254\u0256\5&\24\2\u0255\u0257\5(\25\2\u0256\u0255\3\2"+
		"\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u0253\3\2\2\2\u0258"+
		"\u0259\3\2\2\2\u0259\u0263\3\2\2\2\u025a\u025b\7\66\2\2\u025b\u0260\5"+
		"h\65\2\u025c\u025d\7\5\2\2\u025d\u025f\5h\65\2\u025e\u025c\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0264\3\2"+
		"\2\2\u0262\u0260\3\2\2\2\u0263\u025a\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0274\3\2\2\2\u0265\u026f\7\4\2\2\u0266\u026b\7\'\2\2\u0267\u026b\7("+
		"\2\2\u0268\u026b\7)\2\2\u0269\u026b\7*\2\2\u026a\u0266\3\2\2\2\u026a\u0267"+
		"\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u0269\3\2\2\2\u026b\u026d\3\2\2\2\u026c"+
		"\u026e\7\5\2\2\u026d\u026c\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270\3\2"+
		"\2\2\u026f\u026a\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u026f\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\7\6\2\2\u0274\u0265\3\2"+
		"\2\2\u0274\u0275\3\2\2\2\u0275\u0282\3\2\2\2\u0276\u027d\7\4\2\2\u0277"+
		"\u027c\5\62\32\2\u0278\u027c\5D#\2\u0279\u027c\5@!\2\u027a\u027c\5F$\2"+
		"\u027b\u0277\3\2\2\2\u027b\u0278\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027a"+
		"\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u0280\3\2\2\2\u027f\u027d\3\2\2\2\u0280\u0283\7\6\2\2\u0281\u0283\7\25"+
		"\2\2\u0282\u0276\3\2\2\2\u0282\u0281\3\2\2\2\u0283#\3\2\2\2\u0284\u0287"+
		"\7!\2\2\u0285\u0287\7\"\2\2\u0286\u0284\3\2\2\2\u0286\u0285\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028e\5h\65\2\u0289\u028a\7\b"+
		"\2\2\u028a\u028c\5&\24\2\u028b\u028d\5(\25\2\u028c\u028b\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028d\u028f\3\2\2\2\u028e\u0289\3\2\2\2\u028e\u028f\3\2"+
		"\2\2\u028f\u029f\3\2\2\2\u0290\u029a\7\4\2\2\u0291\u0296\7\'\2\2\u0292"+
		"\u0296\7(\2\2\u0293\u0296\7)\2\2\u0294\u0296\7*\2\2\u0295\u0291\3\2\2"+
		"\2\u0295\u0292\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0294\3\2\2\2\u0296\u0298"+
		"\3\2\2\2\u0297\u0299\7\5\2\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299"+
		"\u029b\3\2\2\2\u029a\u0295\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029a\3\2"+
		"\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\7\6\2\2\u029f"+
		"\u0290\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a9\3\2\2\2\u02a1\u02a5\7\4"+
		"\2\2\u02a2\u02a4\5\62\32\2\u02a3\u02a2\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5"+
		"\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\3\2\2\2\u02a7\u02a5\3\2"+
		"\2\2\u02a8\u02aa\7\6\2\2\u02a9\u02a1\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa"+
		"%\3\2\2\2\u02ab\u02ae\5,\27\2\u02ac\u02ae\5f\64\2\u02ad\u02ab\3\2\2\2"+
		"\u02ad\u02ac\3\2\2\2\u02ae\'\3\2\2\2\u02af\u02b6\7\r\2\2\u02b0\u02b3\5"+
		"l\67\2\u02b1\u02b2\7\20\2\2\u02b2\u02b4\5j\66\2\u02b3\u02b1\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5\u02b7\t\2\2\2\u02b6\u02b0\3\2"+
		"\2\2\u02b6\u02b5\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02bb\7:\2\2\u02b9"+
		"\u02bb\7;\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02bd\7\16\2\2\u02bd)\3\2\2\2\u02be\u02c0"+
		"\5H%\2\u02bf\u02be\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c6\3\2\2\2\u02c1"+
		"\u02c7\7<\2\2\u02c2\u02c5\7!\2\2\u02c3\u02c5\7\"\2\2\u02c4\u02c2\3\2\2"+
		"\2\u02c4\u02c3\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c1\3\2\2\2\u02c6\u02c4"+
		"\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c9\7=\2\2\u02c9"+
		"\u02cb\5h\65\2\u02ca\u02cc\5> \2\u02cb\u02ca\3\2\2\2\u02cb\u02cc\3\2\2"+
		"\2\u02cc\u02cf\3\2\2\2\u02cd\u02ce\7\b\2\2\u02ce\u02d0\7\u0089\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d7\3\2\2\2\u02d1\u02d4\7\4"+
		"\2\2\u02d2\u02d5\7>\2\2\u02d3\u02d5\7?\2\2\u02d4\u02d2\3\2\2\2\u02d4\u02d3"+
		"\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\7\6\2\2\u02d7"+
		"\u02d1\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02e6\b\26"+
		"\1\2\u02da\u02db\7\4\2\2\u02db\u02e4\5\62\32\2\u02dc\u02de\5B\"\2\u02dd"+
		"\u02dc\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df\u02e0\3\2"+
		"\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e4\7\6\2\2\u02e3"+
		"\u02da\3\2\2\2\u02e3\u02df\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e7\7\25"+
		"\2\2\u02e6\u02e3\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8"+
		"\u02e9\b\26\1\2\u02e9+\3\2\2\2\u02ea\u02eb\t\3\2\2\u02eb-\3\2\2\2\u02ec"+
		"\u02ee\5H%\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\3\2\2"+
		"\2\u02ef\u02f0\7E\2\2\u02f0\u02f2\5h\65\2\u02f1\u02f3\5> \2\u02f2\u02f1"+
		"\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f5\7\b\2\2\u02f5"+
		"\u02f7\7\u0089\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02fe"+
		"\3\2\2\2\u02f8\u02fb\7\4\2\2\u02f9\u02fc\7>\2\2\u02fa\u02fc\7?\2\2\u02fb"+
		"\u02f9\3\2\2\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2"+
		"\2\2\u02fd\u02ff\7\6\2\2\u02fe\u02f8\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u030c\b\30\1\2\u0301\u0307\7\4\2\2\u0302\u0306\5"+
		"\62\32\2\u0303\u0306\5\60\31\2\u0304\u0306\5B\"\2\u0305\u0302\3\2\2\2"+
		"\u0305\u0303\3\2\2\2\u0305\u0304\3\2\2\2\u0306\u0309\3\2\2\2\u0307\u0305"+
		"\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a\3\2\2\2\u0309\u0307\3\2\2\2\u030a"+
		"\u030d\7\6\2\2\u030b\u030d\7\25\2\2\u030c\u0301\3\2\2\2\u030c\u030b\3"+
		"\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\b\30\1\2\u030f/\3\2\2\2\u0310\u0311"+
		"\7F\2\2\u0311\u0314\5h\65\2\u0312\u0314\5h\65\2\u0313\u0310\3\2\2\2\u0313"+
		"\u0312\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0316\7\27\2\2\u0316\u0318\5"+
		"n8\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0322\3\2\2\2\u0319"+
		"\u031d\7\4\2\2\u031a\u031c\5\62\32\2\u031b\u031a\3\2\2\2\u031c\u031f\3"+
		"\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u0320\u0323\7\6\2\2\u0321\u0323\7\25\2\2\u0322\u0319\3"+
		"\2\2\2\u0322\u0321\3\2\2\2\u0323\61\3\2\2\2\u0324\u0326\7G\2\2\u0325\u0327"+
		"\7\u0089\2\2\u0326\u0325\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0333\3\2\2"+
		"\2\u0328\u0329\7\21\2\2\u0329\u032e\5\64\33\2\u032a\u032b\7\5\2\2\u032b"+
		"\u032d\5\64\33\2\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3"+
		"\2\2\2\u032e\u032f\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u032e\3\2\2\2\u0331"+
		"\u0332\7\22\2\2\u0332\u0334\3\2\2\2\u0333\u0328\3\2\2\2\u0333\u0334\3"+
		"\2\2\2\u0334\u0340\3\2\2\2\u0335\u0339\7\4\2\2\u0336\u033a\5\62\32\2\u0337"+
		"\u033a\5\66\34\2\u0338\u033a\5<\37\2\u0339\u0336\3\2\2\2\u0339\u0337\3"+
		"\2\2\2\u0339\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033e\7\6\2\2\u033e\u0341\3\2"+
		"\2\2\u033f\u0341\7\25\2\2\u0340\u0335\3\2\2\2\u0340\u033f\3\2\2\2\u0341"+
		"\63\3\2\2\2\u0342\u0343\7\u0089\2\2\u0343\u0344\7\27\2\2\u0344\u0345\t"+
		"\4\2\2\u0345\65\3\2\2\2\u0346\u0349\5\62\32\2\u0347\u0349\58\35\2\u0348"+
		"\u0346\3\2\2\2\u0348\u0347\3\2\2\2\u0349\67\3\2\2\2\u034a\u034f\5:\36"+
		"\2\u034b\u034f\5\30\r\2\u034c\u034f\5\26\f\2\u034d\u034f\5\60\31\2\u034e"+
		"\u034a\3\2\2\2\u034e\u034b\3\2\2\2\u034e\u034c\3\2\2\2\u034e\u034d\3\2"+
		"\2\2\u034f9\3\2\2\2\u0350\u0354\5\"\22\2\u0351\u0354\5$\23\2\u0352\u0354"+
		"\5\34\17\2\u0353\u0350\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0352\3\2\2\2"+
		"\u0354;\3\2\2\2\u0355\u0356\7H\2\2\u0356\u0357\5f\64\2\u0357\u0358\7\25"+
		"\2\2\u0358=\3\2\2\2\u0359\u035a\7\21\2\2\u035a\u035f\5h\65\2\u035b\u035c"+
		"\7\5\2\2\u035c\u035e\5h\65\2\u035d\u035b\3\2\2\2\u035e\u0361\3\2\2\2\u035f"+
		"\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u035f\3\2"+
		"\2\2\u0362\u0363\7\22\2\2\u0363\u0370\3\2\2\2\u0364\u0365\7I\2\2\u0365"+
		"\u036a\5h\65\2\u0366\u0367\7\5\2\2\u0367\u0369\5h\65\2\u0368\u0366\3\2"+
		"\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036d\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u036e\7J\2\2\u036e\u0370\3\2"+
		"\2\2\u036f\u0359\3\2\2\2\u036f\u0364\3\2\2\2\u0370?\3\2\2\2\u0371\u0373"+
		"\7K\2\2\u0372\u0374\5h\65\2\u0373\u0372\3\2\2\2\u0373\u0374\3\2\2\2\u0374"+
		"\u037b\3\2\2\2\u0375\u0377\7\b\2\2\u0376\u0378\5P)\2\u0377\u0376\3\2\2"+
		"\2\u0377\u0378\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037c\7\25\2\2\u037a"+
		"\u037c\7\25\2\2\u037b\u0375\3\2\2\2\u037b\u037a\3\2\2\2\u037cA\3\2\2\2"+
		"\u037d\u037f\7L\2\2\u037e\u037d\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0380"+
		"\3\2\2\2\u0380\u0387\7M\2\2\u0381\u0385\5h\65\2\u0382\u0383\7\21\2\2\u0383"+
		"\u0384\7\u0088\2\2\u0384\u0386\7\22\2\2\u0385\u0382\3\2\2\2\u0385\u0386"+
		"\3\2\2\2\u0386\u0388\3\2\2\2\u0387\u0381\3\2\2\2\u0387\u0388\3\2\2\2\u0388"+
		"\u038f\3\2\2\2\u0389\u038b\7\b\2\2\u038a\u038c\5N(\2\u038b\u038a\3\2\2"+
		"\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u0390\7\25\2\2\u038e"+
		"\u0390\7\25\2\2\u038f\u0389\3\2\2\2\u038f\u038e\3\2\2\2\u0390C\3\2\2\2"+
		"\u0391\u0398\t\5\2\2\u0392\u0396\5h\65\2\u0393\u0394\7\21\2\2\u0394\u0395"+
		"\7\u0088\2\2\u0395\u0397\7\22\2\2\u0396\u0393\3\2\2\2\u0396\u0397\3\2"+
		"\2\2\u0397\u0399\3\2\2\2\u0398\u0392\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u03a0\3\2\2\2\u039a\u039c\7\b\2\2\u039b\u039d\5N(\2\u039c\u039b\3\2\2"+
		"\2\u039c\u039d\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a1\7\25\2\2\u039f"+
		"\u03a1\7\25\2\2\u03a0\u039a\3\2\2\2\u03a0\u039f\3\2\2\2\u03a1E\3\2\2\2"+
		"\u03a2\u03a9\t\6\2\2\u03a3\u03a7\5h\65\2\u03a4\u03a5\7\21\2\2\u03a5\u03a6"+
		"\7\u0088\2\2\u03a6\u03a8\7\22\2\2\u03a7\u03a4\3\2\2\2\u03a7\u03a8\3\2"+
		"\2\2\u03a8\u03aa\3\2\2\2\u03a9\u03a3\3\2\2\2\u03a9\u03aa\3\2\2\2\u03aa"+
		"\u03b1\3\2\2\2\u03ab\u03ad\7\b\2\2\u03ac\u03ae\5N(\2\u03ad\u03ac\3\2\2"+
		"\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b2\7\25\2\2\u03b0"+
		"\u03b2\7\25\2\2\u03b1\u03ab\3\2\2\2\u03b1\u03b0\3\2\2\2\u03b2G\3\2\2\2"+
		"\u03b3\u03b4\t\7\2\2\u03b4I\3\2\2\2\u03b5\u03b6\7\u0087\2\2\u03b6\u03b9"+
		"\b&\1\2\u03b7\u03b9\7\u0086\2\2\u03b8\u03b5\3\2\2\2\u03b8\u03b7\3\2\2"+
		"\2\u03b9K\3\2\2\2\u03ba\u03bb\7\u0086\2\2\u03bbM\3\2\2\2\u03bc\u03bd\b"+
		"(\1\2\u03bd\u03be\7U\2\2\u03be\u04c3\5P)\2\u03bf\u03c0\7V\2\2\u03c0\u04c3"+
		"\5P)\2\u03c1\u03c2\7W\2\2\u03c2\u04c3\5P)\2\u03c3\u03c4\7X\2\2\u03c4\u04c3"+
		"\5P)\2\u03c5\u03c7\5P)\2\u03c6\u03c8\t\b\2\2\u03c7\u03c6\3\2\2\2\u03c7"+
		"\u03c8\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\7[\2\2\u03ca\u03cb\5P)"+
		"\2\u03cb\u04c3\3\2\2\2\u03cc\u03ce\5P)\2\u03cd\u03cf\t\b\2\2\u03ce\u03cd"+
		"\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\7\27\2\2"+
		"\u03d1\u03d2\5P)\2\u03d2\u04c3\3\2\2\2\u03d3\u03d5\5R*\2\u03d4\u03d6\t"+
		"\b\2\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7"+
		"\u03d8\7\27\2\2\u03d8\u03d9\5R*\2\u03d9\u04c3\3\2\2\2\u03da\u03dc\5R*"+
		"\2\u03db\u03dd\t\b\2\2\u03dc\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de"+
		"\3\2\2\2\u03de\u03df\7I\2\2\u03df\u03e0\5R*\2\u03e0\u04c3\3\2\2\2\u03e1"+
		"\u03e3\5R*\2\u03e2\u03e4\t\b\2\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4\3\2\2"+
		"\2\u03e4\u03e5\3\2\2\2\u03e5\u03e6\7\\\2\2\u03e6\u03e7\5R*\2\u03e7\u04c3"+
		"\3\2\2\2\u03e8\u03ea\5R*\2\u03e9\u03eb\t\b\2\2\u03ea\u03e9\3\2\2\2\u03ea"+
		"\u03eb\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ed\7J\2\2\u03ed\u03ee\5R*"+
		"\2\u03ee\u04c3\3\2\2\2\u03ef\u03f1\5R*\2\u03f0\u03f2\t\b\2\2\u03f1\u03f0"+
		"\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\7]\2\2\u03f4"+
		"\u03f5\5R*\2\u03f5\u04c3\3\2\2\2\u03f6\u03f7\b(\1\2\u03f7\u03f8\7^\2\2"+
		"\u03f8\u03f9\5T+\2\u03f9\u03fa\7_\2\2\u03fa\u03fb\5R*\2\u03fb\u03fc\3"+
		"\2\2\2\u03fc\u03fd\b(\1\2\u03fd\u04c3\3\2\2\2\u03fe\u03ff\7`\2\2\u03ff"+
		"\u0400\7\r\2\2\u0400\u0401\5`\61\2\u0401\u0402\7\16\2\2\u0402\u04c3\3"+
		"\2\2\2\u0403\u0404\7a\2\2\u0404\u0405\7\r\2\2\u0405\u0406\5`\61\2\u0406"+
		"\u0407\7\b\2\2\u0407\u0408\5P)\2\u0408\u0409\7b\2\2\u0409\u040a\t\t\2"+
		"\2\u040a\u040b\5P)\2\u040b\u040c\7\16\2\2\u040c\u04c3\3\2\2\2\u040d\u040e"+
		"\7c\2\2\u040e\u040f\7\r\2\2\u040f\u0410\5`\61\2\u0410\u0411\7\5\2\2\u0411"+
		"\u0412\5`\61\2\u0412\u0413\7\5\2\2\u0413\u0414\5`\61\2\u0414\u0415\7\5"+
		"\2\2\u0415\u0416\5`\61\2\u0416\u0417\7\16\2\2\u0417\u04c3\3\2\2\2\u0418"+
		"\u0419\t\b\2\2\u0419\u04c3\5N(\20\u041a\u041b\b(\1\2\u041b\u041c\7l\2"+
		"\2\u041c\u0431\5T+\2\u041d\u0427\7_\2\2\u041e\u0428\5N(\2\u041f\u0423"+
		"\7\4\2\2\u0420\u0422\5N(\2\u0421\u0420\3\2\2\2\u0422\u0425\3\2\2\2\u0423"+
		"\u0421\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426\3\2\2\2\u0425\u0423\3\2"+
		"\2\2\u0426\u0428\7\6\2\2\u0427\u041e\3\2\2\2\u0427\u041f\3\2\2\2\u0428"+
		"\u0432\3\2\2\2\u0429\u042d\7\4\2\2\u042a\u042c\5N(\2\u042b\u042a\3\2\2"+
		"\2\u042c\u042f\3\2\2\2\u042d\u042b\3\2\2\2\u042d\u042e\3\2\2\2\u042e\u0430"+
		"\3\2\2\2\u042f\u042d\3\2\2\2\u0430\u0432\7\6\2\2\u0431\u041d\3\2\2\2\u0431"+
		"\u0429\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0434\b(\1\2\u0434\u04c3\3\2"+
		"\2\2\u0435\u0436\b(\1\2\u0436\u0437\7X\2\2\u0437\u044c\5T+\2\u0438\u0442"+
		"\7_\2\2\u0439\u0443\5N(\2\u043a\u043e\7\4\2\2\u043b\u043d\5N(\2\u043c"+
		"\u043b\3\2\2\2\u043d\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2"+
		"\2\2\u043f\u0441\3\2\2\2\u0440\u043e\3\2\2\2\u0441\u0443\7\6\2\2\u0442"+
		"\u0439\3\2\2\2\u0442\u043a\3\2\2\2\u0443\u044d\3\2\2\2\u0444\u0448\7\4"+
		"\2\2\u0445\u0447\5N(\2\u0446\u0445\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446"+
		"\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044b\3\2\2\2\u044a\u0448\3\2\2\2\u044b"+
		"\u044d\7\6\2\2\u044c\u0438\3\2\2\2\u044c\u0444\3\2\2\2\u044d\u044e\3\2"+
		"\2\2\u044e\u044f\b(\1\2\u044f\u04c3\3\2\2\2\u0450\u0451\b(\1\2\u0451\u0452"+
		"\7U\2\2\u0452\u0467\5T+\2\u0453\u045d\7_\2\2\u0454\u045e\5N(\2\u0455\u0459"+
		"\7\4\2\2\u0456\u0458\5N(\2\u0457\u0456\3\2\2\2\u0458\u045b\3\2\2\2\u0459"+
		"\u0457\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c\3\2\2\2\u045b\u0459\3\2"+
		"\2\2\u045c\u045e\7\6\2\2\u045d\u0454\3\2\2\2\u045d\u0455\3\2\2\2\u045e"+
		"\u0468\3\2\2\2\u045f\u0463\7\4\2\2\u0460\u0462\5N(\2\u0461\u0460\3\2\2"+
		"\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0466"+
		"\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0468\7\6\2\2\u0467\u0453\3\2\2\2\u0467"+
		"\u045f\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046a\b(\1\2\u046a\u04c3\3\2"+
		"\2\2\u046b\u046c\b(\1\2\u046c\u046d\7W\2\2\u046d\u0482\5T+\2\u046e\u0478"+
		"\7_\2\2\u046f\u0479\5N(\2\u0470\u0474\7\4\2\2\u0471\u0473\5N(\2\u0472"+
		"\u0471\3\2\2\2\u0473\u0476\3\2\2\2\u0474\u0472\3\2\2\2\u0474\u0475\3\2"+
		"\2\2\u0475\u0477\3\2\2\2\u0476\u0474\3\2\2\2\u0477\u0479\7\6\2\2\u0478"+
		"\u046f\3\2\2\2\u0478\u0470\3\2\2\2\u0479\u0483\3\2\2\2\u047a\u047e\7\4"+
		"\2\2\u047b\u047d\5N(\2\u047c\u047b\3\2\2\2\u047d\u0480\3\2\2\2\u047e\u047c"+
		"\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\3\2\2\2\u0480\u047e\3\2\2\2\u0481"+
		"\u0483\7\6\2\2\u0482\u046e\3\2\2\2\u0482\u047a\3\2\2\2\u0483\u0484\3\2"+
		"\2\2\u0484\u0485\b(\1\2\u0485\u04c3\3\2\2\2\u0486\u0487\b(\1\2\u0487\u0488"+
		"\7V\2\2\u0488\u049d\5T+\2\u0489\u0493\7_\2\2\u048a\u0494\5N(\2\u048b\u048f"+
		"\7\4\2\2\u048c\u048e\5N(\2\u048d\u048c\3\2\2\2\u048e\u0491\3\2\2\2\u048f"+
		"\u048d\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0492\3\2\2\2\u0491\u048f\3\2"+
		"\2\2\u0492\u0494\7\6\2\2\u0493\u048a\3\2\2\2\u0493\u048b\3\2\2\2\u0494"+
		"\u049e\3\2\2\2\u0495\u0499\7\4\2\2\u0496\u0498\5N(\2\u0497\u0496\3\2\2"+
		"\2\u0498\u049b\3\2\2\2\u0499\u0497\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c"+
		"\3\2\2\2\u049b\u0499\3\2\2\2\u049c\u049e\7\6\2\2\u049d\u0489\3\2\2\2\u049d"+
		"\u0495\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\b(\1\2\u04a0\u04c3\3\2"+
		"\2\2\u04a1\u04a2\b(\1\2\u04a2\u04a3\7m\2\2\u04a3\u04b8\5X-\2\u04a4\u04ae"+
		"\7_\2\2\u04a5\u04af\5N(\2\u04a6\u04aa\7\4\2\2\u04a7\u04a9\5N(\2\u04a8"+
		"\u04a7\3\2\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa\u04ab\3\2"+
		"\2\2\u04ab\u04ad\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04af\7\6\2\2\u04ae"+
		"\u04a5\3\2\2\2\u04ae\u04a6\3\2\2\2\u04af\u04b9\3\2\2\2\u04b0\u04b4\7\4"+
		"\2\2\u04b1\u04b3\5N(\2\u04b2\u04b1\3\2\2\2\u04b3\u04b6\3\2\2\2\u04b4\u04b2"+
		"\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b7\3\2\2\2\u04b6\u04b4\3\2\2\2\u04b7"+
		"\u04b9\7\6\2\2\u04b8\u04a4\3\2\2\2\u04b8\u04b0\3\2\2\2\u04b9\u04ba\3\2"+
		"\2\2\u04ba\u04bb\b(\1\2\u04bb\u04c3\3\2\2\2\u04bc\u04c3\7n\2\2\u04bd\u04c3"+
		"\7o\2\2\u04be\u04bf\7\21\2\2\u04bf\u04c0\5N(\2\u04c0\u04c1\7\22\2\2\u04c1"+
		"\u04c3\3\2\2\2\u04c2\u03bc\3\2\2\2\u04c2\u03bf\3\2\2\2\u04c2\u03c1\3\2"+
		"\2\2\u04c2\u03c3\3\2\2\2\u04c2\u03c5\3\2\2\2\u04c2\u03cc\3\2\2\2\u04c2"+
		"\u03d3\3\2\2\2\u04c2\u03da\3\2\2\2\u04c2\u03e1\3\2\2\2\u04c2\u03e8\3\2"+
		"\2\2\u04c2\u03ef\3\2\2\2\u04c2\u03f6\3\2\2\2\u04c2\u03fe\3\2\2\2\u04c2"+
		"\u0403\3\2\2\2\u04c2\u040d\3\2\2\2\u04c2\u0418\3\2\2\2\u04c2\u041a\3\2"+
		"\2\2\u04c2\u0435\3\2\2\2\u04c2\u0450\3\2\2\2\u04c2\u046b\3\2\2\2\u04c2"+
		"\u0486\3\2\2\2\u04c2\u04a1\3\2\2\2\u04c2\u04bc\3\2\2\2\u04c2\u04bd\3\2"+
		"\2\2\u04c2\u04be\3\2\2\2\u04c3\u04d2\3\2\2\2\u04c4\u04c5\f\17\2\2\u04c5"+
		"\u04c6\t\n\2\2\u04c6\u04d1\5N(\17\u04c7\u04c8\f\16\2\2\u04c8\u04c9\t\13"+
		"\2\2\u04c9\u04d1\5N(\16\u04ca\u04cb\f\r\2\2\u04cb\u04cc\t\f\2\2\u04cc"+
		"\u04d1\5N(\r\u04cd\u04ce\f\f\2\2\u04ce\u04cf\t\r\2\2\u04cf\u04d1\5N(\f"+
		"\u04d0\u04c4\3\2\2\2\u04d0\u04c7\3\2\2\2\u04d0\u04ca\3\2\2\2\u04d0\u04cd"+
		"\3\2\2\2\u04d1\u04d4\3\2\2\2\u04d2\u04d0\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3"+
		"O\3\2\2\2\u04d4\u04d2\3\2\2\2\u04d5\u04d6\b)\1\2\u04d6\u04d7\7p\2\2\u04d7"+
		"\u04fb\5P)\25\u04d8\u04d9\7q\2\2\u04d9\u04fb\5P)\24\u04da\u04db\7\67\2"+
		"\2\u04db\u04fb\5P)\23\u04dc\u04dd\b)\1\2\u04dd\u04de\7\4\2\2\u04de\u04df"+
		"\5\\/\2\u04df\u04e0\7_\2\2\u04e0\u04e1\5N(\2\u04e1\u04e2\7\6\2\2\u04e2"+
		"\u04e3\3\2\2\2\u04e3\u04e4\b)\1\2\u04e4\u04fb\3\2\2\2\u04e5\u04e6\t\f"+
		"\2\2\u04e6\u04e7\5N(\2\u04e7\u04e8\7w\2\2\u04e8\u04e9\5P)\2\u04e9\u04ea"+
		"\7x\2\2\u04ea\u04eb\5P)\n\u04eb\u04fb\3\2\2\2\u04ec\u04fb\7y\2\2\u04ed"+
		"\u04fb\7z\2\2\u04ee\u04fb\7{\2\2\u04ef\u04fb\7|\2\2\u04f0\u04f1\7\21\2"+
		"\2\u04f1\u04f2\5P)\2\u04f2\u04f3\7\22\2\2\u04f3\u04fb\3\2\2\2\u04f4\u04f5"+
		"\6)\6\2\u04f5\u04f6\5b\62\2\u04f6\u04f7\b)\1\2\u04f7\u04fb\3\2\2\2\u04f8"+
		"\u04f9\6)\7\2\u04f9\u04fb\5`\61\2\u04fa\u04d5\3\2\2\2\u04fa\u04d8\3\2"+
		"\2\2\u04fa\u04da\3\2\2\2\u04fa\u04dc\3\2\2\2\u04fa\u04e5\3\2\2\2\u04fa"+
		"\u04ec\3\2\2\2\u04fa\u04ed\3\2\2\2\u04fa\u04ee\3\2\2\2\u04fa\u04ef\3\2"+
		"\2\2\u04fa\u04f0\3\2\2\2\u04fa\u04f4\3\2\2\2\u04fa\u04f8\3\2\2\2\u04fb"+
		"\u051b\3\2\2\2\u04fc\u04fd\f\22\2\2\u04fd\u04fe\78\2\2\u04fe\u051a\5P"+
		")\23\u04ff\u0500\f\21\2\2\u0500\u0501\7r\2\2\u0501\u051a\5P)\22\u0502"+
		"\u0503\f\20\2\2\u0503\u0504\7s\2\2\u0504\u051a\5P)\21\u0505\u0506\f\17"+
		"\2\2\u0506\u0507\7t\2\2\u0507\u051a\5P)\20\u0508\u050a\f\r\2\2\u0509\u050b"+
		"\t\16\2\2\u050a\u0509\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u050c\3\2\2\2"+
		"\u050c\u050e\7b\2\2\u050d\u050f\t\16\2\2\u050e\u050d\3\2\2\2\u050e\u050f"+
		"\3\2\2\2\u050f\u0510\3\2\2\2\u0510\u051a\5P)\r\u0511\u0512\f\f\2\2\u0512"+
		"\u0513\7v\2\2\u0513\u051a\5P)\r\u0514\u0515\f\16\2\2\u0515\u0516\7\r\2"+
		"\2\u0516\u0517\5P)\2\u0517\u0518\7\16\2\2\u0518\u051a\3\2\2\2\u0519\u04fc"+
		"\3\2\2\2\u0519\u04ff\3\2\2\2\u0519\u0502\3\2\2\2\u0519\u0505\3\2\2\2\u0519"+
		"\u0508\3\2\2\2\u0519\u0511\3\2\2\2\u0519\u0514\3\2\2\2\u051a\u051d\3\2"+
		"\2\2\u051b\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051cQ\3\2\2\2\u051d\u051b"+
		"\3\2\2\2\u051e\u051f\b*\1\2\u051f\u0520\t\f\2\2\u0520\u0521\5N(\2\u0521"+
		"\u0522\7w\2\2\u0522\u0523\5R*\2\u0523\u0524\7x\2\2\u0524\u0525\5R*\f\u0525"+
		"\u0533\3\2\2\2\u0526\u0527\7^\2\2\u0527\u0533\5P)\2\u0528\u0529\7\60\2"+
		"\2\u0529\u0533\5P)\2\u052a\u052c\7s\2\2\u052b\u052a\3\2\2\2\u052b\u052c"+
		"\3\2\2\2\u052c\u052d\3\2\2\2\u052d\u0533\5d\63\2\u052e\u052f\7\21\2\2"+
		"\u052f\u0530\5R*\2\u0530\u0531\7\22\2\2\u0531\u0533\3\2\2\2\u0532\u051e"+
		"\3\2\2\2\u0532\u0526\3\2\2\2\u0532\u0528\3\2\2\2\u0532\u052b\3\2\2\2\u0532"+
		"\u052e\3\2\2\2\u0533\u0545\3\2\2\2\u0534\u0535\f\t\2\2\u0535\u0536\t\17"+
		"\2\2\u0536\u0544\5R*\n\u0537\u0538\f\b\2\2\u0538\u0539\t\20\2\2\u0539"+
		"\u0544\5R*\t\u053a\u053b\f\7\2\2\u053b\u053c\t\21\2\2\u053c\u0544\5R*"+
		"\b\u053d\u053e\f\6\2\2\u053e\u053f\t\22\2\2\u053f\u0544\5R*\7\u0540\u0541"+
		"\f\5\2\2\u0541\u0542\t\23\2\2\u0542\u0544\5R*\6\u0543\u0534\3\2\2\2\u0543"+
		"\u0537\3\2\2\2\u0543\u053a\3\2\2\2\u0543\u053d\3\2\2\2\u0543\u0540\3\2"+
		"\2\2\u0544\u0547\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546"+
		"S\3\2\2\2\u0547\u0545\3\2\2\2\u0548\u054d\5V,\2\u0549\u054a\7\5\2\2\u054a"+
		"\u054c\5V,\2\u054b\u0549\3\2\2\2\u054c\u054f\3\2\2\2\u054d\u054b\3\2\2"+
		"\2\u054d\u054e\3\2\2\2\u054eU\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u0552"+
		"\7\u0084\2\2\u0551\u0550\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0553\3\2\2"+
		"\2\u0553\u0558\5b\62\2\u0554\u0555\7\5\2\2\u0555\u0557\5b\62\2\u0556\u0554"+
		"\3\2\2\2\u0557\u055a\3\2\2\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559"+
		"\u055b\3\2\2\2\u055a\u0558\3\2\2\2\u055b\u055d\7\b\2\2\u055c\u055e\7W"+
		"\2\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f"+
		"\u0560\5P)\2\u0560\u0561\b,\1\2\u0561\u0593\3\2\2\2\u0562\u0564\7\u0084"+
		"\2\2\u0563\u0562\3\2\2\2\u0563\u0564\3\2\2\2\u0564\u0565\3\2\2\2\u0565"+
		"\u056a\5b\62\2\u0566\u0567\7\5\2\2\u0567\u0569\5b\62\2\u0568\u0566\3\2"+
		"\2\2\u0569\u056c\3\2\2\2\u056a\u0568\3\2\2\2\u056a\u056b\3\2\2\2\u056b"+
		"\u056d\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u056e\7\b\2\2\u056e\u056f\7V"+
		"\2\2\u056f\u0570\5P)\2\u0570\u0571\b,\1\2\u0571\u0593\3\2\2\2\u0572\u0574"+
		"\7\u0084\2\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0575\3\2\2"+
		"\2\u0575\u057a\5b\62\2\u0576\u0577\7\5\2\2\u0577\u0579\5b\62\2\u0578\u0576"+
		"\3\2\2\2\u0579\u057c\3\2\2\2\u057a\u0578\3\2\2\2\u057a\u057b\3\2\2\2\u057b"+
		"\u057d\3\2\2\2\u057c\u057a\3\2\2\2\u057d\u057e\7\b\2\2\u057e\u057f\7X"+
		"\2\2\u057f\u0580\5P)\2\u0580\u0581\b,\1\2\u0581\u0593\3\2\2\2\u0582\u0584"+
		"\7\u0084\2\2\u0583\u0582\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u0585\3\2\2"+
		"\2\u0585\u058a\5b\62\2\u0586\u0587\7\5\2\2\u0587\u0589\5b\62\2\u0588\u0586"+
		"\3\2\2\2\u0589\u058c\3\2\2\2\u058a\u0588\3\2\2\2\u058a\u058b\3\2\2\2\u058b"+
		"\u058d\3\2\2\2\u058c\u058a\3\2\2\2\u058d\u058e\7\b\2\2\u058e\u058f\7u"+
		"\2\2\u058f\u0590\5P)\2\u0590\u0591\b,\1\2\u0591\u0593\3\2\2\2\u0592\u0551"+
		"\3\2\2\2\u0592\u0563\3\2\2\2\u0592\u0573\3\2\2\2\u0592\u0583\3\2\2\2\u0593"+
		"W\3\2\2\2\u0594\u0599\5Z.\2\u0595\u0596\7\5\2\2\u0596\u0598\5Z.\2\u0597"+
		"\u0595\3\2\2\2\u0598\u059b\3\2\2\2\u0599\u0597\3\2\2\2\u0599\u059a\3\2"+
		"\2\2\u059aY\3\2\2\2\u059b\u0599\3\2\2\2\u059c\u05a1\5b\62\2\u059d\u059e"+
		"\7\5\2\2\u059e\u05a0\5b\62\2\u059f\u059d\3\2\2\2\u05a0\u05a3\3\2\2\2\u05a1"+
		"\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a1\3\2"+
		"\2\2\u05a4\u05a5\7\27\2\2\u05a5\u05a6\5P)\2\u05a6\u05a7\3\2\2\2\u05a7"+
		"\u05a8\b.\1\2\u05a8[\3\2\2\2\u05a9\u05ae\5^\60\2\u05aa\u05ab\7\5\2\2\u05ab"+
		"\u05ad\5^\60\2\u05ac\u05aa\3\2\2\2\u05ad\u05b0\3\2\2\2\u05ae\u05ac\3\2"+
		"\2\2\u05ae\u05af\3\2\2\2\u05af]\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b1\u05b3"+
		"\7\u0084\2\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3\2\2\2\u05b3\u05b4\3\2\2"+
		"\2\u05b4\u05b9\5b\62\2\u05b5\u05b6\7\5\2\2\u05b6\u05b8\5b\62\2\u05b7\u05b5"+
		"\3\2\2\2\u05b8\u05bb\3\2\2\2\u05b9\u05b7\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba"+
		"\u05bc\3\2\2\2\u05bb\u05b9\3\2\2\2\u05bc\u05be\7\b\2\2\u05bd\u05bf\7W"+
		"\2\2\u05be\u05bd\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0"+
		"\u05c1\5P)\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\b\60\1\2\u05c3_\3\2\2\2\u05c4"+
		"\u05c5\7\u0087\2\2\u05c5a\3\2\2\2\u05c6\u05c7\7\u0087\2\2\u05c7c\3\2\2"+
		"\2\u05c8\u05c9\7\u0086\2\2\u05c9e\3\2\2\2\u05ca\u05da\5h\65\2\u05cb\u05cc"+
		"\7t\2\2\u05cc\u05ce\5h\65\2\u05cd\u05cb\3\2\2\2\u05ce\u05d1\3\2\2\2\u05cf"+
		"\u05cd\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d8\3\2\2\2\u05d1\u05cf\3\2"+
		"\2\2\u05d2\u05d3\7t\2\2\u05d3\u05d9\5h\65\2\u05d4\u05d5\7\u0085\2\2\u05d5"+
		"\u05d9\5h\65\2\u05d6\u05d7\7b\2\2\u05d7\u05d9\5h\65\2\u05d8\u05d2\3\2"+
		"\2\2\u05d8\u05d4\3\2\2\2\u05d8\u05d6\3\2\2\2\u05d9\u05db\3\2\2\2\u05da"+
		"\u05cf\3\2\2\2\u05da\u05db\3\2\2\2\u05dbg\3\2\2\2\u05dc\u05dd\7\u0087"+
		"\2\2\u05ddi\3\2\2\2\u05de\u05df\t\24\2\2\u05dfk\3\2\2\2\u05e0\u05e1\7"+
		"\u0086\2\2\u05e1m\3\2\2\2\u05e2\u05e4\7s\2\2\u05e3\u05e2\3\2\2\2\u05e3"+
		"\u05e4\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\7\u0086\2\2\u05e6o\3\2"+
		"\2\2\u00e4qz\u0087\u0098\u00a1\u00ac\u00b1\u00ba\u00c2\u00c6\u00cc\u00d8"+
		"\u00db\u00e4\u00e7\u00f6\u00fe\u0109\u010e\u0111\u0115\u011a\u0120\u0129"+
		"\u012f\u013f\u0141\u0146\u014d\u0150\u0153\u0157\u0160\u0163\u0167\u016f"+
		"\u0171\u0176\u017c\u017f\u0182\u0186\u0189\u018c\u0190\u0193\u0199\u019e"+
		"\u01a0\u01ab\u01ae\u01b2\u01b5\u01bb\u01bf\u01c4\u01c8\u01cb\u01cd\u01d2"+
		"\u01d7\u01da\u01de\u01e1\u01e4\u01e8\u01eb\u01f1\u01f6\u01f8\u01fc\u0209"+
		"\u020c\u0210\u0213\u021d\u0224\u0228\u022d\u0231\u0234\u0236\u023b\u0240"+
		"\u0243\u024d\u0250\u0256\u0258\u0260\u0263\u026a\u026d\u0271\u0274\u027b"+
		"\u027d\u0282\u0286\u028c\u028e\u0295\u0298\u029c\u029f\u02a5\u02a9\u02ad"+
		"\u02b3\u02b6\u02ba\u02bf\u02c4\u02c6\u02cb\u02cf\u02d4\u02d7\u02df\u02e3"+
		"\u02e6\u02ed\u02f2\u02f6\u02fb\u02fe\u0305\u0307\u030c\u0313\u0317\u031d"+
		"\u0322\u0326\u032e\u0333\u0339\u033b\u0340\u0348\u034e\u0353\u035f\u036a"+
		"\u036f\u0373\u0377\u037b\u037e\u0385\u0387\u038b\u038f\u0396\u0398\u039c"+
		"\u03a0\u03a7\u03a9\u03ad\u03b1\u03b8\u03c7\u03ce\u03d5\u03dc\u03e3\u03ea"+
		"\u03f1\u0423\u0427\u042d\u0431\u043e\u0442\u0448\u044c\u0459\u045d\u0463"+
		"\u0467\u0474\u0478\u047e\u0482\u048f\u0493\u0499\u049d\u04aa\u04ae\u04b4"+
		"\u04b8\u04c2\u04d0\u04d2\u04fa\u050a\u050e\u0519\u051b\u052b\u0532\u0543"+
		"\u0545\u054d\u0551\u0558\u055d\u0563\u056a\u0573\u057a\u0583\u058a\u0592"+
		"\u0599\u05a1\u05ae\u05b2\u05b9\u05be\u05cf\u05d8\u05da\u05e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}