package com.kodilla.good.patterns.challenges.flights;

public class ApplicationFlights {
    public static void main(String[] args){
        FlightProcessor flightProcessor = new FlightProcessor();
        System.out.println(flightProcessor.departureSearcher("Wrocław"));
        System.out.println(flightProcessor.arrivalSearcher("Wrocław"));
        System.out.println(flightProcessor.transferSearcher("MM"));
    }
}
