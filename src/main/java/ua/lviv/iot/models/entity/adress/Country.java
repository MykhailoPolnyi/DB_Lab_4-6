package ua.lviv.iot.models.entity.adress;

import lombok.Data;

import javax.persistence.*;


import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    @NotNull
    private String name;

    @OneToMany(mappedBy = "country")
    private Set<City> cities;

    @Override
    public String toString() {
        return String.format("Country: %s, Country id: %s", name, id);
    }
}
