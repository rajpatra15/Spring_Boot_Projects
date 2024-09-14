package com.example.demo.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/")
    public String showHome(){
        return "home";
    }

    @GetMapping("/customLoginPage")
    public String showCustomLoging(){
        return "custom-login";
    }

    @GetMapping("/leader")
    public String showLeadersPage(){
        return "leader";
    }

    @GetMapping("/admin")
    public String showAdminPage(){
        return "admin";
    }

    @GetMapping("/access-denied")
    public String showAccessDenyPage(){
        return "access-denied";
    }
}
