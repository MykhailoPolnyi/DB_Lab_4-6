package ua.lviv.iot.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.models.domain.snackmachine.MachineProducer;

@Repository
public interface MachineProducerRepository extends JpaRepository<MachineProducer, Integer> {
}
