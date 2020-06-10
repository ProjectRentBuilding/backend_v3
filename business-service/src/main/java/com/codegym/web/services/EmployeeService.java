package com.codegym.web.services;

import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllByDeleteFlagIsNull();
//    CustomerDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
