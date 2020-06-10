package com.codegym.webservice.controller;

import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.Equipment;
import com.codegym.web.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("")
    public List<Customer> getAllCustomer() {
        List<Customer> customers;
        customers = customerService.findAllByDeleteFlagIsNull();
        return customers;
    }
}
