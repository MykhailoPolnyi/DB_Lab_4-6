package ua.lviv.iot.models.converter.snack;

import ua.lviv.iot.models.domain.snack.Snack;
import ua.lviv.iot.models.dto.snack.SnackDto;

public class SnackConverter {
    public static SnackDto toDTO(Snack snack) {
        return SnackDto.builder()
                .id(snack.getId())
                .trademark(snack.getTrademark())
                .type(snack.getType())
                .price(snack.getPrice())
                .producer(snack.getSnackProducer().getName())
                .build();
    }
}
