package ua.lviv.iot.models.converter;

import ua.lviv.iot.models.domain.snack.Snack;
import ua.lviv.iot.models.dto.snack.SnackDTO;

public class SnackConverter {
    public static SnackDTO toDTO(Snack snack) {
        return SnackDTO.builder()
                .id(snack.getId())
                .trademark(snack.getTrademark())
                .type(snack.getType())
                .price(snack.getPrice())
                .producer(snack.getSnackProducer().getName())
                .build();
    }
}
