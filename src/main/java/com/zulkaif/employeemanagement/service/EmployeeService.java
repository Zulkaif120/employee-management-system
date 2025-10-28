package com.zulkaif.employeemanagement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return repo.findById(id).orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }

    public Employee updateEmployee(int id, Employee employeeDetails) {
        Employee existing = repo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(employeeDetails.getName());
            existing.setDept(employeeDetails.getDept());
            existing.setGender(employeeDetails.getGender());
            existing.setSalary(employeeDetails.getSalary());
            existing.setAge(employeeDetails.getAge());
            return repo.save(existing);
        }
        return null;
    }

    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }
}
