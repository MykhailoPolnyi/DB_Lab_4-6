package ua.lviv.iot.controller.entites;

import ua.lviv.iot.controller.GeneralController;
import ua.lviv.iot.dal.dao.entities.FullAddressDao;
import ua.lviv.iot.models.entity.address.FullAddress;

public class FullAddressController extends GeneralController<FullAddress, Integer> {
    public FullAddressController() {
        super(new FullAddressDao());
    }
}
