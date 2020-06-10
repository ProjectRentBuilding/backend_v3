package com.codegym.webservice.controller;

import com.codegym.dao.entity.Employee;
import com.codegym.web.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/customers")

public class EmployeeController {
@Autowired
    EmployeeService employeeService;
@GetMapping("")
public List<Employee> getAllEmployee() {
    List<Employee> employees;
    employees = employeeService.findAllByDeleteFlagIsNull();
    return employees;
}
}
