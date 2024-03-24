package entity;

import jakarta.persistence.*;
@Entity
@Table(name = "travelers")
public class Traveler {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "traveler_id")
        private Long id;

        @Column(name = "first_name")
        private String travelerFirstName;

        @Column(name = "last_name")
        private String travelerLastName;

        @Column(name = "traveler_age")
        private int age;

}
