package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchAirports {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
       Map<String, Boolean> flightMap = new HashMap<>();
       flightMap.put("Wrocław", true);
       flightMap.put("Warszawa", false);
       flightMap.put("Londyn", true);
       flightMap.put("Frankfurt", false);

        if(!flightMap.containsKey(flight.getDepartureAirport()) || !flightMap.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException("UWAGA!");
        }
       return flightMap.get(flight.getDepartureAirport()) && flightMap.get(flight.getArrivalAirport());
    }

    public static void main(String args[]){
        Flight flight = new Flight("Wrocław", "Katowice");
        SearchAirports searchAirports = new SearchAirports();

        try {
            if(searchAirports.findFlight(flight)){
                System.out.println("You can fly.");
            } else {
                System.out.println("That flight is imposible.");
            }
        } catch (RouteNotFoundException e){
            System.out.println("Look out for Exception: " + e);
        } finally {
            System.out.println("\nProgram is running ...");
        }
    }
}
