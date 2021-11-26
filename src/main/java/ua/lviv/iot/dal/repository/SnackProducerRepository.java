package ua.lviv.iot.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.models.domain.snack.SnackProducer;

@Repository
public interface SnackProducerRepository extends JpaRepository<SnackProducer, Integer> {
    SnackProducer findByName(String name);
}
