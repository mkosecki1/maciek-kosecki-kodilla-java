package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;


public class TestingMain {
    public static void main(String[] args){

        //SimpleUsers test//
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("SimpleUser test OK");
        } else {
            System.out.println("SimpleUser test Error!");
        }

        //exercise 6.2. Calculator test//
        Calculator calc = new Calculator();
        int addResult = calc.addAToB(1,1);
        if (addResult == 2){
            System.out.println("\nCalculator addAToB test OK");
        } else {
            System.out.println("\nCalculator addAToB test FALSE");
        }
        Calculator calc2 = new Calculator();
        int substractResult = calc2.substractAFromB(1,1);
        if (substractResult == 0){
            System.out.println("Calculator substractAFromB test OK");
        } else {
            System.out.println("Calculator substractAFromB test FALSE");
        }
    }
}