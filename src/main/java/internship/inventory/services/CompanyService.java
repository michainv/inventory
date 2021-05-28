package internship.inventory.services;

import internship.inventory.models.Company;
import internship.inventory.models.Device;
import internship.inventory.models.Employee;
import internship.inventory.repository.CompanyRepository;
import internship.inventory.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private DeviceService deviceService;

    public List<Company> getAllCompanies(){ return (ArrayList<Company>) companyRepository.findAll(); }

    public Optional<Company> getCompanyById(Integer id){ return companyRepository.findById(id); }

    public Optional<Company> getCompanyByName(String name){return companyRepository.findByName(name);}

    public void registerNewDevice(Device device){deviceService.addDevice(device);}

    public void assignDevice(String serial_number,Integer employee_id){
        //do sth...
    }

    public void addCompany(Company company) {
        companyRepository.save(company);
    }


}
