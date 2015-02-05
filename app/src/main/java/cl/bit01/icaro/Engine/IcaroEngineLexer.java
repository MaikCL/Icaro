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
		T__0=1, T__1=2, PETICION=3, RELOJ=4, INTERROGACION=5, PREPOSICION=6, STRING=7, 
		NUMEROS=8, WS=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "PETICION", "RELOJ", "INTERROGACION", "PREPOSICION", "STRING", 
		"NUMEROS", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'la'", "'es'", null, "'hora'", "'que'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "PETICION", "RELOJ", "INTERROGACION", "PREPOSICION", 
		"STRING", "NUMEROS", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4=\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7\3\b\6\bW\n\b\r\b\16\bX\3\t\6"+
		"\t\\\n\t\r\t\16\t]\3\n\6\na\n\n\r\n\16\nb\3\n\3\n\2\2\13\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\3\2\4\4\2C\\c|\5\2\13\f\16\17\"\"o\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\30\3\2\2\2\7<\3\2\2"+
		"\2\t>\3\2\2\2\13C\3\2\2\2\rS\3\2\2\2\17V\3\2\2\2\21[\3\2\2\2\23`\3\2\2"+
		"\2\25\26\7n\2\2\26\27\7c\2\2\27\4\3\2\2\2\30\31\7g\2\2\31\32\7u\2\2\32"+
		"\6\3\2\2\2\33\34\7e\2\2\34\35\7w\2\2\35\36\7c\2\2\36\37\7n\2\2\37 \7\""+
		"\2\2 !\7g\2\2!=\7u\2\2\"#\7f\2\2#$\7k\2\2$%\7o\2\2%=\7g\2\2&\'\7p\2\2"+
		"\'(\7g\2\2()\7e\2\2)*\7g\2\2*+\7u\2\2+,\7k\2\2,-\7v\2\2-=\7q\2\2./\7f"+
		"\2\2/\60\7c\2\2\60\61\7o\2\2\61=\7g\2\2\62\63\7e\2\2\63\64\7w\2\2\64\65"+
		"\7c\2\2\65\66\7n\2\2\66\67\7g\2\2\678\7u\2\289\7\"\2\29:\7u\2\2:;\7q\2"+
		"\2;=\7p\2\2<\33\3\2\2\2<\"\3\2\2\2<&\3\2\2\2<.\3\2\2\2<\62\3\2\2\2=\b"+
		"\3\2\2\2>?\7j\2\2?@\7q\2\2@A\7t\2\2AB\7c\2\2B\n\3\2\2\2CD\7s\2\2DE\7w"+
		"\2\2EF\7g\2\2F\f\3\2\2\2GH\7f\2\2HT\7g\2\2IJ\7g\2\2JT\7p\2\2KL\7u\2\2"+
		"LM\7q\2\2MN\7d\2\2NO\7t\2\2OT\7g\2\2PQ\7f\2\2QR\7g\2\2RT\7n\2\2SG\3\2"+
		"\2\2SI\3\2\2\2SK\3\2\2\2SP\3\2\2\2T\16\3\2\2\2UW\t\2\2\2VU\3\2\2\2WX\3"+
		"\2\2\2XV\3\2\2\2XY\3\2\2\2Y\20\3\2\2\2Z\\\4\62;\2[Z\3\2\2\2\\]\3\2\2\2"+
		"][\3\2\2\2]^\3\2\2\2^\22\3\2\2\2_a\t\3\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2"+
		"\2bc\3\2\2\2cd\3\2\2\2de\b\n\2\2e\24\3\2\2\2\b\2<SX]b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}