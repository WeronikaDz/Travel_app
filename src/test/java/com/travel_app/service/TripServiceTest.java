package com.travel_app.service;

import com.travel_app.entity.Trip;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TripServiceTest {

    @Autowired
    private TripService tripService;

    @Test
    void testFindTripsByAirportName() {
        String airportName = "Tegel Airport";
        List<Trip> trips = tripService.findTripsByAirportName(airportName);

        assertNotNull(trips);
        int oczekiwanaLiczbaWycieczek = 1;
        assertEquals(oczekiwanaLiczbaWycieczek, trips.size());
    }
}