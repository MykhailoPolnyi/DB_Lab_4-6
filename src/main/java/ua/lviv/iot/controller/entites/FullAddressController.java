package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.entities.FullAddressDao;
import ua.lviv.iot.models.entity.adress.FullAddress;

public class FullAddressController extends GeneralController<FullAddress> {
    public FullAddressController() {
        super(new FullAddressDao());
    }
}
