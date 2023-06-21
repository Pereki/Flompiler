package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class Unary extends StatementExpression {

    /**
     * Default constructor
     */
    public Unary() {
    }

    /**
     * Checks and sets the type of the unary.
     * @return the type of the unary.
     * @throws Exception if no type could be determined.
     */
    @Override
    public String typeCheck() throws Exception {
        return type = expression.typeCheck();
    }

    /**
     * 
     */
    public String operator;

    /**
     * 
     */
    public Expression expression;

    public Unary(String operator, Expression expression){
        this.operator = operator;
        this.expression = expression;
    }

}