package ua.lviv.iot.models.entity.snackmachine;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "machine_producer")
public class MachineProducer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "mobile_phone")
    @NotNull
    private String mobilePhone;

    @Column(name = "full_adress_id")
    @NotNull
    private Integer fullAddressId;
}
