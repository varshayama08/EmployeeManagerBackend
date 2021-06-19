package com.example.demo.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Interface.EmployeeRepo;
import com.example.demo.entity.Employee;
import com.example.demo.exception.UserNotFoundException;

import java.util.List;
import java.util.UUID;
import javax.transaction.Transactional;
@Service
@Transactional
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    
    @Autowired
    public EmployeeService(EmployeeRepo employeeRepo) {

        this.employeeRepo = employeeRepo;
    }
    
    public List<Employee> findAllEmployees() {
        return employeeRepo.findAll();
    }
    
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }
    
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
    
    public Employee findEmployeeById(Long Id) {
        return employeeRepo.findEmployeeById(Id)
        		.orElseThrow(() -> new UserNotFoundException("User by id " + Id + " was not found"));
    }

    public void deleteEmployee(Long Id){
        employeeRepo.deleteEmployeeById(Id);
    }
}
