package com.sky.calculatorplustests.impl;

import com.sky.calculatorplustests.Impl.CalculatorServiceImpl;
import com.sky.calculatorplustests.Interface.CalculatorService;
import com.sky.calculatorplustests.exeptions.DivideByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculatorServiceImplTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldPlus() {

        int num1 = 10;
        int num2 = 20;
        int expectedResult = 30;
        Integer actualResult = calculatorService.plus(num1,num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldMultiply() {

        int num1 = 10;
        int num2 = 20;
        int expectedResult = 200;
        Integer actualResult = calculatorService.multiply(num1,num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldMinus() {

        int num1 = 10;
        int num2 = 20;
        int expectedResult = -10;
        Integer actualResult = calculatorService.minus(num1,num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldDivide() {

        int num1 = 20;
        int num2 = 10;
        int expectedResult = 2;

        Integer actualResult = calculatorService.divide(num1,num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldThrowException(){
        int num1 = 12;
        int num2 = 0;

        Assertions.assertThrows(DivideByZeroException.class,
        () ->
            calculatorService.divide(num1, num2)
        );

    }

}
