package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class FlightsSet {
    private final Set<Flights> flightsSet;

    public FlightsSet() {
        flightsSet = new HashSet<>();
        flightsSet.add(new Flights("Gdańsk","Wrocław", null));
        flightsSet.add(new Flights("Wrocław","Gdańsk",null));
        flightsSet.add(new Flights("Wrocław","Warszawa","Kraków"));
        flightsSet.add(new Flights("Warszawa","Wrocław", "Kraków"));
        flightsSet.add(new Flights("Kraków","Gdańsk",null));
        flightsSet.add(new Flights("Gdańsk","Kraków",null));
        flightsSet.add(new Flights("Kraków","Warszawa","Wrocław"));
        flightsSet.add(new Flights("Warszawa","Kraków", "Wrocław"));
    }

    public Set<Flights> getFlightsSet() {
        return flightsSet;
    }
}
