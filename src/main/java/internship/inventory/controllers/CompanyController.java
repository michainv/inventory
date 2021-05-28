package internship.inventory.controllers;

import internship.inventory.models.Company;
import internship.inventory.models.Device;
import internship.inventory.models.Employee;
import internship.inventory.services.CompanyService;
import internship.inventory.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/company")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getAllEmployees() {
        System.out.println("CALLED GET ALL COMPANIES");
        return companyService.getAllCompanies();
    }

    @GetMapping("/{id}")
    public Optional<Company> getCompanyById(@PathVariable("id") Integer id) {
        System.out.println("CALLED GET COMPANY BY ID");
        return companyService.getCompanyById(id);

    }

    @GetMapping("name/{name}")
    public Optional<Company> getCompanyByName(@PathVariable("name") String name) {
        System.out.println("CALLED GET COMPANY BY NAME");
        return companyService.getCompanyByName(name);

    }


    @PostMapping
    public void add(@RequestBody Company company){
        companyService.addCompany(company);
    }

    @PostMapping("/register")
    public void registerNewDevice(@RequestBody Device device){
        companyService.registerNewDevice(device);
    }

    @PutMapping("/assign")
    public void assignDeviceToEmployee(){
        //do sth...
    }

}
