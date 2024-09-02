package com.example.demo.service;

import com.example.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void  addEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    void deleteEmployee(int empId);
}
