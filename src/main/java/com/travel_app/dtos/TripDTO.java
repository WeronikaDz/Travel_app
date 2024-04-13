package com.travel_app.dtos;

import com.travel_app.entity.TripType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class TripDTO {
// todo tutaj dodać wszystkie interesujące nas pola
    private String cityFromName;
    private String airportFromName;
    private String cityToName;
    private String airportToName;
    private String hotelName;
    private String departureDate;
    private String returnDate;
    private int tripDurationInDays;
    private TripType tripType;
    private BigDecimal priceForAdult;
    private BigDecimal priceForKid;
    private boolean isPromoted;
    private int numberOfSpotsForAdults;
    private int numberOfSpotsForKids;

    public TripDTO(String cityFromName, String airportFromName, String cityToName, String airportToName, String hotelName, String departureDate, String returnDate, int tripDurationInDays, TripType tripType, BigDecimal priceForAdult, BigDecimal priceForKid, boolean isPromoted, int numberOfSpotsForAdults, int numberOfSpotsForKids) {
        this.cityFromName = cityFromName;
        this.airportFromName = airportFromName;
        this.cityToName = cityToName;
        this.airportToName = airportToName;
        this.hotelName = hotelName;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.tripDurationInDays = tripDurationInDays;
        this.tripType = tripType;
        this.priceForAdult = priceForAdult;
        this.priceForKid = priceForKid;
        this.isPromoted = isPromoted;
        this.numberOfSpotsForAdults = numberOfSpotsForAdults;
        this.numberOfSpotsForKids = numberOfSpotsForKids;
    }

    public String getCityFromName() {
        return cityFromName;
    }

    public void setCityFromName(String cityFromName) {
        this.cityFromName = cityFromName;
    }

    public String getAirportFromName() {
        return airportFromName;
    }

    public void setAirportFromName(String airportFromName) {
        this.airportFromName = airportFromName;
    }

    public String getCityToName() {
        return cityToName;
    }

    public void setCityToName(String cityToName) {
        this.cityToName = cityToName;
    }

    public String getAirportToName() {
        return airportToName;
    }

    public void setAirportToName(String airportToName) {
        this.airportToName = airportToName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getTripDurationInDays() {
        return tripDurationInDays;
    }

    public void setTripDurationInDays(int tripDurationInDays) {
        this.tripDurationInDays = tripDurationInDays;
    }

    public TripType getTripType() {
        return tripType;
    }

    public void setTripType(TripType tripType) {
        this.tripType = tripType;
    }

    public BigDecimal getPriceForAdult() {
        return priceForAdult;
    }

    public void setPriceForAdult(BigDecimal priceForAdult) {
        this.priceForAdult = priceForAdult;
    }

    public BigDecimal getPriceForKid() {
        return priceForKid;
    }

    public void setPriceForKid(BigDecimal priceForKid) {
        this.priceForKid = priceForKid;
    }

    public boolean isPromoted() {
        return isPromoted;
    }

    public void setPromoted(boolean promoted) {
        isPromoted = promoted;
    }

    public int getNumberOfSpotsForAdults() {
        return numberOfSpotsForAdults;
    }

    public void setNumberOfSpotsForAdults(int numberOfSpotsForAdults) {
        this.numberOfSpotsForAdults = numberOfSpotsForAdults;
    }

    public int getNumberOfSpotsForKids() {
        return numberOfSpotsForKids;
    }

    public void setNumberOfSpotsForKids(int numberOfSpotsForKids) {
        this.numberOfSpotsForKids = numberOfSpotsForKids;
    }
}
