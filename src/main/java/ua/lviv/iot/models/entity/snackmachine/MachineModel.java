package ua.lviv.iot.models.entity.snackmachine;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "machine_model")
public class MachineModel {
    @Id
    @Column(name = "model")
    private String model;

    @Column(name = "max_capacity")
    @NotNull
    private Integer capacity;

    @Column(name = "electricity_consumption_wh")
    @NotNull
    private Integer electricityConsumption;

    @Override
    public String toString() {
        return String.format("Model: %s, capacity: %s, electricity consumption: %s wh",
                model,
                capacity,
                electricityConsumption
        );
    }
}
