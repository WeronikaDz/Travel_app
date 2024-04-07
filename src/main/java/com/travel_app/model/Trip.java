package com.travel_app.model;

public class Trip {

    private final Integer tripId;
    private final String countryName;

    public Trip(Integer tripId, String countryName) {
        this.tripId = tripId;
        this.countryName = countryName;

    }

    public Integer getTripId() {
        return tripId;
    }

    public String getCountryName() {
        return countryName;
    }

}
