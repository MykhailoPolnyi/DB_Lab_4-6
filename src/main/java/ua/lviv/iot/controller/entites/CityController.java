package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.entities.CityDao;
import ua.lviv.iot.models.entity.adress.City;

public class CityController extends GeneralController<City> {
    public CityController() {
        super(new CityDao());
    }
}
