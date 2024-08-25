package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalTime;

@Controller
public class DemoController {

    @GetMapping("/helloworld")
    public String printHelloWorld(Model model){

        model.addAttribute("time", LocalTime.now());
        return "helloworld";
    }
}
