package com.example.demo.dao;

import com.example.demo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    EntityManager entityManager;
    @Autowired
    public StudentDaoImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }


    @Transactional
    @Override
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findById(int id) {
        return  entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        TypedQuery<Student> q = entityManager.createQuery("from Student where lastName=:data", Student.class);
        q.setParameter("data",lastName);
        return q.getResultList();
    }

    @Override
    public List<Student> findByFirstName() {
        TypedQuery<Student> q = entityManager.createQuery("from Student where firstName = 'Raj' ",Student.class);
        return q.getResultList();
    }

    @Transactional
    @Override
    public void updateStudent() {
        Student s = entityManager.find(Student.class, 1);
        System.out.println("Student details:"+s.toString());

        s.firstName = "Rajesh";
        entityManager.merge(s);

        s = entityManager.find(Student.class, 1);
        System.out.println("Updated Student details:"+s.toString());
    }

    @Transactional
    @Override
    public void deleteStudent() {
        Student s = entityManager.find(Student.class,1);
        entityManager.remove(s);
    }
}
