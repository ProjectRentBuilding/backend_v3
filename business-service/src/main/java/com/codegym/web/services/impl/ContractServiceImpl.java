package com.codegym.web.services.impl;

import com.codegym.dao.entity.Contract;
import com.codegym.dao.repository.ContractRepository;
import com.codegym.web.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {


    @Autowired
    ContractRepository contractRepository;


    @Override
    public List<Contract> findAllByDeleteFlagIsNull() {
        return contractRepository.findAllByDeleteFlagIsNull();
    }

}
