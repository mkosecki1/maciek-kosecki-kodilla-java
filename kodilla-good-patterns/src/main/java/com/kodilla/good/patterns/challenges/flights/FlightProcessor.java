package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightProcessor {
    private final FlightsSet flightsSet = new FlightsSet();

    public Set<Flights> departureSearcher(String departure){
        Set<Flights> departureFlight = flightsSet.getFlightsSet().stream()
                .filter(n->n.getDepartureCity().equals(departure))
                .collect(Collectors.toSet());
        return departureFlight;
    }
    public Set<Flights> arrivalSearcher(String arrival){
        Set<Flights> arrivalFlight = flightsSet.getFlightsSet().stream()
                .filter(n->n.getArrivalCity().equals(arrival))
                .collect(Collectors.toSet());
        return arrivalFlight;
    }
    public Set<Flights> transferSearcher(String transfer){
        Set<Flights> transferFlight = flightsSet.getFlightsSet().stream()
                .filter(n->n.getTransitCity().equals(transfer))
                .filter(n->n != null)
                .collect(Collectors.toSet());
        return transferFlight;
    }
}
