package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getListOfEmployees(){
        return employeeService.getListOfEmployees();
    }

    @PostMapping("/employees")
    public Employee createEmployee(){
        return employeeService.createEmployee();
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable int id){
        return employeeService.updateEmployee(id);
    }

    @DeleteMapping("/employees/{id}")
    public Employee deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }





}
