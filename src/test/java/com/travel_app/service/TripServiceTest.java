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

    @Test
    void testFindTripsByHotelName(){
        //given
        String hotelName = "Grand Hotel";
        //when
        List<Trip> hotels = tripService.findTripsByHotelName(hotelName);
        assertNotNull(hotels);

        //then
        int expectedNumberOfHotels = 1;
        assertEquals(expectedNumberOfHotels, hotels.size());
    }
    @Test
    void testFindTripsByStandardInStars(){
        //given
        int standardInStars = 4;
        //when
        List<Trip> hotels = tripService.findTripsByStandardInStars(standardInStars);
        assertNotNull(hotels);
        //then
        int expectedNumberOfTrips = 2;
        assertEquals(expectedNumberOfTrips,hotels.size());
    }
}