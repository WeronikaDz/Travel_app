package com.travel_app.service;

import com.travel_app.entity.Trip;
import com.travel_app.entity.TripType;
import net.minidev.json.JSONValue;
import org.assertj.core.util.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static com.travel_app.entity.TripType.BB;
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
    void testFindTripsByTripType() {
        TripType tripType = BB;
        List<Trip> trips = tripService.findTripsByType(tripType);

        assertNotNull(trips);
        int oczekiwanaLiczbaWycieczek = 2;
        assertEquals(oczekiwanaLiczbaWycieczek, trips.size());
    }

    @Test
    void testFindTripsByDurationInDays () {
        int tripDurationInDays = 7;
        List <Trip> trips = tripService.findTripsByDurationInDays(tripDurationInDays);


        assertNotNull(trips);
        int oczekiwanaLiczbaWycieczek = 1;
        assertEquals(oczekiwanaLiczbaWycieczek, trips.size());
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
        assertEquals(expectedNumberOfTrips, hotels.size());
    }

    @Test
    void testFindTripsByDepartureDate() throws ParseException {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        Date departureDate = dateFormat.parse("2024-06-15 00:00:00");
        LocalDate departureDate = LocalDate.of(2024,06,15);
        List<Trip> trips = tripService.findTripsByDepartureDate(departureDate);

        assertNotNull(trips);
        int oczekiwanaLiczbaWycieczek = 1;
        assertEquals(oczekiwanaLiczbaWycieczek, trips.size());
    }
    @Test
    void testSortByPrice (){
        //given
        int standardInStars = 4;
        //when
        List<Trip> hotels = tripService.findTripsByStandardInStars(standardInStars);
        assertNotNull(hotels);
        //then
        int expectedNumberOfTrips = 2;
        assertEquals(expectedNumberOfTrips, hotels.size());
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
}