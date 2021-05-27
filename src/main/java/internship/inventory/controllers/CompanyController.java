package internship.inventory.controllers;

import internship.inventory.models.Company;
import internship.inventory.models.Employee;
import internship.inventory.services.CompanyService;
import internship.inventory.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/company/")
public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("get/all")
    public List<Company> getAllEmployees() {
        System.out.println("CALLED GET ALL");
        return companyService.getAllEmployees();
    }




}
