package ua.lviv.iot.models.entity.loader;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "loader")
public class Loader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "surname")
    @NotNull
    private String surname;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @Column(name = "company")
    private String company;

    @Column(name = "full_adress_id")
    private Integer fullAddressId;

    @Column(name = "email")
    private String email;
}
