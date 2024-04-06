package com.travel_app.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "continent")
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "continent_name")
    private String continentName;

    public Continent() {
    }

    public Continent(Long id, String continentName) {
        this.id = id;
        this.continentName = continentName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return Objects.equals(id, continent.id) && Objects.equals(continentName, continent.continentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, continentName);
    }
}


