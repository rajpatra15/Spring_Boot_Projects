package com.example.demo.dao;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeDao {

    public List<Employee> getAllEmployees();

    public void addEmployee(Employee emp);

    public Employee getEmployeeById(int id);

    void deleteEmployee(int id);
}
