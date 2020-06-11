package com.codegym.webservice.controller;

import com.codegym.dao.dto.CustomerDTO;
import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.Equipment;
import com.codegym.web.services.CustomerService;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",allowedHeaders = "*")
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

    @PostMapping("")
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.save(customerDTO);
        return ResponseEntity.ok(customerDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("id") int id) {
        CustomerDTO customerDTO = customerService.getCustomerById(id);
        if (customerDTO != null) {
            return ResponseEntity.ok(customerDTO);
        }
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomerDTO> deleteCourse(@PathVariable int id) {
        if (customerService.deleteCustomer(id) == null) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
