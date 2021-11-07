package ua.lviv.iot.models.entity.snackmachine;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Table(name = "machine_service")
public class MachineService {

    @Id
    @Column(name = "snack_machine_id")
    private Integer machineId;

    @Column(name = "last_load")
    private LocalDate lastLoad;

    @Column(name = "last_cash_gathering")
    private LocalDate lastCashGathering;

    @Column(name = "gathered_cash")
    private Integer gatheredCash;

    @Column(name = "last_coint_load")
    private LocalDate lastCoinLoad;

    @Column(name = "loaded_coins")
    private Integer loadedCoins;
}
