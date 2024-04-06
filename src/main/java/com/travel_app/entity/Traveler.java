package com.travel_app.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "traveler")
public class Traveler {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "traveler_first_name")
        private String travelerFirstName;

        @Column(name = "traveler_last_name")
        private String travelerLastName;

        @Column(name = "age")
        private int age;

        public Traveler() {
        }

        public Traveler(Long id, String travelerFirstName, String travelerLastName, int age) {
                this.id = id;
                this.travelerFirstName = travelerFirstName;
                this.travelerLastName = travelerLastName;
                this.age = age;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getTravelerFirstName() {
                return travelerFirstName;
        }

        public void setTravelerFirstName(String travelerFirstName) {
                this.travelerFirstName = travelerFirstName;
        }

        public String getTravelerLastName() {
                return travelerLastName;
        }

        public void setTravelerLastName(String travelerLastName) {
                this.travelerLastName = travelerLastName;
        }

        public int getAge() {
                return age;
        }

        public void setAge(int age) {
                this.age = age;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Traveler traveler = (Traveler) o;
                return age == traveler.age && Objects.equals(id, traveler.id) && Objects.equals(travelerFirstName, traveler.travelerFirstName) && Objects.equals(travelerLastName, traveler.travelerLastName);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, travelerFirstName, travelerLastName, age);
        }
}
