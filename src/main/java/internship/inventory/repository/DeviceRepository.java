package internship.inventory.repository;


import internship.inventory.models.Device;
import internship.inventory.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceRepository extends JpaRepository<Device,String> {
}
