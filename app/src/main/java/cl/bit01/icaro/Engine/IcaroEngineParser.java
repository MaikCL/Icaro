// Generated from /media/HD/Documentos/Proyectos Git/Icaro Engine/IcaroEngine.g4 by ANTLR 4.5

package cl.bit01.icaro.Engine;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.util.Log;

import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import cl.bit01.icaro.Fragments.Funcionalidades.Hora;
import cl.bit01.icaro.R;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IcaroEngineParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
    }

    public static final int
            T__0 = 1, T__1 = 2, PETICION = 3, RELOJ = 4, INTERROGACION = 5;
    public static final int
            RULE_icaro = 0, RULE_funcion = 1, RULE_reloj = 2;
    public static final String[] ruleNames = {
            "icaro", "funcion", "reloj"
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\7\27\4\2\t\2\4\3" +
                    "\t\3\4\4\t\4\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\23\n\4\3\4\3" +
                    "\4\3\4\2\2\5\2\4\6\2\2\24\2\b\3\2\2\2\4\n\3\2\2\2\6\22\3\2\2\2\b\t\5\4" +
                    "\3\2\t\3\3\2\2\2\n\13\5\6\4\2\13\5\3\2\2\2\f\r\7\5\2\2\r\16\7\3\2\2\16" +
                    "\23\7\6\2\2\17\20\7\7\2\2\20\21\7\6\2\2\21\23\7\4\2\2\22\f\3\2\2\2\22" +
                    "\17\3\2\2\2\23\24\3\2\2\2\24\25\b\4\1\2\25\7\3\2\2\2\3\22";
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
    private FragmentManager mFragmentManager;

    public IcaroEngineParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public ATN getATN() {
        return _ATN;
    }

    public final IcaroContext icaro(FragmentManager mFragmentManager) throws RecognitionException {
        this.mFragmentManager = mFragmentManager;
        IcaroContext _localctx = new IcaroContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_icaro);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(6);
                funcion();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final FuncionContext funcion() throws RecognitionException {
        FuncionContext _localctx = new FuncionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_funcion);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(8);
                reloj();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final RelojContext reloj() throws RecognitionException {
        RelojContext _localctx = new RelojContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_reloj);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(16);
                switch (_input.LA(1)) {
                    case PETICION: {
                        {
                            {
                                setState(10);
                                match(PETICION);
                            }
                            setState(11);
                            match(T__0);
                            {
                                setState(12);
                                match(RELOJ);
                            }
                        }
                    }
                    break;
                    case INTERROGACION: {
                        {
                            {
                                setState(13);
                                match(INTERROGACION);
                            }
                            {
                                setState(14);
                                match(RELOJ);
                            }
                            {
                                setState(15);
                                match(T__1);
                            }
                        }
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }

                Log.d("Icaro", "ENGINE - Funcion Hora Reconocida");
                mFragmentManager.beginTransaction()
                        .replace(R.id.fragmentMainIcaro, new Hora())
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IcaroContext extends ParserRuleContext {
        public IcaroContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FuncionContext funcion() {
            return getRuleContext(FuncionContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_icaro;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IcaroEngineListener)
                ((IcaroEngineListener) listener).enterIcaro(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IcaroEngineListener)
                ((IcaroEngineListener) listener).exitIcaro(this);
        }
    }

    public static class FuncionContext extends ParserRuleContext {
        public FuncionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public RelojContext reloj() {
            return getRuleContext(RelojContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_funcion;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IcaroEngineListener)
                ((IcaroEngineListener) listener).enterFuncion(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IcaroEngineListener)
                ((IcaroEngineListener) listener).exitFuncion(this);
        }
    }

    public static class RelojContext extends ParserRuleContext {
        public RelojContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode PETICION() {
            return getToken(IcaroEngineParser.PETICION, 0);
        }

        public TerminalNode RELOJ() {
            return getToken(IcaroEngineParser.RELOJ, 0);
        }

        public TerminalNode INTERROGACION() {
            return getToken(IcaroEngineParser.INTERROGACION, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_reloj;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof IcaroEngineListener)
                ((IcaroEngineListener) listener).enterReloj(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof IcaroEngineListener)
                ((IcaroEngineListener) listener).exitReloj(this);
        }
    }
}