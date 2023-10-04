package com.example.Controller;

import com.example.Service.FlightService;
import com.example.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")

public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/flight/searchFlight")
    public String searchFlights(@RequestParam("arrival") String origin,
                                @RequestParam("departure") String destination,@RequestParam("arrivalDate")String arrivalDate,@RequestParam("departureDate") String departureDate
                                ) {

        List<Flight> result = flightService.searchFlight(origin, destination,arrivalDate,departureDate);
        Gson gson = new Gson();
        String jsonResponse = gson.toJson(result);
        return jsonResponse;
    }
}