package ua.lviv.iot.models.converter.loader;

import ua.lviv.iot.models.domain.loader.Loader;
import ua.lviv.iot.models.dto.loader.LoaderDto;

public class LoaderConverter {
    public static LoaderDto toDTO(Loader loader) {
        LoaderDto convertedDto = LoaderDto.builder()
                .id(loader.getId())
                .name(loader.getName())
                .surname(loader.getSurname())
                .mobilePhone(loader.getMobilePhone())
                .email(loader.getEmail())
                .company(loader.getCompany())
                .build();
        if (loader.getFullAddress() != null) {
            convertedDto.setFullAddressId(loader.getFullAddress().getId());
        }
        return convertedDto;
    }
}
