package ua.lviv.iot.dal.dao.entities;

import ua.lviv.iot.dal.dao.GeneralDao;
import ua.lviv.iot.models.entity.loader.Loader;

public class LoaderDao extends GeneralDao<Loader, Integer> {
    public LoaderDao() {
        super(Loader.class);
    }
}
