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

import java.util.List;

import cl.bit01.icaro.Fragments.Features.Business;
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
            T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PETICION=6, PREGUNTA=7, RELOJ=8,
            CLIMA=9, UBICACION=10, LUGAR=11, CERCA=12, INTERROGACION=13, PREPOSICION=14,
            ADJETIVO=15, STRING=16, NUMEROS=17, WS=18;
    public static final int
            RULE_icaro = 0, RULE_funcionalidad = 1, RULE_reloj = 2, RULE_clima = 3,
            RULE_ubicacion_actual = 4, RULE_explorar_negocios = 5, RULE_string = 6;
    public static final String[] ruleNames = {
            "icaro", "funcionalidad", "reloj", "clima", "ubicacion_actual", "explorar_negocios",
            "string"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'la'", "'es'", "'el'", "'un'", "'una'", null, "'donde'", "'hora'",
            null, null, null, null, "'que'", null, "'mi'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, "PETICION", "PREGUNTA", "RELOJ", "CLIMA",
            "UBICACION", "LUGAR", "CERCA", "INTERROGACION", "PREPOSICION", "ADJETIVO",
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
                setState(14);
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
        public Explorar_negociosContext explorar_negocios() {
            return getRuleContext(Explorar_negociosContext.class,0);
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
            setState(20);
            switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(16);
                    reloj();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(17);
                    clima();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(18);
                    ubicacion_actual();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(19);
                    explorar_negocios();
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
            setState(45);
            switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(28);
                    switch (_input.LA(1)) {
                        case PETICION:
                        {
                            {
                                {
                                    setState(22);
                                    match(PETICION);
                                }
                                setState(23);
                                match(T__0);
                                {
                                    setState(24);
                                    match(RELOJ);
                                }
                            }
                        }
                        break;
                        case INTERROGACION:
                        {
                            {
                                {
                                    setState(25);
                                    match(INTERROGACION);
                                }
                                {
                                    setState(26);
                                    match(RELOJ);
                                }
                                {
                                    setState(27);
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
                    setState(41);
                    switch (_input.LA(1)) {
                        case PETICION:
                        {
                            {
                                {
                                    setState(31);
                                    match(PETICION);
                                }
                                setState(32);
                                match(T__0);
                                {
                                    setState(33);
                                    match(RELOJ);
                                }
                                {
                                    setState(34);
                                    match(PREPOSICION);
                                }
                                {
                                    setState(35);
                                    ((RelojContext)_localctx).ciudad = string();
                                }
                            }
                        }
                        break;
                        case INTERROGACION:
                        {
                            {
                                {
                                    setState(36);
                                    match(INTERROGACION);
                                }
                                {
                                    setState(37);
                                    match(RELOJ);
                                }
                                {
                                    setState(38);
                                    match(T__1);
                                }
                                {
                                    setState(39);
                                    match(PREPOSICION);
                                }
                                {
                                    setState(40);
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
            setState(64);
            switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        {
                            setState(48);
                            _la = _input.LA(1);
                            if (_la==PETICION) {
                                {
                                    setState(47);
                                    match(PETICION);
                                }
                            }

                        }
                        setState(50);
                        _la = _input.LA(1);
                        if ( !(_la==T__0 || _la==T__2) ) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        {
                            setState(51);
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
                            setState(55);
                            _la = _input.LA(1);
                            if (_la==PETICION) {
                                {
                                    setState(54);
                                    match(PETICION);
                                }
                            }

                        }
                        setState(57);
                        _la = _input.LA(1);
                        if ( !(_la==T__0 || _la==T__2) ) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        {
                            setState(58);
                            match(CLIMA);
                        }
                        {
                            setState(59);
                            match(PREPOSICION);
                        }
                        {
                            setState(60);
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
                setState(71);
                switch (_input.LA(1)) {
                    case PETICION:
                    {
                        {
                            {
                                setState(66);
                                match(PETICION);
                            }
                            {
                                setState(67);
                                match(ADJETIVO);
                            }
                            {
                                setState(68);
                                match(UBICACION);
                            }
                        }
                    }
                    break;
                    case PREGUNTA:
                    {
                        {
                            {
                                setState(69);
                                match(PREGUNTA);
                            }
                            {
                                setState(70);
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

    public static class Explorar_negociosContext extends ParserRuleContext {
        public StringContext negocio;
        public TerminalNode PREGUNTA() { return getToken(IcaroEngineParser.PREGUNTA, 0); }
        public TerminalNode LUGAR() { return getToken(IcaroEngineParser.LUGAR, 0); }
        public StringContext string() {
            return getRuleContext(StringContext.class,0);
        }
        public TerminalNode CERCA() { return getToken(IcaroEngineParser.CERCA, 0); }
        public Explorar_negociosContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_explorar_negocios; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterExplorar_negocios(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitExplorar_negocios(this);
        }
    }

    public final Explorar_negociosContext explorar_negocios() throws RecognitionException {
        Explorar_negociosContext _localctx = new Explorar_negociosContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_explorar_negocios);
        int _la;
        try {
            setState(94);
            switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        {
                            setState(75);
                            match(PREGUNTA);
                        }
                        {
                            setState(76);
                            match(LUGAR);
                        }
                        setState(78);
                        _la = _input.LA(1);
                        if (_la==T__3 || _la==T__4) {
                            {
                                setState(77);
                                _la = _input.LA(1);
                                if ( !(_la==T__3 || _la==T__4) ) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    consume();
                                }
                            }
                        }

                        {
                            setState(80);
                            ((Explorar_negociosContext)_localctx).negocio = string();
                        }
                    }

                    Log.d("Icaro","ENGINE - Funcionalidad Reconocida Explorar Negocio: "+(((Explorar_negociosContext)_localctx).negocio!=null?_input.getText(((Explorar_negociosContext)_localctx).negocio.start,((Explorar_negociosContext)_localctx).negocio.stop):null));
                    Fragment businessFragment = new Business();

                    Bundle bundle = new Bundle();
                    bundle.putString("business",(((Explorar_negociosContext)_localctx).negocio!=null?_input.getText(((Explorar_negociosContext)_localctx).negocio.start,((Explorar_negociosContext)_localctx).negocio.stop):null));
                    bundle.putBoolean("near",false);
                    bundle.putString("mode","explore");
                    businessFragment.setArguments(bundle);

                    mFragmentManager.beginTransaction()
                            .replace(R.id.fragmentMainIcaro, businessFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .commit();

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    {
                        {
                            setState(84);
                            match(PREGUNTA);
                        }
                        {
                            setState(85);
                            match(LUGAR);
                        }
                        setState(87);
                        _la = _input.LA(1);
                        if (_la==T__3 || _la==T__4) {
                            {
                                setState(86);
                                _la = _input.LA(1);
                                if ( !(_la==T__3 || _la==T__4) ) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    consume();
                                }
                            }
                        }

                        {
                            setState(89);
                            ((Explorar_negociosContext)_localctx).negocio = string();
                        }
                        {
                            setState(90);
                            match(CERCA);
                        }
                    }

                    Log.d("Icaro","ENGINE - Funcionalidad Reconocida Explorar Negocio Cerca: "+(((Explorar_negociosContext)_localctx).negocio!=null?_input.getText(((Explorar_negociosContext)_localctx).negocio.start,((Explorar_negociosContext)_localctx).negocio.stop):null));
                    Fragment businessFragment = new Business();

                    Bundle bundle = new Bundle();
                    bundle.putString("business",(((Explorar_negociosContext)_localctx).negocio!=null?_input.getText(((Explorar_negociosContext)_localctx).negocio.start,((Explorar_negociosContext)_localctx).negocio.stop):null));
                    bundle.putBoolean("near",true);
                    bundle.putString("mode","explore");
                    businessFragment.setArguments(bundle);

                    mFragmentManager.beginTransaction()
                            .replace(R.id.fragmentMainIcaro, businessFragment)
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
        enterRule(_localctx, 12, RULE_string);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(102);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(102);
                        switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
                            case 1:
                            {
                                {
                                    setState(96);
                                    match(STRING);
                                    setState(97);
                                    match(WS);
                                }
                            }
                            break;
                            case 2:
                            {
                                {
                                    setState(98);
                                    match(STRING);
                                }
                            }
                            break;
                            case 3:
                            {
                                {
                                    setState(99);
                                    match(NUMEROS);
                                    setState(100);
                                    match(WS);
                                }
                            }
                            break;
                            case 4:
                            {
                                {
                                    setState(101);
                                    match(NUMEROS);
                                }
                            }
                            break;
                        }
                    }
                    setState(104);
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24m\4\2\t\2\4\3\t"+
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\5\3"+
                    "\27\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\37\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
                    "\3\4\3\4\3\4\3\4\5\4,\n\4\3\4\3\4\5\4\60\n\4\3\5\5\5\63\n\5\3\5\3\5\3"+
                    "\5\3\5\3\5\5\5:\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6\3\6\3\6\3"+
                    "\6\3\6\5\6J\n\6\3\6\3\6\3\7\3\7\3\7\5\7Q\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
                    "\7\5\7Z\n\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3\b\3\b\3\b\3\b\3\b\3\b\6\bi"+
                    "\n\b\r\b\16\bj\3\b\2\2\t\2\4\6\b\n\f\16\2\4\4\2\3\3\5\5\3\2\6\7v\2\20"+
                    "\3\2\2\2\4\26\3\2\2\2\6/\3\2\2\2\bB\3\2\2\2\nI\3\2\2\2\f`\3\2\2\2\16h"+
                    "\3\2\2\2\20\21\5\4\3\2\21\3\3\2\2\2\22\27\5\6\4\2\23\27\5\b\5\2\24\27"+
                    "\5\n\6\2\25\27\5\f\7\2\26\22\3\2\2\2\26\23\3\2\2\2\26\24\3\2\2\2\26\25"+
                    "\3\2\2\2\27\5\3\2\2\2\30\31\7\b\2\2\31\32\7\3\2\2\32\37\7\n\2\2\33\34"+
                    "\7\17\2\2\34\35\7\n\2\2\35\37\7\4\2\2\36\30\3\2\2\2\36\33\3\2\2\2\37 "+
                    "\3\2\2\2 \60\b\4\1\2!\"\7\b\2\2\"#\7\3\2\2#$\7\n\2\2$%\7\20\2\2%,\5\16"+
                    "\b\2&\'\7\17\2\2\'(\7\n\2\2()\7\4\2\2)*\7\20\2\2*,\5\16\b\2+!\3\2\2\2"+
                    "+&\3\2\2\2,-\3\2\2\2-.\b\4\1\2.\60\3\2\2\2/\36\3\2\2\2/+\3\2\2\2\60\7"+
                    "\3\2\2\2\61\63\7\b\2\2\62\61\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65"+
                    "\t\2\2\2\65\66\7\13\2\2\66\67\3\2\2\2\67C\b\5\1\28:\7\b\2\298\3\2\2\2"+
                    "9:\3\2\2\2:;\3\2\2\2;<\t\2\2\2<=\7\13\2\2=>\7\20\2\2>?\5\16\b\2?@\3\2"+
                    "\2\2@A\b\5\1\2AC\3\2\2\2B\62\3\2\2\2B9\3\2\2\2C\t\3\2\2\2DE\7\b\2\2EF"+
                    "\7\21\2\2FJ\7\f\2\2GH\7\t\2\2HJ\7\f\2\2ID\3\2\2\2IG\3\2\2\2JK\3\2\2\2"+
                    "KL\b\6\1\2L\13\3\2\2\2MN\7\t\2\2NP\7\r\2\2OQ\t\3\2\2PO\3\2\2\2PQ\3\2\2"+
                    "\2QR\3\2\2\2RS\5\16\b\2ST\3\2\2\2TU\b\7\1\2Ua\3\2\2\2VW\7\t\2\2WY\7\r"+
                    "\2\2XZ\t\3\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\5\16\b\2\\]\7\16\2\2]"+
                    "^\3\2\2\2^_\b\7\1\2_a\3\2\2\2`M\3\2\2\2`V\3\2\2\2a\r\3\2\2\2bc\7\22\2"+
                    "\2ci\7\24\2\2di\7\22\2\2ef\7\23\2\2fi\7\24\2\2gi\7\23\2\2hb\3\2\2\2hd"+
                    "\3\2\2\2he\3\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\17\3\2\2\2"+
                    "\17\26\36+/\629BIPY`hj";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}