package com.example.domain;

import com.example.model.Flight;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public class FlightRepo {
    @Transactional
    public interface FlightRepository extends JpaRepository<Flight, String> {

        List<Flight> searchByArrivalAndDeparture(String arrival, String departure,LocalDateTime arrivalDate, LocalDateTime departureDate);
    }
}
