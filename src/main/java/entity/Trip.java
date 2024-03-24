package entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Data
@Entity
@Table(name = "trips")

public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_id")
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
    @JoinTable(name = "trip_from",
            joinColumns = @JoinColumn(name = "trip_id"),
            inverseJoinColumns = {
                    @JoinColumn(name = "city_id", referencedColumnName = "city_id"),
                    @JoinColumn(name = "airport_id", referencedColumnName = "airport_id")
            })
    private City cityFrom;

    @ManyToOne
    @JoinTable(name = "trip_to",
            joinColumns = @JoinColumn(name = "trip_id"),
            inverseJoinColumns = {
                    @JoinColumn(name = "city_id", referencedColumnName = "city_id"),
                    @JoinColumn(name = "hotel_id", referencedColumnName = "hotel_id"),
                    @JoinColumn(name = "airport_id", referencedColumnName = "airport_id")
            })
    private City cityTo;


    @Column (name = "trip_to", nullable = false)
    private String tripTo; // czy tutaj bedzie id

    @Column (name = "departure_date", nullable = false)
    private Date departureDate;

    @Column (name = "return_date", nullable = false)
    private Date returnDate;

    @Column (name = "trip_duration_in_days", nullable = false)
    private int tripDurationInDays;
    @Column (name = "trip_type", nullable = false)
    // available types: BB, HB, FB, AI - bedandbreakfast etc
    private String tripType;

    @Column (name = "price_for_adult", nullable = false)
    private BigDecimal priceForAdult;

    @Column (name = "price_for_kid", nullable = false)
    private BigDecimal priceForKid;

    @Column (name = "is_promoted")
    private Boolean isPromoted;

    @Column (name = "number_of_spots_for_adults", nullable = false)
    private int numberOfSpotsForAdults;
    @Column (name = "number_of_spots_for_kids", nullable = false)
    private int numberOfSpotsForKids;

    public Boolean getPromoted() {
        return isPromoted;
    }

    public void setPromoted(Boolean promoted) {
        isPromoted = promoted;
    }
}
