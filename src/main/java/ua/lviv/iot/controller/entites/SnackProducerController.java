package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.dao.entities.SnackProducerDao;
import ua.lviv.iot.models.entity.snack.SnackProducer;

public class SnackProducerController extends GeneralController<SnackProducer, Integer> {
    public SnackProducerController() {
        super(new SnackProducerDao());
    }
}
