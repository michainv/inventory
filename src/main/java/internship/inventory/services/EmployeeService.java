package internship.inventory.services;

import internship.inventory.models.Company;
import internship.inventory.models.Employee;
import internship.inventory.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;


@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private CompanyService companyService ;


   public List<Employee> getAllEmployees(){
        return (ArrayList<Employee>) employeeRepository.findAll();
   }


    public Optional<Employee> getEmployeeById(Integer id){
        return employeeRepository.findById(id);
    }

    public List<Employee> getEmployeeByName(String name){ return employeeRepository.findByName(name); }

    public void addEmployee(Employee employee) {
        Optional <Company> work_company = companyService.getCompanyById(employee.getCompany_id());
        if(work_company.isPresent()){
            employee.setWork_company(work_company.get());
            employeeRepository.save(employee);
        }
        else{
            System.out.println("INVALID COMPANY ID");
        }

    }


    public boolean deleteEmployeeByID(Integer id){
        if(employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public void updateEmployee(Employee employee) {
       Integer id = employee.getId();

       if(employeeRepository.existsById(id)){
             Optional<Employee> old = employeeRepository.findById(id);
             if(employee.getName()!=null){
                old.get().setName(employee.getName());
             }
             if(employee.getEmail()!=null){
             old.get().setEmail(employee.getEmail());
             }
             if(employee.getWork_company()!=null) {
                 old.get().setWork_company(employee.getWork_company());
             }
       }
    }


}
