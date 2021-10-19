package SpringAngular.Employee.controller;

import SpringAngular.Employee.model.Employee;
import SpringAngular.Employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequiredArgsConstructor
public class EmployeeControllerForAdmin {

    private final EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getSingleEmployee(@PathVariable Long id){
        return employeeService.getSingleEmployee(id);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public Employee editEmployee(@PathVariable Long id, @RequestBody Employee employee){
         return employeeService.editEmployee(id, employee);
    }
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }
}
