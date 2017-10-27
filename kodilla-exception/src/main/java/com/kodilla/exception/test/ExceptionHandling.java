package com.kodilla.exception.test;

public class ExceptionHandling extends Exception{

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.7, 1.3);
            System.out.println("Done!");
        } catch (Exception e) {
            System.out.println("There is some problem!" + e);
        } finally {
            System.out.println("I'm still here");
        }
    }
}
