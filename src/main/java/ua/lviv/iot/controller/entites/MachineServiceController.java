package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.entities.MachineServiceDao;
import ua.lviv.iot.models.entity.snackmachine.MachineService;

public class MachineServiceController extends GeneralController<MachineService> {
    public MachineServiceController() {
        super(new MachineServiceDao());
    }
}
