package ua.lviv.iot.models.entity.snackmachine;

import lombok.Data;

@Data
public class MachineModel {
    private String model;
    private Integer capacity;
    private Integer electricityConsumption;
}
