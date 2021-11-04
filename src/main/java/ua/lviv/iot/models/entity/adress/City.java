package ua.lviv.iot.models.entity.adress;

import lombok.Data;

@Data
public class City {

    private Integer id;
    private Integer countryId;
    private String name;
    private String region;
}
