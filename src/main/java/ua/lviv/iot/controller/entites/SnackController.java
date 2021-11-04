package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.entities.SnackDao;
import ua.lviv.iot.models.entity.snack.Snack;

public class SnackController extends GeneralController<Snack> {
    public SnackController() {
        super(new SnackDao());
    }
}
