package com.codegym.web.services.impl;

import com.codegym.dao.entity.Employee;
import com.codegym.dao.repository.CustomerRepository;
import com.codegym.dao.repository.EmployeeRepository;
import com.codegym.web.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public List<Employee> findAllByDeleteFlagIsNull() {
        return employeeRepository.findAllByDeleteFlagIsNull() ;
    }
}
