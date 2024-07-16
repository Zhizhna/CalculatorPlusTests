package com.sky.calculatorplustests.Controller;

import com.sky.calculatorplustests.Interface.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("calculator")
public class CalculatorController {

    @Autowired
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome(){
        return "Welcome to the calculator";
    }

    @GetMapping("plus")
    public String plus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){

        if(num1 == null || num2 == null){
            return "two variables required";
        }

        Integer result = calculatorService.plus(num1,num2);
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("plus")
    public String minus(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){

        if(num1 == null || num2 == null){
            return "two variables required";
        }

        Integer result = calculatorService.minus(num1,num2);
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("plus")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){

        if(num1 == null || num2 == null){
            return "two variables required";
        }

        Integer result = calculatorService.multiply(num1,num2);
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("plus")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2){

        if(num1 == null || num2 == null){
            return "two variables required";
        }

        Integer result = calculatorService.divide(num1,num2);
        return num1 + " / " + num2 + " = " + result;
    }

}