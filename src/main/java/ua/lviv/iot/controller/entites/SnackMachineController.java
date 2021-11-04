package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.entities.SnackMachineDao;
import ua.lviv.iot.models.entity.snackmachine.SnackMachine;

public class SnackMachineController extends GeneralController<SnackMachine> {
    public SnackMachineController() {
        super(new SnackMachineDao());
    }
}
