package com.example.EmployeeManagement.Controller;

import com.example.EmployeeManagement.Exception.ResourceNotFoundException;
import com.example.EmployeeManagement.Model.Employee;
import com.example.EmployeeManagement.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employee_management/list/")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    //get all employee list
    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    @GetMapping("/test")
    public Object testOnly(){
        return "Hello tested";
    }

    @GetMapping("/test1")
    public Object testOnly1(){
        return "Hello tested 1";
    }

    //insert/create employee api
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
    return employeeRepository.save(employee);
    }
    //get employee record by id
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Exist!!!"));
        return ResponseEntity.ok(employee);
    }

//    //update the employee
//    @PutMapping("/employees/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetails){
//        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Exist!!!"));
//        employee.setFirstName(employeeDetails.getFirstName());
//        employee.setLastName(employeeDetails.getLastName());
//        employee.setEmailAddress(employeeDetails.getEmailAddress());
//        employee.setAddress(employeeDetails.getAddress());
//
//       Employee updatedEmployee = employeeRepository.save(employee);
//
//       return ResponseEntity.ok(updatedEmployee);
//    }
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteEmployeeById(@PathVariable Long id){
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee Not Exist!!!"));
        employeeRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("DELETED", Boolean.TRUE);
       return ResponseEntity.ok(response);
    }
}
