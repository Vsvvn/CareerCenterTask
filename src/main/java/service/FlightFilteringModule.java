package service;

import com.gridnine.testing.Flight;

public interface FlightFilteringModule {
    boolean flightUpToTheCurrentPointInTime(Flight flight);
}
