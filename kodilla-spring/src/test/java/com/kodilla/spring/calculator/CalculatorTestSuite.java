package com.kodilla.spring.calculator;

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
        calculator.add(6.0,2.0);
        calculator.div(6.0,2.0);
        calculator.mul(6.0,2.0);
        calculator.sub(6.0,2.0);
        //Then
        //do nothing
    }
}
