package com.travel_app.repository;


import com.travel_app.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;


@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {




}
