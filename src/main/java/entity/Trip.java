package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "trips")

public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_id")
    private Long id;
    @ManyToMany
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    @Column (name = "trip_from", nullable = false)
    private String tripFrom; // czy tutaj bedzie id
/*
    skąd (Miasto, Lotnisko)
    dokąd (Miasto, Hotel, Lotnisko)
*/
//    @ManyToOne
//    private City city;


    @Column (name = "trip_to", nullable = false)
    private String tripTo; // czy tutaj bedzie id




    @Column (name = "departure_date", nullable = false)
    private LocalDate departureDate;

    @Column (name = "return_date", nullable = false)
    private LocalDate returnDate;

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
