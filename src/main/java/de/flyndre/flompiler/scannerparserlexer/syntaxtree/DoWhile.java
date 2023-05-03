package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

/**
 * 
 */
public class DoWhile extends Statement {

    /**
     * Default constructor
     */
    public DoWhile() {
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws ExecutionControl.NotImplementedException {
        return "void";
    }

}