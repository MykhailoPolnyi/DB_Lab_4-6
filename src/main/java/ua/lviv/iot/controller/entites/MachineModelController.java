package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.entities.MachineModelDao;
import ua.lviv.iot.models.entity.snackmachine.MachineModel;

public class MachineModelController extends GeneralController<MachineModel> {
    public MachineModelController() {
        super(new MachineModelDao());
    }
}
