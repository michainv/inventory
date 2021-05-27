package internship.inventory.controllers;

import internship.inventory.services.EmployeeService;
import internship.inventory.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/employee/")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("get/all")
    public List<Employee> getAllEmployees() {
        System.out.println("CALLED GET ALL");
        return employeeService.getAllEmployees();
    }

    @GetMapping("/get/id/{id}")
    public Optional<Employee> getEmployeeByID(@PathVariable("id") Integer id) {
        System.out.println("CALLED GET BY ID");
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/get/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable("name") String name){
        System.out.println("CALLED GET BY NAME");
        return employeeService.getEmployeeByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeByID(@PathVariable("id") Integer id){
        System.out.println("CALLED DELETE");
        employeeService.deleteEmployeeByID(id);
    }

    @PutMapping("/update/{id}")
    public int updateEmployee(@PathVariable("id") Integer id){
        System.out.println("updating");
        return 1;
//        return employeeService.updateEmployee(id,employee);
    }

    @PostMapping(path= "/add")
    public void addEmployee(@RequestBody  Employee employee){
        System.out.println("CALLED POST");
        employeeService.addEmployee(employee);

    }

}
