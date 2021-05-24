package internship.inventory.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.HashMap;


@Service
public class EmployeeService {

    HashMap<Integer ,Employee> employees;

    @Autowired
    public EmployeeService(){
        this.employees = new HashMap<>();
    }

    public HashMap<Integer,Employee> getEmployees() {
        return employees;
    }

    public boolean deleteEmployeeByID(int id){
        if (employees.containsKey(id)){
            employees.remove(id);
            return true;
        }
        return false;
    }

    public boolean updateEmployee(int id,Employee employee){
        if(employees.containsKey(id)){
            employees.put(id,employee);
            return true;
        }
        return false;
    }

    public String getEmployeeById(int id){
        return employees.get(id).toString();
    }
    public void addEmployee(Employee employee){
        employees.put(employee.getId(),employee);
    }
}
