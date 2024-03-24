package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    private Long id;
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "standard_in_stars")
    private int standardInStars;
    @Column(name = "hotel_description")
    private String hotelDescription;
    @Column(name = "city_id")
    private Long cityId;

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

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }
}