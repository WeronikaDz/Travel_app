package com.travel_app.repository;

import com.travel_app.entity.Airport;
import com.travel_app.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {

    default List<Trip> findTripsByAirportName(String airportName, AirportRepository airportRepository) {
        return findAll().stream()
                .filter(trip -> trip.getAirport() != null && trip.getAirport().getAirportName().equals(airportName))
                .collect(Collectors.toList());
    }

}
