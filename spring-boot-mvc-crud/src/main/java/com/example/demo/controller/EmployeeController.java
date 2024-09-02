package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    private String getAllEmployees(Model model){
        List<Employee> listOfEmployees = employeeService.getAllEmployees();
        model.addAttribute("employees",listOfEmployees);
       return "employees";
    }

    @GetMapping("/addEmployeeForm")
    private String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "employee-form";
    }

    @GetMapping("/addEmployeeFormForUpdate")
    private String addEmployeeFormForUpdate(@RequestParam ("employeeId")int empId, Model model){
        Employee employee = employeeService.getEmployeeById(empId);
        model.addAttribute("employee",employee);
        return "employee-form";
    }

    @GetMapping("/deleteEmployee")
    private String delete(@RequestParam ("employeeId")int empId){
        employeeService.deleteEmployee(empId);
        return "redirect:/employees/list";
    }

    @PostMapping("/save")
    private String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.addEmployee(employee);
        return "redirect:/employees/list";
    }
}
