// Generated from /media/HD/Documentos/Proyectos Git/Icaro Engine/IcaroEngine.g4 by ANTLR 4.5

package cl.bit01.icaro.Engine;

    /*
     *    Disclaimer: Interpreter for Spanish Language
     *    Interprete de frases para idioma Español
     */

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

import cl.bit01.icaro.Fragments.Features.Clock;
import cl.bit01.icaro.Fragments.Features.Location;
import cl.bit01.icaro.Fragments.Features.Weather;
import cl.bit01.icaro.R;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IcaroEngineParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0=1, T__1=2, T__2=3, PETICION=4, PREGUNTA=5, RELOJ=6, CLIMA=7, UBICACION=8,
            INTERROGACION=9, PREPOSICION=10, ADJETIVO=11, STRING=12, NUMEROS=13, WS=14;
    public static final int
            RULE_icaro = 0, RULE_funcionalidad = 1, RULE_reloj = 2, RULE_clima = 3,
            RULE_ubicacion_actual = 4, RULE_string = 5;
    public static final String[] ruleNames = {
            "icaro", "funcionalidad", "reloj", "clima", "ubicacion_actual", "string"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'la'", "'es'", "'el'", null, "'donde'", "'hora'", null, null, "'que'",
            null, "'mi'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, "PETICION", "PREGUNTA", "RELOJ", "CLIMA", "UBICACION",
            "INTERROGACION", "PREPOSICION", "ADJETIVO", "STRING", "NUMEROS", "WS"
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
        public FuncionalidadContext funcionalidad() {
            return getRuleContext(FuncionalidadContext.class,0);
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
                setState(12);
                funcionalidad();
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

    public static class FuncionalidadContext extends ParserRuleContext {
        public RelojContext reloj() {
            return getRuleContext(RelojContext.class,0);
        }
        public ClimaContext clima() {
            return getRuleContext(ClimaContext.class,0);
        }
        public Ubicacion_actualContext ubicacion_actual() {
            return getRuleContext(Ubicacion_actualContext.class,0);
        }
        public FuncionalidadContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_funcionalidad; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterFuncionalidad(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitFuncionalidad(this);
        }
    }

    public final FuncionalidadContext funcionalidad() throws RecognitionException {
        FuncionalidadContext _localctx = new FuncionalidadContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_funcionalidad);
        try {
            setState(17);
            switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(14);
                    reloj();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(15);
                    clima();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(16);
                    ubicacion_actual();
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
            setState(42);
            switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(25);
                    switch (_input.LA(1)) {
                        case PETICION:
                        {
                            {
                                {
                                    setState(19);
                                    match(PETICION);
                                }
                                setState(20);
                                match(T__0);
                                {
                                    setState(21);
                                    match(RELOJ);
                                }
                            }
                        }
                        break;
                        case INTERROGACION:
                        {
                            {
                                {
                                    setState(22);
                                    match(INTERROGACION);
                                }
                                {
                                    setState(23);
                                    match(RELOJ);
                                }
                                {
                                    setState(24);
                                    match(T__1);
                                }
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }

                    Log.d("Icaro", "ENGINE - Funcionalidad Hora Reconocida");
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
                    setState(38);
                    switch (_input.LA(1)) {
                        case PETICION:
                        {
                            {
                                {
                                    setState(28);
                                    match(PETICION);
                                }
                                setState(29);
                                match(T__0);
                                {
                                    setState(30);
                                    match(RELOJ);
                                }
                                {
                                    setState(31);
                                    match(PREPOSICION);
                                }
                                {
                                    setState(32);
                                    ((RelojContext)_localctx).ciudad = string();
                                }
                            }
                        }
                        break;
                        case INTERROGACION:
                        {
                            {
                                {
                                    setState(33);
                                    match(INTERROGACION);
                                }
                                {
                                    setState(34);
                                    match(RELOJ);
                                }
                                {
                                    setState(35);
                                    match(T__1);
                                }
                                {
                                    setState(36);
                                    match(PREPOSICION);
                                }
                                {
                                    setState(37);
                                    ((RelojContext)_localctx).ciudad = string();
                                }
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }

                    Log.d("Icaro","ENGINE - Funcionalidad Hora Reconocida en Ciudad: "+(((RelojContext)_localctx).ciudad!=null?_input.getText(((RelojContext)_localctx).ciudad.start,((RelojContext)_localctx).ciudad.stop):null));
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
            setState(61);
            switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        {
                            setState(45);
                            _la = _input.LA(1);
                            if (_la==PETICION) {
                                {
                                    setState(44);
                                    match(PETICION);
                                }
                            }

                        }
                        setState(47);
                        _la = _input.LA(1);
                        if ( !(_la==T__0 || _la==T__2) ) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        {
                            setState(48);
                            match(CLIMA);
                        }
                    }

                    Log.d("Icaro","ENGINE - Funcionalidad Clima Reconocida");
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
                            setState(52);
                            _la = _input.LA(1);
                            if (_la==PETICION) {
                                {
                                    setState(51);
                                    match(PETICION);
                                }
                            }

                        }
                        setState(54);
                        _la = _input.LA(1);
                        if ( !(_la==T__0 || _la==T__2) ) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        {
                            setState(55);
                            match(CLIMA);
                        }
                        {
                            setState(56);
                            match(PREPOSICION);
                        }
                        {
                            setState(57);
                            ((ClimaContext)_localctx).ciudad = string();
                        }
                    }

                    Log.d("Icaro","ENGINE - Funcionalidad Clima Reconocida en Ciudad: "+(((ClimaContext)_localctx).ciudad!=null?_input.getText(((ClimaContext)_localctx).ciudad.start,((ClimaContext)_localctx).ciudad.stop):null));
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

    public static class Ubicacion_actualContext extends ParserRuleContext {
        public TerminalNode PETICION() { return getToken(IcaroEngineParser.PETICION, 0); }
        public TerminalNode ADJETIVO() { return getToken(IcaroEngineParser.ADJETIVO, 0); }
        public TerminalNode UBICACION() { return getToken(IcaroEngineParser.UBICACION, 0); }
        public TerminalNode PREGUNTA() { return getToken(IcaroEngineParser.PREGUNTA, 0); }
        public Ubicacion_actualContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_ubicacion_actual; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterUbicacion_actual(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitUbicacion_actual(this);
        }
    }

    public final Ubicacion_actualContext ubicacion_actual() throws RecognitionException {
        Ubicacion_actualContext _localctx = new Ubicacion_actualContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_ubicacion_actual);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(68);
                switch (_input.LA(1)) {
                    case PETICION:
                    {
                        {
                            {
                                setState(63);
                                match(PETICION);
                            }
                            {
                                setState(64);
                                match(ADJETIVO);
                            }
                            {
                                setState(65);
                                match(UBICACION);
                            }
                        }
                    }
                    break;
                    case PREGUNTA:
                    {
                        {
                            {
                                setState(66);
                                match(PREGUNTA);
                            }
                            {
                                setState(67);
                                match(UBICACION);
                            }
                        }
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }

                Log.d("Icaro", "ENGINE - Funcionalidad Ubicacion Actual Reconocida");
                Fragment locationFragment = new Location();

                mFragmentManager.beginTransaction()
                        .replace(R.id.fragmentMainIcaro, locationFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .commit();
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
        enterRule(_localctx, 10, RULE_string);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(78);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(78);
                        switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
                            case 1:
                            {
                                {
                                    setState(72);
                                    match(STRING);
                                    setState(73);
                                    match(WS);
                                }
                            }
                            break;
                            case 2:
                            {
                                {
                                    setState(74);
                                    match(STRING);
                                }
                            }
                            break;
                            case 3:
                            {
                                {
                                    setState(75);
                                    match(NUMEROS);
                                    setState(76);
                                    match(WS);
                                }
                            }
                            break;
                            case 4:
                            {
                                {
                                    setState(77);
                                    match(NUMEROS);
                                }
                            }
                            break;
                        }
                    }
                    setState(80);
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20U\4\2\t\2\4\3\t"+
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\5\3\24\n\3\3\4"+
                    "\3\4\3\4\3\4\3\4\3\4\5\4\34\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
                    "\4\3\4\5\4)\n\4\3\4\3\4\5\4-\n\4\3\5\5\5\60\n\5\3\5\3\5\3\5\3\5\3\5\5"+
                    "\5\67\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5@\n\5\3\6\3\6\3\6\3\6\3\6\5\6"+
                    "G\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\6\7Q\n\7\r\7\16\7R\3\7\2\2\b\2\4"+
                    "\6\b\n\f\2\3\4\2\3\3\5\5[\2\16\3\2\2\2\4\23\3\2\2\2\6,\3\2\2\2\b?\3\2"+
                    "\2\2\nF\3\2\2\2\fP\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\24\5\6\4\2\21"+
                    "\24\5\b\5\2\22\24\5\n\6\2\23\20\3\2\2\2\23\21\3\2\2\2\23\22\3\2\2\2\24"+
                    "\5\3\2\2\2\25\26\7\6\2\2\26\27\7\3\2\2\27\34\7\b\2\2\30\31\7\13\2\2\31"+
                    "\32\7\b\2\2\32\34\7\4\2\2\33\25\3\2\2\2\33\30\3\2\2\2\34\35\3\2\2\2\35"+
                    "-\b\4\1\2\36\37\7\6\2\2\37 \7\3\2\2 !\7\b\2\2!\"\7\f\2\2\")\5\f\7\2#$"+
                    "\7\13\2\2$%\7\b\2\2%&\7\4\2\2&\'\7\f\2\2\')\5\f\7\2(\36\3\2\2\2(#\3\2"+
                    "\2\2)*\3\2\2\2*+\b\4\1\2+-\3\2\2\2,\33\3\2\2\2,(\3\2\2\2-\7\3\2\2\2.\60"+
                    "\7\6\2\2/.\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\t\2\2\2\62\63\7\t\2"+
                    "\2\63\64\3\2\2\2\64@\b\5\1\2\65\67\7\6\2\2\66\65\3\2\2\2\66\67\3\2\2\2"+
                    "\678\3\2\2\289\t\2\2\29:\7\t\2\2:;\7\f\2\2;<\5\f\7\2<=\3\2\2\2=>\b\5\1"+
                    "\2>@\3\2\2\2?/\3\2\2\2?\66\3\2\2\2@\t\3\2\2\2AB\7\6\2\2BC\7\r\2\2CG\7"+
                    "\n\2\2DE\7\7\2\2EG\7\n\2\2FA\3\2\2\2FD\3\2\2\2GH\3\2\2\2HI\b\6\1\2I\13"+
                    "\3\2\2\2JK\7\16\2\2KQ\7\20\2\2LQ\7\16\2\2MN\7\17\2\2NQ\7\20\2\2OQ\7\17"+
                    "\2\2PJ\3\2\2\2PL\3\2\2\2PM\3\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2"+
                    "\2\2S\r\3\2\2\2\f\23\33(,/\66?FPR";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}