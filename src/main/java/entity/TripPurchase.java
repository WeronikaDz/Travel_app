package entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "trips_purchased")
public class TripPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchased_trip_id")
    private Long id;

    @Column(name = "trip_id")
    private Long tripId;

    @Column(name = "trip_id")
    private String userData; // dane uczestników

    @Column(name = "trip_price")
    private BigDecimal tripPrice;


}
