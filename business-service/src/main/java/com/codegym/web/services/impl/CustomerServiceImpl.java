package com.codegym.web.services.impl;

import com.codegym.dao.dto.CustomerDTO;
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

}
