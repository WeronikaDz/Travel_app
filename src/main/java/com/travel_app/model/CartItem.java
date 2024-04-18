package com.travel_app.model;

import com.travel_app.entity.Trip;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CartItem {
    private Trip trip;
    private int numberOfAdults;
    private int numberOfKids;
    private List<com.travel_app.model.Traveler> travelers;

    public CartItem() {
        this.travelers = new ArrayList<>();
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public int getNumberOfKids() {
        return numberOfKids;
    }

    public void setNumberOfKids(int numberOfKids) {
        this.numberOfKids = numberOfKids;
    }

    public List<com.travel_app.model.Traveler> getTravelers() {
        return travelers;
    }

    public void addTraveler(Traveler traveler) {
        this.travelers.add(traveler);
    }

    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        totalPrice = totalPrice.add(trip.getPriceForAdult().multiply(BigDecimal.valueOf(numberOfAdults)));
        totalPrice = totalPrice.add(trip.getPriceForKid().multiply(BigDecimal.valueOf(numberOfKids)));
        return totalPrice;
    }
}