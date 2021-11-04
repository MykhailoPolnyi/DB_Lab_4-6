package ua.lviv.iot.models.entity.snack;

import lombok.Data;

@Data
public class SnackProducer {
    private Integer id;
    private String name;
    private String email;
    private String mobilePhone;
    private Integer fullAddressId;
}
