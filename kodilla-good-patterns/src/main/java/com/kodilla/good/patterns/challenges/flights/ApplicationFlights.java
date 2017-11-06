package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ApplicationFlights {
    public static void main(String[] args){
        FlightProcessor flightProcessor = new FlightProcessor();
        List<Set<Flights>> x = new ArrayList<>();
        x.add(flightProcessor.departureSearcher("Wrocław"));
        for (Set<Flights> xxx:x) {
            System.out.println(xxx);
        }
        System.out.println(flightProcessor.arrivalSearcher("Wrocław"));
        System.out.println(flightProcessor.transferSearcher("Kraków"));
    }
}