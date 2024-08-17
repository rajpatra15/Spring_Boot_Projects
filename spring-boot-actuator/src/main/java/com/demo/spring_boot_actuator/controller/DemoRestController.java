package com.demo.spring_boot_actuator.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @Value("${coach.name}")
    private String coachName;

    @GetMapping("/")
    public String sayHello()
    {
        return "Hello World !!"+ coachName;
    }
}
