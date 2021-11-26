package ua.lviv.iot.models.dto.adress;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CountryDTO {
    private Integer id;
    private String name;
}
