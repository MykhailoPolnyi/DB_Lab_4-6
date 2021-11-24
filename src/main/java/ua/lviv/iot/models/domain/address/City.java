package ua.lviv.iot.models.domain.address;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "city")
public class City {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String name;

    @Column(name = "region", nullable = false, length = 45)
    private String region;

    @ManyToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id", nullable = false)
    private Country country;

    @Override
    public String toString() {
        return String.format("City id: %2d, City: %s, Region: %s, %s", id, name, region, country.toString());
    }
}
