package com.travel_app.dtos;

public class TripDTO {
// todo tutaj dodać wszystkie interesujące nas pola
    private String cityFromName;
    private String cityToName;
    private String airportName;
    private String hotelName;

    public TripDTO(String cityFromName, String airportName, String hotelName, String cityToName) {
        this.cityFromName = cityFromName;
        this.airportName = airportName;
        this.hotelName = hotelName;
        this.cityToName = cityToName;
    }

    public String getCityFromName() {
        return cityFromName;
    }

    public void setCityFromName(String cityFromName) {
        this.cityFromName = cityFromName;
    }

    public String getCityToName() {
        return cityToName;
    }

    public void setCityToName(String cityToName) {
        this.cityToName = cityToName;
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
