package com.example.Service;


import com.example.model.Flight;

import java.util.List;


public interface FlightService {

        List<Flight> searchFlight(String source, String Destination, String departureDate, String arrivalDate);


    }

