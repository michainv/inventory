package internship.inventory.controllers;

import internship.inventory.services.EmployeeService;
import internship.inventory.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "api/employees/")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("get/all")
    public List<Employee> getAllEmployees() {
        System.out.println("called controoler ");
//       employeeService.addEmployee(employee);
//        return null;
        return employeeService.getAllEmployees();
    }



    @GetMapping("/get/{id}")
    public Employee getEmployeeByID(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeByID(@PathVariable("id") int id){
        System.out.println("inside delete");
        employeeService.deleteEmployeeByID(id);
    }

    @PutMapping("/update/{id}")
    public int updateEmployee(@PathVariable("id") int id){
        System.out.println("updating");
        return 1;
//        return employeeService.updateEmployee(id,employee);
    }

    @PostMapping(path= "/add")
    public void addEmployee(@RequestBody  Employee employee){
//        System.out.println("inside get addEmployee of controller");
//        employeeService.addEmployee(employee);

    }

}
