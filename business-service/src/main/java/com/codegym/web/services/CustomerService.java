package com.codegym.web.services;

import com.codegym.dao.dto.ContractDTO;
import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAllByDeleteFlagIsNull();
//    CustomerDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
