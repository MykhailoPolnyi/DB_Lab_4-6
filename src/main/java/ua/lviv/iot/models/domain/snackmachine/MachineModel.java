package ua.lviv.iot.models.domain.snackmachine;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "machine_model")
@Builder
public class MachineModel {
    @Id
    @Column(name = "model", length = 50)
    private String model;

    @Column(name = "max_capacity", nullable = false)
    private Integer capacity;

    @Column(name = "electricity_consumption_wh", nullable = false)
    private Integer electricityConsumption;

    @ManyToMany(mappedBy = "producedMachineModels")
    private Set<MachineProducer> machineProducers;

    @Override
    public String toString() {
        return String.format("Model: %s, capacity: %s, electricity consumption: %s wh",
                model,
                capacity,
                electricityConsumption
        );
    }
}
