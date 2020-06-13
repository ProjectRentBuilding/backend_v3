package com.codegym.web.services.impl;


import com.codegym.dao.dto.EmployeeDTO;
import com.codegym.dao.entity.Employee;
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
        return employeeRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public EmployeeDTO findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        Employee employee = employeeRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        if (employee != null) {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setId(employee.getId());
            employeeDTO.setDeleteFlag(employee.getDeleteFlag());
            employeeDTO.setName(employee.getName());
            employeeDTO.setBirthday(employee.getBirthday());
            employeeDTO.setIdCard(employee.getIdCard());
            employeeDTO.setPhone(employee.getPhone());
            employeeDTO.setEmail(employee.getEmail());
            employeeDTO.setEmail(employee.getEmail());
            employeeDTO.setAddress(employee.getAddress());
            employeeDTO.setGender(employee.getGender());
            employeeDTO.setUserBuilding(employee.getUserBuilding());
            employeeDTO.setUserBuilding(employee.getUserBuilding());
            employeeDTO.setContracts(employee.getContracts());
            return employeeDTO;
        }
        return null;
    }
}
