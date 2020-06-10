package com.codegym.dao.repository;

import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    List<Customer> findAllByDeleteFlagIsNull();
    Customer findAllByDeleteFlagIsNullAndIdIs(Long id);
}
