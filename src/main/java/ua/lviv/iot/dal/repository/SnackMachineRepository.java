package ua.lviv.iot.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.models.domain.snackmachine.SnackMachine;

@Repository
public interface SnackMachineRepository extends JpaRepository<SnackMachine, Integer> {
}
