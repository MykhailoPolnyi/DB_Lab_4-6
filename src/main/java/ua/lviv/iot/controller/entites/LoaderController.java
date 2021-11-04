package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.entities.LoaderDao;
import ua.lviv.iot.models.entity.loader.Loader;

public class LoaderController extends GeneralController<Loader> {
    public LoaderController () {
        super(new LoaderDao());
    }
}
