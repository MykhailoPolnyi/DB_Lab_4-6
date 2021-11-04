package ua.lviv.iot.models.entity.snackmachine;

import lombok.Data;

import java.util.Date;

@Data
public class MachineService {
    private Integer machineId;
    private Date lastLoad;

    private Date lastCashGathering;
    private Integer gatheredCash;

    private Date lastCoinLoad;
    private Integer loadedCoins;
}
