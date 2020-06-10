package com.codegym.webservice.controller;

import com.codegym.dao.dto.CustomerDTO;
import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.Equipment;
import com.codegym.web.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO>getCustomer(@PathVariable("id") int id) {
        CustomerDTO customerDTO = customerService.getCustomerById(id);
        if (customerDTO != null) {
            return ResponseEntity.ok(customerDTO);
        }
        return ResponseEntity.ok(null);
    }
}
