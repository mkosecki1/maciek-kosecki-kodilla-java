package com.kodilla.good.patterns.challenges.flights;

import java.util.Objects;

public class Flights {
    private final String departureCity;
    private final String arrivalCity;
    private final String transitCity;

    public Flights(final String departureCity, final String arrivalCity, final String transitCity) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.transitCity = transitCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getTransitCity() {
        return transitCity;
    }

    @Override
    public String toString() {
        return "Flight from " + departureCity + " to " + arrivalCity + " with transit in: " + transitCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(departureCity, flights.departureCity) &&
                Objects.equals(arrivalCity, flights.arrivalCity) &&
                Objects.equals(transitCity, flights.transitCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureCity, arrivalCity, transitCity);
    }
}
