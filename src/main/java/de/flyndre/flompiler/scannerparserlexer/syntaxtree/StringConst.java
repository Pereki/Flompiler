package de.flyndre.flompiler.scannerparserlexer.syntaxtree;

import java.util.List;

public class StringConst extends Expression{
    public String value;

    public StringConst(){

    }

    public StringConst(String value){
        this.value = value;
    }

    @Override
    public String typeCheck(List<Field> fields, List<Parameter> parameters) throws Exception {
        return type = "String";
    }
}
