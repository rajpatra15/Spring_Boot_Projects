package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

    @RequestMapping("/showform")
    public String showForm(){
        return "helloworld_form";
    }

    @RequestMapping("/processform")
    public String processForm(){
        return "confirmation";
    }

    @RequestMapping("/processform2")
    public String processForm2(HttpServletRequest request, Model model){
        String name = request.getParameter("input_name");
        name  = name.toUpperCase();
        model.addAttribute("input_name", name);
        return "confirmation2";
    }

    @PostMapping("/processform3")
    public String processForm3(@RequestParam("input_name") String name, Model model){
        name  = name.toUpperCase();
        model.addAttribute("input_name", name);
        return "confirmation2";
    }
}
