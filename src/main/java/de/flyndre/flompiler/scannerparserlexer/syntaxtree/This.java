package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

/**
 * 
 */
public class This extends Expression {

    /**
     * Default constructor
     */
    public This() {
    }

    /**
     * @return the set type.
     */
    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) {
        return type;
    }

}