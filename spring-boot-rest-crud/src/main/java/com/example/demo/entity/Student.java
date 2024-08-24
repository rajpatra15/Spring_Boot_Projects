package com.example.demo.entity;

import jakarta.persistence.*;


public class Student {


    public String firstName;
    public String lastName;
    public String email;

    public Student(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "first name:" + firstName + " last name:" + lastName + " email:" + email;
    }
}
