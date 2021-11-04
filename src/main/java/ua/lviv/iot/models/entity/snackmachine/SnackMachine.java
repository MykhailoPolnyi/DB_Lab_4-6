package ua.lviv.iot.models.entity.snackmachine;

import lombok.Data;

@Data
public class SnackMachine {
    private Integer id;
    private Integer producerId;
    private Integer modelId;
    private Integer fullAddressId;
}
