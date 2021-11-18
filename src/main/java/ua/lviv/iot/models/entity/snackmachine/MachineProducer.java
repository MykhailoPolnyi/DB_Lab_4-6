package ua.lviv.iot.models.entity.snackmachine;

import lombok.Data;
import ua.lviv.iot.models.entity.adress.FullAddress;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Entity
@Table(name = "machine_producer")
public class MachineProducer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    @NotNull
    private String name;

    @Column(name = "email", nullable = false, length = 45)
    @NotNull
    private String email;

    @Column(name = "mobile_phone", length = 12, nullable = false)
    @NotNull
    private String mobilePhone;

    @ManyToOne
    @JoinColumn(name = "full_adress_id", referencedColumnName = "id", nullable = false)
    private FullAddress fullAddress;

    @ManyToMany
    @JoinTable(name = "producer_model",
    joinColumns = @JoinColumn(name = "machine_model"),
    inverseJoinColumns = @JoinColumn(name = "machine_producer_id"))
    private Set<MachineModel> machineModels;

    @Override
    public String toString() {
        return String.format("Producer: %s, id: %s, email: %s, mobile phone: %s, %s",
                name,
                id,
                email,
                mobilePhone,
                fullAddress.toString()
        );
    }
}
