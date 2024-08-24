package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.error.StudentErrorResponse;
import com.example.demo.error.StudentRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    ArrayList<Student> studentArrayList = new ArrayList<>();

    @GetMapping("/list")
    public List<Student> getListOfStudents(){
        studentArrayList.add(new Student("Ravi","Kumar","ravikumar@gmail.com"));
        studentArrayList.add(new Student("Rajesh","Kumar","rajeshkumar@gmail.com"));
        studentArrayList.add(new Student("Uma","Patra","umapatra@gmail.com"));
        return studentArrayList;
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){

        if(id < 0 || id >= studentArrayList.size())
            throw new StudentRuntimeException("Student id is not present"+ id);
        return studentArrayList.get(id);
    }


//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(StudentRuntimeException ex){
//
//        StudentErrorResponse errorResponse = new StudentErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage(),new Date().getTime());
//        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
//    }


}
