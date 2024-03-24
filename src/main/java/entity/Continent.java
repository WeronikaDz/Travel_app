package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "continents")
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "continent_id")
    private Long id;

    @Column(name = "continent_name")
    private String continentName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
}

