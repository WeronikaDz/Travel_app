package com.travel_app.repository;

import com.travel_app.entity.Hotel;
import com.travel_app.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
