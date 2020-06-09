package com.codegym.dao.repository;

import com.codegym.dao.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContractRepository extends JpaRepository<Contract, Integer> {
    List<Contract> findAllByDeleteFlagIsNull();
}
