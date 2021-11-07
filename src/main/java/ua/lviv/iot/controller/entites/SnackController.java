package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.dao.entities.SnackDao;
import ua.lviv.iot.models.entity.snack.Snack;

public class SnackController extends GeneralController<Snack, Integer> {
    public SnackController() {
        super(new SnackDao());
    }
}
