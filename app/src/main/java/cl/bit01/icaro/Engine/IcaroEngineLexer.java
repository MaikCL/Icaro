// Generated from /media/HD/Documentos/Proyectos Git/Icaro Engine/IcaroEngine.g4 by ANTLR 4.5

package cl.bit01.icaro.Engine;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IcaroEngineLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
    }

    public static final int
            T__0 = 1, T__1 = 2, PETICION = 3, RELOJ = 4, INTERROGACION = 5;
    public static final String[] ruleNames = {
            "T__0", "T__1", "PETICION", "RELOJ", "INTERROGACION"
    };
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

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\7?\b\1\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3" +
                    "\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\65\n\4\3\5\3\5\3\5" +
                    "\3\5\3\5\3\6\3\6\3\6\3\6\2\2\7\3\3\5\4\7\5\t\6\13\7\3\2\2B\2\3\3\2\2\2" +
                    "\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\3\r\3\2\2\2\5\20\3\2" +
                    "\2\2\7\64\3\2\2\2\t\66\3\2\2\2\13;\3\2\2\2\r\16\7n\2\2\16\17\7c\2\2\17" +
                    "\4\3\2\2\2\20\21\7g\2\2\21\22\7u\2\2\22\6\3\2\2\2\23\24\7e\2\2\24\25\7" +
                    "w\2\2\25\26\7c\2\2\26\27\7n\2\2\27\30\7\"\2\2\30\31\7g\2\2\31\65\7u\2" +
                    "\2\32\33\7f\2\2\33\34\7k\2\2\34\35\7o\2\2\35\65\7g\2\2\36\37\7p\2\2\37" +
                    " \7g\2\2 !\7e\2\2!\"\7g\2\2\"#\7u\2\2#$\7k\2\2$%\7v\2\2%\65\7q\2\2&\'" +
                    "\7f\2\2\'(\7c\2\2()\7o\2\2)\65\7g\2\2*+\7e\2\2+,\7w\2\2,-\7c\2\2-.\7n" +
                    "\2\2./\7g\2\2/\60\7u\2\2\60\61\7\"\2\2\61\62\7u\2\2\62\63\7q\2\2\63\65" +
                    "\7p\2\2\64\23\3\2\2\2\64\32\3\2\2\2\64\36\3\2\2\2\64&\3\2\2\2\64*\3\2" +
                    "\2\2\65\b\3\2\2\2\66\67\7j\2\2\678\7q\2\289\7t\2\29:\7c\2\2:\n\3\2\2\2" +
                    ";<\7s\2\2<=\7w\2\2=>\7g\2\2>\f\3\2\2\2\4\2\64\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'la'", "'es'", null, "'hora'", "'que'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, "PETICION", "RELOJ", "INTERROGACION"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public IcaroEngineLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String getGrammarFileName() {
        return "IcaroEngine.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }
}