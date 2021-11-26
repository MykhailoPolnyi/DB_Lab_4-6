package ua.lviv.iot.models.converter.address;

import ua.lviv.iot.models.domain.address.FullAddress;
import ua.lviv.iot.models.dto.adress.FullAddressDto;

public class FullAddressConverter {
    public static FullAddressDto toDTO(FullAddress fullAddress) {
        return FullAddressDto.builder()
                .id(fullAddress.getId())
                .number(fullAddress.getNumber())
                .street(fullAddress.getStreet())
                .city(fullAddress.getCity().getName())
                .cityId(fullAddress.getCity().getId())
                .country(fullAddress.getCity().getCountry().getName())
                .build();
    }
}
