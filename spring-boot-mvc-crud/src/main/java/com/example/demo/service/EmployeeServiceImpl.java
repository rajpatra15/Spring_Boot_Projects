package com.example.demo.service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {


    private EmployeeDao employeeDao;

    @Autowired
    EmployeeServiceImpl(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }

    @Transactional
    @Override
    public void addEmployee(Employee employee) {
         employeeDao.addEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeDao.getEmployeeById(id);
    }

    @Transactional
    @Override
    public void deleteEmployee(int empId) {
        employeeDao.deleteEmployee(empId);
    }
}
