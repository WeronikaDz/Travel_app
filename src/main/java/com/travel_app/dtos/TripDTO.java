package com.travel_app.dtos;

public class TripDTO {
// todo tutaj dodać wszystkie interesujące nas pola
    private String cityName;
    private String airportName;
    private String hotelName;

    public TripDTO(String cityName, String airportName, String hotelName) {
        this.cityName = cityName;
        this.airportName = airportName;
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }


}
