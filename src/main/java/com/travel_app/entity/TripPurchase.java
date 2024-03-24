package com.travel_app.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "trip_purchase")
public class TripPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "trip_id")
    private Long tripId;

    @ManyToOne
    @JoinColumn(name = "traveler_id")
    private Traveler traveler;

    @Column(name = "trip_price")
    private BigDecimal tripPrice;

    public TripPurchase() {
    }

    public TripPurchase(Long id, Long tripId, Traveler traveler, BigDecimal tripPrice) {
        this.id = id;
        this.tripId = tripId;
        this.traveler = traveler;
        this.tripPrice = tripPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTripId() {
        return tripId;
    }

    public void setTripId(Long tripId) {
        this.tripId = tripId;
    }

    public Traveler getTraveler() {
        return traveler;
    }

    public void setTraveler(Traveler traveler) {
        this.traveler = traveler;
    }

    public BigDecimal getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(BigDecimal tripPrice) {
        this.tripPrice = tripPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripPurchase that = (TripPurchase) o;
        return Objects.equals(id, that.id) && Objects.equals(tripId, that.tripId) && Objects.equals(traveler, that.traveler) && Objects.equals(tripPrice, that.tripPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tripId, traveler, tripPrice);
    }
}

