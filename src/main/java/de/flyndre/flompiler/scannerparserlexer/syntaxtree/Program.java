package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.*;

/**
 * 
 */
public class Program {

    /**
     * Default constructor
     */
    public Program() {
    }

    /**
     * 
     */
    public List<Class> classes;

    public Program typeCheck() throws Exception {
        for(Class cl:classes){
            cl.typeCheck();
        }
        return this;
    }

}