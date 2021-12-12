package ua.lviv.iot.models.converter.address;

import ua.lviv.iot.models.domain.address.City;
import ua.lviv.iot.models.dto.adress.CityDto;

public class CityConverter {
    public static CityDto toDTO(City city) {
        return CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .region(city.getRegion())
                .country(city.getCountry().getName())
                .build();
    }
}
