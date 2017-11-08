package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsSet {
    private final Set<Flight> flightSet;

    public FlightsSet() {
        flightSet = new HashSet<>();
        flightSet.add(new Flight("Gdańsk","Wrocław"));
        flightSet.add(new Flight("Wrocław","Warszawa"));
        flightSet.add(new Flight("Warszawa","Wrocław"));
        flightSet.add(new Flight("Kraków","Gdańsk"));
        flightSet.add(new Flight("Gdańsk","Kraków"));
        flightSet.add(new Flight("Warszawa","Kraków"));
    }

    public Set<Flight> getFlightSet() {
        return flightSet;
    }
}
