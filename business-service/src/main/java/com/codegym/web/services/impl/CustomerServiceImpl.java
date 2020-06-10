package com.codegym.web.services.impl;

import com.codegym.dao.entity.Customer;
import com.codegym.dao.repository.CustomerRepository;
import com.codegym.web.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllByDeleteFlagIsNull() {
        return customerRepository.findAllByDeleteFlagIsNull();
    }
}
