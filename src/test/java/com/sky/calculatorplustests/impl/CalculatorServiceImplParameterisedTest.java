package com.sky.calculatorplustests.impl;

import com.sky.calculatorplustests.Impl.CalculatorServiceImpl;
import com.sky.calculatorplustests.Interface.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterisedTest {

    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    public static Stream<Arguments> provideNums(){
        return Stream.of(
                Arguments.of(10,20),
                Arguments.of(0,5),
                Arguments.of(0,6),
                Arguments.of(3,7)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNums")
    public void shouldPlus(Integer num1, Integer num2){

        int expectedResult = num1 + num2;

        Integer actualResult = calculatorService.plus(num1,num2);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("provideNums")
    public void shouldMinus(Integer num1, Integer num2){

        int expectedResult = num1 - num2;

        Integer actualResult = calculatorService.minus(num1,num2);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("provideNums")
    public void shouldMultiply(Integer num1, Integer num2){

        int expectedResult = num1 * num2;

        Integer actualResult = calculatorService.multiply(num1,num2);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @ParameterizedTest
    @MethodSource("provideNums")
    public void shouldDivide(Integer num1, Integer num2){

        int expectedResult = num1 / num2;

        Integer actualResult = calculatorService.divide(num1,num2);

        Assertions.assertEquals(expectedResult, actualResult);

    }


}
