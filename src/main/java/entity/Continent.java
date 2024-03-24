package entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "continents")
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "continent_id")
    private Long id;

    @Setter
    @Getter
    @Column(name = "continent_name")
    private String continentName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}

