package com.travel_app.repository;

import com.travel_app.entity.TripPurchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripPurchaseRepository extends JpaRepository<TripPurchase, Long> {
}
