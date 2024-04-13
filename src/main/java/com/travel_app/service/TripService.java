package com.travel_app.service;

import com.travel_app.dtos.TripDTO;
import com.travel_app.entity.Trip;
import com.travel_app.entity.TripType;
import com.travel_app.repository.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class TripService {

    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public void addTrip(Trip trip) {
        String insertQuery = "INSERT INTO trip (city_id, airport_id, hotel_id, city_from_id, airport_from_id, city_to_id, airport_to_id, hotel_to_id, departure_date, return_date, trip_duration_in_days, trip_type, price_for_adult, price_for_kid, is_promoted, number_of_spots_for_adults, number_of_spots_for_kids) " +
                "VALUES (:cityId, :airportId, :hotelId, :cityFromId, :airportFromId, :cityToId, :airportToId, :hotelToId, :departureDate, :returnDate, :tripDurationInDays, :tripType, :priceForAdult, :priceForKid, :isPromoted, :numberOfSpotsForAdults, :numberOfSpotsForKids)";

        entityManager.createNativeQuery(insertQuery)
                .setParameter("cityId", trip.getCity().getId())
                .setParameter("airportId", trip.getAirport().getId())
                .setParameter("hotelId", trip.getHotel().getId())
                .setParameter("cityFromId", trip.getCityFrom().getId())
                .setParameter("airportFromId", trip.getAirportFrom().getId())
                .setParameter("cityToId", trip.getCityTo().getId())
                .setParameter("airportToId", trip.getAirportTo().getId())
                .setParameter("hotelToId", trip.getHotelTo().getId())
                .setParameter("departureDate", trip.getDepartureDate())
                .setParameter("returnDate", trip.getReturnDate())
                .setParameter("tripDurationInDays", trip.getTripDurationInDays())
                .setParameter("tripType", trip.getTripType().toString())
                .setParameter("priceForAdult", trip.getPriceForAdult())
                .setParameter("priceForKid", trip.getPriceForKid())
                .setParameter("isPromoted", trip.getPromoted())
                .setParameter("numberOfSpotsForAdults", trip.getNumberOfSpotsForAdults())
                .setParameter("numberOfSpotsForKids", trip.getNumberOfSpotsForKids())
                .executeUpdate();
    }

    @Transactional
    public void updateTrip(Integer tripId, Trip updatedTrip) {
        String updateQuery = "UPDATE trip " +
                "SET city_id = :cityId, " +
                "airport_id = :airportId, " +
                "hotel_id = :hotelId, " +
                "city_from_id = :cityFromId, " +
                "airport_from_id = :airportFromId, " +
                "city_to_id = :cityToId, " +
                "airport_to_id = :airportToId, " +
                "hotel_to_id = :hotelToId, " +
                "departure_date = :departureDate, " +
                "return_date = :returnDate, " +
                "trip_duration_in_days = :tripDurationInDays, " +
                "trip_type = :tripType, " +
                "price_for_adult = :priceForAdult, " +
                "price_for_kid = :priceForKid, " +
                "is_promoted = :isPromoted, " +
                "number_of_spots_for_adults = :numberOfSpotsForAdults, " +
                "number_of_spots_for_kids = :numberOfSpotsForKids " +
                "WHERE id = :tripId";

        entityManager.createNativeQuery(updateQuery)
                .setParameter("cityId", updatedTrip.getCity().getId())
                .setParameter("airportId", updatedTrip.getAirport().getId())
                .setParameter("hotelId", updatedTrip.getHotel().getId())
                .setParameter("cityFromId", updatedTrip.getCityFrom().getId())
                .setParameter("airportFromId", updatedTrip.getAirportFrom().getId())
                .setParameter("cityToId", updatedTrip.getCityTo().getId())
                .setParameter("airportToId", updatedTrip.getAirportTo().getId())
                .setParameter("hotelToId", updatedTrip.getHotelTo().getId())
                .setParameter("departureDate", updatedTrip.getDepartureDate())
                .setParameter("returnDate", updatedTrip.getReturnDate())
                .setParameter("tripDurationInDays", updatedTrip.getTripDurationInDays())
                .setParameter("tripType", updatedTrip.getTripType().toString())
                .setParameter("priceForAdult", updatedTrip.getPriceForAdult())
                .setParameter("priceForKid", updatedTrip.getPriceForKid())
                .setParameter("isPromoted", updatedTrip.getPromoted())
                .setParameter("numberOfSpotsForAdults", updatedTrip.getNumberOfSpotsForAdults())
                .setParameter("numberOfSpotsForKids", updatedTrip.getNumberOfSpotsForKids())
                .setParameter("tripId", tripId)
                .executeUpdate();
    }

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

    public List<TripDTO> findAll() {
        return tripRepository.findAll().stream()
                .map(Trip::map).collect(Collectors.toList());
    }
    public void deleteTrip(Long tripId) {
        tripRepository.deleteById(tripId);
    }
}