package ua.lviv.iot.models.converter.snackmachine;

import ua.lviv.iot.models.domain.snackmachine.MachineProducer;
import ua.lviv.iot.models.dto.snackmachine.MachineProducerDto;

public class MachineProducerConverter {
    public static MachineProducerDto toDTO(MachineProducer machineProducer) {
        MachineProducerDto machineProducerDto = MachineProducerDto.builder()
                .id(machineProducer.getId())
                .name(machineProducer.getName())
                .email(machineProducer.getEmail())
                .mobilePhone(machineProducer.getMobilePhone())
                .build();
        if (machineProducer.getFullAddress() != null) {
            machineProducerDto.setFullAddressId(machineProducer.getFullAddress().getId());
        }
        return machineProducerDto;
    }
}
