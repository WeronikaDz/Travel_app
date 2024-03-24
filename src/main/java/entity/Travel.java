package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "travels")

public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;

    @Id
    @Column(nullable = false)
    private String continent;

    @Id
    @Column(nullable = false)
    private String country;

    @Id
    @Column(nullable = false)
    private String city;
    @Id
    @Column(nullable = false)
    private String hotel;
    @Id
    @Column(nullable = false)
    private String airport;
    @Id
    @Column(nullable = false)
    private String Trip;



}
