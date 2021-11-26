package ua.lviv.iot.models.dto.adress;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FullAddressDTO {
    private Integer id;
    private String street;
    private String number;
    private String country;
    private String city;
    private Integer cityId;
}
