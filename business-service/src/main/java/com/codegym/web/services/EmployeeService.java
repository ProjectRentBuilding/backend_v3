package com.codegym.web.services;


import com.codegym.dao.dto.EmployeeDTO;
import com.codegym.dao.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllByDeleteFlagIsNull();
    EmployeeDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
