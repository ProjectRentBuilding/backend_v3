package com.codegym.web.services;

import com.codegym.dao.entity.Contract;

import java.util.List;

public interface ContractService {


    List<Contract> findAllByDeleteFlagIsNull();


}
