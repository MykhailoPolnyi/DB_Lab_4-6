package ua.lviv.iot.models.converter;

import ua.lviv.iot.models.domain.loader.Loader;
import ua.lviv.iot.models.dto.loader.LoaderDTO;

public class LoaderConverter {
    public static LoaderDTO toDTO(Loader loader) {
        LoaderDTO convertedDto = LoaderDTO.builder()
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
