package ua.lviv.iot.dal.dao.entities;

import ua.lviv.iot.dal.dao.GeneralDao;
import ua.lviv.iot.models.entity.snackmachine.SnackMachine;

public class SnackMachineDao extends GeneralDao<SnackMachine, Integer> {
    public SnackMachineDao() {
        super(SnackMachine.class);
    }
}
