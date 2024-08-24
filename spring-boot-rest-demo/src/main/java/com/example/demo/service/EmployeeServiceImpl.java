package com.example.demo.service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private  EmployeeDao employeeDao;

    @Autowired
    public EmployeeServiceImpl(EmployeeDao employeeDao){
        this.employeeDao =employeeDao;
    }

    @Override
    public List<Employee> getListOfEmployees(){
        return employeeDao.getListOfEmployees();
    }

    @Transactional
    @Override
    public Employee createEmployee() {
        return employeeDao.createEmployee();
    }

    @Transactional
    @Override
    public Employee updateEmployee(int id) {
        return employeeDao.updateEmployee(id);
    }

    @Transactional
    @Override
    public Employee deleteEmployee(int id) {
        return employeeDao.deleteEmployee(id);
    }
}
