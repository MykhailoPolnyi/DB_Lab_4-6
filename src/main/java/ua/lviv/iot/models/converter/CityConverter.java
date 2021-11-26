package ua.lviv.iot.models.converter;

import ua.lviv.iot.models.domain.address.City;
import ua.lviv.iot.models.dto.adress.CityDTO;

public class CityConverter {
    public static CityDTO toDTO(City city) {
        return CityDTO.builder()
                .id(city.getId())
                .name(city.getName())
                .region(city.getRegion())
                .country(city.getCountry().getName())
                .build();
    }
}
