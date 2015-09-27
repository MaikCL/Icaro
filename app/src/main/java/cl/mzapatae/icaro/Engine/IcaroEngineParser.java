// Generated from IcaroEngine.g4 by ANTLR 4.5

package cl.mzapatae.icaro.Engine;

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
import org.antlr.v4.runtime.Token;
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

import cl.mzapatae.icaro.R;
import cl.mzapatae.icaro.Features.Alarm;
import cl.mzapatae.icaro.Features.Business;
import cl.mzapatae.icaro.Features.Calendar;
import cl.mzapatae.icaro.Features.Clock;
import cl.mzapatae.icaro.Features.Location;
import cl.mzapatae.icaro.Features.News;
import cl.mzapatae.icaro.Features.Phone;
import cl.mzapatae.icaro.Features.Remember;
import cl.mzapatae.icaro.Features.Search;
import cl.mzapatae.icaro.Features.Weather;
import cl.mzapatae.icaro.Features.Whatsapp;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IcaroEngineParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9,
            T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, ENVIAR=15, BUSQUEDA=16,
            PETICION=17, AGENDA=18, PREGUNTA=19, RELOJ=20, ALARMA=21, COLOCAR=22,
            RECORDATORIO=23, NOTICIAS=24, TIPO_NOTICIA=25, CLIMA=26, WHATSAPP=27,
            UBICACION=28, EXPLORAR=29, BUSCAR=30, CERCA=31, BORRAR=32, INTERROGACION=33,
            PREPOSICION=34, ADJETIVO=35, HORARIO=36, AMPM=37, DIA=38, MES=39, SEUDODIA=40,
            LLAMADA=41, STRING=42, NUMEROS=43, WS=44;
    public static final int
            RULE_icaro = 0, RULE_funcionalidad = 1, RULE_reloj = 2, RULE_clima = 3,
            RULE_ubicacion_actual = 4, RULE_explorar_negocios = 5, RULE_buscar_negocios = 6,
            RULE_calendario = 7, RULE_busqueda_general = 8, RULE_whatsapp = 9, RULE_telefonia = 10,
            RULE_busqueda_web = 11, RULE_noticias = 12, RULE_recordatorios = 13, RULE_alarmas = 14,
            RULE_string = 15;
    public static final String[] ruleNames = {
            "icaro", "funcionalidad", "reloj", "clima", "ubicacion_actual", "explorar_negocios",
            "buscar_negocios", "calendario", "busqueda_general", "whatsapp", "telefonia",
            "busqueda_web", "noticias", "recordatorios", "alarmas", "string"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'la'", "'es'", "'el'", "'hay'", "'encuentro'", "'un'", "'una'",
            "'para el'", "'de'", "'a las'", "'y'", "'a'", "'con'", "'los'", null,
            null, null, null, "'donde'", "'hora'", "'alarma'", null, null, null, null,
            null, null, null, null, "'esta'", null, null, "'que'", null, "'mi'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, "ENVIAR", "BUSQUEDA", "PETICION", "AGENDA", "PREGUNTA",
            "RELOJ", "ALARMA", "COLOCAR", "RECORDATORIO", "NOTICIAS", "TIPO_NOTICIA",
            "CLIMA", "WHATSAPP", "UBICACION", "EXPLORAR", "BUSCAR", "CERCA", "BORRAR",
            "INTERROGACION", "PREPOSICION", "ADJETIVO", "HORARIO", "AMPM", "DIA",
            "MES", "SEUDODIA", "LLAMADA", "STRING", "NUMEROS", "WS"
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

    public final IcaroContext icaro(FragmentManager fragmentManager) throws RecognitionException {
        this.mFragmentManager = fragmentManager;
        IcaroContext _localctx = new IcaroContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_icaro);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(32);
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
        public Buscar_negociosContext buscar_negocios() {
            return getRuleContext(Buscar_negociosContext.class,0);
        }
        public CalendarioContext calendario() {
            return getRuleContext(CalendarioContext.class,0);
        }
        public Busqueda_generalContext busqueda_general() {
            return getRuleContext(Busqueda_generalContext.class,0);
        }
        public WhatsappContext whatsapp() {
            return getRuleContext(WhatsappContext.class,0);
        }
        public TelefoniaContext telefonia() {
            return getRuleContext(TelefoniaContext.class,0);
        }
        public Busqueda_webContext busqueda_web() {
            return getRuleContext(Busqueda_webContext.class,0);
        }
        public NoticiasContext noticias() {
            return getRuleContext(NoticiasContext.class,0);
        }
        public RecordatoriosContext recordatorios() {
            return getRuleContext(RecordatoriosContext.class,0);
        }
        public AlarmasContext alarmas() {
            return getRuleContext(AlarmasContext.class,0);
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
            setState(47);
            switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(34);
                    reloj();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(35);
                    clima();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(36);
                    ubicacion_actual();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(37);
                    explorar_negocios();
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(38);
                    buscar_negocios();
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(39);
                    calendario();
                }
                break;
                case 7:
                    enterOuterAlt(_localctx, 7);
                {
                    setState(40);
                    busqueda_general();
                }
                break;
                case 8:
                    enterOuterAlt(_localctx, 8);
                {
                    setState(41);
                    whatsapp();
                }
                break;
                case 9:
                    enterOuterAlt(_localctx, 9);
                {
                    setState(42);
                    telefonia();
                }
                break;
                case 10:
                    enterOuterAlt(_localctx, 10);
                {
                    setState(43);
                    busqueda_web();
                }
                break;
                case 11:
                    enterOuterAlt(_localctx, 11);
                {
                    setState(44);
                    noticias();
                }
                break;
                case 12:
                    enterOuterAlt(_localctx, 12);
                {
                    setState(45);
                    recordatorios();
                }
                break;
                case 13:
                    enterOuterAlt(_localctx, 13);
                {
                    setState(46);
                    alarmas();
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
            setState(72);
            switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(55);
                    switch (_input.LA(1)) {
                        case PETICION:
                        {
                            {
                                {
                                    setState(49);
                                    match(PETICION);
                                }
                                setState(50);
                                match(T__0);
                                {
                                    setState(51);
                                    match(RELOJ);
                                }
                            }
                        }
                        break;
                        case INTERROGACION:
                        {
                            {
                                {
                                    setState(52);
                                    match(INTERROGACION);
                                }
                                {
                                    setState(53);
                                    match(RELOJ);
                                }
                                {
                                    setState(54);
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
                    setState(68);
                    switch (_input.LA(1)) {
                        case PETICION:
                        {
                            {
                                {
                                    setState(58);
                                    match(PETICION);
                                }
                                setState(59);
                                match(T__0);
                                {
                                    setState(60);
                                    match(RELOJ);
                                }
                                {
                                    setState(61);
                                    match(PREPOSICION);
                                }
                                {
                                    setState(62);
                                    ((RelojContext)_localctx).ciudad = string();
                                }
                            }
                        }
                        break;
                        case INTERROGACION:
                        {
                            {
                                {
                                    setState(63);
                                    match(INTERROGACION);
                                }
                                {
                                    setState(64);
                                    match(RELOJ);
                                }
                                {
                                    setState(65);
                                    match(T__1);
                                }
                                {
                                    setState(66);
                                    match(PREPOSICION);
                                }
                                {
                                    setState(67);
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
            setState(91);
            switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        {
                            setState(75);
                            _la = _input.LA(1);
                            if (_la==PETICION) {
                                {
                                    setState(74);
                                    match(PETICION);
                                }
                            }

                        }
                        setState(77);
                        _la = _input.LA(1);
                        if ( !(_la==T__0 || _la==T__2) ) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        {
                            setState(78);
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
                            setState(82);
                            _la = _input.LA(1);
                            if (_la==PETICION) {
                                {
                                    setState(81);
                                    match(PETICION);
                                }
                            }

                        }
                        setState(84);
                        _la = _input.LA(1);
                        if ( !(_la==T__0 || _la==T__2) ) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        {
                            setState(85);
                            match(CLIMA);
                        }
                        {
                            setState(86);
                            match(PREPOSICION);
                        }
                        {
                            setState(87);
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
                setState(98);
                switch (_input.LA(1)) {
                    case PETICION:
                    {
                        {
                            {
                                setState(93);
                                match(PETICION);
                            }
                            {
                                setState(94);
                                match(ADJETIVO);
                            }
                            {
                                setState(95);
                                match(UBICACION);
                            }
                        }
                    }
                    break;
                    case PREGUNTA:
                    {
                        {
                            {
                                setState(96);
                                match(PREGUNTA);
                            }
                            {
                                setState(97);
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
            setState(121);
            switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        {
                            setState(102);
                            match(PREGUNTA);
                        }
                        setState(103);
                        _la = _input.LA(1);
                        if ( !(_la==T__3 || _la==T__4) ) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(105);
                        _la = _input.LA(1);
                        if (_la==T__5 || _la==T__6) {
                            {
                                setState(104);
                                _la = _input.LA(1);
                                if ( !(_la==T__5 || _la==T__6) ) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    consume();
                                }
                            }
                        }

                        {
                            setState(107);
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
                            setState(111);
                            match(PREGUNTA);
                        }
                        setState(112);
                        _la = _input.LA(1);
                        if ( !(_la==T__3 || _la==T__4) ) {
                            _errHandler.recoverInline(this);
                        } else {
                            consume();
                        }
                        setState(114);
                        _la = _input.LA(1);
                        if (_la==T__5 || _la==T__6) {
                            {
                                setState(113);
                                _la = _input.LA(1);
                                if ( !(_la==T__5 || _la==T__6) ) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    consume();
                                }
                            }
                        }

                        {
                            setState(116);
                            ((Explorar_negociosContext)_localctx).negocio = string();
                        }
                        {
                            setState(117);
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

    public static class Buscar_negociosContext extends ParserRuleContext {
        public StringContext negocio;
        public TerminalNode PREGUNTA() { return getToken(IcaroEngineParser.PREGUNTA, 0); }
        public TerminalNode BUSCAR() { return getToken(IcaroEngineParser.BUSCAR, 0); }
        public StringContext string() {
            return getRuleContext(StringContext.class,0);
        }
        public Buscar_negociosContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_buscar_negocios; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterBuscar_negocios(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitBuscar_negocios(this);
        }
    }

    public final Buscar_negociosContext buscar_negocios() throws RecognitionException {
        Buscar_negociosContext _localctx = new Buscar_negociosContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_buscar_negocios);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    {
                        setState(123);
                        match(PREGUNTA);
                    }
                    {
                        setState(124);
                        match(BUSCAR);
                    }
                    setState(126);
                    _la = _input.LA(1);
                    if (_la==T__5 || _la==T__6) {
                        {
                            setState(125);
                            _la = _input.LA(1);
                            if ( !(_la==T__5 || _la==T__6) ) {
                                _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                        }
                    }

                    {
                        setState(128);
                        ((Buscar_negociosContext)_localctx).negocio = string();
                    }
                }

                Log.d("Icaro", "ENGINE | Buscar negocio: "+(((Buscar_negociosContext)_localctx).negocio!=null?_input.getText(((Buscar_negociosContext)_localctx).negocio.start,((Buscar_negociosContext)_localctx).negocio.stop):null));

                Fragment businessFragment = new Business();

                Bundle bundle = new Bundle();
                bundle.putString("business",(((Buscar_negociosContext)_localctx).negocio!=null?_input.getText(((Buscar_negociosContext)_localctx).negocio.start,((Buscar_negociosContext)_localctx).negocio.stop):null));
                bundle.putBoolean("near",true);
                bundle.putString("mode","search");
                businessFragment.setArguments(bundle);

                mFragmentManager.beginTransaction()
                        .replace(R.id.fragmentMainIcaro, businessFragment)
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

    public static class CalendarioContext extends ParserRuleContext {
        public StringContext evento;
        public Token dia;
        public Token mes;
        public Token hora;
        public Token minutos;
        public Token horario;
        public TerminalNode AGENDA() { return getToken(IcaroEngineParser.AGENDA, 0); }
        public StringContext string() {
            return getRuleContext(StringContext.class,0);
        }
        public TerminalNode DIA() { return getToken(IcaroEngineParser.DIA, 0); }
        public List<TerminalNode> NUMEROS() { return getTokens(IcaroEngineParser.NUMEROS); }
        public TerminalNode NUMEROS(int i) {
            return getToken(IcaroEngineParser.NUMEROS, i);
        }
        public TerminalNode MES() { return getToken(IcaroEngineParser.MES, 0); }
        public TerminalNode SEUDODIA() { return getToken(IcaroEngineParser.SEUDODIA, 0); }
        public TerminalNode HORARIO() { return getToken(IcaroEngineParser.HORARIO, 0); }
        public TerminalNode AMPM() { return getToken(IcaroEngineParser.AMPM, 0); }
        public CalendarioContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_calendario; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterCalendario(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitCalendario(this);
        }
    }

    public final CalendarioContext calendario() throws RecognitionException {
        CalendarioContext _localctx = new CalendarioContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_calendario);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    {
                        setState(132);
                        match(AGENDA);
                    }
                    setState(134);
                    _la = _input.LA(1);
                    if (_la==T__5 || _la==T__6) {
                        {
                            setState(133);
                            _la = _input.LA(1);
                            if ( !(_la==T__5 || _la==T__6) ) {
                                _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                        }
                    }

                    {
                        setState(136);
                        ((CalendarioContext)_localctx).evento = string();
                    }
                    setState(137);
                    _la = _input.LA(1);
                    if ( !(_la==T__2 || _la==T__7) ) {
                        _errHandler.recoverInline(this);
                    } else {
                        consume();
                    }
                    setState(143);
                    switch (_input.LA(1)) {
                        case DIA:
                        {
                            {
                                setState(138);
                                ((CalendarioContext)_localctx).dia = match(DIA);
                            }
                        }
                        break;
                        case NUMEROS:
                        {
                            {
                                setState(139);
                                ((CalendarioContext)_localctx).dia = match(NUMEROS);
                                setState(140);
                                match(T__8);
                                setState(141);
                                ((CalendarioContext)_localctx).mes = match(MES);
                            }
                        }
                        break;
                        case SEUDODIA:
                        {
                            {
                                setState(142);
                                ((CalendarioContext)_localctx).dia = match(SEUDODIA);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    {
                        setState(145);
                        match(T__9);
                    }
                    setState(169);
                    switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
                        case 1:
                        {
                            {
                                {
                                    setState(146);
                                    ((CalendarioContext)_localctx).hora = match(NUMEROS);
                                }
                                setState(148);
                                _la = _input.LA(1);
                                if (_la==T__10) {
                                    {
                                        setState(147);
                                        match(T__10);
                                    }
                                }

                                setState(151);
                                _la = _input.LA(1);
                                if (_la==NUMEROS) {
                                    {
                                        setState(150);
                                        ((CalendarioContext)_localctx).minutos = match(NUMEROS);
                                    }
                                }

                                {
                                    setState(153);
                                    ((CalendarioContext)_localctx).horario = match(HORARIO);
                                }
                            }
                        }
                        break;
                        case 2:
                        {
                            {
                                {
                                    setState(154);
                                    ((CalendarioContext)_localctx).hora = match(NUMEROS);
                                }
                                setState(156);
                                _la = _input.LA(1);
                                if (_la==T__10) {
                                    {
                                        setState(155);
                                        match(T__10);
                                    }
                                }

                                setState(159);
                                _la = _input.LA(1);
                                if (_la==NUMEROS) {
                                    {
                                        setState(158);
                                        ((CalendarioContext)_localctx).minutos = match(NUMEROS);
                                    }
                                }

                                {
                                    setState(161);
                                    ((CalendarioContext)_localctx).horario = match(AMPM);
                                }
                            }
                        }
                        break;
                        case 3:
                        {
                            {
                                {
                                    setState(162);
                                    ((CalendarioContext)_localctx).hora = match(NUMEROS);
                                }
                                setState(164);
                                _la = _input.LA(1);
                                if (_la==T__10) {
                                    {
                                        setState(163);
                                        match(T__10);
                                    }
                                }

                                setState(167);
                                _la = _input.LA(1);
                                if (_la==NUMEROS) {
                                    {
                                        setState(166);
                                        ((CalendarioContext)_localctx).minutos = match(NUMEROS);
                                    }
                                }

                            }
                        }
                        break;
                    }
                }

                Log.d("Icaro", "ENGINE | Agendar evento titulo "+(((CalendarioContext)_localctx).evento!=null?_input.getText(((CalendarioContext)_localctx).evento.start,((CalendarioContext)_localctx).evento.stop):null));

                Fragment calendarFragment = new Calendar();

                Bundle bundle = new Bundle();
                bundle.putString("event",(((CalendarioContext)_localctx).evento!=null?_input.getText(((CalendarioContext)_localctx).evento.start,((CalendarioContext)_localctx).evento.stop):null));
                bundle.putString("day",(((CalendarioContext)_localctx).dia!=null?((CalendarioContext)_localctx).dia.getText():null));
                bundle.putString("month",(((CalendarioContext)_localctx).mes!=null?((CalendarioContext)_localctx).mes.getText():null));
                bundle.putString("hour",(((CalendarioContext)_localctx).hora!=null?((CalendarioContext)_localctx).hora.getText():null));
                bundle.putString("minutes",(((CalendarioContext)_localctx).minutos!=null?((CalendarioContext)_localctx).minutos.getText():null));
                bundle.putString("horarie",(((CalendarioContext)_localctx).horario!=null?((CalendarioContext)_localctx).horario.getText():null));
                calendarFragment.setArguments(bundle);

                mFragmentManager.beginTransaction()
                        .replace(R.id.fragmentMainIcaro, calendarFragment)
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

    public static class Busqueda_generalContext extends ParserRuleContext {
        public StringContext consulta;
        public StringContext string() {
            return getRuleContext(StringContext.class,0);
        }
        public Busqueda_generalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_busqueda_general; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterBusqueda_general(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitBusqueda_general(this);
        }
    }

    public final Busqueda_generalContext busqueda_general() throws RecognitionException {
        Busqueda_generalContext _localctx = new Busqueda_generalContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_busqueda_general);
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(173);
                    ((Busqueda_generalContext)_localctx).consulta = string();
                }

                Log.d("Icaro", "ENGINE | Busqueda general");

                Fragment searchFragment = new Search();

                Bundle bundle = new Bundle();
                bundle.putString("mode","lucky");
                bundle.putString("search",(((Busqueda_generalContext)_localctx).consulta!=null?_input.getText(((Busqueda_generalContext)_localctx).consulta.start,((Busqueda_generalContext)_localctx).consulta.stop):null));
                searchFragment.setArguments(bundle);

                mFragmentManager.beginTransaction()
                        .replace(R.id.fragmentMainIcaro, searchFragment)
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

    public static class WhatsappContext extends ParserRuleContext {
        public StringContext usuario;
        public TerminalNode WHATSAPP() { return getToken(IcaroEngineParser.WHATSAPP, 0); }
        public TerminalNode ENVIAR() { return getToken(IcaroEngineParser.ENVIAR, 0); }
        public StringContext string() {
            return getRuleContext(StringContext.class,0);
        }
        public WhatsappContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_whatsapp; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterWhatsapp(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitWhatsapp(this);
        }
    }

    public final WhatsappContext whatsapp() throws RecognitionException {
        WhatsappContext _localctx = new WhatsappContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_whatsapp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(177);
                    _la = _input.LA(1);
                    if (_la==ENVIAR) {
                        {
                            setState(176);
                            match(ENVIAR);
                        }
                    }

                    setState(180);
                    _la = _input.LA(1);
                    if (_la==T__5) {
                        {
                            setState(179);
                            match(T__5);
                        }
                    }

                    {
                        setState(182);
                        match(WHATSAPP);
                    }
                    setState(184);
                    _la = _input.LA(1);
                    if (_la==T__11) {
                        {
                            setState(183);
                            match(T__11);
                        }
                    }

                    {
                        setState(186);
                        ((WhatsappContext)_localctx).usuario = string();
                    }
                }

                Log.d("Icaro", "ENGINE | Envio Whatsapp");

                Fragment whatsappFragment = new Whatsapp();

                Bundle bundle = new Bundle();
                bundle.putString("user",(((WhatsappContext)_localctx).usuario!=null?_input.getText(((WhatsappContext)_localctx).usuario.start,((WhatsappContext)_localctx).usuario.stop):null));
                whatsappFragment.setArguments(bundle);

                mFragmentManager.beginTransaction()
                        .replace(R.id.fragmentMainIcaro, whatsappFragment)
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

    public static class TelefoniaContext extends ParserRuleContext {
        public StringContext nombre_contacto;
        public TerminalNode LLAMADA() { return getToken(IcaroEngineParser.LLAMADA, 0); }
        public StringContext string() {
            return getRuleContext(StringContext.class,0);
        }
        public TelefoniaContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_telefonia; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterTelefonia(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitTelefonia(this);
        }
    }

    public final TelefoniaContext telefonia() throws RecognitionException {
        TelefoniaContext _localctx = new TelefoniaContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_telefonia);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    {
                        setState(190);
                        match(LLAMADA);
                    }
                    setState(192);
                    _la = _input.LA(1);
                    if (_la==T__11 || _la==T__12) {
                        {
                            setState(191);
                            _la = _input.LA(1);
                            if ( !(_la==T__11 || _la==T__12) ) {
                                _errHandler.recoverInline(this);
                            } else {
                                consume();
                            }
                        }
                    }

                    {
                        setState(194);
                        ((TelefoniaContext)_localctx).nombre_contacto = string();
                    }
                }

                Log.d("Icaro", "ENGINE | Telefonia ");

                Fragment phoneFragment = new Phone();

                Bundle bundle = new Bundle();
                bundle.putString("contact",(((TelefoniaContext)_localctx).nombre_contacto!=null?_input.getText(((TelefoniaContext)_localctx).nombre_contacto.start,((TelefoniaContext)_localctx).nombre_contacto.stop):null));
                phoneFragment.setArguments(bundle);

                mFragmentManager.beginTransaction()
                        .replace(R.id.fragmentMainIcaro, phoneFragment)
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

    public static class Busqueda_webContext extends ParserRuleContext {
        public StringContext objetivo;
        public StringContext string() {
            return getRuleContext(StringContext.class,0);
        }
        public TerminalNode BUSQUEDA() { return getToken(IcaroEngineParser.BUSQUEDA, 0); }
        public TerminalNode PREPOSICION() { return getToken(IcaroEngineParser.PREPOSICION, 0); }
        public Busqueda_webContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_busqueda_web; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterBusqueda_web(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitBusqueda_web(this);
        }
    }

    public final Busqueda_webContext busqueda_web() throws RecognitionException {
        Busqueda_webContext _localctx = new Busqueda_webContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_busqueda_web);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    setState(204);
                    switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
                        case 1:
                        {
                            {
                                setState(198);
                                match(BUSQUEDA);
                            }
                        }
                        break;
                        case 2:
                        {
                            {
                                setState(199);
                                match(BUSQUEDA);
                            }
                            {
                                setState(201);
                                _la = _input.LA(1);
                                if (_la==PREPOSICION) {
                                    {
                                        setState(200);
                                        match(PREPOSICION);
                                    }
                                }

                            }
                            {
                                setState(203);
                                match(T__2);
                            }
                        }
                        break;
                    }
                    {
                        setState(206);
                        ((Busqueda_webContext)_localctx).objetivo = string();
                    }
                }

                Log.d("Icaro", "ENGINE | Busqueda web");

                Fragment searchFragment = new Search();

                Bundle bundle = new Bundle();
                bundle.putString("search",(((Busqueda_webContext)_localctx).objetivo!=null?_input.getText(((Busqueda_webContext)_localctx).objetivo.start,((Busqueda_webContext)_localctx).objetivo.stop):null));
                bundle.putString("mode","normal");
                searchFragment.setArguments(bundle);

                mFragmentManager.beginTransaction()
                        .replace(R.id.fragmentMainIcaro, searchFragment)
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

    public static class NoticiasContext extends ParserRuleContext {
        public Token tipo;
        public TerminalNode NOTICIAS() { return getToken(IcaroEngineParser.NOTICIAS, 0); }
        public TerminalNode INTERROGACION() { return getToken(IcaroEngineParser.INTERROGACION, 0); }
        public TerminalNode TIPO_NOTICIA() { return getToken(IcaroEngineParser.TIPO_NOTICIA, 0); }
        public TerminalNode PETICION() { return getToken(IcaroEngineParser.PETICION, 0); }
        public TerminalNode PREPOSICION() { return getToken(IcaroEngineParser.PREPOSICION, 0); }
        public NoticiasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_noticias; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterNoticias(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitNoticias(this);
        }
    }

    public final NoticiasContext noticias() throws RecognitionException {
        NoticiasContext _localctx = new NoticiasContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_noticias);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(228);
                switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
                    case 1:
                    {
                        {
                            {
                                setState(211);
                                _la = _input.LA(1);
                                if (_la==PETICION) {
                                    {
                                        setState(210);
                                        match(PETICION);
                                    }
                                }

                            }
                            {
                                setState(214);
                                _la = _input.LA(1);
                                if (_la==INTERROGACION) {
                                    {
                                        setState(213);
                                        match(INTERROGACION);
                                    }
                                }

                            }
                            {
                                setState(216);
                                match(NOTICIAS);
                            }
                            {
                                setState(218);
                                _la = _input.LA(1);
                                if (_la==PREPOSICION) {
                                    {
                                        setState(217);
                                        match(PREPOSICION);
                                    }
                                }

                            }
                            {
                                setState(220);
                                ((NoticiasContext)_localctx).tipo = match(TIPO_NOTICIA);
                            }
                        }
                    }
                    break;
                    case 2:
                    {
                        {
                            {
                                setState(221);
                                match(INTERROGACION);
                            }
                            {
                                setState(222);
                                match(NOTICIAS);
                            }
                            {
                                setState(223);
                                match(T__3);
                            }
                            {
                                setState(225);
                                _la = _input.LA(1);
                                if (_la==PREPOSICION) {
                                    {
                                        setState(224);
                                        match(PREPOSICION);
                                    }
                                }

                            }
                            {
                                setState(227);
                                ((NoticiasContext)_localctx).tipo = match(TIPO_NOTICIA);
                            }
                        }
                    }
                    break;
                }

                Log.d("Icaro", "ENGINE | Noticias");

                Fragment newsFragment = new News();

                Bundle bundle = new Bundle();
                bundle.putString("newsType",(((NoticiasContext)_localctx).tipo!=null?((NoticiasContext)_localctx).tipo.getText():null));
                newsFragment.setArguments(bundle);

                mFragmentManager.beginTransaction()
                        .replace(R.id.fragmentMainIcaro, newsFragment)
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

    public static class RecordatoriosContext extends ParserRuleContext {
        public StringContext objetivo;
        public TerminalNode RECORDATORIO() { return getToken(IcaroEngineParser.RECORDATORIO, 0); }
        public StringContext string() {
            return getRuleContext(StringContext.class,0);
        }
        public TerminalNode BORRAR() { return getToken(IcaroEngineParser.BORRAR, 0); }
        public TerminalNode PETICION() { return getToken(IcaroEngineParser.PETICION, 0); }
        public RecordatoriosContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_recordatorios; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterRecordatorios(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitRecordatorios(this);
        }
    }

    public final RecordatoriosContext recordatorios() throws RecognitionException {
        RecordatoriosContext _localctx = new RecordatoriosContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_recordatorios);
        int _la;
        try {
            setState(249);
            switch (_input.LA(1)) {
                case RECORDATORIO:
                    enterOuterAlt(_localctx, 1);
                {
                    {
                        {
                            setState(232);
                            match(RECORDATORIO);
                        }
                        setState(234);
                        _la = _input.LA(1);
                        if (_la==T__8 || _la==INTERROGACION) {
                            {
                                setState(233);
                                _la = _input.LA(1);
                                if ( !(_la==T__8 || _la==INTERROGACION) ) {
                                    _errHandler.recoverInline(this);
                                } else {
                                    consume();
                                }
                            }
                        }

                        {
                            setState(236);
                            ((RecordatoriosContext)_localctx).objetivo = string();
                        }
                    }

                    Log.d("Icaro", "ENGINE | Agregar recordatorio ");

                    Fragment rememberFragment = new Remember();

                    Bundle bundle = new Bundle();
                    bundle.putString("mode","addRemember");
                    bundle.putString("remember",(((RecordatoriosContext)_localctx).objetivo!=null?_input.getText(((RecordatoriosContext)_localctx).objetivo.start,((RecordatoriosContext)_localctx).objetivo.stop):null));
                    rememberFragment.setArguments(bundle);

                    mFragmentManager.beginTransaction()
                            .replace(R.id.fragmentMainIcaro, rememberFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .commit();

                }
                break;
                case BORRAR:
                    enterOuterAlt(_localctx, 2);
                {
                    {
                        {
                            setState(240);
                            match(BORRAR);
                        }
                        {
                            setState(241);
                            match(RECORDATORIO);
                        }
                    }

                    Log.d("Icaro", "ENGINE | Borrar recordatorio ");

                    Fragment rememberFragment = new Remember();

                    Bundle bundle = new Bundle();
                    bundle.putString("mode","deleteRemember");
                    rememberFragment.setArguments(bundle);

                    mFragmentManager.beginTransaction()
                            .replace(R.id.fragmentMainIcaro, rememberFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .commit();

                }
                break;
                case PETICION:
                    enterOuterAlt(_localctx, 3);
                {
                    {
                        {
                            setState(244);
                            match(PETICION);
                        }
                        {
                            setState(245);
                            match(T__13);
                        }
                        {
                            setState(246);
                            match(RECORDATORIO);
                        }
                    }

                    Log.d("Icaro", "ENGINE | Mostrar recordatorios ");

                    Fragment rememberFragment = new Remember();

                    Bundle bundle = new Bundle();
                    bundle.putString("mode","showRemember");
                    rememberFragment.setArguments(bundle);

                    mFragmentManager.beginTransaction()
                            .replace(R.id.fragmentMainIcaro, rememberFragment)
                            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                            .commit();

                }
                break;
                default:
                    throw new NoViableAltException(this);
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

    public static class AlarmasContext extends ParserRuleContext {
        public Token hora;
        public Token minutos;
        public Token horario;
        public TerminalNode COLOCAR() { return getToken(IcaroEngineParser.COLOCAR, 0); }
        public TerminalNode ALARMA() { return getToken(IcaroEngineParser.ALARMA, 0); }
        public List<TerminalNode> NUMEROS() { return getTokens(IcaroEngineParser.NUMEROS); }
        public TerminalNode NUMEROS(int i) {
            return getToken(IcaroEngineParser.NUMEROS, i);
        }
        public TerminalNode HORARIO() { return getToken(IcaroEngineParser.HORARIO, 0); }
        public TerminalNode AMPM() { return getToken(IcaroEngineParser.AMPM, 0); }
        public AlarmasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_alarmas; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).enterAlarmas(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof IcaroEngineListener ) ((IcaroEngineListener)listener).exitAlarmas(this);
        }
    }

    public final AlarmasContext alarmas() throws RecognitionException {
        AlarmasContext _localctx = new AlarmasContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_alarmas);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                {
                    {
                        setState(251);
                        match(COLOCAR);
                    }
                    {
                        setState(253);
                        _la = _input.LA(1);
                        if (_la==T__0) {
                            {
                                setState(252);
                                match(T__0);
                            }
                        }

                    }
                    {
                        setState(255);
                        match(ALARMA);
                    }
                    {
                        setState(256);
                        match(T__9);
                    }
                    setState(280);
                    switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
                        case 1:
                        {
                            {
                                {
                                    setState(257);
                                    ((AlarmasContext)_localctx).hora = match(NUMEROS);
                                }
                                {
                                    setState(259);
                                    _la = _input.LA(1);
                                    if (_la==T__10) {
                                        {
                                            setState(258);
                                            match(T__10);
                                        }
                                    }

                                }
                                {
                                    setState(262);
                                    _la = _input.LA(1);
                                    if (_la==NUMEROS) {
                                        {
                                            setState(261);
                                            ((AlarmasContext)_localctx).minutos = match(NUMEROS);
                                        }
                                    }

                                }
                                {
                                    setState(264);
                                    ((AlarmasContext)_localctx).horario = match(HORARIO);
                                }
                            }
                        }
                        break;
                        case 2:
                        {
                            {
                                {
                                    setState(265);
                                    ((AlarmasContext)_localctx).hora = match(NUMEROS);
                                }
                                {
                                    setState(267);
                                    _la = _input.LA(1);
                                    if (_la==T__10) {
                                        {
                                            setState(266);
                                            match(T__10);
                                        }
                                    }

                                }
                                {
                                    setState(270);
                                    _la = _input.LA(1);
                                    if (_la==NUMEROS) {
                                        {
                                            setState(269);
                                            ((AlarmasContext)_localctx).minutos = match(NUMEROS);
                                        }
                                    }

                                }
                                {
                                    setState(272);
                                    ((AlarmasContext)_localctx).horario = match(AMPM);
                                }
                            }
                        }
                        break;
                        case 3:
                        {
                            {
                                {
                                    setState(273);
                                    ((AlarmasContext)_localctx).hora = match(NUMEROS);
                                }
                                {
                                    setState(275);
                                    _la = _input.LA(1);
                                    if (_la==T__10) {
                                        {
                                            setState(274);
                                            match(T__10);
                                        }
                                    }

                                }
                                {
                                    setState(278);
                                    _la = _input.LA(1);
                                    if (_la==NUMEROS) {
                                        {
                                            setState(277);
                                            ((AlarmasContext)_localctx).minutos = match(NUMEROS);
                                        }
                                    }

                                }
                            }
                        }
                        break;
                    }
                }

                Log.d("Icaro", "ENGINE | Setear la alarma ");

                Fragment alarmFragment = new Alarm();

                Bundle bundle = new Bundle();
                bundle.putString("hour",(((AlarmasContext)_localctx).hora!=null?((AlarmasContext)_localctx).hora.getText():null));
                bundle.putString("minutes",(((AlarmasContext)_localctx).minutos!=null?((AlarmasContext)_localctx).minutos.getText():null));
                bundle.putString("horarie",(((AlarmasContext)_localctx).horario!=null?((AlarmasContext)_localctx).horario.getText():null));
                alarmFragment.setArguments(bundle);

                mFragmentManager.beginTransaction()
                        .replace(R.id.fragmentMainIcaro, alarmFragment)
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
        enterRule(_localctx, 30, RULE_string);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(290);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(290);
                        switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
                            case 1:
                            {
                                {
                                    setState(284);
                                    match(STRING);
                                    setState(285);
                                    match(WS);
                                }
                            }
                            break;
                            case 2:
                            {
                                {
                                    setState(286);
                                    match(STRING);
                                }
                            }
                            break;
                            case 3:
                            {
                                {
                                    setState(287);
                                    match(NUMEROS);
                                    setState(288);
                                    match(WS);
                                }
                            }
                            break;
                            case 4:
                            {
                                {
                                    setState(289);
                                    match(NUMEROS);
                                }
                            }
                            break;
                        }
                    }
                    setState(292);
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0129\4\2\t\2\4"+
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
                    "\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\4\3\4"+
                    "\3\4\3\4\3\4\3\4\5\4:\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
                    "\5\4G\n\4\3\4\3\4\5\4K\n\4\3\5\5\5N\n\5\3\5\3\5\3\5\3\5\3\5\5\5U\n\5\3"+
                    "\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\3\6\3\6\5\6e\n\6\3\6\3"+
                    "\6\3\7\3\7\3\7\5\7l\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7u\n\7\3\7\3\7\3"+
                    "\7\3\7\3\7\5\7|\n\7\3\b\3\b\3\b\5\b\u0081\n\b\3\b\3\b\3\b\3\b\3\t\3\t"+
                    "\5\t\u0089\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0092\n\t\3\t\3\t\3\t\5"+
                    "\t\u0097\n\t\3\t\5\t\u009a\n\t\3\t\3\t\3\t\5\t\u009f\n\t\3\t\5\t\u00a2"+
                    "\n\t\3\t\3\t\3\t\5\t\u00a7\n\t\3\t\5\t\u00aa\n\t\5\t\u00ac\n\t\3\t\3\t"+
                    "\3\n\3\n\3\n\3\13\5\13\u00b4\n\13\3\13\5\13\u00b7\n\13\3\13\3\13\5\13"+
                    "\u00bb\n\13\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u00c3\n\f\3\f\3\f\3\f\3\f"+
                    "\3\r\3\r\3\r\5\r\u00cc\n\r\3\r\5\r\u00cf\n\r\3\r\3\r\3\r\3\r\3\16\5\16"+
                    "\u00d6\n\16\3\16\5\16\u00d9\n\16\3\16\3\16\5\16\u00dd\n\16\3\16\3\16\3"+
                    "\16\3\16\3\16\5\16\u00e4\n\16\3\16\5\16\u00e7\n\16\3\16\3\16\3\17\3\17"+
                    "\5\17\u00ed\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
                    "\3\17\3\17\5\17\u00fc\n\17\3\20\3\20\5\20\u0100\n\20\3\20\3\20\3\20\3"+
                    "\20\5\20\u0106\n\20\3\20\5\20\u0109\n\20\3\20\3\20\3\20\5\20\u010e\n\20"+
                    "\3\20\5\20\u0111\n\20\3\20\3\20\3\20\5\20\u0116\n\20\3\20\5\20\u0119\n"+
                    "\20\5\20\u011b\n\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0125"+
                    "\n\21\r\21\16\21\u0126\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
                    "\36 \2\b\4\2\3\3\5\5\3\2\6\7\3\2\b\t\4\2\5\5\n\n\3\2\16\17\4\2\13\13#"+
                    "#\u0155\2\"\3\2\2\2\4\61\3\2\2\2\6J\3\2\2\2\b]\3\2\2\2\nd\3\2\2\2\f{\3"+
                    "\2\2\2\16}\3\2\2\2\20\u0086\3\2\2\2\22\u00af\3\2\2\2\24\u00b3\3\2\2\2"+
                    "\26\u00c0\3\2\2\2\30\u00ce\3\2\2\2\32\u00e6\3\2\2\2\34\u00fb\3\2\2\2\36"+
                    "\u00fd\3\2\2\2 \u0124\3\2\2\2\"#\5\4\3\2#\3\3\2\2\2$\62\5\6\4\2%\62\5"+
                    "\b\5\2&\62\5\n\6\2\'\62\5\f\7\2(\62\5\16\b\2)\62\5\20\t\2*\62\5\22\n\2"+
                    "+\62\5\24\13\2,\62\5\26\f\2-\62\5\30\r\2.\62\5\32\16\2/\62\5\34\17\2\60"+
                    "\62\5\36\20\2\61$\3\2\2\2\61%\3\2\2\2\61&\3\2\2\2\61\'\3\2\2\2\61(\3\2"+
                    "\2\2\61)\3\2\2\2\61*\3\2\2\2\61+\3\2\2\2\61,\3\2\2\2\61-\3\2\2\2\61.\3"+
                    "\2\2\2\61/\3\2\2\2\61\60\3\2\2\2\62\5\3\2\2\2\63\64\7\23\2\2\64\65\7\3"+
                    "\2\2\65:\7\26\2\2\66\67\7#\2\2\678\7\26\2\28:\7\4\2\29\63\3\2\2\29\66"+
                    "\3\2\2\2:;\3\2\2\2;K\b\4\1\2<=\7\23\2\2=>\7\3\2\2>?\7\26\2\2?@\7$\2\2"+
                    "@G\5 \21\2AB\7#\2\2BC\7\26\2\2CD\7\4\2\2DE\7$\2\2EG\5 \21\2F<\3\2\2\2"+
                    "FA\3\2\2\2GH\3\2\2\2HI\b\4\1\2IK\3\2\2\2J9\3\2\2\2JF\3\2\2\2K\7\3\2\2"+
                    "\2LN\7\23\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\t\2\2\2PQ\7\34\2\2QR\3\2"+
                    "\2\2R^\b\5\1\2SU\7\23\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\t\2\2\2WX\7"+
                    "\34\2\2XY\7$\2\2YZ\5 \21\2Z[\3\2\2\2[\\\b\5\1\2\\^\3\2\2\2]M\3\2\2\2]"+
                    "T\3\2\2\2^\t\3\2\2\2_`\7\23\2\2`a\7%\2\2ae\7\36\2\2bc\7\25\2\2ce\7\36"+
                    "\2\2d_\3\2\2\2db\3\2\2\2ef\3\2\2\2fg\b\6\1\2g\13\3\2\2\2hi\7\25\2\2ik"+
                    "\t\3\2\2jl\t\4\2\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5 \21\2no\3\2\2\2o"+
                    "p\b\7\1\2p|\3\2\2\2qr\7\25\2\2rt\t\3\2\2su\t\4\2\2ts\3\2\2\2tu\3\2\2\2"+
                    "uv\3\2\2\2vw\5 \21\2wx\7!\2\2xy\3\2\2\2yz\b\7\1\2z|\3\2\2\2{h\3\2\2\2"+
                    "{q\3\2\2\2|\r\3\2\2\2}~\7\25\2\2~\u0080\7 \2\2\177\u0081\t\4\2\2\u0080"+
                    "\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\5 \21"+
                    "\2\u0083\u0084\3\2\2\2\u0084\u0085\b\b\1\2\u0085\17\3\2\2\2\u0086\u0088"+
                    "\7\24\2\2\u0087\u0089\t\4\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2"+
                    "\u0089\u008a\3\2\2\2\u008a\u008b\5 \21\2\u008b\u0091\t\5\2\2\u008c\u0092"+
                    "\7(\2\2\u008d\u008e\7-\2\2\u008e\u008f\7\13\2\2\u008f\u0092\7)\2\2\u0090"+
                    "\u0092\7*\2\2\u0091\u008c\3\2\2\2\u0091\u008d\3\2\2\2\u0091\u0090\3\2"+
                    "\2\2\u0092\u0093\3\2\2\2\u0093\u00ab\7\f\2\2\u0094\u0096\7-\2\2\u0095"+
                    "\u0097\7\r\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2"+
                    "\2\2\u0098\u009a\7-\2\2\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
                    "\u009b\3\2\2\2\u009b\u00ac\7&\2\2\u009c\u009e\7-\2\2\u009d\u009f\7\r\2"+
                    "\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u00a2"+
                    "\7-\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
                    "\u00ac\7\'\2\2\u00a4\u00a6\7-\2\2\u00a5\u00a7\7\r\2\2\u00a6\u00a5\3\2"+
                    "\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa\7-\2\2\u00a9"+
                    "\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u0094\3\2"+
                    "\2\2\u00ab\u009c\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
                    "\u00ae\b\t\1\2\u00ae\21\3\2\2\2\u00af\u00b0\5 \21\2\u00b0\u00b1\b\n\1"+
                    "\2\u00b1\23\3\2\2\2\u00b2\u00b4\7\21\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4"+
                    "\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b7\7\b\2\2\u00b6\u00b5\3\2\2\2\u00b6"+
                    "\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\7\35\2\2\u00b9\u00bb\7"+
                    "\16\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
                    "\u00bd\5 \21\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\13\1\2\u00bf\25\3\2\2"+
                    "\2\u00c0\u00c2\7+\2\2\u00c1\u00c3\t\6\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3"+
                    "\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\5 \21\2\u00c5\u00c6\3\2\2\2\u00c6"+
                    "\u00c7\b\f\1\2\u00c7\27\3\2\2\2\u00c8\u00cf\7\22\2\2\u00c9\u00cb\7\22"+
                    "\2\2\u00ca\u00cc\7$\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
                    "\u00cd\3\2\2\2\u00cd\u00cf\7\5\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2"+
                    "\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\5 \21\2\u00d1\u00d2\3\2\2\2\u00d2"+
                    "\u00d3\b\r\1\2\u00d3\31\3\2\2\2\u00d4\u00d6\7\23\2\2\u00d5\u00d4\3\2\2"+
                    "\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d9\7#\2\2\u00d8\u00d7"+
                    "\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\7\32\2\2"+
                    "\u00db\u00dd\7$\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de"+
                    "\3\2\2\2\u00de\u00e7\7\33\2\2\u00df\u00e0\7#\2\2\u00e0\u00e1\7\32\2\2"+
                    "\u00e1\u00e3\7\6\2\2\u00e2\u00e4\7$\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4"+
                    "\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7\7\33\2\2\u00e6\u00d5\3\2\2\2"+
                    "\u00e6\u00df\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\b\16\1\2\u00e9\33"+
                    "\3\2\2\2\u00ea\u00ec\7\31\2\2\u00eb\u00ed\t\7\2\2\u00ec\u00eb\3\2\2\2"+
                    "\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\5 \21\2\u00ef\u00f0"+
                    "\3\2\2\2\u00f0\u00f1\b\17\1\2\u00f1\u00fc\3\2\2\2\u00f2\u00f3\7\"\2\2"+
                    "\u00f3\u00f4\7\31\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00fc\b\17\1\2\u00f6\u00f7"+
                    "\7\23\2\2\u00f7\u00f8\7\20\2\2\u00f8\u00f9\7\31\2\2\u00f9\u00fa\3\2\2"+
                    "\2\u00fa\u00fc\b\17\1\2\u00fb\u00ea\3\2\2\2\u00fb\u00f2\3\2\2\2\u00fb"+
                    "\u00f6\3\2\2\2\u00fc\35\3\2\2\2\u00fd\u00ff\7\30\2\2\u00fe\u0100\7\3\2"+
                    "\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
                    "\7\27\2\2\u0102\u011a\7\f\2\2\u0103\u0105\7-\2\2\u0104\u0106\7\r\2\2\u0105"+
                    "\u0104\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2\2\2\u0107\u0109\7-"+
                    "\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
                    "\u011b\7&\2\2\u010b\u010d\7-\2\2\u010c\u010e\7\r\2\2\u010d\u010c\3\2\2"+
                    "\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u0111\7-\2\2\u0110\u010f"+
                    "\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u011b\7\'\2\2\u0113"+
                    "\u0115\7-\2\2\u0114\u0116\7\r\2\2\u0115\u0114\3\2\2\2\u0115\u0116\3\2"+
                    "\2\2\u0116\u0118\3\2\2\2\u0117\u0119\7-\2\2\u0118\u0117\3\2\2\2\u0118"+
                    "\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u0103\3\2\2\2\u011a\u010b\3\2"+
                    "\2\2\u011a\u0113\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\b\20\1\2\u011d"+
                    "\37\3\2\2\2\u011e\u011f\7,\2\2\u011f\u0125\7.\2\2\u0120\u0125\7,\2\2\u0121"+
                    "\u0122\7-\2\2\u0122\u0125\7.\2\2\u0123\u0125\7-\2\2\u0124\u011e\3\2\2"+
                    "\2\u0124\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0123\3\2\2\2\u0125\u0126"+
                    "\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127!\3\2\2\2.\619F"+
                    "JMT]dkt{\u0080\u0088\u0091\u0096\u0099\u009e\u00a1\u00a6\u00a9\u00ab\u00b3"+
                    "\u00b6\u00ba\u00c2\u00cb\u00ce\u00d5\u00d8\u00dc\u00e3\u00e6\u00ec\u00fb"+
                    "\u00ff\u0105\u0108\u010d\u0110\u0115\u0118\u011a\u0124\u0126";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}