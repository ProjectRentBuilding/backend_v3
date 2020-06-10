package com.codegym.web.services;

import com.codegym.dao.dto.ContractDTO;
import com.codegym.dao.entity.Contract;

import java.util.List;

public interface ContractService {

    List<Contract> findAllByDeleteFlagIsNull();
    ContractDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);
    void delete(Integer id) ;


}
