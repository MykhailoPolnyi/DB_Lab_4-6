package ua.lviv.iot.models.converter;

import ua.lviv.iot.models.domain.address.FullAddress;
import ua.lviv.iot.models.dto.adress.FullAddressDTO;

public class FullAddressConverter {
    public static FullAddressDTO toDTO(FullAddress fullAddress) {
        return FullAddressDTO.builder()
                .id(fullAddress.getId())
                .number(fullAddress.getNumber())
                .street(fullAddress.getStreet())
                .city(fullAddress.getCity().getName())
                .cityId(fullAddress.getCity().getId())
                .country(fullAddress.getCity().getCountry().getName())
                .build();
    }
}
