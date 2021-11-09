package ua.lviv.iot.models.entity.snack;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "snack_producer")
public class SnackProducer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @Column(name = "full_adress_id")
    @NotNull
    private Integer fullAddressId;

    @Override
    public String toString() {
        return String.format("Producer: %s, id: %s, email: %s, mobile phone: %s, address id:%s",
                name,
                id,
                email,
                mobilePhone,
                fullAddressId
        );
    }
}
