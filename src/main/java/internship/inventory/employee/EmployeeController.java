package internship.inventory.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value = "api/employees/")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("get/all")
    public HashMap<Integer,Employee> getAllEmployees() {
        return employeeService.getEmployees();
    }



    @GetMapping("get/{id}")
    public String getEmployeeByID(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("delete/{id}")
    public boolean deleteEmployeeByID(@PathVariable("id") int id){

        return employeeService.deleteEmployeeByID(id);
    }


    @PutMapping( "test/{id}")
    public void test2(@PathVariable("id") int id){
        System.out.println(id);
    }

    @PutMapping("update/{id}")
    public int updateEmployee(@PathVariable("id") int id){
        System.out.println("updating");
        return 1;
//        return employeeService.updateEmployee(id,employee);
    }

    @PostMapping(path= "post")
    public void addEmployee(@RequestBody  Employee employee){
        System.out.println("inside get addEmployee of controller");
        employeeService.addEmployee(employee);

    }

}
