package ua.lviv.iot.models.converter;

import ua.lviv.iot.models.domain.address.Country;
import ua.lviv.iot.models.dto.adress.CountryDTO;

public class CountryConverter {
    public static CountryDTO toDTO(Country country) {
        return CountryDTO.builder()
                .id(country.getId())
                .name(country.getName())
                .build();
    }
}
