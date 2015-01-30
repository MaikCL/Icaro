// Generated from IcaroEngine.g4 by ANTLR 4.5

package cl.bit01.icaro.Engine;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IcaroEngineParser}.
 */
public interface IcaroEngineListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link IcaroEngineParser#icaro}.
     *
     * @param ctx the parse tree
     */
    void enterIcaro(IcaroEngineParser.IcaroContext ctx);

    /**
     * Exit a parse tree produced by {@link IcaroEngineParser#icaro}.
     *
     * @param ctx the parse tree
     */
    void exitIcaro(IcaroEngineParser.IcaroContext ctx);

    /**
     * Enter a parse tree produced by {@link IcaroEngineParser#funcion}.
     *
     * @param ctx the parse tree
     */
    void enterFuncion(IcaroEngineParser.FuncionContext ctx);

    /**
     * Exit a parse tree produced by {@link IcaroEngineParser#funcion}.
     *
     * @param ctx the parse tree
     */
    void exitFuncion(IcaroEngineParser.FuncionContext ctx);

    /**
     * Enter a parse tree produced by {@link IcaroEngineParser#reloj}.
     *
     * @param ctx the parse tree
     */
    void enterReloj(IcaroEngineParser.RelojContext ctx);

    /**
     * Exit a parse tree produced by {@link IcaroEngineParser#reloj}.
     *
     * @param ctx the parse tree
     */
    void exitReloj(IcaroEngineParser.RelojContext ctx);
}