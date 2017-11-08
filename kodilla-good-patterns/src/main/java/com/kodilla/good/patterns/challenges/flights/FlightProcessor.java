package com.kodilla.good.patterns.challenges.flights;

import java.util.Set;
import java.util.stream.Collectors;

public class FlightProcessor {
    private final FlightsSet flightsSet = new FlightsSet();

    public Set<Flight> departureSearcher(String departure){
        Set<Flight> departureFlight = flightsSet.getFlightSet().stream()
                .filter(n->n.getDepartureCity().equals(departure))
                .collect(Collectors.toSet());
        return departureFlight;
    }
    public Set<Flight> arrivalSearcher(String arrival){
        Set<Flight> arrivalFlight = flightsSet.getFlightSet().stream()
                .filter(n->n.getArrivalCity().equals(arrival))
                .collect(Collectors.toSet());
        return arrivalFlight;
    }
    public Set<String> searchWitchTransfer(String departure, String arrival){
        Set<Flight> citiesInTheMiddle = arrivalSearcher(arrival);

        Set<String> directFlights = arrivalSearcher(arrival).stream()
                .filter(flight -> flight.getDepartureCity().equals(departure))
                .map(flight -> flight.getDepartureCity())
                .collect(Collectors.toSet());

        Set<String> departureCities = citiesInTheMiddle.stream()
                .map(flight -> flight.getArrivalCity())
                .map(arrivalCity -> arrivalSearcher(arrivalCity))
                .flatMap(flights -> flights.stream())
                .map(flight -> flight.getArrivalCity())
                .filter(city -> ! arrival.equals(city))
                .collect(Collectors.toSet());

        directFlights.addAll(departureCities);
        return directFlights;
    }
}
