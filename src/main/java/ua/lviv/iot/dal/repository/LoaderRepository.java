package ua.lviv.iot.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.models.domain.loader.Loader;

@Repository
public interface LoaderRepository extends JpaRepository<Loader, Integer> {
}
