// Generated from /media/HD/Documentos/Proyectos Git/Icaro Engine/IcaroEngine.g4 by ANTLR 4.5

package cl.bit01.icaro.Engine;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

import cl.bit01.icaro.Fragments.Funcionalidades.Clock;
import cl.bit01.icaro.Fragments.Funcionalidades.Weather;
import cl.bit01.icaro.R;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IcaroEngineParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0=1, T__1=2, T__2=3, PETICION=4, RELOJ=5, CLIMA=6, INTERROGACION=7,
            PREPOSICION=8, STRING=9, NUMEROS=10, WS=11;
    public static final int
            RULE_icaro = 0, RULE_funcion = 1, RULE_reloj = 2, RULE_clima = 3, RULE_string = 4;
    public static final String[] ruleNames = {
            "icaro", "funcion", "reloj", "clima", "string"
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

    private FragmentManager mFragmentManager;

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
    public String getGrammarFileName() { return "IcaroEngine.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public ATN getATN() { return _ATN; }

    public IcaroEngineParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }
    public static class IcaroContext extends ParserRuleContext {
        public FuncionContext funcion() {
            return getRuleContext(FuncionContext.class,0);
        }
        public IcaroContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_icaro; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterIcaro(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitIcaro(this);
        }
    }

    public final IcaroContext icaro(FragmentManager mFragmentManager) throws RecognitionException {
        this.mFragmentManager = mFragmentManager;
        IcaroContext _localctx = new IcaroContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_icaro);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(10);
                funcion();
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

    public static class FuncionContext extends ParserRuleContext {
        public RelojContext reloj() {
            return getRuleContext(RelojContext.class,0);
        }
        public ClimaContext clima() {
            return getRuleContext(ClimaContext.class,0);
        }
        public FuncionContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_funcion; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterFuncion(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitFuncion(this);
        }
    }

    public final FuncionContext funcion() throws RecognitionException {
        FuncionContext _localctx = new FuncionContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_funcion);
        try {
            setState(14);
            switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(12);
                    reloj();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(13);
                    clima();
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

    public static class RelojContext extends ParserRuleContext {
        public StringContext ciudad;
        public TerminalNode PETICION() { return getToken(IcaroEngineParser.PETICION, 0); }
        public TerminalNode RELOJ() { return getToken(IcaroEngineParser.RELOJ, 0); }
        public TerminalNode INTERROGACION() { return getToken(IcaroEngineParser.INTERROGACION, 0); }
        public TerminalNode PREPOSICION() { return getToken(IcaroEngineParser.PREPOSICION, 0); }
        public StringContext string() {
            return getRuleContext(StringContext.class,0);
        }
        public RelojContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_reloj; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterReloj(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitReloj(this);
        }
    }

    public final RelojContext reloj() throws RecognitionException {
        RelojContext _localctx = new RelojContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_reloj);
        try {
            setState(39);
            switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(22);
                    switch (_input.LA(1)) {
                        case PETICION:
                        {
                            {
                                {
                                    setState(16);
                                    match(PETICION);
                                }
                                setState(17);
                                match(T__0);
                                {
                                    setState(18);
                                    match(RELOJ);
                                }
                            }
                        }
                        break;
                        case INTERROGACION:
                        {
                            {
                                {
                                    setState(19);
                                    match(INTERROGACION);
                                }
                                {
                                    setState(20);
                                    match(RELOJ);
                                }
                                {
                                    setState(21);
                                    match(T__1);
                                }
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }

                    Log.d("Icaro", "ENGINE - Funcion Hora Reconocida");
                    Fragment clockFragment = new Clock();

                    Bundle bundle = new Bundle();
                    bundle.putString("layoutMode", "localClock");

                    clockFragment.setArguments(bundle);

                    mFragmentManager.beginTransaction()
                            .replace(R.id.fragmentMainIcaro, clockFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .commit();


                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(35);
                    switch (_input.LA(1)) {
                        case PETICION:
                        {
                            {
                                {
                                    setState(25);
                                    match(PETICION);
                                }
                                setState(26);
                                match(T__0);
                                {
                                    setState(27);
                                    match(RELOJ);
                                }
                                {
                                    setState(28);
                                    match(PREPOSICION);
                                }
                                {
                                    setState(29);
                                    ((RelojContext)_localctx).ciudad = string();
                                }
                            }
                        }
                        break;
                        case INTERROGACION:
                        {
                            {
                                {
                                    setState(30);
                                    match(INTERROGACION);
                                }
                                {
                                    setState(31);
                                    match(RELOJ);
                                }
                                {
                                    setState(32);
                                    match(T__1);
                                }
                                {
                                    setState(33);
                                    match(PREPOSICION);
                                }
                                {
                                    setState(34);
                                    ((RelojContext)_localctx).ciudad = string();
                                }
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }

                    Log.d("Icaro","ENGINE - Funcion Hora Reconocida en Ciudad: "+(((RelojContext)_localctx).ciudad!=null?_input.getText(((RelojContext)_localctx).ciudad.start,((RelojContext)_localctx).ciudad.stop):null));
                    Fragment clockFragment = new Clock();

                    Bundle bundle = new Bundle();
                    bundle.putString("layoutMode", "worldClock");
                    bundle.putString("city",(((RelojContext)_localctx).ciudad!=null?_input.getText(((RelojContext)_localctx).ciudad.start,((RelojContext)_localctx).ciudad.stop):null));

                    clockFragment.setArguments(bundle);

                    mFragmentManager.beginTransaction()
                            .replace(R.id.fragmentMainIcaro, clockFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .commit();

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

    public static class ClimaContext extends ParserRuleContext {
        public StringContext ciudad;
        public TerminalNode CLIMA() { return getToken(IcaroEngineParser.CLIMA, 0); }
        public TerminalNode PETICION() { return getToken(IcaroEngineParser.PETICION, 0); }
        public TerminalNode PREPOSICION() { return getToken(IcaroEngineParser.PREPOSICION, 0); }
        public StringContext string() {
            return getRuleContext(StringContext.class,0);
        }
        public ClimaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_clima; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterClima(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitClima(this);
        }
    }

    public final ClimaContext clima() throws RecognitionException {
        ClimaContext _localctx = new ClimaContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_clima);
        int _la;
        try {
            setState(58);
            switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        {
                            setState(42);
                            _la = _input.LA(1);
                            if (_la==PETICION) {
                                {
                                    setState(41);
                                    match(PETICION);
                                }
                            }

                        }
                        setState(44);
                        _la = _input.LA(1);
                        if ( !(_la==T__0 || _la==T__2) ) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        {
                            setState(45);
                            match(CLIMA);
                        }
                    }

                    Log.d("Icaro","ENGINE - Funcion Clima Reconocida");
                    Fragment weatherFragment = new Weather();

                    mFragmentManager.beginTransaction()
                            .replace(R.id.fragmentMainIcaro, weatherFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .commit();

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    {
                        {
                            setState(49);
                            _la = _input.LA(1);
                            if (_la==PETICION) {
                                {
                                    setState(48);
                                    match(PETICION);
                                }
                            }

                        }
                        setState(51);
                        _la = _input.LA(1);
                        if ( !(_la==T__0 || _la==T__2) ) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        {
                            setState(52);
                            match(CLIMA);
                        }
                        {
                            setState(53);
                            match(PREPOSICION);
                        }
                        {
                            setState(54);
                            ((ClimaContext)_localctx).ciudad = string();
                        }
                    }

                    Log.d("Icaro","ENGINE - Funcion Clima Reconocida en Ciudad: "+(((ClimaContext)_localctx).ciudad!=null?_input.getText(((ClimaContext)_localctx).ciudad.start,((ClimaContext)_localctx).ciudad.stop):null));
                    Fragment weatherFragment = new Weather();

                    Bundle bundle = new Bundle();
                    bundle.putString("city",(((ClimaContext)_localctx).ciudad!=null?_input.getText(((ClimaContext)_localctx).ciudad.start,((ClimaContext)_localctx).ciudad.stop):null));

                    weatherFragment.setArguments(bundle);

                    mFragmentManager.beginTransaction()
                            .replace(R.id.fragmentMainIcaro, weatherFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .commit();

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

    public static class StringContext extends ParserRuleContext {
        public List<TerminalNode> STRING() { return getTokens(IcaroEngineParser.STRING); }
        public TerminalNode STRING(int i) {
            return getToken(IcaroEngineParser.STRING, i);
        }
        public List<TerminalNode> WS() { return getTokens(IcaroEngineParser.WS); }
        public TerminalNode WS(int i) {
            return getToken(IcaroEngineParser.WS, i);
        }
        public List<TerminalNode> NUMEROS() { return getTokens(IcaroEngineParser.NUMEROS); }
        public TerminalNode NUMEROS(int i) {
            return getToken(IcaroEngineParser.NUMEROS, i);
        }
        public StringContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_string; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterString(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitString(this);
        }
    }

    public final StringContext string() throws RecognitionException {
        StringContext _localctx = new StringContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_string);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(66);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(66);
                        switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
                            case 1:
                            {
                                {
                                    setState(60);
                                    match(STRING);
                                    setState(61);
                                    match(WS);
                                }
                            }
                            break;
                            case 2:
                            {
                                {
                                    setState(62);
                                    match(STRING);
                                }
                            }
                            break;
                            case 3:
                            {
                                {
                                    setState(63);
                                    match(NUMEROS);
                                    setState(64);
                                    match(WS);
                                }
                            }
                            break;
                            case 4:
                            {
                                {
                                    setState(65);
                                    match(NUMEROS);
                                }
                            }
                            break;
                        }
                    }
                    setState(68);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==STRING || _la==NUMEROS );
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

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rI\4\2\t\2\4\3\t"+
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\5\3\21\n\3\3\4\3\4\3\4\3\4"+
                    "\3\4\3\4\5\4\31\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4&\n"+
                    "\4\3\4\3\4\5\4*\n\4\3\5\5\5-\n\5\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5\3\5\3"+
                    "\5\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6E\n\6\r\6\16"+
                    "\6F\3\6\2\2\7\2\4\6\b\n\2\3\4\2\3\3\5\5N\2\f\3\2\2\2\4\20\3\2\2\2\6)\3"+
                    "\2\2\2\b<\3\2\2\2\nD\3\2\2\2\f\r\5\4\3\2\r\3\3\2\2\2\16\21\5\6\4\2\17"+
                    "\21\5\b\5\2\20\16\3\2\2\2\20\17\3\2\2\2\21\5\3\2\2\2\22\23\7\6\2\2\23"+
                    "\24\7\3\2\2\24\31\7\7\2\2\25\26\7\t\2\2\26\27\7\7\2\2\27\31\7\4\2\2\30"+
                    "\22\3\2\2\2\30\25\3\2\2\2\31\32\3\2\2\2\32*\b\4\1\2\33\34\7\6\2\2\34\35"+
                    "\7\3\2\2\35\36\7\7\2\2\36\37\7\n\2\2\37&\5\n\6\2 !\7\t\2\2!\"\7\7\2\2"+
                    "\"#\7\4\2\2#$\7\n\2\2$&\5\n\6\2%\33\3\2\2\2% \3\2\2\2&\'\3\2\2\2\'(\b"+
                    "\4\1\2(*\3\2\2\2)\30\3\2\2\2)%\3\2\2\2*\7\3\2\2\2+-\7\6\2\2,+\3\2\2\2"+
                    ",-\3\2\2\2-.\3\2\2\2./\t\2\2\2/\60\7\b\2\2\60\61\3\2\2\2\61=\b\5\1\2\62"+
                    "\64\7\6\2\2\63\62\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\t\2\2\2\66"+
                    "\67\7\b\2\2\678\7\n\2\289\5\n\6\29:\3\2\2\2:;\b\5\1\2;=\3\2\2\2<,\3\2"+
                    "\2\2<\63\3\2\2\2=\t\3\2\2\2>?\7\13\2\2?E\7\r\2\2@E\7\13\2\2AB\7\f\2\2"+
                    "BE\7\r\2\2CE\7\f\2\2D>\3\2\2\2D@\3\2\2\2DA\3\2\2\2DC\3\2\2\2EF\3\2\2\2"+
                    "FD\3\2\2\2FG\3\2\2\2G\13\3\2\2\2\13\20\30%),\63<DF";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}