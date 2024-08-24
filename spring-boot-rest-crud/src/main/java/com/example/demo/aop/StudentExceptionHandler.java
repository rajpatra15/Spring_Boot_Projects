package com.example.demo.aop;

import com.example.demo.error.StudentErrorResponse;
import com.example.demo.error.StudentRuntimeException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<StudentErrorResponse> handleStudentException(StudentRuntimeException ex) {

        StudentErrorResponse errorResponse = new StudentErrorResponse(
                HttpStatus.BANDWIDTH_LIMIT_EXCEEDED.value(), ex.getMessage(),
                new Date().getTime());
        return new ResponseEntity<>(errorResponse,HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }
}
