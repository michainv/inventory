package internship.inventory.services;

import internship.inventory.models.Employee;
import internship.inventory.repository.EmployeeRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


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


    public void deleteEmployeeByID(int id){
       employeeRepository.deleteById(id);
    }

    public boolean updateEmployee(int id,Employee employee){
//        if(employees.containsKey(id)){
//            employees.put(id,employee);
//            return true;
//        }
        return false;
    }

    public Employee getEmployeeById(int id){
           return employeeRepository.findById(id);
    }


    public void addEmployee() {
    }
}
