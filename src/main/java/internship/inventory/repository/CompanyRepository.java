package internship.inventory.repository;

import internship.inventory.models.Company;
import internship.inventory.models.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CompanyRepository extends JpaRepository<Company,Integer> {
    Optional<Company> findByName(String name);

}
