package ua.lviv.iot.models.entity.snackmachine;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "snack_machine")
public class SnackMachine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "machine_producer_id")
    @NotNull
    private Integer producerId;

    @Column(name = "machine_model")
    @NotNull
    private String modelId;

    @Column(name = "full_adress_id")
    @NotNull
    private Integer fullAddressId;

    @Override
    public String toString() {
        return String.format("Machine id: %s, model: %s, producer id: %s, address id: %s",
                id,
                modelId,
                producerId,
                fullAddressId
        );
    }
}
