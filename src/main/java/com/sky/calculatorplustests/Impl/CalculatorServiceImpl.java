package com.sky.calculatorplustests.Impl;

import com.sky.calculatorplustests.Interface.CalculatorService;
import com.sky.calculatorplustests.exeptions.DivideByZeroException;

public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Integer plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {

        if(num2 == 0){
            throw new DivideByZeroException("Second variable can't be zero");
        }
        return num1 / num2;
    }
}
