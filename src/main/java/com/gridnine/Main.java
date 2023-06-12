package com.gridnine;

import com.gridnine.testing.Flight;
import com.gridnine.testing.FlightBuilder;
import service.impl.FlightFilteringModuleImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        flights.stream().filter(flight -> FlightFilteringModuleImpl.flightUpToTheCurrentPointInTime(flight))
                .forEach(flight1 -> flight1.toString());


        System.out.println(flights);

    }
}