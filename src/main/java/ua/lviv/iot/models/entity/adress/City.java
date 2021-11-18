package ua.lviv.iot.models.entity.adress;

import lombok.Data;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Entity
@Table(name = "city")
public class City {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    @NotNull
    private String name;

    @Column(name = "region", nullable = false, length = 45)
    @NotNull
    private String region;

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false)
    private Country country;

    @OneToMany(mappedBy = "city")
    private Set<FullAddress> addresses;

    @Override
    public String toString() {
        return String.format("City: %s, Region: %s, City id: %s, %s", name, region, id, country.toString());
    }
}
