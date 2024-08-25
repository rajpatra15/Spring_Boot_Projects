package com.example.demo.controller;

import com.example.demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${allSex}")
    private List<String> allSexOptions;

    @Value("${allSubjects}")
    private List<String> allSubjects;

    @RequestMapping("/showstudentform")
    public String showStudentForm(Model model){
        model.addAttribute("theStudent", new Student());
        model.addAttribute("countries",countries);
        model.addAttribute("allSexOptions",allSexOptions);
        model.addAttribute("allSubjects", allSubjects);
        return "studentform";
    }

    // should be the same name as the attribute name for model
    @PostMapping("/processstudentform")
    public String processForm(@ModelAttribute("theStudent") Student theStudent){
        System.out.println("Student details:"+theStudent.getFirstName()+" "+ theStudent.getLastName());
        return "student-confirmation";
    }

}
