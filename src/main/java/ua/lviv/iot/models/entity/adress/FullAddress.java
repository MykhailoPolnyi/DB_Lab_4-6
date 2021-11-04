package ua.lviv.iot.models.entity.adress;

import lombok.Data;

@Data
public class FullAddress {
    private Integer id;
    private Integer cityId;
    private String street;
    private String number;
}
