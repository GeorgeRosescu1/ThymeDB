package com.georgerosescu.ThymeDB.controller;

import com.georgerosescu.ThymeDB.model.Customer;
import com.georgerosescu.ThymeDB.repo.CustomerRepo;
import org.dom4j.rule.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @Autowired
    private CustomerRepo customerRepo;

    @GetMapping("/greeting")
    public String getCustomer(Model model) {

        model.addAttribute("customer", new Customer());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String addCustomer(@ModelAttribute("customer") Customer customer) {

        Customer customer1 = new Customer();
        customer1.setName(customer.getName());
        customer1.setEmail(customer.getEmail());
        customer1.setAge(customer.getAge());
        customer1.setCity(customer.getCity());

        customerRepo.save(customer1);


        return "greeting";
    }

}
