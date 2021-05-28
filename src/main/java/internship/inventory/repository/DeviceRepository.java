package internship.inventory.repository;


import internship.inventory.models.Device;
import internship.inventory.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeviceRepository extends JpaRepository<Device,String> {

    @Query(value = "SELECT * from device d where d.serial_number= :serial_number",nativeQuery = true)
    Optional<Device> findBySerialNumber(@Param("serial_number") String serial_number);


}
