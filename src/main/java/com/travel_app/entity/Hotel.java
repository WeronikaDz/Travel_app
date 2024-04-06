package com.travel_app.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "standard_in_stars")
    private int standardInStars;

    @Column(name = "hotel_description")
    private String hotelDescription;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    public Hotel() {
    }

    public Hotel(Long id, String hotelName, int standardInStars, String hotelDescription, City city) {
        this.id = id;
        this.hotelName = hotelName;
        this.standardInStars = standardInStars;
        this.hotelDescription = hotelDescription;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getStandardInStars() {
        return standardInStars;
    }

    public void setStandardInStars(int standardInStars) {
        this.standardInStars = standardInStars;
    }

    public String getHotelDescription() {
        return hotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        this.hotelDescription = hotelDescription;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return standardInStars == hotel.standardInStars && Objects.equals(id, hotel.id) && Objects.equals(hotelName, hotel.hotelName) && Objects.equals(hotelDescription, hotel.hotelDescription) && Objects.equals(city, hotel.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hotelName, standardInStars, hotelDescription, city);
    }
}
