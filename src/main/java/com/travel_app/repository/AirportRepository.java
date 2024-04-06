package com.travel_app.repository;

import com.travel_app.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
//    Airport findByName(String airportName);


}
