// Generated from /media/HD/Documentos/Proyectos Git/Icaro Engine/IcaroEngine.g4 by ANTLR 4.5

    package cl.bit01.icaro.Engine;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IcaroEngineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PETICION=4, RELOJ=5, CLIMA=6, INTERROGACION=7, 
		PREPOSICION=8, STRING=9, NUMEROS=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "PETICION", "RELOJ", "CLIMA", "INTERROGACION", 
		"PREPOSICION", "STRING", "NUMEROS", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'la'", "'es'", "'el'", null, "'hora'", null, "'que'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "PETICION", "RELOJ", "CLIMA", "INTERROGACION", 
		"PREPOSICION", "STRING", "NUMEROS", "WS"
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


	public IcaroEngineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IcaroEngine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r\u0085\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5D\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\ts\n\t\3\n\6\nv\n\n\r\n\16\nw\3\13\6\13{\n"+
		"\13\r\13\16\13|\3\f\6\f\u0080\n\f\r\f\16\f\u0081\3\f\3\f\2\2\r\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\4\4\2C\\c|\5\2\13\f\16"+
		"\17\"\"\u0090\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2"+
		"\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2"+
		"\27\3\2\2\2\3\31\3\2\2\2\5\34\3\2\2\2\7\37\3\2\2\2\tC\3\2\2\2\13E\3\2"+
		"\2\2\r`\3\2\2\2\17b\3\2\2\2\21r\3\2\2\2\23u\3\2\2\2\25z\3\2\2\2\27\177"+
		"\3\2\2\2\31\32\7n\2\2\32\33\7c\2\2\33\4\3\2\2\2\34\35\7g\2\2\35\36\7u"+
		"\2\2\36\6\3\2\2\2\37 \7g\2\2 !\7n\2\2!\b\3\2\2\2\"#\7e\2\2#$\7w\2\2$%"+
		"\7c\2\2%&\7n\2\2&\'\7\"\2\2\'(\7g\2\2(D\7u\2\2)*\7f\2\2*+\7k\2\2+,\7o"+
		"\2\2,D\7g\2\2-.\7p\2\2./\7g\2\2/\60\7e\2\2\60\61\7g\2\2\61\62\7u\2\2\62"+
		"\63\7k\2\2\63\64\7v\2\2\64D\7q\2\2\65\66\7f\2\2\66\67\7c\2\2\678\7o\2"+
		"\28D\7g\2\29:\7e\2\2:;\7w\2\2;<\7c\2\2<=\7n\2\2=>\7g\2\2>?\7u\2\2?@\7"+
		"\"\2\2@A\7u\2\2AB\7q\2\2BD\7p\2\2C\"\3\2\2\2C)\3\2\2\2C-\3\2\2\2C\65\3"+
		"\2\2\2C9\3\2\2\2D\n\3\2\2\2EF\7j\2\2FG\7q\2\2GH\7t\2\2HI\7c\2\2I\f\3\2"+
		"\2\2JK\7e\2\2KL\7n\2\2LM\7k\2\2MN\7o\2\2Na\7c\2\2OP\7v\2\2PQ\7g\2\2QR"+
		"\7o\2\2RS\7r\2\2ST\7g\2\2TU\7t\2\2UV\7c\2\2VW\7v\2\2WX\7w\2\2XY\7t\2\2"+
		"Ya\7c\2\2Z[\7v\2\2[\\\7k\2\2\\]\7g\2\2]^\7o\2\2^_\7r\2\2_a\7q\2\2`J\3"+
		"\2\2\2`O\3\2\2\2`Z\3\2\2\2a\16\3\2\2\2bc\7s\2\2cd\7w\2\2de\7g\2\2e\20"+
		"\3\2\2\2fg\7f\2\2gs\7g\2\2hi\7g\2\2is\7p\2\2jk\7u\2\2kl\7q\2\2lm\7d\2"+
		"\2mn\7t\2\2ns\7g\2\2op\7f\2\2pq\7g\2\2qs\7n\2\2rf\3\2\2\2rh\3\2\2\2rj"+
		"\3\2\2\2ro\3\2\2\2s\22\3\2\2\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2"+
		"wx\3\2\2\2x\24\3\2\2\2y{\4\62;\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}\26\3\2\2\2~\u0080\t\3\2\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\b\f\2\2\u0084"+
		"\30\3\2\2\2\t\2C`rw|\u0081\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}