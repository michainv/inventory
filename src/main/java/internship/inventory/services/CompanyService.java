package internship.inventory.services;

import internship.inventory.models.Company;
import internship.inventory.models.Employee;
import internship.inventory.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> getAllCompanies(){ return (ArrayList<Company>) companyRepository.findAll(); }


}
