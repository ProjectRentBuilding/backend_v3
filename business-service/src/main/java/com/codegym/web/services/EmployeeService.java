package com.codegym.web.services;


import com.codegym.dao.dto.CustomerDTO;
import com.codegym.dao.dto.EmployeeDTO;
import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllByDeleteFlagIsNull();
    EmployeeDTO getEmployeeById(Integer id);


    void deleteEmployee(Integer id);
    void save(EmployeeDTO customerDTO);
    void updateEmployee(EmployeeDTO employeeDTO);
    Page<Employee> getEmployees(String nameEmployee, Pageable pageable);
}
