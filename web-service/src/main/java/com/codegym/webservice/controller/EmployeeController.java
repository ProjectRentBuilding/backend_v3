package com.codegym.webservice.controller;

import com.codegym.dao.dto.CustomerDTO;
import com.codegym.dao.dto.EmployeeDTO;
import com.codegym.dao.entity.Employee;
import com.codegym.web.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/employees")

public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("")
    public List<Employee> getAllEmployee() {
        List<Employee> employees;
        employees = employeeService.findAllByDeleteFlagIsNull();
        return employees;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable("id") int id) {
        EmployeeDTO employeeDTO = employeeService.findAllByDeleteFlagIsNullAndIdIs(id);
        if (employeeDTO != null) {
            return ResponseEntity.ok(employeeDTO);
        }
        return ResponseEntity.ok(null);
    }
}
