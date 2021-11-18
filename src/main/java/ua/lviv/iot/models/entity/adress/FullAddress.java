package ua.lviv.iot.models.entity.adress;

import lombok.Data;
import ua.lviv.iot.models.entity.loader.Loader;
import ua.lviv.iot.models.entity.snack.SnackProducer;
import ua.lviv.iot.models.entity.snackmachine.MachineProducer;
import ua.lviv.iot.models.entity.snackmachine.SnackMachine;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "full_adress")
public class FullAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "street", length = 45)
    private String street;

    @Column(name = "number", length = 45)
    private String number;

    @ManyToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id", nullable = false)
    private City city;

    @OneToMany(mappedBy = "fullAddress")
    private Set<Loader> loaders;
/*
    @OneToMany(mappedBy = "fullAddress")
    private Set<SnackProducer> snackProducers;

    @OneToMany(mappedBy = "fullAddress")
    private Set<MachineProducer> machineProducers;

    @OneToMany(mappedBy = "fullAddress")
    private Set<SnackMachine> snackMachines;
*/
    @Override
    public String toString() {
        return String.format(
                "Street: %s, %s, Address id: %s, %s",
                (street != null ? street : "unknown"),
                (number != null ? number : "unknown"),
                id,
                city.toString()
        );
    }
}
