package SpringAngular.Employee.service;

import SpringAngular.Employee.exception.ResourceNotFoundException;
import SpringAngular.Employee.model.Employee;
import SpringAngular.Employee.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getSingleEmployee(Long id){
        return employeeRepository.findById(id).orElseThrow(() ->
        new ResourceNotFoundException("Pracownik z podanym id nie istnieje"));
    }

    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
