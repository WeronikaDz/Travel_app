package com.travel_app.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "trip")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @ManyToOne
    @JoinColumn(name = "airport_id")
    private Airport airport;

    @ManyToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "city_from_id")
    private City cityFrom;

    @ManyToOne
    @JoinColumn(name = "airport_from_id")
    private Airport airportFrom;

    @ManyToOne
    @JoinColumn(name = "city_to_id")
    private City cityTo;

    @ManyToOne
    @JoinColumn(name = "airport_to_id")
    private Airport airportTo;

    @ManyToOne
    @JoinColumn(name = "hotel_to_id")
    private Hotel hotelTo;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "trip_duration_in_days")
    private int tripDurationInDays;

    @Enumerated(EnumType.STRING)
    @Column(name = "trip_type")
    private TripType tripType;

    @Column(name = "price_for_adult")
    private BigDecimal priceForAdult;

    @Column(name = "price_for_kid")
    private BigDecimal priceForKid;

    @Column(name = "is_promoted")
    private Boolean isPromoted;

    @Column(name = "number_of_spots_for_adults")
    private int numberOfSpotsForAdults;

    @Column(name = "number_of_spots_for_kids")
    private int numberOfSpotsForKids;

    public Trip() {
    }

    public Trip(Long id, City city, Airport airport, Hotel hotel, City cityFrom, Airport airportFrom, City cityTo, Airport airportTo, Hotel hotelTo, Date departureDate, Date returnDate, int tripDurationInDays, TripType tripType, BigDecimal priceForAdult, BigDecimal priceForKid, Boolean isPromoted, int numberOfSpotsForAdults, int numberOfSpotsForKids) {
        this.id = id;
        this.city = city;
        this.airport = airport;
        this.hotel = hotel;
        this.cityFrom = cityFrom;
        this.airportFrom = airportFrom;
        this.cityTo = cityTo;
        this.airportTo = airportTo;
        this.hotelTo = hotelTo;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public City getCityFrom() {
        return cityFrom;
    }

    public void setCityFrom(City cityFrom) {
        this.cityFrom = cityFrom;
    }

    public Airport getAirportFrom() {
        return airportFrom;
    }

    public void setAirportFrom(Airport airportFrom) {
        this.airportFrom = airportFrom;
    }

    public City getCityTo() {
        return cityTo;
    }

    public void setCityTo(City cityTo) {
        this.cityTo = cityTo;
    }

    public Airport getAirportTo() {
        return airportTo;
    }

    public void setAirportTo(Airport airportTo) {
        this.airportTo = airportTo;
    }

    public Hotel getHotelTo() {
        return hotelTo;
    }

    public void setHotelTo(Hotel hotelTo) {
        this.hotelTo = hotelTo;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
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

    public Boolean getPromoted() {
        return isPromoted;
    }

    public void setPromoted(Boolean promoted) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trip trip)) return false;
        return tripDurationInDays == trip.tripDurationInDays && numberOfSpotsForAdults == trip.numberOfSpotsForAdults && numberOfSpotsForKids == trip.numberOfSpotsForKids && Objects.equals(id, trip.id) && Objects.equals(city, trip.city) && Objects.equals(airport, trip.airport) && Objects.equals(hotel, trip.hotel) && Objects.equals(cityFrom, trip.cityFrom) && Objects.equals(airportFrom, trip.airportFrom) && Objects.equals(cityTo, trip.cityTo) && Objects.equals(airportTo, trip.airportTo) && Objects.equals(hotelTo, trip.hotelTo) && Objects.equals(departureDate, trip.departureDate) && Objects.equals(returnDate, trip.returnDate) && tripType == trip.tripType && Objects.equals(priceForAdult, trip.priceForAdult) && Objects.equals(priceForKid, trip.priceForKid) && Objects.equals(isPromoted, trip.isPromoted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, city, airport, hotel, cityFrom, airportFrom, cityTo, airportTo, hotelTo, departureDate, returnDate, tripDurationInDays, tripType, priceForAdult, priceForKid, isPromoted, numberOfSpotsForAdults, numberOfSpotsForKids);
    }

    public void setCreationDate(Date date) {
    }
}

