package internship.inventory.repository;

import internship.inventory.models.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepositoryInterface extends CrudRepository<Employee,Integer> {
   Employee findById(int id);

   void updateEmployee(int id);
}
