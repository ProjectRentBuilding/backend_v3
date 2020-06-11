package com.codegym.web.services.impl;

import com.codegym.dao.dto.CustomerDTO;
import com.codegym.dao.entity.Building;
import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.UserBuilding;
import com.codegym.dao.repository.CustomerRepository;
import com.codegym.web.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAllByDeleteFlagIsNull() {
        return customerRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public CustomerDTO getCustomerById(Integer id) {
        Customer customer = customerRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        if (customer != null) {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setId(customer.getId());
            customerDTO.setDeleteFlag(customer.getDeleteFlag());
            customerDTO.setName(customer.getName());
            customerDTO.setBirthday(customer.getBirthday());
            customerDTO.setIdCard(customer.getIdCard());
            customerDTO.setPhone(customer.getPhone());
            customerDTO.setEmail(customer.getEmail());
            customerDTO.setAddress(customer.getAddress());
            customerDTO.setGender(customer.getGender());
            customerDTO.setWebsite(customer.getWebsite());
            customerDTO.setNameCompany(customer.getNameCompany());
            customerDTO.setUserBuilding(customer.getUserBuilding());
            customerDTO.setContracts(customer.getContracts());
            return customerDTO;
        }
        return null;
    }

    @Override
    public void deleteCustomer(Integer id) {
        Customer customer = customerRepository.findAllByDeleteFlagIsNullAndIdIs(id);
            customer.setDeleteFlag(1);
            customerRepository.save(customer);
    }

    @Override
    public void save(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setId(customerDTO.getId());
        customer.setDeleteFlag(customerDTO.getDeleteFlag());
        customer.setName(customerDTO.getName());
        customer.setBirthday(customerDTO.getBirthday());
        customer.setIdCard(customerDTO.getIdCard());
        customer.setPhone(customerDTO.getPhone());
        customer.setEmail(customerDTO.getEmail());
        customer.setAddress(customerDTO.getAddress());
        customer.setGender(customerDTO.getGender());
        customer.setWebsite(customerDTO.getWebsite());
        customer.setNameCompany(customerDTO.getNameCompany());
        customer.setUserBuilding(customerDTO.getUserBuilding());
        customer.setContracts(customerDTO.getContracts());
        customerRepository.save(customer);
    }
}
