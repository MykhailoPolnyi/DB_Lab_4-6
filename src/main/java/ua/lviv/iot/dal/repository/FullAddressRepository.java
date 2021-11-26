package ua.lviv.iot.dal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.models.domain.address.FullAddress;

@Repository
public interface FullAddressRepository extends JpaRepository<FullAddress, Integer> {
}
