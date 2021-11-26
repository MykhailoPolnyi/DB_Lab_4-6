package ua.lviv.iot.models.dto.snack;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SnackProducerDTO {
    private Integer id;
    private String name;
    private String email;
    private String mobilePhone;
    private Integer fullAddressId;
}
