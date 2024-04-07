package com.travel_app.service;

import com.travel_app.entity.Trip;
import com.travel_app.entity.TripType;
import com.travel_app.repository.*;
import org.springframework.stereotype.Service;
import java.sql.Date;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;


@Service
public class TripService {

    private final AirportRepository airportRepository;
    private final CityRepository cityRepository;
    private  final ContinentRepository continentRepository;
    private final CountryRepository countryRepository;
    private final HotelRepository hotelRepository;
    private final TravelerRepository travelerRepository;
    private final TripPurchaseRepository tripPurchaseRepository;
    private final TripRepository tripRepository;


    public TripService(AirportRepository airportRepository, CityRepository cityRepository, ContinentRepository continentRepository, CountryRepository countryRepository, HotelRepository hotelRepository, TravelerRepository travelerRepository, TripPurchaseRepository tripPurchaseRepository, TripRepository tripRepository) {
        this.airportRepository = airportRepository;
        this.cityRepository = cityRepository;
        this.continentRepository = continentRepository;
        this.countryRepository = countryRepository;
        this.hotelRepository = hotelRepository;
        this.travelerRepository = travelerRepository;
        this.tripPurchaseRepository = tripPurchaseRepository;
        this.tripRepository = tripRepository;
    }
/*
    można wyszukiwać wycieczki po (np.):
    mieście (Lotnisku) wylotu
    mieście (Hotelu) pobytu
    dacie wyjazdu (opcjonalnie zakresie)
    dacie powrotu (opcjonalnie zakresie)
    typie (BB, HB, FB, AI)
    standardzie hotelu
    ilości dni
    sortować można po (np.):
    cenie
    dacie wylotu
    */

//     metoda wyszukująca po lotnisku wylotu

    public List<Trip> findTripsByAirportName(String airportName) {
        return tripRepository.findAll().stream()
                .filter(trip -> trip.getAirport() != null && trip.getAirport().getAirportName().equals(airportName))
                .collect(Collectors.toList());
    }
// metoda wyszukująca po mieście (nazwie Hotelu) pobytu

    // metoda wyszukująca po typie (BB, HB, FB, AI)
    public List <Trip> findTripsByType (TripType tripType) {
        return tripRepository.findAll().stream()
                .filter(trip -> trip.getTripType() != null && trip.getTripType().equals(tripType))
                .collect(Collectors.toList());

    }

    // metoda wyszukująca po ilości dni

    public List<Trip> findTripsByDurationInDays (int tripDurationInDays) {
        return tripRepository.findAll().stream()
                .filter(trip -> trip.getTripDurationInDays() != 0 && trip.getTripDurationInDays() == tripDurationInDays)
                .collect(Collectors.toList());
    }


    public List<Trip> findTripsByDepartureDate(LocalDate departureDate) {
        return tripRepository.findAll().stream()
                .filter(trip -> trip.getDepartureDate() != null && trip.getDepartureDate().equals(departureDate))
                .collect(Collectors.toList());
    }

    public List<Trip> findTripsByReturnDate(LocalDate returnDate) {
        return tripRepository.findAll().stream()
                .filter(trip -> trip.getReturnDate() != null && trip.getReturnDate().equals(returnDate))
                .collect(Collectors.toList());
    }


    public List<Trip> sortByPriceForAdult (List<Trip> trips) {
        Collections.sort(trips, Comparator.comparing(Trip::getPriceForAdult));
        return trips;
    }
public List<Trip> findTripsByHotelName(String hotelName) {
        return tripRepository.findAll().stream()
                .filter(trip -> trip.getHotel() !=null && trip.getHotel().getHotelName().equals(hotelName))
                .collect(Collectors.toList());
}

// metoda wyszukująca po standardzie hotelu

    public List<Trip> findTripsByStandardInStars(int standardInStars) {
        return tripRepository.findAll().stream()
                .filter(trip -> trip.getHotel() !=null && trip.getHotel().getStandardInStars() == standardInStars)
                .collect(Collectors.toList());
    }

    public List<Trip> findAll() {

        return null;
    }

}