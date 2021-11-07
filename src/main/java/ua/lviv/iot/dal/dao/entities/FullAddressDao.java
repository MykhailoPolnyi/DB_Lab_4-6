package ua.lviv.iot.dal.dao.entities;

import ua.lviv.iot.dal.dao.GeneralDao;
import ua.lviv.iot.models.entity.adress.FullAddress;

public class FullAddressDao extends GeneralDao<FullAddress, Integer> {
    public FullAddressDao() {
        super(FullAddress.class);
    }
}
