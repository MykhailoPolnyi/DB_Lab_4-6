package ua.lviv.iot.models.entity.loader;

import lombok.Data;

@Data
public class Loader {
    private Integer id;
    private String name;
    private String surname;
    private String mobilePhone;
    private String company;
    private Integer fullAddressId;
    private String email;
}
