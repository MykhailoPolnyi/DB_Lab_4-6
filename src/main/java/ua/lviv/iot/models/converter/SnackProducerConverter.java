package ua.lviv.iot.models.converter;

import ua.lviv.iot.models.domain.snack.SnackProducer;
import ua.lviv.iot.models.dto.snack.SnackProducerDTO;

public class SnackProducerConverter {
    public static SnackProducerDTO toDTO(SnackProducer snackProducer) {
        return SnackProducerDTO.builder()
                .id(snackProducer.getId())
                .name(snackProducer.getName())
                .email(snackProducer.getEmail())
                .mobilePhone(snackProducer.getMobilePhone())
                .fullAddressId(snackProducer.getFullAddress().getId())
                .build();
    }
}
