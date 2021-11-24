package ua.lviv.iot.models.domain.snackmachine;

import lombok.Data;
import ua.lviv.iot.models.domain.address.FullAddress;

import javax.persistence.*;
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
    private String name;

    @Column(name = "email", nullable = false, length = 45)
    private String email;

    @Column(name = "mobile_phone", columnDefinition = "char", length = 12, nullable = false)
    private String mobilePhone;

    @ManyToOne
    @JoinColumn(name = "full_adress_id", referencedColumnName = "id", nullable = false)
    private FullAddress fullAddress;

    @ManyToMany
    @JoinTable(name = "producer_model",
    joinColumns = @JoinColumn(name = "machine_model", columnDefinition = "varchar"),
    inverseJoinColumns = @JoinColumn(name = "machine_producer_id", columnDefinition = "int"))
    private Set<MachineModel> producedMachineModels;

    @Override
    public String toString() {
        return String.format("Id: %2d, Producer: %s, email: %s, mobile phone: %s, Address: %s",
                id,
                name,
                email,
                mobilePhone,
                fullAddress.toString()
        );
    }
}
