package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "travels")

public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_id")
    private Long id;

    @Column (name = "trip_from", nullable = false)
    private String from; // czy tutaj bedzie id
//    skąd (Miasto, Lotnisko)
//    dokąd (Miasto, Hotel, Lotnisko)

    @Column (name = "trip_to", nullable = false)
    private String to; // czy tutaj bedzie id

    @Column (name = "departure_date", nullable = false)
    private LocalDate departureDate;

    @Column (name = "return_date", nullable = false)
    private LocalDate returnDate;

    @Column (name = "number_of_days", nullable = false)
    private Integer numberOfDays;
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
    private Integer numberOfSpotsForAdults;
    @Column (name = "number_of_spots_for_kids", nullable = false)
    private Integer numberOfSpotsForKids;


    public Boolean getPromoted() {
        return isPromoted;
    }

    public void setPromoted(Boolean promoted) {
        isPromoted = promoted;
    }
}
