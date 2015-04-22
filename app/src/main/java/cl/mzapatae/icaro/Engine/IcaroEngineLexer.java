// Generated from IcaroEngine.g4 by ANTLR 4.5

package cl.mzapatae.icaro.Engine;

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
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, ENVIAR = 14, BUSQUEDA = 15, PETICION = 16,
            AGENDA = 17, PREGUNTA = 18, RELOJ = 19, ALARMA = 20, COLOCAR = 21, RECORDATORIO = 22,
            NOTICIAS = 23, TIPO_NOTICIA = 24, CLIMA = 25, WHATSAPP = 26, UBICACION = 27, EXPLORAR = 28,
            BUSCAR = 29, CERCA = 30, BORRAR = 31, INTERROGACION = 32, PREPOSICION = 33, ADJETIVO = 34,
            HORARIO = 35, AMPM = 36, DIA = 37, MES = 38, SEUDODIA = 39, LLAMADA = 40, STRING = 41,
            NUMEROS = 42, WS = 43;
    public static final String[] ruleNames = {
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
            "T__9", "T__10", "T__11", "T__12", "ENVIAR", "BUSQUEDA", "PETICION", "AGENDA",
            "PREGUNTA", "RELOJ", "ALARMA", "COLOCAR", "RECORDATORIO", "NOTICIAS",
            "TIPO_NOTICIA", "CLIMA", "WHATSAPP", "UBICACION", "EXPLORAR", "BUSCAR",
            "CERCA", "BORRAR", "INTERROGACION", "PREPOSICION", "ADJETIVO", "HORARIO",
            "AMPM", "DIA", "MES", "SEUDODIA", "LLAMADA", "STRING", "NUMEROS", "WS"
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u0310\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4" +
                    ",\t,\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3" +
                    "\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n" +
                    "\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17" +
                    "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17" +
                    "\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a3\n\17\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20" +
                    "\3\20\3\20\3\20\3\20\5\20\u00b9\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21" +
                    "\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00dc" +
                    "\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22" +
                    "\3\22\5\22\u00ec\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24" +
                    "\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26" +
                    "\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26" +
                    "\5\26\u0114\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27" +
                    "\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0148\n\27" +
                    "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30" +
                    "\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30" +
                    "\3\30\3\30\3\30\5\30\u0169\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31" +
                    "\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u018a\n\31\3\32\3\32" +
                    "\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32" +
                    "\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01a2\n\32\3\33\3\33\3\33\3\33\3\33" +
                    "\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01b3\n\33\3\34" +
                    "\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34" +
                    "\u01c3\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35" +
                    "\5\35\u01d1\n\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37" +
                    "\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01e4\n\37\3 \3 \3 \3 \3 \3 \3 \3" +
                    " \3 \3 \3 \5 \u01f1\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"" +
                    "\3\"\3\"\3\"\5\"\u0203\n\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3" +
                    "$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3" +
                    "$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u0236\n$\3%\3%\3%\3%\3%\5%\u023d" +
                    "\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&" +
                    "\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&" +
                    "\3&\5&\u026d\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3" +
                    "\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'" +
                    "\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3" +
                    "\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'" +
                    "\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u02bc\n\'\3(\3(\3(\3" +
                    "(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3" +
                    "(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02e7\n(\3)\3)\3)\3)\3" +
                    ")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u02fe\n)\3*\6*\u0301" +
                    "\n*\r*\16*\u0302\3+\6+\u0306\n+\r+\16+\u0307\3,\6,\u030b\n,\r,\16,\u030c" +
                    "\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33" +
                    "\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67" +
                    "\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\4\4\2C\\c|\5\2\13\f\16\17" +
                    "\"\"\u034f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2" +
                    "\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27" +
                    "\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2" +
                    "\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2" +
                    "\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2" +
                    "\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2" +
                    "\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S" +
                    "\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5\\\3\2\2\2\7_\3\2\2\2\tb\3" +
                    "\2\2\2\13e\3\2\2\2\ri\3\2\2\2\17q\3\2\2\2\21t\3\2\2\2\23z\3\2\2\2\25|" +
                    "\3\2\2\2\27~\3\2\2\2\31\u0082\3\2\2\2\33\u0086\3\2\2\2\35\u00a2\3\2\2" +
                    "\2\37\u00b8\3\2\2\2!\u00db\3\2\2\2#\u00eb\3\2\2\2%\u00ed\3\2\2\2\'\u00f3" +
                    "\3\2\2\2)\u00f8\3\2\2\2+\u0113\3\2\2\2-\u0147\3\2\2\2/\u0168\3\2\2\2\61" +
                    "\u0189\3\2\2\2\63\u01a1\3\2\2\2\65\u01b2\3\2\2\2\67\u01c2\3\2\2\29\u01d0" +
                    "\3\2\2\2;\u01d2\3\2\2\2=\u01e3\3\2\2\2?\u01f0\3\2\2\2A\u01f2\3\2\2\2C" +
                    "\u0202\3\2\2\2E\u0204\3\2\2\2G\u0235\3\2\2\2I\u023c\3\2\2\2K\u026c\3\2" +
                    "\2\2M\u02bb\3\2\2\2O\u02e6\3\2\2\2Q\u02fd\3\2\2\2S\u0300\3\2\2\2U\u0305" +
                    "\3\2\2\2W\u030a\3\2\2\2YZ\7n\2\2Z[\7c\2\2[\4\3\2\2\2\\]\7g\2\2]^\7u\2" +
                    "\2^\6\3\2\2\2_`\7g\2\2`a\7n\2\2a\b\3\2\2\2bc\7w\2\2cd\7p\2\2d\n\3\2\2" +
                    "\2ef\7w\2\2fg\7p\2\2gh\7c\2\2h\f\3\2\2\2ij\7r\2\2jk\7c\2\2kl\7t\2\2lm" +
                    "\7c\2\2mn\7\"\2\2no\7g\2\2op\7n\2\2p\16\3\2\2\2qr\7f\2\2rs\7g\2\2s\20" +
                    "\3\2\2\2tu\7c\2\2uv\7\"\2\2vw\7n\2\2wx\7c\2\2xy\7u\2\2y\22\3\2\2\2z{\7" +
                    "{\2\2{\24\3\2\2\2|}\7c\2\2}\26\3\2\2\2~\177\7e\2\2\177\u0080\7q\2\2\u0080" +
                    "\u0081\7p\2\2\u0081\30\3\2\2\2\u0082\u0083\7j\2\2\u0083\u0084\7c\2\2\u0084" +
                    "\u0085\7{\2\2\u0085\32\3\2\2\2\u0086\u0087\7n\2\2\u0087\u0088\7q\2\2\u0088" +
                    "\u0089\7u\2\2\u0089\34\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7p\2\2\u008c" +
                    "\u008d\7x\2\2\u008d\u008e\7k\2\2\u008e\u00a3\7c\2\2\u008f\u0090\7g\2\2" +
                    "\u0090\u0091\7p\2\2\u0091\u0092\7x\2\2\u0092\u0093\7k\2\2\u0093\u0094" +
                    "\7c\2\2\u0094\u00a3\7t\2\2\u0095\u0096\7o\2\2\u0096\u0097\7c\2\2\u0097" +
                    "\u0098\7p\2\2\u0098\u0099\7f\2\2\u0099\u009a\7c\2\2\u009a\u00a3\7t\2\2" +
                    "\u009b\u009c\7g\2\2\u009c\u009d\7u\2\2\u009d\u009e\7e\2\2\u009e\u009f" +
                    "\7t\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7d\2\2\u00a1\u00a3\7g\2\2\u00a2" +
                    "\u008a\3\2\2\2\u00a2\u008f\3\2\2\2\u00a2\u0095\3\2\2\2\u00a2\u009b\3\2" +
                    "\2\2\u00a3\36\3\2\2\2\u00a4\u00a5\7d\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7" +
                    "\7u\2\2\u00a7\u00a8\7e\2\2\u00a8\u00a9\7c\2\2\u00a9\u00b9\7t\2\2\u00aa" +
                    "\u00ab\7d\2\2\u00ab\u00ac\7w\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7e\2\2" +
                    "\u00ae\u00b9\7c\2\2\u00af\u00b0\7o\2\2\u00b0\u00b1\7w\2\2\u00b1\u00b2" +
                    "\7g\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7t\2\2\u00b5" +
                    "\u00b6\7c\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b9\7g\2\2\u00b8\u00a4\3\2\2" +
                    "\2\u00b8\u00aa\3\2\2\2\u00b8\u00af\3\2\2\2\u00b9 \3\2\2\2\u00ba\u00bb" +
                    "\7e\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7n\2\2\u00be" +
                    "\u00bf\7\"\2\2\u00bf\u00c0\7g\2\2\u00c0\u00dc\7u\2\2\u00c1\u00c2\7f\2" +
                    "\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7o\2\2\u00c4\u00dc\7g\2\2\u00c5\u00c6" +
                    "\7p\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7e\2\2\u00c8\u00c9\7g\2\2\u00c9" +
                    "\u00ca\7u\2\2\u00ca\u00cb\7k\2\2\u00cb\u00cc\7v\2\2\u00cc\u00dc\7q\2\2" +
                    "\u00cd\u00ce\7f\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7o\2\2\u00d0\u00dc" +
                    "\7g\2\2\u00d1\u00d2\7e\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7c\2\2\u00d4" +
                    "\u00d5\7n\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7\"\2" +
                    "\2\u00d8\u00d9\7u\2\2\u00d9\u00da\7q\2\2\u00da\u00dc\7p\2\2\u00db\u00ba" +
                    "\3\2\2\2\u00db\u00c1\3\2\2\2\u00db\u00c5\3\2\2\2\u00db\u00cd\3\2\2\2\u00db" +
                    "\u00d1\3\2\2\2\u00dc\"\3\2\2\2\u00dd\u00de\7c\2\2\u00de\u00df\7i\2\2\u00df" +
                    "\u00e0\7g\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2\7f\2\2\u00e2\u00ec\7c\2\2" +
                    "\u00e3\u00e4\7c\2\2\u00e4\u00e5\7i\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7" +
                    "\7p\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7o\2\2\u00ea" +
                    "\u00ec\7g\2\2\u00eb\u00dd\3\2\2\2\u00eb\u00e3\3\2\2\2\u00ec$\3\2\2\2\u00ed" +
                    "\u00ee\7f\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7f\2\2" +
                    "\u00f1\u00f2\7g\2\2\u00f2&\3\2\2\2\u00f3\u00f4\7j\2\2\u00f4\u00f5\7q\2" +
                    "\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7c\2\2\u00f7(\3\2\2\2\u00f8\u00f9\7" +
                    "c\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd" +
                    "\7o\2\2\u00fd\u00fe\7c\2\2\u00fe*\3\2\2\2\u00ff\u0100\7e\2\2\u0100\u0101" +
                    "\7q\2\2\u0101\u0102\7n\2\2\u0102\u0103\7q\2\2\u0103\u0104\7e\2\2\u0104" +
                    "\u0114\7c\2\2\u0105\u0106\7e\2\2\u0106\u0107\7q\2\2\u0107\u0108\7n\2\2" +
                    "\u0108\u0109\7q\2\2\u0109\u010a\7e\2\2\u010a\u010b\7c\2\2\u010b\u0114" +
                    "\7t\2\2\u010c\u010d\7r\2\2\u010d\u010e\7q\2\2\u010e\u0114\7p\2\2\u010f" +
                    "\u0110\7v\2\2\u0110\u0111\7q\2\2\u0111\u0112\7e\2\2\u0112\u0114\7c\2\2" +
                    "\u0113\u00ff\3\2\2\2\u0113\u0105\3\2\2\2\u0113\u010c\3\2\2\2\u0113\u010f" +
                    "\3\2\2\2\u0114,\3\2\2\2\u0115\u0116\7c\2\2\u0116\u0117\7x\2\2\u0117\u0118" +
                    "\7k\2\2\u0118\u0119\7u\2\2\u0119\u011a\7c\2\2\u011a\u011b\7o\2\2\u011b" +
                    "\u0148\7g\2\2\u011c\u011d\7t\2\2\u011d\u011e\7g\2\2\u011e\u011f\7e\2\2" +
                    "\u011f\u0120\7w\2\2\u0120\u0121\7g\2\2\u0121\u0122\7t\2\2\u0122\u0123" +
                    "\7f\2\2\u0123\u0124\7c\2\2\u0124\u0125\7o\2\2\u0125\u0148\7g\2\2\u0126" +
                    "\u0127\7t\2\2\u0127\u0128\7g\2\2\u0128\u0129\7e\2\2\u0129\u012a\7w\2\2" +
                    "\u012a\u012b\7g\2\2\u012b\u012c\7t\2\2\u012c\u012d\7f\2\2\u012d\u0148" +
                    "\7c\2\2\u012e\u012f\7t\2\2\u012f\u0130\7g\2\2\u0130\u0131\7e\2\2\u0131" +
                    "\u0132\7q\2\2\u0132\u0133\7t\2\2\u0133\u0134\7f\2\2\u0134\u0135\7c\2\2" +
                    "\u0135\u0136\7v\2\2\u0136\u0137\7q\2\2\u0137\u0138\7t\2\2\u0138\u0139" +
                    "\7k\2\2\u0139\u0148\7q\2\2\u013a\u013b\7t\2\2\u013b\u013c\7g\2\2\u013c" +
                    "\u013d\7e\2\2\u013d\u013e\7q\2\2\u013e\u013f\7t\2\2\u013f\u0140\7f\2\2" +
                    "\u0140\u0141\7c\2\2\u0141\u0142\7v\2\2\u0142\u0143\7q\2\2\u0143\u0144" +
                    "\7t\2\2\u0144\u0145\7k\2\2\u0145\u0146\7q\2\2\u0146\u0148\7u\2\2\u0147" +
                    "\u0115\3\2\2\2\u0147\u011c\3\2\2\2\u0147\u0126\3\2\2\2\u0147\u012e\3\2" +
                    "\2\2\u0147\u013a\3\2\2\2\u0148.\3\2\2\2\u0149\u014a\7p\2\2\u014a\u014b" +
                    "\7q\2\2\u014b\u014c\7v\2\2\u014c\u014d\7k\2\2\u014d\u014e\7e\2\2\u014e" +
                    "\u014f\7k\2\2\u014f\u0150\7c\2\2\u0150\u0169\7u\2\2\u0151\u0152\7r\2\2" +
                    "\u0152\u0153\7c\2\2\u0153\u0154\7u\2\2\u0154\u0169\7q\2\2\u0155\u0156" +
                    "\7q\2\2\u0156\u0157\7e\2\2\u0157\u0158\7w\2\2\u0158\u0159\7t\2\2\u0159" +
                    "\u015a\7t\2\2\u015a\u015b\7k\2\2\u015b\u0169\7q\2\2\u015c\u015d\7n\2\2" +
                    "\u015d\u015e\7c\2\2\u015e\u015f\7u\2\2\u015f\u0160\7\"\2\2\u0160\u0161" +
                    "\7p\2\2\u0161\u0162\7q\2\2\u0162\u0163\7v\2\2\u0163\u0164\7k\2\2\u0164" +
                    "\u0165\7e\2\2\u0165\u0166\7k\2\2\u0166\u0167\7c\2\2\u0167\u0169\7u\2\2" +
                    "\u0168\u0149\3\2\2\2\u0168\u0151\3\2\2\2\u0168\u0155\3\2\2\2\u0168\u015c" +
                    "\3\2\2\2\u0169\60\3\2\2\2\u016a\u016b\7f\2\2\u016b\u016c\7g\2\2\u016c" +
                    "\u016d\7u\2\2\u016d\u016e\7v\2\2\u016e\u016f\7c\2\2\u016f\u0170\7e\2\2" +
                    "\u0170\u0171\7c\2\2\u0171\u0172\7f\2\2\u0172\u0173\7c\2\2\u0173\u018a" +
                    "\7u\2\2\u0174\u0175\7f\2\2\u0175\u0176\7k\2\2\u0176\u018a\7c\2\2\u0177" +
                    "\u0178\7e\2\2\u0178\u0179\7j\2\2\u0179\u017a\7k\2\2\u017a\u017b\7n\2\2" +
                    "\u017b\u018a\7g\2\2\u017c\u017d\7o\2\2\u017d\u017e\7w\2\2\u017e\u017f" +
                    "\7p\2\2\u017f\u0180\7f\2\2\u0180\u018a\7q\2\2\u0181\u0182\7f\2\2\u0182" +
                    "\u0183\7g\2\2\u0183\u0184\7r\2\2\u0184\u0185\7q\2\2\u0185\u0186\7t\2\2" +
                    "\u0186\u0187\7v\2\2\u0187\u0188\7g\2\2\u0188\u018a\7u\2\2\u0189\u016a" +
                    "\3\2\2\2\u0189\u0174\3\2\2\2\u0189\u0177\3\2\2\2\u0189\u017c\3\2\2\2\u0189" +
                    "\u0181\3\2\2\2\u018a\62\3\2\2\2\u018b\u018c\7e\2\2\u018c\u018d\7n\2\2" +
                    "\u018d\u018e\7k\2\2\u018e\u018f\7o\2\2\u018f\u01a2\7c\2\2\u0190\u0191" +
                    "\7v\2\2\u0191\u0192\7g\2\2\u0192\u0193\7o\2\2\u0193\u0194\7r\2\2\u0194" +
                    "\u0195\7g\2\2\u0195\u0196\7t\2\2\u0196\u0197\7c\2\2\u0197\u0198\7v\2\2" +
                    "\u0198\u0199\7w\2\2\u0199\u019a\7t\2\2\u019a\u01a2\7c\2\2\u019b\u019c" +
                    "\7v\2\2\u019c\u019d\7k\2\2\u019d\u019e\7g\2\2\u019e\u019f\7o\2\2\u019f" +
                    "\u01a0\7r\2\2\u01a0\u01a2\7q\2\2\u01a1\u018b\3\2\2\2\u01a1\u0190\3\2\2" +
                    "\2\u01a1\u019b\3\2\2\2\u01a2\64\3\2\2\2\u01a3\u01a4\7y\2\2\u01a4\u01a5" +
                    "\7j\2\2\u01a5\u01a6\7c\2\2\u01a6\u01a7\7v\2\2\u01a7\u01a8\7u\2\2\u01a8" +
                    "\u01a9\7c\2\2\u01a9\u01aa\7r\2\2\u01aa\u01b3\7r\2\2\u01ab\u01ac\7o\2\2" +
                    "\u01ac\u01ad\7g\2\2\u01ad\u01ae\7p\2\2\u01ae\u01af\7u\2\2\u01af\u01b0" +
                    "\7c\2\2\u01b0\u01b1\7l\2\2\u01b1\u01b3\7g\2\2\u01b2\u01a3\3\2\2\2\u01b2" +
                    "\u01ab\3\2\2\2\u01b3\66\3\2\2\2\u01b4\u01b5\7w\2\2\u01b5\u01b6\7d\2\2" +
                    "\u01b6\u01b7\7k\2\2\u01b7\u01b8\7e\2\2\u01b8\u01b9\7c\2\2\u01b9\u01ba" +
                    "\7e\2\2\u01ba\u01bb\7k\2\2\u01bb\u01bc\7q\2\2\u01bc\u01c3\7p\2\2\u01bd" +
                    "\u01be\7g\2\2\u01be\u01bf\7u\2\2\u01bf\u01c0\7v\2\2\u01c0\u01c1\7q\2\2" +
                    "\u01c1\u01c3\7{\2\2\u01c2\u01b4\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c38\3\2" +
                    "\2\2\u01c4\u01c5\7g\2\2\u01c5\u01c6\7p\2\2\u01c6\u01c7\7e\2\2\u01c7\u01c8" +
                    "\7w\2\2\u01c8\u01c9\7g\2\2\u01c9\u01ca\7p\2\2\u01ca\u01cb\7v\2\2\u01cb" +
                    "\u01cc\7t\2\2\u01cc\u01d1\7q\2\2\u01cd\u01ce\7j\2\2\u01ce\u01cf\7c\2\2" +
                    "\u01cf\u01d1\7{\2\2\u01d0\u01c4\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d1:\3\2" +
                    "\2\2\u01d2\u01d3\7g\2\2\u01d3\u01d4\7u\2\2\u01d4\u01d5\7v\2\2\u01d5\u01d6" +
                    "\7c\2\2\u01d6<\3\2\2\2\u01d7\u01d8\7e\2\2\u01d8\u01d9\7g\2\2\u01d9\u01da" +
                    "\7t\2\2\u01da\u01db\7e\2\2\u01db\u01e4\7c\2\2\u01dc\u01dd\7e\2\2\u01dd" +
                    "\u01de\7g\2\2\u01de\u01df\7t\2\2\u01df\u01e0\7e\2\2\u01e0\u01e1\7c\2\2" +
                    "\u01e1\u01e2\7p\2\2\u01e2\u01e4\7q\2\2\u01e3\u01d7\3\2\2\2\u01e3\u01dc" +
                    "\3\2\2\2\u01e4>\3\2\2\2\u01e5\u01e6\7d\2\2\u01e6\u01e7\7q\2\2\u01e7\u01e8" +
                    "\7t\2\2\u01e8\u01e9\7t\2\2\u01e9\u01ea\7c\2\2\u01ea\u01f1\7t\2\2\u01eb" +
                    "\u01ec\7d\2\2\u01ec\u01ed\7q\2\2\u01ed\u01ee\7t\2\2\u01ee\u01ef\7t\2\2" +
                    "\u01ef\u01f1\7c\2\2\u01f0\u01e5\3\2\2\2\u01f0\u01eb\3\2\2\2\u01f1@\3\2" +
                    "\2\2\u01f2\u01f3\7s\2\2\u01f3\u01f4\7w\2\2\u01f4\u01f5\7g\2\2\u01f5B\3" +
                    "\2\2\2\u01f6\u01f7\7f\2\2\u01f7\u0203\7g\2\2\u01f8\u01f9\7g\2\2\u01f9" +
                    "\u0203\7p\2\2\u01fa\u01fb\7u\2\2\u01fb\u01fc\7q\2\2\u01fc\u01fd\7d\2\2" +
                    "\u01fd\u01fe\7t\2\2\u01fe\u0203\7g\2\2\u01ff\u0200\7f\2\2\u0200\u0201" +
                    "\7g\2\2\u0201\u0203\7n\2\2\u0202\u01f6\3\2\2\2\u0202\u01f8\3\2\2\2\u0202" +
                    "\u01fa\3\2\2\2\u0202\u01ff\3\2\2\2\u0203D\3\2\2\2\u0204\u0205\7o\2\2\u0205" +
                    "\u0206\7k\2\2\u0206F\3\2\2\2\u0207\u0208\7f\2\2\u0208\u0209\7g\2\2\u0209" +
                    "\u020a\7\"\2\2\u020a\u020b\7n\2\2\u020b\u020c\7c\2\2\u020c\u020d\7\"\2" +
                    "\2\u020d\u020e\7o\2\2\u020e\u020f\7c\2\2\u020f\u0210\7\u00f3\2\2\u0210" +
                    "\u0211\7c\2\2\u0211\u0212\7p\2\2\u0212\u0236\7c\2\2\u0213\u0214\7f\2\2" +
                    "\u0214\u0215\7g\2\2\u0215\u0216\7\"\2\2\u0216\u0217\7n\2\2\u0217\u0218" +
                    "\7c\2\2\u0218\u0219\7\"\2\2\u0219\u021a\7v\2\2\u021a\u021b\7c\2\2\u021b" +
                    "\u021c\7t\2\2\u021c\u021d\7f\2\2\u021d\u0236\7g\2\2\u021e\u021f\7f\2\2" +
                    "\u021f\u0220\7g\2\2\u0220\u0221\7\"\2\2\u0221\u0222\7n\2\2\u0222\u0223" +
                    "\7c\2\2\u0223\u0224\7\"\2\2\u0224\u0225\7p\2\2\u0225\u0226\7q\2\2\u0226" +
                    "\u0227\7e\2\2\u0227\u0228\7j\2\2\u0228\u0236\7g\2\2\u0229\u022a\7f\2\2" +
                    "\u022a\u022b\7g\2\2\u022b\u022c\7\"\2\2\u022c\u022d\7n\2\2\u022d\u022e" +
                    "\7c\2\2\u022e\u022f\7\"\2\2\u022f\u0230\7o\2\2\u0230\u0231\7c\2\2\u0231" +
                    "\u0232\7p\2\2\u0232\u0233\7c\2\2\u0233\u0234\7p\2\2\u0234\u0236\7c\2\2" +
                    "\u0235\u0207\3\2\2\2\u0235\u0213\3\2\2\2\u0235\u021e\3\2\2\2\u0235\u0229" +
                    "\3\2\2\2\u0236H\3\2\2\2\u0237\u0238\7r\2\2\u0238\u023d\7o\2\2\u0239\u023a" +
                    "\7c\2\2\u023a\u023b\7\"\2\2\u023b\u023d\7o\2\2\u023c\u0237\3\2\2\2\u023c" +
                    "\u0239\3\2\2\2\u023dJ\3\2\2\2\u023e\u023f\7n\2\2\u023f\u0240\7w\2\2\u0240" +
                    "\u0241\7p\2\2\u0241\u0242\7g\2\2\u0242\u026d\7u\2\2\u0243\u0244\7o\2\2" +
                    "\u0244\u0245\7c\2\2\u0245\u0246\7t\2\2\u0246\u0247\7v\2\2\u0247\u0248" +
                    "\7g\2\2\u0248\u026d\7u\2\2\u0249\u024a\7o\2\2\u024a\u024b\7k\2\2\u024b" +
                    "\u024c\7g\2\2\u024c\u024d\7t\2\2\u024d\u024e\7e\2\2\u024e\u024f\7q\2\2" +
                    "\u024f\u0250\7n\2\2\u0250\u0251\7g\2\2\u0251\u026d\7u\2\2\u0252\u0253" +
                    "\7l\2\2\u0253\u0254\7w\2\2\u0254\u0255\7g\2\2\u0255\u0256\7x\2\2\u0256" +
                    "\u0257\7g\2\2\u0257\u026d\7u\2\2\u0258\u0259\7x\2\2\u0259\u025a\7k\2\2" +
                    "\u025a\u025b\7g\2\2\u025b\u025c\7t\2\2\u025c\u025d\7p\2\2\u025d\u025e" +
                    "\7g\2\2\u025e\u026d\7u\2\2\u025f\u0260\7u\2\2\u0260\u0261\7c\2\2\u0261" +
                    "\u0262\7d\2\2\u0262\u0263\7c\2\2\u0263\u0264\7f\2\2\u0264\u026d\7q\2\2" +
                    "\u0265\u0266\7f\2\2\u0266\u0267\7q\2\2\u0267\u0268\7o\2\2\u0268\u0269" +
                    "\7k\2\2\u0269\u026a\7p\2\2\u026a\u026b\7i\2\2\u026b\u026d\7q\2\2\u026c" +
                    "\u023e\3\2\2\2\u026c\u0243\3\2\2\2\u026c\u0249\3\2\2\2\u026c\u0252\3\2" +
                    "\2\2\u026c\u0258\3\2\2\2\u026c\u025f\3\2\2\2\u026c\u0265\3\2\2\2\u026d" +
                    "L\3\2\2\2\u026e\u026f\7g\2\2\u026f\u0270\7p\2\2\u0270\u0271\7g\2\2\u0271" +
                    "\u0272\7t\2\2\u0272\u02bc\7q\2\2\u0273\u0274\7h\2\2\u0274\u0275\7g\2\2" +
                    "\u0275\u0276\7d\2\2\u0276\u0277\7t\2\2\u0277\u0278\7g\2\2\u0278\u0279" +
                    "\7t\2\2\u0279\u02bc\7q\2\2\u027a\u027b\7o\2\2\u027b\u027c\7c\2\2\u027c" +
                    "\u027d\7t\2\2\u027d\u027e\7|\2\2\u027e\u02bc\7q\2\2\u027f\u0280\7c\2\2" +
                    "\u0280\u0281\7d\2\2\u0281\u0282\7t\2\2\u0282\u0283\7k\2\2\u0283\u02bc" +
                    "\7n\2\2\u0284\u0285\7o\2\2\u0285\u0286\7c\2\2\u0286\u0287\7{\2\2\u0287" +
                    "\u02bc\7q\2\2\u0288\u0289\7l\2\2\u0289\u028a\7w\2\2\u028a\u028b\7p\2\2" +
                    "\u028b\u028c\7k\2\2\u028c\u02bc\7q\2\2\u028d\u028e\7l\2\2\u028e\u028f" +
                    "\7w\2\2\u028f\u0290\7n\2\2\u0290\u0291\7k\2\2\u0291\u02bc\7q\2\2\u0292" +
                    "\u0293\7c\2\2\u0293\u0294\7i\2\2\u0294\u0295\7q\2\2\u0295\u0296\7u\2\2" +
                    "\u0296\u0297\7v\2\2\u0297\u02bc\7q\2\2\u0298\u0299\7u\2\2\u0299\u029a" +
                    "\7g\2\2\u029a\u029b\7r\2\2\u029b\u029c\7v\2\2\u029c\u029d\7k\2\2\u029d" +
                    "\u029e\7g\2\2\u029e\u029f\7o\2\2\u029f\u02a0\7d\2\2\u02a0\u02a1\7t\2\2" +
                    "\u02a1\u02bc\7g\2\2\u02a2\u02a3\7q\2\2\u02a3\u02a4\7e\2\2\u02a4\u02a5" +
                    "\7v\2\2\u02a5\u02a6\7w\2\2\u02a6\u02a7\7d\2\2\u02a7\u02a8\7t\2\2\u02a8" +
                    "\u02bc\7g\2\2\u02a9\u02aa\7p\2\2\u02aa\u02ab\7q\2\2\u02ab\u02ac\7x\2\2" +
                    "\u02ac\u02ad\7k\2\2\u02ad\u02ae\7g\2\2\u02ae\u02af\7o\2\2\u02af\u02b0" +
                    "\7d\2\2\u02b0\u02b1\7t\2\2\u02b1\u02bc\7g\2\2\u02b2\u02b3\7f\2\2\u02b3" +
                    "\u02b4\7k\2\2\u02b4\u02b5\7e\2\2\u02b5\u02b6\7k\2\2\u02b6\u02b7\7g\2\2" +
                    "\u02b7\u02b8\7o\2\2\u02b8\u02b9\7d\2\2\u02b9\u02ba\7t\2\2\u02ba\u02bc" +
                    "\7g\2\2\u02bb\u026e\3\2\2\2\u02bb\u0273\3\2\2\2\u02bb\u027a\3\2\2\2\u02bb" +
                    "\u027f\3\2\2\2\u02bb\u0284\3\2\2\2\u02bb\u0288\3\2\2\2\u02bb\u028d\3\2" +
                    "\2\2\u02bb\u0292\3\2\2\2\u02bb\u0298\3\2\2\2\u02bb\u02a2\3\2\2\2\u02bb" +
                    "\u02a9\3\2\2\2\u02bb\u02b2\3\2\2\2\u02bcN\3\2\2\2\u02bd\u02be\7j\2\2\u02be" +
                    "\u02bf\7q\2\2\u02bf\u02e7\7{\2\2\u02c0\u02c1\7o\2\2\u02c1\u02c2\7c\2\2" +
                    "\u02c2\u02c3\7\u00f3\2\2\u02c3\u02c4\7c\2\2\u02c4\u02c5\7p\2\2\u02c5\u02e7" +
                    "\7c\2\2\u02c6\u02c7\7r\2\2\u02c7\u02c8\7c\2\2\u02c8\u02c9\7u\2\2\u02c9" +
                    "\u02ca\7c\2\2\u02ca\u02cb\7f\2\2\u02cb\u02cc\7q\2\2\u02cc\u02cd\7\"\2" +
                    "\2\u02cd\u02ce\7o\2\2\u02ce\u02cf\7c\2\2\u02cf\u02d0\7\u00f3\2\2\u02d0" +
                    "\u02d1\7c\2\2\u02d1\u02d2\7p\2\2\u02d2\u02e7\7c\2\2\u02d3\u02d4\7o\2\2" +
                    "\u02d4\u02d5\7c\2\2\u02d5\u02d6\7p\2\2\u02d6\u02d7\7c\2\2\u02d7\u02d8" +
                    "\7p\2\2\u02d8\u02e7\7c\2\2\u02d9\u02da\7r\2\2\u02da\u02db\7c\2\2\u02db" +
                    "\u02dc\7u\2\2\u02dc\u02dd\7c\2\2\u02dd\u02de\7f\2\2\u02de\u02df\7q\2\2" +
                    "\u02df\u02e0\7\"\2\2\u02e0\u02e1\7o\2\2\u02e1\u02e2\7c\2\2\u02e2\u02e3" +
                    "\7p\2\2\u02e3\u02e4\7c\2\2\u02e4\u02e5\7p\2\2\u02e5\u02e7\7c\2\2\u02e6" +
                    "\u02bd\3\2\2\2\u02e6\u02c0\3\2\2\2\u02e6\u02c6\3\2\2\2\u02e6\u02d3\3\2" +
                    "\2\2\u02e6\u02d9\3\2\2\2\u02e7P\3\2\2\2\u02e8\u02e9\7n\2\2\u02e9\u02ea" +
                    "\7n\2\2\u02ea\u02eb\7c\2\2\u02eb\u02ec\7o\2\2\u02ec\u02ed\7c\2\2\u02ed" +
                    "\u02fe\7t\2\2\u02ee\u02ef\7n\2\2\u02ef\u02f0\7n\2\2\u02f0\u02f1\7c\2\2" +
                    "\u02f1\u02f2\7o\2\2\u02f2\u02fe\7c\2\2\u02f3\u02f4\7e\2\2\u02f4\u02f5" +
                    "\7q\2\2\u02f5\u02f6\7p\2\2\u02f6\u02f7\7v\2\2\u02f7\u02f8\7c\2\2\u02f8" +
                    "\u02f9\7e\2\2\u02f9\u02fa\7v\2\2\u02fa\u02fb\7c\2\2\u02fb\u02fc\7o\2\2" +
                    "\u02fc\u02fe\7g\2\2\u02fd\u02e8\3\2\2\2\u02fd\u02ee\3\2\2\2\u02fd\u02f3" +
                    "\3\2\2\2\u02feR\3\2\2\2\u02ff\u0301\t\2\2\2\u0300\u02ff\3\2\2\2\u0301" +
                    "\u0302\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303T\3\2\2\2" +
                    "\u0304\u0306\4\62;\2\u0305\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0305" +
                    "\3\2\2\2\u0307\u0308\3\2\2\2\u0308V\3\2\2\2\u0309\u030b\t\3\2\2\u030a" +
                    "\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2" +
                    "\2\2\u030d\u030e\3\2\2\2\u030e\u030f\b,\2\2\u030fX\3\2\2\2\33\2\u00a2" +
                    "\u00b8\u00db\u00eb\u0113\u0147\u0168\u0189\u01a1\u01b2\u01c2\u01d0\u01e3" +
                    "\u01f0\u0202\u0235\u023c\u026c\u02bb\u02e6\u02fd\u0302\u0307\u030c\3\2" +
                    "\3\2";
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
            null, "'la'", "'es'", "'el'", "'un'", "'una'", "'para el'", "'de'", "'a las'",
            "'y'", "'a'", "'con'", "'hay'", "'los'", null, null, null, null, "'donde'",
            "'hora'", "'alarma'", null, null, null, null, null, null, null, null,
            "'esta'", null, null, "'que'", null, "'mi'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, "ENVIAR", "BUSQUEDA", "PETICION", "AGENDA", "PREGUNTA", "RELOJ",
            "ALARMA", "COLOCAR", "RECORDATORIO", "NOTICIAS", "TIPO_NOTICIA", "CLIMA",
            "WHATSAPP", "UBICACION", "EXPLORAR", "BUSCAR", "CERCA", "BORRAR", "INTERROGACION",
            "PREPOSICION", "ADJETIVO", "HORARIO", "AMPM", "DIA", "MES", "SEUDODIA",
            "LLAMADA", "STRING", "NUMEROS", "WS"
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