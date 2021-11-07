package ua.lviv.iot.dal.dao.entities;

import ua.lviv.iot.dal.dao.GeneralDao;
import ua.lviv.iot.models.entity.snackmachine.MachineService;

public class MachineServiceDao extends GeneralDao<MachineService, Integer> {
    public MachineServiceDao() {
        super(MachineService.class);
    }
}
