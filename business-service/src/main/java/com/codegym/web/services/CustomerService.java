package com.codegym.web.services;

import com.codegym.dao.dto.CustomerDTO;
import com.codegym.dao.entity.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> findAllByDeleteFlagIsNull();
    CustomerDTO getCustomerById(Integer id);


    void deleteCustomer(Integer id);
    void deleteAllCustomer(Integer id);
    void save(CustomerDTO customerDTO);
    void updateCustomer(CustomerDTO customerDTO);
}
