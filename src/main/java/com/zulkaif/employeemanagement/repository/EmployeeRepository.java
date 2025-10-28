package com.zulkaif.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zulkaif.employeemanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
