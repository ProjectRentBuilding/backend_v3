package com.codegym.web.services;

import com.codegym.dao.dto.ContractDTO;
import com.codegym.dao.entity.Contract;

import java.util.List;

public interface ContractService {

    List<Contract> findAllByDeleteFlagIsNull();
    ContractDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);
    Contract findById(Integer id);

    void save(ContractDTO contractDTO);
    void delete(Integer id) ;
    void updateContract(ContractDTO contractDTO);


}
