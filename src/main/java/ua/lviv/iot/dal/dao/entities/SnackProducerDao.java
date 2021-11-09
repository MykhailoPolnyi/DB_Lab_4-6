package ua.lviv.iot.dal.dao.entities;

import ua.lviv.iot.dal.dao.GeneralDao;
import ua.lviv.iot.models.entity.snack.SnackProducer;

public class SnackProducerDao extends GeneralDao<SnackProducer, Integer> {
    public SnackProducerDao() {
        super(SnackProducer.class);
    }
}
