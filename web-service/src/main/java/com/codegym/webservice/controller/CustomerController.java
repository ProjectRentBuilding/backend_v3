package com.codegym.webservice.controller;

import com.codegym.dao.dto.ContractDTO;
import com.codegym.dao.dto.CustomerDTO;
import com.codegym.dao.entity.Building;
import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.Employee;
import com.codegym.dao.entity.Equipment;
import com.codegym.dao.repository.CustomerRepository;
import com.codegym.web.services.CustomerService;
import com.codegym.webservice.validation.ResourceNotFoundException;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity<CustomerDTO> createCustomer(@Valid @RequestBody CustomerDTO customerDTO) {
        customerService.save(customerDTO);
        return ResponseEntity.ok(customerDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> getCustomer(@PathVariable("id") int id){
        CustomerDTO customerDTO = customerService.getCustomerById(id);
        if (customerDTO != null) {
            return ResponseEntity.ok(customerDTO);
        }
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteCustomer(@PathVariable("id") int id) {
       CustomerDTO customer=customerService.getCustomerById(id);
        customerService.deleteCustomer(customer.getId());
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", Boolean.TRUE);
        return response;


    }
    @PutMapping("/{id}")
    public ResponseEntity<CustomerDTO> updateContract(@PathVariable(value = "id") Integer id , @RequestBody CustomerDTO customerDTO){
        customerService.updateCustomer(customerDTO);
        return ResponseEntity.ok(customerDTO);
    }

}

