package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ApplicationFlights {
    public static void main(String[] args){
        FlightProcessor flightProcessor = new FlightProcessor();
        Set<Flight> flights = flightProcessor.departureSearcher("Gdańsk");
        String arrivalCity = "Wrocław";
        Set<Flight> flights2 = flightProcessor.arrivalSearcher(arrivalCity);
        new ApplicationFlights().printAvailableDeparturePorts(flights2,arrivalCity);
        new ApplicationFlights().printAvailableArrivalPorts(flights);

        System.out.println("Transit city: " + flightProcessor.searchWitchTransfer("Kraków", "Gdańsk"));
    }
    private void printAvailableDeparturePorts(Set<Flight> flights, String arrivalCity){
        System.out.println("Available ports to get to: " + arrivalCity + " from: ");
        flights.stream()
                .map(Flight::getDepartureCity)
                .forEach(System.out::println);
    }
    private void printAvailableArrivalPorts(Set<Flight> flights){
        System.out.println("\nAvailable ports:");
        flights.stream()
                .map(Flight::getArrivalCity)
                .forEach(System.out::println);
    }

}