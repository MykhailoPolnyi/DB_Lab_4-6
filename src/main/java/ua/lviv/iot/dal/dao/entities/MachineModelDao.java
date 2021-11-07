package ua.lviv.iot.dal.dao.entities;

import ua.lviv.iot.dal.dao.GeneralDao;
import ua.lviv.iot.models.entity.snackmachine.MachineModel;

public class MachineModelDao extends GeneralDao<MachineModel, String> {
    public MachineModelDao() {
        super(MachineModel.class);
    }
}
