package com.example.demo.dao;

import com.example.demo.entity.Employee;

import java.util.List;

public interface EmployeeDao {

    List<Employee> getListOfEmployees();
    Employee createEmployee();
    Employee updateEmployee(int id);
    Employee deleteEmployee(int id);
}
