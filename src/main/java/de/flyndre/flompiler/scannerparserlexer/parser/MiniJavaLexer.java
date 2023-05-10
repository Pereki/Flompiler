// Generated from java-escape by ANTLR 4.11.1
package de.flyndre.flompiler.scannerparserlexer.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, RETURN=3, CLASS=4, BOOLEAN=5, INTTYPE=6, STRINGTYPE=7, BOOLEANTYPE=8, 
		CHARTYPE=9, VOIDTYPE=10, EQUALS=11, STRING=12, CHAR=13, INTEGER=14, COMMA=15, 
		PUBLIC=16, PRIVATE=17, PROTECTED=18, NAME=19, WAVEDBROPEN=20, WAVEDBRCLOSE=21, 
		SEMICOLON=22, BROPEN=23, BRCLOSE=24, SEQUENCE=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "RETURN", "CLASS", "BOOLEAN", "INTTYPE", "STRINGTYPE", 
			"BOOLEANTYPE", "CHARTYPE", "VOIDTYPE", "EQUALS", "STRING", "CHAR", "INTEGER", 
			"COMMA", "PUBLIC", "PRIVATE", "PROTECTED", "NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", 
			"SEMICOLON", "BROPEN", "BRCLOSE", "SEQUENCE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'return'", "'class'", null, "'int'", "'String'", 
			"'boolean'", "'char'", "'void'", "'='", null, null, null, "','", "'public'", 
			"'private'", "'protected'", null, "'{'", "'}'", "';'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "RETURN", "CLASS", "BOOLEAN", "INTTYPE", "STRINGTYPE", 
			"BOOLEANTYPE", "CHARTYPE", "VOIDTYPE", "EQUALS", "STRING", "CHAR", "INTEGER", 
			"COMMA", "PUBLIC", "PRIVATE", "PROTECTED", "NAME", "WAVEDBROPEN", "WAVEDBRCLOSE", 
			"SEMICOLON", "BROPEN", "BRCLOSE", "SEQUENCE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0019\u00b2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004R\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bu\b\u000b\n\u000b\f\u000b"+
		"x\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0005\r\u0082\b\r\n\r\f\r\u0085\t\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0004\u0012\u00a3\b\u0012\u000b\u0012\f\u0012"+
		"\u00a4\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'"+
		"\u0014)\u0015+\u0016-\u0017/\u00181\u0019\u0001\u0000\u0004\u0003\u0000"+
		"09AZaz\u0001\u000019\u0001\u000009\u0002\u0000AZaz\u00b5\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00036"+
		"\u0001\u0000\u0000\u0000\u0005;\u0001\u0000\u0000\u0000\u0007B\u0001\u0000"+
		"\u0000\u0000\tQ\u0001\u0000\u0000\u0000\u000bS\u0001\u0000\u0000\u0000"+
		"\rW\u0001\u0000\u0000\u0000\u000f^\u0001\u0000\u0000\u0000\u0011f\u0001"+
		"\u0000\u0000\u0000\u0013k\u0001\u0000\u0000\u0000\u0015p\u0001\u0000\u0000"+
		"\u0000\u0017r\u0001\u0000\u0000\u0000\u0019{\u0001\u0000\u0000\u0000\u001b"+
		"\u007f\u0001\u0000\u0000\u0000\u001d\u0086\u0001\u0000\u0000\u0000\u001f"+
		"\u0088\u0001\u0000\u0000\u0000!\u008f\u0001\u0000\u0000\u0000#\u0097\u0001"+
		"\u0000\u0000\u0000%\u00a2\u0001\u0000\u0000\u0000\'\u00a6\u0001\u0000"+
		"\u0000\u0000)\u00a8\u0001\u0000\u0000\u0000+\u00aa\u0001\u0000\u0000\u0000"+
		"-\u00ac\u0001\u0000\u0000\u0000/\u00ae\u0001\u0000\u0000\u00001\u00b0"+
		"\u0001\u0000\u0000\u000034\u0005i\u0000\u000045\u0005f\u0000\u00005\u0002"+
		"\u0001\u0000\u0000\u000067\u0005e\u0000\u000078\u0005l\u0000\u000089\u0005"+
		"s\u0000\u00009:\u0005e\u0000\u0000:\u0004\u0001\u0000\u0000\u0000;<\u0005"+
		"r\u0000\u0000<=\u0005e\u0000\u0000=>\u0005t\u0000\u0000>?\u0005u\u0000"+
		"\u0000?@\u0005r\u0000\u0000@A\u0005n\u0000\u0000A\u0006\u0001\u0000\u0000"+
		"\u0000BC\u0005c\u0000\u0000CD\u0005l\u0000\u0000DE\u0005a\u0000\u0000"+
		"EF\u0005s\u0000\u0000FG\u0005s\u0000\u0000G\b\u0001\u0000\u0000\u0000"+
		"HI\u0005t\u0000\u0000IJ\u0005r\u0000\u0000JK\u0005u\u0000\u0000KR\u0005"+
		"e\u0000\u0000LM\u0005f\u0000\u0000MN\u0005a\u0000\u0000NO\u0005l\u0000"+
		"\u0000OP\u0005s\u0000\u0000PR\u0005e\u0000\u0000QH\u0001\u0000\u0000\u0000"+
		"QL\u0001\u0000\u0000\u0000R\n\u0001\u0000\u0000\u0000ST\u0005i\u0000\u0000"+
		"TU\u0005n\u0000\u0000UV\u0005t\u0000\u0000V\f\u0001\u0000\u0000\u0000"+
		"WX\u0005S\u0000\u0000XY\u0005t\u0000\u0000YZ\u0005r\u0000\u0000Z[\u0005"+
		"i\u0000\u0000[\\\u0005n\u0000\u0000\\]\u0005g\u0000\u0000]\u000e\u0001"+
		"\u0000\u0000\u0000^_\u0005b\u0000\u0000_`\u0005o\u0000\u0000`a\u0005o"+
		"\u0000\u0000ab\u0005l\u0000\u0000bc\u0005e\u0000\u0000cd\u0005a\u0000"+
		"\u0000de\u0005n\u0000\u0000e\u0010\u0001\u0000\u0000\u0000fg\u0005c\u0000"+
		"\u0000gh\u0005h\u0000\u0000hi\u0005a\u0000\u0000ij\u0005r\u0000\u0000"+
		"j\u0012\u0001\u0000\u0000\u0000kl\u0005v\u0000\u0000lm\u0005o\u0000\u0000"+
		"mn\u0005i\u0000\u0000no\u0005d\u0000\u0000o\u0014\u0001\u0000\u0000\u0000"+
		"pq\u0005=\u0000\u0000q\u0016\u0001\u0000\u0000\u0000rv\u0005\"\u0000\u0000"+
		"su\u00031\u0018\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000yz\u0005\"\u0000\u0000z\u0018\u0001\u0000"+
		"\u0000\u0000{|\u0005\'\u0000\u0000|}\u0007\u0000\u0000\u0000}~\u0005\'"+
		"\u0000\u0000~\u001a\u0001\u0000\u0000\u0000\u007f\u0083\u0007\u0001\u0000"+
		"\u0000\u0080\u0082\u0007\u0002\u0000\u0000\u0081\u0080\u0001\u0000\u0000"+
		"\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u001c\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005,\u0000\u0000"+
		"\u0087\u001e\u0001\u0000\u0000\u0000\u0088\u0089\u0005p\u0000\u0000\u0089"+
		"\u008a\u0005u\u0000\u0000\u008a\u008b\u0005b\u0000\u0000\u008b\u008c\u0005"+
		"l\u0000\u0000\u008c\u008d\u0005i\u0000\u0000\u008d\u008e\u0005c\u0000"+
		"\u0000\u008e \u0001\u0000\u0000\u0000\u008f\u0090\u0005p\u0000\u0000\u0090"+
		"\u0091\u0005r\u0000\u0000\u0091\u0092\u0005i\u0000\u0000\u0092\u0093\u0005"+
		"v\u0000\u0000\u0093\u0094\u0005a\u0000\u0000\u0094\u0095\u0005t\u0000"+
		"\u0000\u0095\u0096\u0005e\u0000\u0000\u0096\"\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005p\u0000\u0000\u0098\u0099\u0005r\u0000\u0000\u0099\u009a"+
		"\u0005o\u0000\u0000\u009a\u009b\u0005t\u0000\u0000\u009b\u009c\u0005e"+
		"\u0000\u0000\u009c\u009d\u0005c\u0000\u0000\u009d\u009e\u0005t\u0000\u0000"+
		"\u009e\u009f\u0005e\u0000\u0000\u009f\u00a0\u0005d\u0000\u0000\u00a0$"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a3\u0007\u0003\u0000\u0000\u00a2\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5&\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005{\u0000\u0000\u00a7(\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005}\u0000\u0000\u00a9*\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0005;\u0000\u0000\u00ab,\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"(\u0000\u0000\u00ad.\u0001\u0000\u0000\u0000\u00ae\u00af\u0005)\u0000"+
		"\u0000\u00af0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0007\u0000\u0000\u0000"+
		"\u00b12\u0001\u0000\u0000\u0000\u0005\u0000Qv\u0083\u00a4\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}