// Generated from /home/ferhat/IdeaProjects/eu.modelwriter.core.alloyinecore/src/eu/modelwriter/core/alloyinecore/recognizer/AlloyInEcore.g4 by ANTLR 4.6
package eu.modelwriter.core.alloyinecore.recognizer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlloyInEcoreLexer extends Lexer {
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
		T__131=132, INT=133, IDENTIFIER=134, DOUBLE_QUOTED_STRING=135, SINGLE_QUOTED_STRING=136, 
		ML_SINGLE_QUOTED_STRING=137, MULTILINE_COMMENT=138, SINGLELINE_COMMENT=139, 
		WS=140;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "T__50", "T__51", "T__52", "T__53", "T__54", "T__55", "T__56", 
		"T__57", "T__58", "T__59", "T__60", "T__61", "T__62", "T__63", "T__64", 
		"T__65", "T__66", "T__67", "T__68", "T__69", "T__70", "T__71", "T__72", 
		"T__73", "T__74", "T__75", "T__76", "T__77", "T__78", "T__79", "T__80", 
		"T__81", "T__82", "T__83", "T__84", "T__85", "T__86", "T__87", "T__88", 
		"T__89", "T__90", "T__91", "T__92", "T__93", "T__94", "T__95", "T__96", 
		"T__97", "T__98", "T__99", "T__100", "T__101", "T__102", "T__103", "T__104", 
		"T__105", "T__106", "T__107", "T__108", "T__109", "T__110", "T__111", 
		"T__112", "T__113", "T__114", "T__115", "T__116", "T__117", "T__118", 
		"T__119", "T__120", "T__121", "T__122", "T__123", "T__124", "T__125", 
		"T__126", "T__127", "T__128", "T__129", "T__130", "T__131", "INT", "IDENTIFIER", 
		"DOUBLE_QUOTED_STRING", "SINGLE_QUOTED_STRING", "LETTER", "DIGIT", "ESCAPED_CHARACTER", 
		"UNDERSCORE", "APOSTROPHE", "DOLLAR", "ML_SINGLE_QUOTED_STRING", "MULTILINE_COMMENT", 
		"SINGLELINE_COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'options'", "'{'", "','", "'}'", "'symmetry_breaking'", "':'", 
		"'bit_width'", "'skolem_depth'", "'sharing'", "'universe'", "'['", "']'", 
		"'relations'", "'..'", "'('", "')'", "'module'", "'import'", "';'", "'package'", 
		"'='", "'abstract'", "'class'", "'interface'", "'extends'", "'static'", 
		"'model'", "'ghost'", "'transient'", "'volatile'", "'nullable'", "'!nullable'", 
		"'readonly'", "'attribute'", "'derived'", "'id'", "'ordered'", "'!ordered'", 
		"'unique'", "'!unique'", "'unsettable'", "'!unsettable'", "'property'", 
		"'#'", "'composes'", "'resolve'", "'!resolve'", "'key'", "'operation'", 
		"'throws'", "'*'", "'+'", "'?'", "'|?'", "'|1'", "'primitive'", "'datatype'", 
		"'serializable'", "'!serializable'", "'Boolean'", "'Integer'", "'String'", 
		"'Real'", "'UnlimitedNatural'", "'enum'", "'literal'", "'annotation'", 
		"'reference'", "'<'", "'>'", "'body'", "'callable'", "'invariant'", "'precondition'", 
		"'requires'", "'postcondition'", "'ensures'", "'initial'", "'derivation'", 
		"'public'", "'protected'", "'private'", "'no'", "'lone'", "'one'", "'some'", 
		"'!'", "'not'", "'in'", "'<='", "'>='", "'sum'", "'|'", "'acyclic'", "'function'", 
		"'->'", "'ord'", "'&&'", "'and'", "'||'", "'or'", "'=>'", "'if'", "'<=>'", 
		"'iff'", "'all'", "'let'", "'true'", "'false'", "'~'", "'^'", "'&'", "'-'", 
		"'.'", "'set'", "'++'", "'then'", "'else'", "'iden'", "'none'", "'univ'", 
		"'ints'", "'plus'", "'minus'", "'mul'", "'/'", "'div'", "'%'", "'modulo'", 
		"'disj'", "'definition'", "'::'"
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
		null, "INT", "IDENTIFIER", "DOUBLE_QUOTED_STRING", "SINGLE_QUOTED_STRING", 
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


	public AlloyInEcoreLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlloyInEcore.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\u008e\u04b6\b\1\4"+
		"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n"+
		"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t"+
		"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_"+
		"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k"+
		"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv"+
		"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t"+
		"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084"+
		"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089"+
		"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d"+
		"\4\u008e\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092"+
		"\t\u0092\4\u0093\t\u0093\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\3"+
		"9\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3"+
		"=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3?\3"+
		"@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3"+
		"B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3D\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\3M\3M\3"+
		"M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3O\3O\3O\3O\3P\3P\3"+
		"P\3P\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3R\3R\3"+
		"R\3R\3R\3S\3S\3S\3S\3S\3S\3S\3S\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3"+
		"W\3W\3W\3W\3W\3X\3X\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3]\3]\3"+
		"]\3]\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3`\3`\3a\3a\3"+
		"a\3b\3b\3b\3b\3c\3c\3c\3d\3d\3d\3d\3e\3e\3e\3f\3f\3f\3g\3g\3g\3h\3h\3"+
		"h\3i\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\3k\3l\3l\3l\3l\3m\3m\3m\3m\3m\3n\3"+
		"n\3n\3n\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3t\3t\3u\3u\3u\3v\3"+
		"v\3v\3v\3v\3w\3w\3w\3w\3w\3x\3x\3x\3x\3x\3y\3y\3y\3y\3y\3z\3z\3z\3z\3"+
		"z\3{\3{\3{\3{\3{\3|\3|\3|\3|\3|\3}\3}\3}\3}\3}\3}\3~\3~\3~\3~\3\177\3"+
		"\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3"+
		"\u0082\3\u0082\3\u0082\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0083"+
		"\3\u0083\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0084"+
		"\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\3\u0086\6\u0086\u0454"+
		"\n\u0086\r\u0086\16\u0086\u0455\3\u0087\3\u0087\5\u0087\u045a\n\u0087"+
		"\3\u0087\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u0461\n\u0087\f\u0087"+
		"\16\u0087\u0464\13\u0087\3\u0088\3\u0088\3\u0088\7\u0088\u0469\n\u0088"+
		"\f\u0088\16\u0088\u046c\13\u0088\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089"+
		"\7\u0089\u0473\n\u0089\f\u0089\16\u0089\u0476\13\u0089\3\u0089\3\u0089"+
		"\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c\3\u008c\3\u008d\3\u008d"+
		"\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\7\u0090\u0489\n\u0090"+
		"\f\u0090\16\u0090\u048c\13\u0090\3\u0090\3\u0090\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0091\3\u0091\7\u0091\u0496\n\u0091\f\u0091\16\u0091\u0499"+
		"\13\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3\u0092"+
		"\3\u0092\7\u0092\u04a4\n\u0092\f\u0092\16\u0092\u04a7\13\u0092\3\u0092"+
		"\5\u0092\u04aa\n\u0092\3\u0092\3\u0092\3\u0092\3\u0092\3\u0093\6\u0093"+
		"\u04b1\n\u0093\r\u0093\16\u0093\u04b2\3\u0093\3\u0093\5\u048a\u0497\u04a5"+
		"\2\u0094\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66"+
		"k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG"+
		"\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3"+
		"[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7"+
		"e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9n\u00db"+
		"o\u00ddp\u00dfq\u00e1r\u00e3s\u00e5t\u00e7u\u00e9v\u00ebw\u00edx\u00ef"+
		"y\u00f1z\u00f3{\u00f5|\u00f7}\u00f9~\u00fb\177\u00fd\u0080\u00ff\u0081"+
		"\u0101\u0082\u0103\u0083\u0105\u0084\u0107\u0085\u0109\u0086\u010b\u0087"+
		"\u010d\u0088\u010f\u0089\u0111\u008a\u0113\2\u0115\2\u0117\2\u0119\2\u011b"+
		"\2\u011d\2\u011f\u008b\u0121\u008c\u0123\u008d\u0125\u008e\3\2\b\4\2$"+
		"$^^\4\2))^^\4\2C\\c|\3\2\62;\n\2$$))^^ddhhppttvw\5\2\f\f\17\17\"\"\u04bf"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df"+
		"\3\2\2\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2"+
		"\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1"+
		"\3\2\2\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2"+
		"\2\2\u00fb\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103"+
		"\3\2\2\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0109\3\2\2\2\2\u010b\3\2\2"+
		"\2\2\u010d\3\2\2\2\2\u010f\3\2\2\2\2\u0111\3\2\2\2\2\u011f\3\2\2\2\2\u0121"+
		"\3\2\2\2\2\u0123\3\2\2\2\2\u0125\3\2\2\2\3\u0127\3\2\2\2\5\u012f\3\2\2"+
		"\2\7\u0131\3\2\2\2\t\u0133\3\2\2\2\13\u0135\3\2\2\2\r\u0147\3\2\2\2\17"+
		"\u0149\3\2\2\2\21\u0153\3\2\2\2\23\u0160\3\2\2\2\25\u0168\3\2\2\2\27\u0171"+
		"\3\2\2\2\31\u0173\3\2\2\2\33\u0175\3\2\2\2\35\u017f\3\2\2\2\37\u0182\3"+
		"\2\2\2!\u0184\3\2\2\2#\u0186\3\2\2\2%\u018d\3\2\2\2\'\u0194\3\2\2\2)\u0196"+
		"\3\2\2\2+\u019e\3\2\2\2-\u01a0\3\2\2\2/\u01a9\3\2\2\2\61\u01af\3\2\2\2"+
		"\63\u01b9\3\2\2\2\65\u01c1\3\2\2\2\67\u01c8\3\2\2\29\u01ce\3\2\2\2;\u01d4"+
		"\3\2\2\2=\u01de\3\2\2\2?\u01e7\3\2\2\2A\u01f0\3\2\2\2C\u01fa\3\2\2\2E"+
		"\u0203\3\2\2\2G\u020d\3\2\2\2I\u0215\3\2\2\2K\u0218\3\2\2\2M\u0220\3\2"+
		"\2\2O\u0229\3\2\2\2Q\u0230\3\2\2\2S\u0238\3\2\2\2U\u0243\3\2\2\2W\u024f"+
		"\3\2\2\2Y\u0258\3\2\2\2[\u025a\3\2\2\2]\u0263\3\2\2\2_\u026b\3\2\2\2a"+
		"\u0274\3\2\2\2c\u0278\3\2\2\2e\u0282\3\2\2\2g\u0289\3\2\2\2i\u028b\3\2"+
		"\2\2k\u028d\3\2\2\2m\u028f\3\2\2\2o\u0292\3\2\2\2q\u0295\3\2\2\2s\u029f"+
		"\3\2\2\2u\u02a8\3\2\2\2w\u02b5\3\2\2\2y\u02c3\3\2\2\2{\u02cb\3\2\2\2}"+
		"\u02d3\3\2\2\2\177\u02da\3\2\2\2\u0081\u02df\3\2\2\2\u0083\u02f0\3\2\2"+
		"\2\u0085\u02f5\3\2\2\2\u0087\u02fd\3\2\2\2\u0089\u0308\3\2\2\2\u008b\u0312"+
		"\3\2\2\2\u008d\u0314\3\2\2\2\u008f\u0316\3\2\2\2\u0091\u031b\3\2\2\2\u0093"+
		"\u0324\3\2\2\2\u0095\u032e\3\2\2\2\u0097\u033b\3\2\2\2\u0099\u0344\3\2"+
		"\2\2\u009b\u0352\3\2\2\2\u009d\u035a\3\2\2\2\u009f\u0362\3\2\2\2\u00a1"+
		"\u036d\3\2\2\2\u00a3\u0374\3\2\2\2\u00a5\u037e\3\2\2\2\u00a7\u0386\3\2"+
		"\2\2\u00a9\u0389\3\2\2\2\u00ab\u038e\3\2\2\2\u00ad\u0392\3\2\2\2\u00af"+
		"\u0397\3\2\2\2\u00b1\u0399\3\2\2\2\u00b3\u039d\3\2\2\2\u00b5\u03a0\3\2"+
		"\2\2\u00b7\u03a3\3\2\2\2\u00b9\u03a6\3\2\2\2\u00bb\u03aa\3\2\2\2\u00bd"+
		"\u03ac\3\2\2\2\u00bf\u03b4\3\2\2\2\u00c1\u03bd\3\2\2\2\u00c3\u03c0\3\2"+
		"\2\2\u00c5\u03c4\3\2\2\2\u00c7\u03c7\3\2\2\2\u00c9\u03cb\3\2\2\2\u00cb"+
		"\u03ce\3\2\2\2\u00cd\u03d1\3\2\2\2\u00cf\u03d4\3\2\2\2\u00d1\u03d7\3\2"+
		"\2\2\u00d3\u03db\3\2\2\2\u00d5\u03df\3\2\2\2\u00d7\u03e3\3\2\2\2\u00d9"+
		"\u03e7\3\2\2\2\u00db\u03ec\3\2\2\2\u00dd\u03f2\3\2\2\2\u00df\u03f4\3\2"+
		"\2\2\u00e1\u03f6\3\2\2\2\u00e3\u03f8\3\2\2\2\u00e5\u03fa\3\2\2\2\u00e7"+
		"\u03fc\3\2\2\2\u00e9\u0400\3\2\2\2\u00eb\u0403\3\2\2\2\u00ed\u0408\3\2"+
		"\2\2\u00ef\u040d\3\2\2\2\u00f1\u0412\3\2\2\2\u00f3\u0417\3\2\2\2\u00f5"+
		"\u041c\3\2\2\2\u00f7\u0421\3\2\2\2\u00f9\u0426\3\2\2\2\u00fb\u042c\3\2"+
		"\2\2\u00fd\u0430\3\2\2\2\u00ff\u0432\3\2\2\2\u0101\u0436\3\2\2\2\u0103"+
		"\u0438\3\2\2\2\u0105\u043f\3\2\2\2\u0107\u0444\3\2\2\2\u0109\u044f\3\2"+
		"\2\2\u010b\u0453\3\2\2\2\u010d\u0459\3\2\2\2\u010f\u0465\3\2\2\2\u0111"+
		"\u046f\3\2\2\2\u0113\u0479\3\2\2\2\u0115\u047b\3\2\2\2\u0117\u047d\3\2"+
		"\2\2\u0119\u0480\3\2\2\2\u011b\u0482\3\2\2\2\u011d\u0484\3\2\2\2\u011f"+
		"\u0486\3\2\2\2\u0121\u0491\3\2\2\2\u0123\u049f\3\2\2\2\u0125\u04b0\3\2"+
		"\2\2\u0127\u0128\7q\2\2\u0128\u0129\7r\2\2\u0129\u012a\7v\2\2\u012a\u012b"+
		"\7k\2\2\u012b\u012c\7q\2\2\u012c\u012d\7p\2\2\u012d\u012e\7u\2\2\u012e"+
		"\4\3\2\2\2\u012f\u0130\7}\2\2\u0130\6\3\2\2\2\u0131\u0132\7.\2\2\u0132"+
		"\b\3\2\2\2\u0133\u0134\7\177\2\2\u0134\n\3\2\2\2\u0135\u0136\7u\2\2\u0136"+
		"\u0137\7{\2\2\u0137\u0138\7o\2\2\u0138\u0139\7o\2\2\u0139\u013a\7g\2\2"+
		"\u013a\u013b\7v\2\2\u013b\u013c\7t\2\2\u013c\u013d\7{\2\2\u013d\u013e"+
		"\7a\2\2\u013e\u013f\7d\2\2\u013f\u0140\7t\2\2\u0140\u0141\7g\2\2\u0141"+
		"\u0142\7c\2\2\u0142\u0143\7m\2\2\u0143\u0144\7k\2\2\u0144\u0145\7p\2\2"+
		"\u0145\u0146\7i\2\2\u0146\f\3\2\2\2\u0147\u0148\7<\2\2\u0148\16\3\2\2"+
		"\2\u0149\u014a\7d\2\2\u014a\u014b\7k\2\2\u014b\u014c\7v\2\2\u014c\u014d"+
		"\7a\2\2\u014d\u014e\7y\2\2\u014e\u014f\7k\2\2\u014f\u0150\7f\2\2\u0150"+
		"\u0151\7v\2\2\u0151\u0152\7j\2\2\u0152\20\3\2\2\2\u0153\u0154\7u\2\2\u0154"+
		"\u0155\7m\2\2\u0155\u0156\7q\2\2\u0156\u0157\7n\2\2\u0157\u0158\7g\2\2"+
		"\u0158\u0159\7o\2\2\u0159\u015a\7a\2\2\u015a\u015b\7f\2\2\u015b\u015c"+
		"\7g\2\2\u015c\u015d\7r\2\2\u015d\u015e\7v\2\2\u015e\u015f\7j\2\2\u015f"+
		"\22\3\2\2\2\u0160\u0161\7u\2\2\u0161\u0162\7j\2\2\u0162\u0163\7c\2\2\u0163"+
		"\u0164\7t\2\2\u0164\u0165\7k\2\2\u0165\u0166\7p\2\2\u0166\u0167\7i\2\2"+
		"\u0167\24\3\2\2\2\u0168\u0169\7w\2\2\u0169\u016a\7p\2\2\u016a\u016b\7"+
		"k\2\2\u016b\u016c\7x\2\2\u016c\u016d\7g\2\2\u016d\u016e\7t\2\2\u016e\u016f"+
		"\7u\2\2\u016f\u0170\7g\2\2\u0170\26\3\2\2\2\u0171\u0172\7]\2\2\u0172\30"+
		"\3\2\2\2\u0173\u0174\7_\2\2\u0174\32\3\2\2\2\u0175\u0176\7t\2\2\u0176"+
		"\u0177\7g\2\2\u0177\u0178\7n\2\2\u0178\u0179\7c\2\2\u0179\u017a\7v\2\2"+
		"\u017a\u017b\7k\2\2\u017b\u017c\7q\2\2\u017c\u017d\7p\2\2\u017d\u017e"+
		"\7u\2\2\u017e\34\3\2\2\2\u017f\u0180\7\60\2\2\u0180\u0181\7\60\2\2\u0181"+
		"\36\3\2\2\2\u0182\u0183\7*\2\2\u0183 \3\2\2\2\u0184\u0185\7+\2\2\u0185"+
		"\"\3\2\2\2\u0186\u0187\7o\2\2\u0187\u0188\7q\2\2\u0188\u0189\7f\2\2\u0189"+
		"\u018a\7w\2\2\u018a\u018b\7n\2\2\u018b\u018c\7g\2\2\u018c$\3\2\2\2\u018d"+
		"\u018e\7k\2\2\u018e\u018f\7o\2\2\u018f\u0190\7r\2\2\u0190\u0191\7q\2\2"+
		"\u0191\u0192\7t\2\2\u0192\u0193\7v\2\2\u0193&\3\2\2\2\u0194\u0195\7=\2"+
		"\2\u0195(\3\2\2\2\u0196\u0197\7r\2\2\u0197\u0198\7c\2\2\u0198\u0199\7"+
		"e\2\2\u0199\u019a\7m\2\2\u019a\u019b\7c\2\2\u019b\u019c\7i\2\2\u019c\u019d"+
		"\7g\2\2\u019d*\3\2\2\2\u019e\u019f\7?\2\2\u019f,\3\2\2\2\u01a0\u01a1\7"+
		"c\2\2\u01a1\u01a2\7d\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4\7v\2\2\u01a4\u01a5"+
		"\7t\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7e\2\2\u01a7\u01a8\7v\2\2\u01a8"+
		".\3\2\2\2\u01a9\u01aa\7e\2\2\u01aa\u01ab\7n\2\2\u01ab\u01ac\7c\2\2\u01ac"+
		"\u01ad\7u\2\2\u01ad\u01ae\7u\2\2\u01ae\60\3\2\2\2\u01af\u01b0\7k\2\2\u01b0"+
		"\u01b1\7p\2\2\u01b1\u01b2\7v\2\2\u01b2\u01b3\7g\2\2\u01b3\u01b4\7t\2\2"+
		"\u01b4\u01b5\7h\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\7e\2\2\u01b7\u01b8"+
		"\7g\2\2\u01b8\62\3\2\2\2\u01b9\u01ba\7g\2\2\u01ba\u01bb\7z\2\2\u01bb\u01bc"+
		"\7v\2\2\u01bc\u01bd\7g\2\2\u01bd\u01be\7p\2\2\u01be\u01bf\7f\2\2\u01bf"+
		"\u01c0\7u\2\2\u01c0\64\3\2\2\2\u01c1\u01c2\7u\2\2\u01c2\u01c3\7v\2\2\u01c3"+
		"\u01c4\7c\2\2\u01c4\u01c5\7v\2\2\u01c5\u01c6\7k\2\2\u01c6\u01c7\7e\2\2"+
		"\u01c7\66\3\2\2\2\u01c8\u01c9\7o\2\2\u01c9\u01ca\7q\2\2\u01ca\u01cb\7"+
		"f\2\2\u01cb\u01cc\7g\2\2\u01cc\u01cd\7n\2\2\u01cd8\3\2\2\2\u01ce\u01cf"+
		"\7i\2\2\u01cf\u01d0\7j\2\2\u01d0\u01d1\7q\2\2\u01d1\u01d2\7u\2\2\u01d2"+
		"\u01d3\7v\2\2\u01d3:\3\2\2\2\u01d4\u01d5\7v\2\2\u01d5\u01d6\7t\2\2\u01d6"+
		"\u01d7\7c\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7u\2\2\u01d9\u01da\7k\2\2"+
		"\u01da\u01db\7g\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7v\2\2\u01dd<\3\2\2"+
		"\2\u01de\u01df\7x\2\2\u01df\u01e0\7q\2\2\u01e0\u01e1\7n\2\2\u01e1\u01e2"+
		"\7c\2\2\u01e2\u01e3\7v\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5\7n\2\2\u01e5"+
		"\u01e6\7g\2\2\u01e6>\3\2\2\2\u01e7\u01e8\7p\2\2\u01e8\u01e9\7w\2\2\u01e9"+
		"\u01ea\7n\2\2\u01ea\u01eb\7n\2\2\u01eb\u01ec\7c\2\2\u01ec\u01ed\7d\2\2"+
		"\u01ed\u01ee\7n\2\2\u01ee\u01ef\7g\2\2\u01ef@\3\2\2\2\u01f0\u01f1\7#\2"+
		"\2\u01f1\u01f2\7p\2\2\u01f2\u01f3\7w\2\2\u01f3\u01f4\7n\2\2\u01f4\u01f5"+
		"\7n\2\2\u01f5\u01f6\7c\2\2\u01f6\u01f7\7d\2\2\u01f7\u01f8\7n\2\2\u01f8"+
		"\u01f9\7g\2\2\u01f9B\3\2\2\2\u01fa\u01fb\7t\2\2\u01fb\u01fc\7g\2\2\u01fc"+
		"\u01fd\7c\2\2\u01fd\u01fe\7f\2\2\u01fe\u01ff\7q\2\2\u01ff\u0200\7p\2\2"+
		"\u0200\u0201\7n\2\2\u0201\u0202\7{\2\2\u0202D\3\2\2\2\u0203\u0204\7c\2"+
		"\2\u0204\u0205\7v\2\2\u0205\u0206\7v\2\2\u0206\u0207\7t\2\2\u0207\u0208"+
		"\7k\2\2\u0208\u0209\7d\2\2\u0209\u020a\7w\2\2\u020a\u020b\7v\2\2\u020b"+
		"\u020c\7g\2\2\u020cF\3\2\2\2\u020d\u020e\7f\2\2\u020e\u020f\7g\2\2\u020f"+
		"\u0210\7t\2\2\u0210\u0211\7k\2\2\u0211\u0212\7x\2\2\u0212\u0213\7g\2\2"+
		"\u0213\u0214\7f\2\2\u0214H\3\2\2\2\u0215\u0216\7k\2\2\u0216\u0217\7f\2"+
		"\2\u0217J\3\2\2\2\u0218\u0219\7q\2\2\u0219\u021a\7t\2\2\u021a\u021b\7"+
		"f\2\2\u021b\u021c\7g\2\2\u021c\u021d\7t\2\2\u021d\u021e\7g\2\2\u021e\u021f"+
		"\7f\2\2\u021fL\3\2\2\2\u0220\u0221\7#\2\2\u0221\u0222\7q\2\2\u0222\u0223"+
		"\7t\2\2\u0223\u0224\7f\2\2\u0224\u0225\7g\2\2\u0225\u0226\7t\2\2\u0226"+
		"\u0227\7g\2\2\u0227\u0228\7f\2\2\u0228N\3\2\2\2\u0229\u022a\7w\2\2\u022a"+
		"\u022b\7p\2\2\u022b\u022c\7k\2\2\u022c\u022d\7s\2\2\u022d\u022e\7w\2\2"+
		"\u022e\u022f\7g\2\2\u022fP\3\2\2\2\u0230\u0231\7#\2\2\u0231\u0232\7w\2"+
		"\2\u0232\u0233\7p\2\2\u0233\u0234\7k\2\2\u0234\u0235\7s\2\2\u0235\u0236"+
		"\7w\2\2\u0236\u0237\7g\2\2\u0237R\3\2\2\2\u0238\u0239\7w\2\2\u0239\u023a"+
		"\7p\2\2\u023a\u023b\7u\2\2\u023b\u023c\7g\2\2\u023c\u023d\7v\2\2\u023d"+
		"\u023e\7v\2\2\u023e\u023f\7c\2\2\u023f\u0240\7d\2\2\u0240\u0241\7n\2\2"+
		"\u0241\u0242\7g\2\2\u0242T\3\2\2\2\u0243\u0244\7#\2\2\u0244\u0245\7w\2"+
		"\2\u0245\u0246\7p\2\2\u0246\u0247\7u\2\2\u0247\u0248\7g\2\2\u0248\u0249"+
		"\7v\2\2\u0249\u024a\7v\2\2\u024a\u024b\7c\2\2\u024b\u024c\7d\2\2\u024c"+
		"\u024d\7n\2\2\u024d\u024e\7g\2\2\u024eV\3\2\2\2\u024f\u0250\7r\2\2\u0250"+
		"\u0251\7t\2\2\u0251\u0252\7q\2\2\u0252\u0253\7r\2\2\u0253\u0254\7g\2\2"+
		"\u0254\u0255\7t\2\2\u0255\u0256\7v\2\2\u0256\u0257\7{\2\2\u0257X\3\2\2"+
		"\2\u0258\u0259\7%\2\2\u0259Z\3\2\2\2\u025a\u025b\7e\2\2\u025b\u025c\7"+
		"q\2\2\u025c\u025d\7o\2\2\u025d\u025e\7r\2\2\u025e\u025f\7q\2\2\u025f\u0260"+
		"\7u\2\2\u0260\u0261\7g\2\2\u0261\u0262\7u\2\2\u0262\\\3\2\2\2\u0263\u0264"+
		"\7t\2\2\u0264\u0265\7g\2\2\u0265\u0266\7u\2\2\u0266\u0267\7q\2\2\u0267"+
		"\u0268\7n\2\2\u0268\u0269\7x\2\2\u0269\u026a\7g\2\2\u026a^\3\2\2\2\u026b"+
		"\u026c\7#\2\2\u026c\u026d\7t\2\2\u026d\u026e\7g\2\2\u026e\u026f\7u\2\2"+
		"\u026f\u0270\7q\2\2\u0270\u0271\7n\2\2\u0271\u0272\7x\2\2\u0272\u0273"+
		"\7g\2\2\u0273`\3\2\2\2\u0274\u0275\7m\2\2\u0275\u0276\7g\2\2\u0276\u0277"+
		"\7{\2\2\u0277b\3\2\2\2\u0278\u0279\7q\2\2\u0279\u027a\7r\2\2\u027a\u027b"+
		"\7g\2\2\u027b\u027c\7t\2\2\u027c\u027d\7c\2\2\u027d\u027e\7v\2\2\u027e"+
		"\u027f\7k\2\2\u027f\u0280\7q\2\2\u0280\u0281\7p\2\2\u0281d\3\2\2\2\u0282"+
		"\u0283\7v\2\2\u0283\u0284\7j\2\2\u0284\u0285\7t\2\2\u0285\u0286\7q\2\2"+
		"\u0286\u0287\7y\2\2\u0287\u0288\7u\2\2\u0288f\3\2\2\2\u0289\u028a\7,\2"+
		"\2\u028ah\3\2\2\2\u028b\u028c\7-\2\2\u028cj\3\2\2\2\u028d\u028e\7A\2\2"+
		"\u028el\3\2\2\2\u028f\u0290\7~\2\2\u0290\u0291\7A\2\2\u0291n\3\2\2\2\u0292"+
		"\u0293\7~\2\2\u0293\u0294\7\63\2\2\u0294p\3\2\2\2\u0295\u0296\7r\2\2\u0296"+
		"\u0297\7t\2\2\u0297\u0298\7k\2\2\u0298\u0299\7o\2\2\u0299\u029a\7k\2\2"+
		"\u029a\u029b\7v\2\2\u029b\u029c\7k\2\2\u029c\u029d\7x\2\2\u029d\u029e"+
		"\7g\2\2\u029er\3\2\2\2\u029f\u02a0\7f\2\2\u02a0\u02a1\7c\2\2\u02a1\u02a2"+
		"\7v\2\2\u02a2\u02a3\7c\2\2\u02a3\u02a4\7v\2\2\u02a4\u02a5\7{\2\2\u02a5"+
		"\u02a6\7r\2\2\u02a6\u02a7\7g\2\2\u02a7t\3\2\2\2\u02a8\u02a9\7u\2\2\u02a9"+
		"\u02aa\7g\2\2\u02aa\u02ab\7t\2\2\u02ab\u02ac\7k\2\2\u02ac\u02ad\7c\2\2"+
		"\u02ad\u02ae\7n\2\2\u02ae\u02af\7k\2\2\u02af\u02b0\7|\2\2\u02b0\u02b1"+
		"\7c\2\2\u02b1\u02b2\7d\2\2\u02b2\u02b3\7n\2\2\u02b3\u02b4\7g\2\2\u02b4"+
		"v\3\2\2\2\u02b5\u02b6\7#\2\2\u02b6\u02b7\7u\2\2\u02b7\u02b8\7g\2\2\u02b8"+
		"\u02b9\7t\2\2\u02b9\u02ba\7k\2\2\u02ba\u02bb\7c\2\2\u02bb\u02bc\7n\2\2"+
		"\u02bc\u02bd\7k\2\2\u02bd\u02be\7|\2\2\u02be\u02bf\7c\2\2\u02bf\u02c0"+
		"\7d\2\2\u02c0\u02c1\7n\2\2\u02c1\u02c2\7g\2\2\u02c2x\3\2\2\2\u02c3\u02c4"+
		"\7D\2\2\u02c4\u02c5\7q\2\2\u02c5\u02c6\7q\2\2\u02c6\u02c7\7n\2\2\u02c7"+
		"\u02c8\7g\2\2\u02c8\u02c9\7c\2\2\u02c9\u02ca\7p\2\2\u02caz\3\2\2\2\u02cb"+
		"\u02cc\7K\2\2\u02cc\u02cd\7p\2\2\u02cd\u02ce\7v\2\2\u02ce\u02cf\7g\2\2"+
		"\u02cf\u02d0\7i\2\2\u02d0\u02d1\7g\2\2\u02d1\u02d2\7t\2\2\u02d2|\3\2\2"+
		"\2\u02d3\u02d4\7U\2\2\u02d4\u02d5\7v\2\2\u02d5\u02d6\7t\2\2\u02d6\u02d7"+
		"\7k\2\2\u02d7\u02d8\7p\2\2\u02d8\u02d9\7i\2\2\u02d9~\3\2\2\2\u02da\u02db"+
		"\7T\2\2\u02db\u02dc\7g\2\2\u02dc\u02dd\7c\2\2\u02dd\u02de\7n\2\2\u02de"+
		"\u0080\3\2\2\2\u02df\u02e0\7W\2\2\u02e0\u02e1\7p\2\2\u02e1\u02e2\7n\2"+
		"\2\u02e2\u02e3\7k\2\2\u02e3\u02e4\7o\2\2\u02e4\u02e5\7k\2\2\u02e5\u02e6"+
		"\7v\2\2\u02e6\u02e7\7g\2\2\u02e7\u02e8\7f\2\2\u02e8\u02e9\7P\2\2\u02e9"+
		"\u02ea\7c\2\2\u02ea\u02eb\7v\2\2\u02eb\u02ec\7w\2\2\u02ec\u02ed\7t\2\2"+
		"\u02ed\u02ee\7c\2\2\u02ee\u02ef\7n\2\2\u02ef\u0082\3\2\2\2\u02f0\u02f1"+
		"\7g\2\2\u02f1\u02f2\7p\2\2\u02f2\u02f3\7w\2\2\u02f3\u02f4\7o\2\2\u02f4"+
		"\u0084\3\2\2\2\u02f5\u02f6\7n\2\2\u02f6\u02f7\7k\2\2\u02f7\u02f8\7v\2"+
		"\2\u02f8\u02f9\7g\2\2\u02f9\u02fa\7t\2\2\u02fa\u02fb\7c\2\2\u02fb\u02fc"+
		"\7n\2\2\u02fc\u0086\3\2\2\2\u02fd\u02fe\7c\2\2\u02fe\u02ff\7p\2\2\u02ff"+
		"\u0300\7p\2\2\u0300\u0301\7q\2\2\u0301\u0302\7v\2\2\u0302\u0303\7c\2\2"+
		"\u0303\u0304\7v\2\2\u0304\u0305\7k\2\2\u0305\u0306\7q\2\2\u0306\u0307"+
		"\7p\2\2\u0307\u0088\3\2\2\2\u0308\u0309\7t\2\2\u0309\u030a\7g\2\2\u030a"+
		"\u030b\7h\2\2\u030b\u030c\7g\2\2\u030c\u030d\7t\2\2\u030d\u030e\7g\2\2"+
		"\u030e\u030f\7p\2\2\u030f\u0310\7e\2\2\u0310\u0311\7g\2\2\u0311\u008a"+
		"\3\2\2\2\u0312\u0313\7>\2\2\u0313\u008c\3\2\2\2\u0314\u0315\7@\2\2\u0315"+
		"\u008e\3\2\2\2\u0316\u0317\7d\2\2\u0317\u0318\7q\2\2\u0318\u0319\7f\2"+
		"\2\u0319\u031a\7{\2\2\u031a\u0090\3\2\2\2\u031b\u031c\7e\2\2\u031c\u031d"+
		"\7c\2\2\u031d\u031e\7n\2\2\u031e\u031f\7n\2\2\u031f\u0320\7c\2\2\u0320"+
		"\u0321\7d\2\2\u0321\u0322\7n\2\2\u0322\u0323\7g\2\2\u0323\u0092\3\2\2"+
		"\2\u0324\u0325\7k\2\2\u0325\u0326\7p\2\2\u0326\u0327\7x\2\2\u0327\u0328"+
		"\7c\2\2\u0328\u0329\7t\2\2\u0329\u032a\7k\2\2\u032a\u032b\7c\2\2\u032b"+
		"\u032c\7p\2\2\u032c\u032d\7v\2\2\u032d\u0094\3\2\2\2\u032e\u032f\7r\2"+
		"\2\u032f\u0330\7t\2\2\u0330\u0331\7g\2\2\u0331\u0332\7e\2\2\u0332\u0333"+
		"\7q\2\2\u0333\u0334\7p\2\2\u0334\u0335\7f\2\2\u0335\u0336\7k\2\2\u0336"+
		"\u0337\7v\2\2\u0337\u0338\7k\2\2\u0338\u0339\7q\2\2\u0339\u033a\7p\2\2"+
		"\u033a\u0096\3\2\2\2\u033b\u033c\7t\2\2\u033c\u033d\7g\2\2\u033d\u033e"+
		"\7s\2\2\u033e\u033f\7w\2\2\u033f\u0340\7k\2\2\u0340\u0341\7t\2\2\u0341"+
		"\u0342\7g\2\2\u0342\u0343\7u\2\2\u0343\u0098\3\2\2\2\u0344\u0345\7r\2"+
		"\2\u0345\u0346\7q\2\2\u0346\u0347\7u\2\2\u0347\u0348\7v\2\2\u0348\u0349"+
		"\7e\2\2\u0349\u034a\7q\2\2\u034a\u034b\7p\2\2\u034b\u034c\7f\2\2\u034c"+
		"\u034d\7k\2\2\u034d\u034e\7v\2\2\u034e\u034f\7k\2\2\u034f\u0350\7q\2\2"+
		"\u0350\u0351\7p\2\2\u0351\u009a\3\2\2\2\u0352\u0353\7g\2\2\u0353\u0354"+
		"\7p\2\2\u0354\u0355\7u\2\2\u0355\u0356\7w\2\2\u0356\u0357\7t\2\2\u0357"+
		"\u0358\7g\2\2\u0358\u0359\7u\2\2\u0359\u009c\3\2\2\2\u035a\u035b\7k\2"+
		"\2\u035b\u035c\7p\2\2\u035c\u035d\7k\2\2\u035d\u035e\7v\2\2\u035e\u035f"+
		"\7k\2\2\u035f\u0360\7c\2\2\u0360\u0361\7n\2\2\u0361\u009e\3\2\2\2\u0362"+
		"\u0363\7f\2\2\u0363\u0364\7g\2\2\u0364\u0365\7t\2\2\u0365\u0366\7k\2\2"+
		"\u0366\u0367\7x\2\2\u0367\u0368\7c\2\2\u0368\u0369\7v\2\2\u0369\u036a"+
		"\7k\2\2\u036a\u036b\7q\2\2\u036b\u036c\7p\2\2\u036c\u00a0\3\2\2\2\u036d"+
		"\u036e\7r\2\2\u036e\u036f\7w\2\2\u036f\u0370\7d\2\2\u0370\u0371\7n\2\2"+
		"\u0371\u0372\7k\2\2\u0372\u0373\7e\2\2\u0373\u00a2\3\2\2\2\u0374\u0375"+
		"\7r\2\2\u0375\u0376\7t\2\2\u0376\u0377\7q\2\2\u0377\u0378\7v\2\2\u0378"+
		"\u0379\7g\2\2\u0379\u037a\7e\2\2\u037a\u037b\7v\2\2\u037b\u037c\7g\2\2"+
		"\u037c\u037d\7f\2\2\u037d\u00a4\3\2\2\2\u037e\u037f\7r\2\2\u037f\u0380"+
		"\7t\2\2\u0380\u0381\7k\2\2\u0381\u0382\7x\2\2\u0382\u0383\7c\2\2\u0383"+
		"\u0384\7v\2\2\u0384\u0385\7g\2\2\u0385\u00a6\3\2\2\2\u0386\u0387\7p\2"+
		"\2\u0387\u0388\7q\2\2\u0388\u00a8\3\2\2\2\u0389\u038a\7n\2\2\u038a\u038b"+
		"\7q\2\2\u038b\u038c\7p\2\2\u038c\u038d\7g\2\2\u038d\u00aa\3\2\2\2\u038e"+
		"\u038f\7q\2\2\u038f\u0390\7p\2\2\u0390\u0391\7g\2\2\u0391\u00ac\3\2\2"+
		"\2\u0392\u0393\7u\2\2\u0393\u0394\7q\2\2\u0394\u0395\7o\2\2\u0395\u0396"+
		"\7g\2\2\u0396\u00ae\3\2\2\2\u0397\u0398\7#\2\2\u0398\u00b0\3\2\2\2\u0399"+
		"\u039a\7p\2\2\u039a\u039b\7q\2\2\u039b\u039c\7v\2\2\u039c\u00b2\3\2\2"+
		"\2\u039d\u039e\7k\2\2\u039e\u039f\7p\2\2\u039f\u00b4\3\2\2\2\u03a0\u03a1"+
		"\7>\2\2\u03a1\u03a2\7?\2\2\u03a2\u00b6\3\2\2\2\u03a3\u03a4\7@\2\2\u03a4"+
		"\u03a5\7?\2\2\u03a5\u00b8\3\2\2\2\u03a6\u03a7\7u\2\2\u03a7\u03a8\7w\2"+
		"\2\u03a8\u03a9\7o\2\2\u03a9\u00ba\3\2\2\2\u03aa\u03ab\7~\2\2\u03ab\u00bc"+
		"\3\2\2\2\u03ac\u03ad\7c\2\2\u03ad\u03ae\7e\2\2\u03ae\u03af\7{\2\2\u03af"+
		"\u03b0\7e\2\2\u03b0\u03b1\7n\2\2\u03b1\u03b2\7k\2\2\u03b2\u03b3\7e\2\2"+
		"\u03b3\u00be\3\2\2\2\u03b4\u03b5\7h\2\2\u03b5\u03b6\7w\2\2\u03b6\u03b7"+
		"\7p\2\2\u03b7\u03b8\7e\2\2\u03b8\u03b9\7v\2\2\u03b9\u03ba\7k\2\2\u03ba"+
		"\u03bb\7q\2\2\u03bb\u03bc\7p\2\2\u03bc\u00c0\3\2\2\2\u03bd\u03be\7/\2"+
		"\2\u03be\u03bf\7@\2\2\u03bf\u00c2\3\2\2\2\u03c0\u03c1\7q\2\2\u03c1\u03c2"+
		"\7t\2\2\u03c2\u03c3\7f\2\2\u03c3\u00c4\3\2\2\2\u03c4\u03c5\7(\2\2\u03c5"+
		"\u03c6\7(\2\2\u03c6\u00c6\3\2\2\2\u03c7\u03c8\7c\2\2\u03c8\u03c9\7p\2"+
		"\2\u03c9\u03ca\7f\2\2\u03ca\u00c8\3\2\2\2\u03cb\u03cc\7~\2\2\u03cc\u03cd"+
		"\7~\2\2\u03cd\u00ca\3\2\2\2\u03ce\u03cf\7q\2\2\u03cf\u03d0\7t\2\2\u03d0"+
		"\u00cc\3\2\2\2\u03d1\u03d2\7?\2\2\u03d2\u03d3\7@\2\2\u03d3\u00ce\3\2\2"+
		"\2\u03d4\u03d5\7k\2\2\u03d5\u03d6\7h\2\2\u03d6\u00d0\3\2\2\2\u03d7\u03d8"+
		"\7>\2\2\u03d8\u03d9\7?\2\2\u03d9\u03da\7@\2\2\u03da\u00d2\3\2\2\2\u03db"+
		"\u03dc\7k\2\2\u03dc\u03dd\7h\2\2\u03dd\u03de\7h\2\2\u03de\u00d4\3\2\2"+
		"\2\u03df\u03e0\7c\2\2\u03e0\u03e1\7n\2\2\u03e1\u03e2\7n\2\2\u03e2\u00d6"+
		"\3\2\2\2\u03e3\u03e4\7n\2\2\u03e4\u03e5\7g\2\2\u03e5\u03e6\7v\2\2\u03e6"+
		"\u00d8\3\2\2\2\u03e7\u03e8\7v\2\2\u03e8\u03e9\7t\2\2\u03e9\u03ea\7w\2"+
		"\2\u03ea\u03eb\7g\2\2\u03eb\u00da\3\2\2\2\u03ec\u03ed\7h\2\2\u03ed\u03ee"+
		"\7c\2\2\u03ee\u03ef\7n\2\2\u03ef\u03f0\7u\2\2\u03f0\u03f1\7g\2\2\u03f1"+
		"\u00dc\3\2\2\2\u03f2\u03f3\7\u0080\2\2\u03f3\u00de\3\2\2\2\u03f4\u03f5"+
		"\7`\2\2\u03f5\u00e0\3\2\2\2\u03f6\u03f7\7(\2\2\u03f7\u00e2\3\2\2\2\u03f8"+
		"\u03f9\7/\2\2\u03f9\u00e4\3\2\2\2\u03fa\u03fb\7\60\2\2\u03fb\u00e6\3\2"+
		"\2\2\u03fc\u03fd\7u\2\2\u03fd\u03fe\7g\2\2\u03fe\u03ff\7v\2\2\u03ff\u00e8"+
		"\3\2\2\2\u0400\u0401\7-\2\2\u0401\u0402\7-\2\2\u0402\u00ea\3\2\2\2\u0403"+
		"\u0404\7v\2\2\u0404\u0405\7j\2\2\u0405\u0406\7g\2\2\u0406\u0407\7p\2\2"+
		"\u0407\u00ec\3\2\2\2\u0408\u0409\7g\2\2\u0409\u040a\7n\2\2\u040a\u040b"+
		"\7u\2\2\u040b\u040c\7g\2\2\u040c\u00ee\3\2\2\2\u040d\u040e\7k\2\2\u040e"+
		"\u040f\7f\2\2\u040f\u0410\7g\2\2\u0410\u0411\7p\2\2\u0411\u00f0\3\2\2"+
		"\2\u0412\u0413\7p\2\2\u0413\u0414\7q\2\2\u0414\u0415\7p\2\2\u0415\u0416"+
		"\7g\2\2\u0416\u00f2\3\2\2\2\u0417\u0418\7w\2\2\u0418\u0419\7p\2\2\u0419"+
		"\u041a\7k\2\2\u041a\u041b\7x\2\2\u041b\u00f4\3\2\2\2\u041c\u041d\7k\2"+
		"\2\u041d\u041e\7p\2\2\u041e\u041f\7v\2\2\u041f\u0420\7u\2\2\u0420\u00f6"+
		"\3\2\2\2\u0421\u0422\7r\2\2\u0422\u0423\7n\2\2\u0423\u0424\7w\2\2\u0424"+
		"\u0425\7u\2\2\u0425\u00f8\3\2\2\2\u0426\u0427\7o\2\2\u0427\u0428\7k\2"+
		"\2\u0428\u0429\7p\2\2\u0429\u042a\7w\2\2\u042a\u042b\7u\2\2\u042b\u00fa"+
		"\3\2\2\2\u042c\u042d\7o\2\2\u042d\u042e\7w\2\2\u042e\u042f\7n\2\2\u042f"+
		"\u00fc\3\2\2\2\u0430\u0431\7\61\2\2\u0431\u00fe\3\2\2\2\u0432\u0433\7"+
		"f\2\2\u0433\u0434\7k\2\2\u0434\u0435\7x\2\2\u0435\u0100\3\2\2\2\u0436"+
		"\u0437\7\'\2\2\u0437\u0102\3\2\2\2\u0438\u0439\7o\2\2\u0439\u043a\7q\2"+
		"\2\u043a\u043b\7f\2\2\u043b\u043c\7w\2\2\u043c\u043d\7n\2\2\u043d\u043e"+
		"\7q\2\2\u043e\u0104\3\2\2\2\u043f\u0440\7f\2\2\u0440\u0441\7k\2\2\u0441"+
		"\u0442\7u\2\2\u0442\u0443\7l\2\2\u0443\u0106\3\2\2\2\u0444\u0445\7f\2"+
		"\2\u0445\u0446\7g\2\2\u0446\u0447\7h\2\2\u0447\u0448\7k\2\2\u0448\u0449"+
		"\7p\2\2\u0449\u044a\7k\2\2\u044a\u044b\7v\2\2\u044b\u044c\7k\2\2\u044c"+
		"\u044d\7q\2\2\u044d\u044e\7p\2\2\u044e\u0108\3\2\2\2\u044f\u0450\7<\2"+
		"\2\u0450\u0451\7<\2\2\u0451\u010a\3\2\2\2\u0452\u0454\5\u0115\u008b\2"+
		"\u0453\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0453\3\2\2\2\u0455\u0456"+
		"\3\2\2\2\u0456\u010c\3\2\2\2\u0457\u045a\5\u0119\u008d\2\u0458\u045a\5"+
		"\u0113\u008a\2\u0459\u0457\3\2\2\2\u0459\u0458\3\2\2\2\u045a\u0462\3\2"+
		"\2\2\u045b\u0461\5\u0113\u008a\2\u045c\u0461\5\u011b\u008e\2\u045d\u0461"+
		"\5\u0115\u008b\2\u045e\u0461\5\u0119\u008d\2\u045f\u0461\5\u011d\u008f"+
		"\2\u0460\u045b\3\2\2\2\u0460\u045c\3\2\2\2\u0460\u045d\3\2\2\2\u0460\u045e"+
		"\3\2\2\2\u0460\u045f\3\2\2\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0462"+
		"\u0463\3\2\2\2\u0463\u010e\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u046a\7$"+
		"\2\2\u0466\u0469\5\u0117\u008c\2\u0467\u0469\n\2\2\2\u0468\u0466\3\2\2"+
		"\2\u0468\u0467\3\2\2\2\u0469\u046c\3\2\2\2\u046a\u0468\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u046d\3\2\2\2\u046c\u046a\3\2\2\2\u046d\u046e\7$\2\2\u046e"+
		"\u0110\3\2\2\2\u046f\u0474\7)\2\2\u0470\u0473\5\u0117\u008c\2\u0471\u0473"+
		"\n\3\2\2\u0472\u0470\3\2\2\2\u0472\u0471\3\2\2\2\u0473\u0476\3\2\2\2\u0474"+
		"\u0472\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0477\3\2\2\2\u0476\u0474\3\2"+
		"\2\2\u0477\u0478\7)\2\2\u0478\u0112\3\2\2\2\u0479\u047a\t\4\2\2\u047a"+
		"\u0114\3\2\2\2\u047b\u047c\t\5\2\2\u047c\u0116\3\2\2\2\u047d\u047e\7^"+
		"\2\2\u047e\u047f\t\6\2\2\u047f\u0118\3\2\2\2\u0480\u0481\7a\2\2\u0481"+
		"\u011a\3\2\2\2\u0482\u0483\7)\2\2\u0483\u011c\3\2\2\2\u0484\u0485\7&\2"+
		"\2\u0485\u011e\3\2\2\2\u0486\u048a\7)\2\2\u0487\u0489\13\2\2\2\u0488\u0487"+
		"\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u048b\3\2\2\2\u048a\u0488\3\2\2\2\u048b"+
		"\u048d\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u048e\7)\2\2\u048e\u048f\3\2"+
		"\2\2\u048f\u0490\b\u0090\2\2\u0490\u0120\3\2\2\2\u0491\u0492\7\61\2\2"+
		"\u0492\u0493\7,\2\2\u0493\u0497\3\2\2\2\u0494\u0496\13\2\2\2\u0495\u0494"+
		"\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0498\3\2\2\2\u0497\u0495\3\2\2\2\u0498"+
		"\u049a\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u049b\7,\2\2\u049b\u049c\7\61"+
		"\2\2\u049c\u049d\3\2\2\2\u049d\u049e\b\u0091\2\2\u049e\u0122\3\2\2\2\u049f"+
		"\u04a0\7/\2\2\u04a0\u04a1\7/\2\2\u04a1\u04a5\3\2\2\2\u04a2\u04a4\13\2"+
		"\2\2\u04a3\u04a2\3\2\2\2\u04a4\u04a7\3\2\2\2\u04a5\u04a6\3\2\2\2\u04a5"+
		"\u04a3\3\2\2\2\u04a6\u04a9\3\2\2\2\u04a7\u04a5\3\2\2\2\u04a8\u04aa\7\17"+
		"\2\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ab\3\2\2\2\u04ab"+
		"\u04ac\7\f\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\b\u0092\2\2\u04ae\u0124"+
		"\3\2\2\2\u04af\u04b1\t\7\2\2\u04b0\u04af\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2"+
		"\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b5\b\u0093"+
		"\2\2\u04b5\u0126\3\2\2\2\20\2\u0455\u0459\u0460\u0462\u0468\u046a\u0472"+
		"\u0474\u048a\u0497\u04a5\u04a9\u04b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}