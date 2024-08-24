package com.example.demo.dao;

import com.example.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> getListOfEmployees() {
        TypedQuery<Employee> q = entityManager.createQuery("from Employee", Employee.class);
        return q.getResultList();
    }

    @Override
    public Employee createEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Raj");
        employee.setLastName("Kumar");
        employee.setEmail("rajkumar@gmail.com");
        entityManager.persist(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(int id) {
        Employee employee = entityManager.find(Employee.class,id);
        employee.setFirstName("Uma");
        entityManager.merge(employee);
        return employee;
    }

    @Override
    public Employee deleteEmployee(int id) {
        Employee employee = entityManager.find(Employee.class,id);
        entityManager.remove(employee);
        return employee;
    }
}
