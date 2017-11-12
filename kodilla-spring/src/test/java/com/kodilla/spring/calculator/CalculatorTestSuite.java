package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultOfAdd = calculator.add(6.0,2.0);
        double resultOfDiv = calculator.div(6.0,2.0);
        double resultOfMul = calculator.mul(6.0,2.0);
        double resultOfSub = calculator.sub(6.0,2.0);
        //Then
        Assert.assertEquals(8.0,resultOfAdd,0.0);
        Assert.assertEquals(3.0,resultOfDiv,0.0);
        Assert.assertEquals(12.0,resultOfMul,0.0);
        Assert.assertEquals(4.0,resultOfSub,0.0);
    }
}
