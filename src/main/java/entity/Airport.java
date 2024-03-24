package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "airport")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airport")
    private Long id;
    @Column(name = "airportName")
    private String hotelName;
    @Column(name = "cityId")
    private String cityId;
}


