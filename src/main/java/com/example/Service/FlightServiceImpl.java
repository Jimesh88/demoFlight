package com.example.Service;

import com.example.domain.FlightRepo;
import com.example.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;

public class FlightServiceImpl implements FlightService {
    @Autowired
    private FlightRepo flightRepo;

    @Override
    public Flight searchFlight(String source, String Destination, String departureDate, String arrivalDate) {
        flightRepo.searchByArrivalAndDeparture(source,destination,arrivalDate,departureDate);
    }
}
