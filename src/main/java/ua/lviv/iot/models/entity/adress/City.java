package ua.lviv.iot.models.entity.adress;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "city")
public class City {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "country_id")
    @NotNull
    private Integer countryId;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "region")
    @NotNull
    private String region;
}
