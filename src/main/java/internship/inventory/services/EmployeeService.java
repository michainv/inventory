package internship.inventory.services;

import internship.inventory.models.Employee;
import internship.inventory.repository.EmployeeRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.*;


@Service
public class EmployeeService {

//    HashMap<Integer , Employee> employees;

    @Autowired
    EmployeeRepositoryInterface employeeRepository;

    @Autowired
    public EmployeeService(){
//        this.employees = new HashMap<>();
    }



   public List<Employee> getAllEmployees(){
        return (ArrayList<Employee>) employeeRepository.findAll();
   }


    public boolean deleteEmployeeByID(Integer id){
       if(employeeRepository.existsById(id)) {
           employeeRepository.deleteById(id);
           return true;
       }
       return false;
    }

//    public boolean updateEmployee(int id,Employee employee){
//        if(employeeRepository.existsById(id)) {
//            Employee prevEmployee = getEmployeeById(id);
//            prevEmployee.setEmail(employee.getEmail());
//            prevEmployee.setName(employee.getName());
//            prevEmployee.setCompany_ID(employee.getCompany_ID());
//            return true;
//        }
//        return false;
//    }

    public Optional<Employee> getEmployeeById(Integer id){
        return employeeRepository.findById(id);
    }


    public List<Employee> getEmployeeByName(String name){
        System.out.println("called by name");
        return employeeRepository.findByName(name);
    }

    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
