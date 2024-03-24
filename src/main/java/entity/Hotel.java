package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Hotel")
    private Long id;
    @Column(name = "hotelName")
    private String hotelName;
    @Column(name = "standard")
    private String standard;
    @Column(name = "description")
    private String description;
    @Column(name = "CityId")
    private Long cityId;





}