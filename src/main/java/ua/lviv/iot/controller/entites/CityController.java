package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.dao.entities.CityDao;
import ua.lviv.iot.models.entity.address.City;

public class CityController extends GeneralController<City, Integer> {
    public CityController() {
        super(new CityDao());
    }
}
