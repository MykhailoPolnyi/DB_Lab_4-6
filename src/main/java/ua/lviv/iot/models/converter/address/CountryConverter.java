package ua.lviv.iot.models.converter.address;

import ua.lviv.iot.models.domain.address.Country;
import ua.lviv.iot.models.dto.adress.CountryDto;

public class CountryConverter {
    public static CountryDto toDTO(Country country) {
        return CountryDto.builder()
                .id(country.getId())
                .name(country.getName())
                .build();
    }
}
