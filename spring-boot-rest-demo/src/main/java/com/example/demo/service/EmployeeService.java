package com.example.demo.service;

import com.example.demo.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getListOfEmployees();
    Employee createEmployee();
    Employee updateEmployee(int id);
    Employee deleteEmployee(int id);
}
