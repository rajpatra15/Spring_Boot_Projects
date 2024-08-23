package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentDao {

     void save(Student s);

     Student findById(int id);

     List<Student> findByLastName(String lastName);

     List<Student> findByFirstName();


     void updateStudent();

     void deleteStudent();
}
