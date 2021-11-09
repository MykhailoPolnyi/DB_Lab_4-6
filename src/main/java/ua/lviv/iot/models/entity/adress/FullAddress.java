package ua.lviv.iot.models.entity.adress;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotNull;

@Data
@Table(name = "full_adress")
public class FullAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "city_id")
    @NotNull
    private Integer cityId;

    @Column(name = "street")
    private String street;

    @Column(name = "number")
    private String number;

    @Override
    public String toString() {
        return String.format(
                "Street: %s, %s, id: %s, city_id: %s\n",
                (street !=null ? street : "unknown" ),
                (number !=null ? number : "unknown" ),
                id,
                cityId
        );
    }
}
