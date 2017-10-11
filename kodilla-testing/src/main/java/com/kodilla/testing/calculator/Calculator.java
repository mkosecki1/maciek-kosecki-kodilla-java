package com.kodilla.testing.calculator;

public class Calculator {

    public int addAToB(int a, int b) {
        return a + b;
    }
    public int substractAFromB(int a, int b) {
        return a - b;
    }

}
class Application {
    public static void main(String[] args) {

        Calculator simpleCalculator1 = new Calculator();
        int result1 = simpleCalculator1.addAToB(3, 4);
        System.out.println("Result A + B is: " + result1);

        Calculator simpleCalculator2 = new Calculator();
        int result2 = simpleCalculator2.substractAFromB(17, 13);
        System.out.println("Result A - B is: " + result2);
    }
}
