package ua.lviv.iot.dal.dao.entities;

import ua.lviv.iot.dal.dao.GeneralDao;
import ua.lviv.iot.models.entity.snackmachine.MachineProducer;

public class MachineProducerDao extends GeneralDao<MachineProducer, Integer> {
    public MachineProducerDao() {
        super(MachineProducer.class);
    }
}
