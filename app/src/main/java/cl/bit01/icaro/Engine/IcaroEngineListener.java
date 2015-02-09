// Generated from /media/HD/Documentos/Proyectos Git/Icaro Engine/IcaroEngine.g4 by ANTLR 4.5

    package cl.bit01.icaro.Engine;

    /*
     *    Disclaimer: Interpreter for Spanish Language
     *    Interprete de frases para idioma Español
     */

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IcaroEngineParser}.
 */
public interface IcaroEngineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IcaroEngineParser#icaro}.
	 * @param ctx the parse tree
	 */
	void enterIcaro(IcaroEngineParser.IcaroContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcaroEngineParser#icaro}.
	 * @param ctx the parse tree
	 */
	void exitIcaro(IcaroEngineParser.IcaroContext ctx);
	/**
	 * Enter a parse tree produced by {@link IcaroEngineParser#funcionalidad}.
	 * @param ctx the parse tree
	 */
	void enterFuncionalidad(IcaroEngineParser.FuncionalidadContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcaroEngineParser#funcionalidad}.
	 * @param ctx the parse tree
	 */
	void exitFuncionalidad(IcaroEngineParser.FuncionalidadContext ctx);
	/**
	 * Enter a parse tree produced by {@link IcaroEngineParser#reloj}.
	 * @param ctx the parse tree
	 */
	void enterReloj(IcaroEngineParser.RelojContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcaroEngineParser#reloj}.
	 * @param ctx the parse tree
	 */
	void exitReloj(IcaroEngineParser.RelojContext ctx);
	/**
	 * Enter a parse tree produced by {@link IcaroEngineParser#clima}.
	 * @param ctx the parse tree
	 */
	void enterClima(IcaroEngineParser.ClimaContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcaroEngineParser#clima}.
	 * @param ctx the parse tree
	 */
	void exitClima(IcaroEngineParser.ClimaContext ctx);
	/**
	 * Enter a parse tree produced by {@link IcaroEngineParser#ubicacion_actual}.
	 * @param ctx the parse tree
	 */
	void enterUbicacion_actual(IcaroEngineParser.Ubicacion_actualContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcaroEngineParser#ubicacion_actual}.
	 * @param ctx the parse tree
	 */
	void exitUbicacion_actual(IcaroEngineParser.Ubicacion_actualContext ctx);
	/**
	 * Enter a parse tree produced by {@link IcaroEngineParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(IcaroEngineParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link IcaroEngineParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(IcaroEngineParser.StringContext ctx);
}