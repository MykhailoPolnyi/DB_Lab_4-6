package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.dao.entities.MachineServiceDao;
import ua.lviv.iot.models.entity.snackmachine.MachineService;

public class MachineServiceController extends GeneralController<MachineService, Integer> {
    public MachineServiceController() {
        super(new MachineServiceDao());
    }
}
