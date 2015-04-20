// Generated from IcaroEngine.g4 by ANTLR 4.5

    package cl.bit01.icaro.Engine;

    /*
     *    Disclaimer: Interpreter for Spanish Language
     *    Interprete de frases para idioma Español
     */

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cl.bit01.icaro.Engine.IcaroEngineParser}.
 */
public interface IcaroEngineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#icaro}.
	 * @param ctx the parse tree
	 */
	void enterIcaro(IcaroEngineParser.IcaroContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#icaro}.
	 * @param ctx the parse tree
	 */
	void exitIcaro(IcaroEngineParser.IcaroContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#funcionalidad}.
	 * @param ctx the parse tree
	 */
	void enterFuncionalidad(IcaroEngineParser.FuncionalidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#funcionalidad}.
	 * @param ctx the parse tree
	 */
	void exitFuncionalidad(IcaroEngineParser.FuncionalidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#reloj}.
	 * @param ctx the parse tree
	 */
	void enterReloj(IcaroEngineParser.RelojContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#reloj}.
	 * @param ctx the parse tree
	 */
	void exitReloj(IcaroEngineParser.RelojContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#clima}.
	 * @param ctx the parse tree
	 */
	void enterClima(IcaroEngineParser.ClimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#clima}.
	 * @param ctx the parse tree
	 */
	void exitClima(IcaroEngineParser.ClimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#ubicacion_actual}.
	 * @param ctx the parse tree
	 */
	void enterUbicacion_actual(IcaroEngineParser.Ubicacion_actualContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#ubicacion_actual}.
	 * @param ctx the parse tree
	 */
	void exitUbicacion_actual(IcaroEngineParser.Ubicacion_actualContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#explorar_negocios}.
	 * @param ctx the parse tree
	 */
	void enterExplorar_negocios(IcaroEngineParser.Explorar_negociosContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#explorar_negocios}.
	 * @param ctx the parse tree
	 */
	void exitExplorar_negocios(IcaroEngineParser.Explorar_negociosContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#buscar_negocios}.
	 * @param ctx the parse tree
	 */
	void enterBuscar_negocios(IcaroEngineParser.Buscar_negociosContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#buscar_negocios}.
	 * @param ctx the parse tree
	 */
	void exitBuscar_negocios(IcaroEngineParser.Buscar_negociosContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#calendario}.
	 * @param ctx the parse tree
	 */
	void enterCalendario(IcaroEngineParser.CalendarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#calendario}.
	 * @param ctx the parse tree
	 */
	void exitCalendario(IcaroEngineParser.CalendarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#busqueda_general}.
	 * @param ctx the parse tree
	 */
	void enterBusqueda_general(IcaroEngineParser.Busqueda_generalContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#busqueda_general}.
	 * @param ctx the parse tree
	 */
	void exitBusqueda_general(IcaroEngineParser.Busqueda_generalContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#whatsapp}.
	 * @param ctx the parse tree
	 */
	void enterWhatsapp(IcaroEngineParser.WhatsappContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#whatsapp}.
	 * @param ctx the parse tree
	 */
	void exitWhatsapp(IcaroEngineParser.WhatsappContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#telefonia}.
	 * @param ctx the parse tree
	 */
	void enterTelefonia(IcaroEngineParser.TelefoniaContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#telefonia}.
	 * @param ctx the parse tree
	 */
	void exitTelefonia(IcaroEngineParser.TelefoniaContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#busqueda_web}.
	 * @param ctx the parse tree
	 */
	void enterBusqueda_web(IcaroEngineParser.Busqueda_webContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#busqueda_web}.
	 * @param ctx the parse tree
	 */
	void exitBusqueda_web(IcaroEngineParser.Busqueda_webContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#noticias}.
	 * @param ctx the parse tree
	 */
	void enterNoticias(IcaroEngineParser.NoticiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#noticias}.
	 * @param ctx the parse tree
	 */
	void exitNoticias(IcaroEngineParser.NoticiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#recordatorios}.
	 * @param ctx the parse tree
	 */
	void enterRecordatorios(IcaroEngineParser.RecordatoriosContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#recordatorios}.
	 * @param ctx the parse tree
	 */
	void exitRecordatorios(IcaroEngineParser.RecordatoriosContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#alarmas}.
	 * @param ctx the parse tree
	 */
	void enterAlarmas(IcaroEngineParser.AlarmasContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#alarmas}.
	 * @param ctx the parse tree
	 */
	void exitAlarmas(IcaroEngineParser.AlarmasContext ctx);
	/**
	 * Enter a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(IcaroEngineParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link cl.bit01.icaro.Engine.IcaroEngineParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(IcaroEngineParser.StringContext ctx);
}