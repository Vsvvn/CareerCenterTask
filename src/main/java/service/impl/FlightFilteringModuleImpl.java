package service.impl;

import com.gridnine.testing.Flight;
import com.gridnine.testing.Segment;

import java.time.LocalDateTime;

public class FlightFilteringModuleImpl {


    public static boolean flightUpToTheCurrentPointInTime(Flight flight) {

        for (Segment seg : flight.getSegments()) {
            if (seg.getDepartureDate().isBefore(LocalDateTime.now())) {
                return false;
            }
        }
        return true;
    }


    public void arrivalDateBeforeDepartureDate() {
    }


    public void totalTimeSpentOnTheGroundExceedsTwoHours() {
    }
}
