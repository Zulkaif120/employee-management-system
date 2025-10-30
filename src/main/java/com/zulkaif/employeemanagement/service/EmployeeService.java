package com.zulkaif.employeemanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zulkaif.employeemanagement.exception.EmployeeNotFoundException;
import com.zulkaif.employeemanagement.exception.ResourceNotFoundException;
import com.zulkaif.employeemanagement.model.Employee;
import com.zulkaif.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    public List<Employee> getAllEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeeById(int id) {
        return repo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));
    }

    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Employee updateEmployee(int id, Employee employeeDetails) {
        Employee existing = repo.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + id));

        existing.setName(employeeDetails.getName());
        existing.setDept(employeeDetails.getDept());
        existing.setGender(employeeDetails.getGender());
        existing.setSalary(employeeDetails.getSalary());
        existing.setAge(employeeDetails.getAge());

        return repo.save(existing);
    }

    public void deleteEmployee(int id) {
        Employee existingEmployee = repo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));

        repo.delete(existingEmployee);
    }

}
