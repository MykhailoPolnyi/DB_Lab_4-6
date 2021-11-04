package ua.lviv.iot.models.entity.snackmachine;

import lombok.Data;

@Data
public class MachineProducer {
    private Integer id;
    private String name;
    private String mobilePhone;
    private String email;
    private Integer fullAddressId;
}
