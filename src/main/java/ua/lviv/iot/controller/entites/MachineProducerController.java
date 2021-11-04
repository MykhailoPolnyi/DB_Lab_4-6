package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.entities.MachineProducerDao;
import ua.lviv.iot.models.entity.snackmachine.MachineProducer;

public class MachineProducerController extends GeneralController<MachineProducer> {
    public MachineProducerController() {
        super(new MachineProducerDao());
    }
}
