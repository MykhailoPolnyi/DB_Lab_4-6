package ua.lviv.iot.models.converter.snackmachine;

import ua.lviv.iot.models.domain.snackmachine.MachineModel;
import ua.lviv.iot.models.dto.snackmachine.MachineModelDto;

public class MachineModelConverter {
    public static MachineModelDto toDTO(MachineModel machineModel) {
        return MachineModelDto.builder()
                .model(machineModel.getModel())
                .capacity(machineModel.getCapacity())
                .electricityConsumption(machineModel.getElectricityConsumption())
                .build();
    }

    public static MachineModel toEntity(MachineModelDto machineModelDTO) {
        return MachineModel.builder()
                .model(machineModelDTO.getModel())
                .capacity(machineModelDTO.getCapacity())
                .electricityConsumption(machineModelDTO.getElectricityConsumption())
                .build();
    }
}
