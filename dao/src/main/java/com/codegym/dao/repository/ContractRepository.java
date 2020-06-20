package com.codegym.dao.repository;

import com.codegym.dao.entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Date;
import java.util.List;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {
    List<Contract> findAllByDeleteFlagIsNull();

    Contract findAllByDeleteFlagIsNullAndIdIs(Integer id);

    Page<Contract> findAllByDeleteFlagIsNull(Pageable pageable);

    Page<Contract> findAllByDeleteFlagIsNullAndCustomerNameContainingIgnoreCase(String fullName, Pageable pageable);


    @Query(value = "SELECT c FROM Contract c where c.customer.name like %?1% and c.ground.codeGround like %?2% and c.startRentDay>=?3 and c.endRentDay<=?4 and c.deleteFlag is null order by c.id" )
    Page<Contract> searchAnything(String fullName, String codeGround, Date startRentDay, Date endRentDay, Pageable pageable);

}
