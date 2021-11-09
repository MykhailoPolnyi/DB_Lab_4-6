package ua.lviv.iot.dal.dao.entities;

import ua.lviv.iot.dal.dao.GeneralDao;
import ua.lviv.iot.models.entity.snack.Snack;

public class SnackDao extends GeneralDao<Snack, Integer> {
    public SnackDao() {
        super(Snack.class);
    }
}
