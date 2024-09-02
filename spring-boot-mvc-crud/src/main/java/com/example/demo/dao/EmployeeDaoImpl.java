package com.example.demo.dao;

import com.example.demo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoImpl implements  EmployeeDao{

    EntityManager entityManager;

    EmployeeDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> getAllEmployees() {
        TypedQuery<Employee> q = entityManager.createQuery("from Employee",Employee.class);
        return q.getResultList();
    }

    @Override
    public void addEmployee(Employee emp) {
        entityManager.merge(emp);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return entityManager.find(Employee.class,id);
    }

    @Override
    public void deleteEmployee(int id) {
        Employee emp = entityManager.find(Employee.class,id);
        entityManager.remove(emp);
    }
}
