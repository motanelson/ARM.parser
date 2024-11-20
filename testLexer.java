// Generated from test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FUNCTS=1, EXPRE=2, NUMBER=3, ID=4, VALUE=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FUNCTS", "EXPRE", "NUMBER", "ID", "VALUE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FUNCTS", "EXPRE", "NUMBER", "ID", "VALUE", "WS"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\bx\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2"+
		"\27\n\2\f\2\16\2\32\13\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\7\2#\n\2\f"+
		"\2\16\2&\13\2\3\2\7\2)\n\2\f\2\16\2,\13\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2=\n\2\f\2\16\2@\13\2\3\2\7\2"+
		"C\n\2\f\2\16\2F\13\2\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3\3\3\3\3"+
		"\3\3\3\7\3U\n\3\f\3\16\3X\13\3\5\3Z\n\3\3\4\6\4]\n\4\r\4\16\4^\3\4\3\4"+
		"\7\4c\n\4\f\4\16\4f\13\4\3\5\6\5i\n\5\r\5\16\5j\3\6\3\6\6\6o\n\6\r\6\16"+
		"\6p\3\6\3\6\3\7\3\7\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\b\3\2\17"+
		"\17\3\2\f\f\3\2\62;\4\2C\\c|\4\2\13\f\17\17\5\2\13\f\17\17\"\"\2\u0085"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\3\17\3\2\2\2\5Y\3\2\2\2\7\\\3\2\2\2\th\3\2\2\2\13l\3\2\2\2\rt\3\2"+
		"\2\2\17\20\7f\2\2\20\21\7g\2\2\21\22\7h\2\2\22\23\7\"\2\2\23\24\3\2\2"+
		"\2\24\30\5\t\5\2\25\27\t\2\2\2\26\25\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2"+
		"\2\30\31\3\2\2\2\31\36\3\2\2\2\32\30\3\2\2\2\33\35\t\3\2\2\34\33\3\2\2"+
		"\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37$\3\2\2\2 \36\3\2\2\2!#\5"+
		"\5\3\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%*\3\2\2\2&$\3\2\2\2\'"+
		")\t\2\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\60\3\2\2\2,*\3\2\2"+
		"\2-/\t\3\2\2.-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\63\3\2"+
		"\2\2\62\60\3\2\2\2\63\64\7g\2\2\64\65\7p\2\2\65\66\7f\2\2\66\67\7\"\2"+
		"\2\678\7f\2\289\7g\2\29:\7h\2\2:>\3\2\2\2;=\t\2\2\2<;\3\2\2\2=@\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?D\3\2\2\2@>\3\2\2\2AC\t\3\2\2BA\3\2\2\2CF\3\2\2"+
		"\2DB\3\2\2\2DE\3\2\2\2E\4\3\2\2\2FD\3\2\2\2GH\5\t\5\2HI\7?\2\2IM\5\13"+
		"\6\2JL\t\3\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NZ\3\2\2\2OM\3\2"+
		"\2\2PQ\5\t\5\2QR\7?\2\2RV\5\7\4\2SU\t\3\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2WZ\3\2\2\2XV\3\2\2\2YG\3\2\2\2YP\3\2\2\2Z\6\3\2\2\2[]\t"+
		"\4\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_d\3\2\2\2`a\7\60\2\2"+
		"ac\t\4\2\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\b\3\2\2\2fd\3\2\2"+
		"\2gi\t\5\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\n\3\2\2\2ln\7$\2"+
		"\2mo\n\6\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7$\2"+
		"\2s\f\3\2\2\2tu\t\7\2\2uv\3\2\2\2vw\b\7\2\2w\16\3\2\2\2\21\2\30\36$*\60"+
		">DMVY^djp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}