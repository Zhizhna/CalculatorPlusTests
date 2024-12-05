package com.sky.calculatorplustests.exeptions;

public class DivideByZeroException extends IllegalArgumentException{

    public DivideByZeroException(String s){
        super(s);
    }

}
