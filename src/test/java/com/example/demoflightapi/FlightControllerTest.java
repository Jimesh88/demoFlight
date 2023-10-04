package com.example.demoflightapi;

import com.example.Controller.FlightController;
import com.example.Service.FlightService;
import com.example.model.Flight;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import java.util.List;


public class FlightControllerTest {

    @InjectMocks
    private FlightController flightController;

    @Mock
    private FlightService flightService;

    @Test
    public void testSearchFlights(){
        String expected;
        String returned;
        Flight flight = new Flight(“New york,Chicago,22-09-2022,28-09-2022");
         expected ="{origin:NewYork,destination:Chicago}";
        returned = {
                "AirportCode":"CAL",
                "AirportName":"California",
                "from":"CAL",
                "to":"NY",
                "Departure":"15 Jun 2019",
                "Arrival":"15 Jun 2019",
                "time":"10:05 AM"
        };
//mock the data
        Mockito.when(flightService.searchFlight(“NewYork,Chicago,22-09-2022,28-09-2022")).thenReturn(returned);

//original method call
        List<Flight> result = flightController.searchFlights(“NewYork,Chicago”);

        Assert.assertEquals(result.get(0).getFLightName().equals("SpiceJet");

    }
}
