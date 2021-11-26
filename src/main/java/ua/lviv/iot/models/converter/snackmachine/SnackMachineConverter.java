package ua.lviv.iot.models.converter.snackmachine;

import ua.lviv.iot.models.domain.snackmachine.SnackMachine;
import ua.lviv.iot.models.dto.snackmachine.SnackMachineDto;

public class SnackMachineConverter {
    public static SnackMachineDto toDTO(SnackMachine snackMachine) {
        SnackMachineDto snackMachineDto = SnackMachineDto.builder()
                .id(snackMachine.getId())
                .machineModel(snackMachine.getMachineModel().getModel())
                .machineProducerId(snackMachine.getMachineProducer().getId())
                .build();
        if (snackMachine.getFullAddress() != null) {
            snackMachineDto.setFullAddressId(snackMachine.getFullAddress().getId());
        }
        return snackMachineDto;
    }
}
