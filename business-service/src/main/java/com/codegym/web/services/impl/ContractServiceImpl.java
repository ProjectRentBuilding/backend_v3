package com.codegym.web.services.impl;

import com.codegym.dao.dto.ContractDTO;
import com.codegym.dao.entity.*;
import com.codegym.dao.repository.ContractRepository;
import com.codegym.web.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class ContractServiceImpl implements ContractService {


    @Autowired
    ContractRepository contractRepository;


    @Override
    public List<Contract> findAllByDeleteFlagIsNull() {
        return contractRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public ContractDTO findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        Contract contract = contractRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        if (contract != null) {
            ContractDTO contractDTO = new ContractDTO();
            contractDTO.setId(contract.getId());
            contractDTO.setEmployee(contract.getEmployee());
            contractDTO.setCustomer(contract.getCustomer());
            contractDTO.setGround(contract.getGround());
            contractDTO.setUlrImage(contract.getUrlImage());
            contractDTO.setTerm(contract.getTerm());
            contractDTO.setStatusContract(contract.getStatusContract());
            contractDTO.setStartRentDay(contract.getStartRentDay());
            contractDTO.setEndRentDay(contract.getEndRentDay());
            contractDTO.setPrice(contract.getPrice());
            contractDTO.setTotal(contract.getTotal());
            contractDTO.setDeposits(contract.getDeposits());
            contractDTO.setTaxCode(contract.getTaxCode());
            contractDTO.setContent(contract.getContent());
            contractDTO.setUnified(contract.getUnified());
            return contractDTO;
        }
        return null;
    }


}
