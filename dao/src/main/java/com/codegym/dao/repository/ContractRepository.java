package com.codegym.dao.repository;

import com.codegym.dao.entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {
    List<Contract> findAllByDeleteFlagIsNull();
    Contract findAllByDeleteFlagIsNullAndIdIs(Integer id);
    Page<Contract> findAllByDeleteFlagIsNull(Pageable pageable);
    Page<Contract> findAllByDeleteFlagIsNullAndCustomerNameIs(String fullName,Pageable pageable);
}
