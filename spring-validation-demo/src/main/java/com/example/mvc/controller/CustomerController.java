package com.example.mvc.controller;

import com.example.mvc.model.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {

    @GetMapping("/")
    public String showCustomerForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @PostMapping("/processform")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer,
                              BindingResult result) {
        if(result.hasErrors())
            return "customer-form";
        return "customer-confirmation";
    }
}
