package com.codegym.dao.repository;


import com.codegym.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findAllByDeleteFlagIsNull();
    @Query(value = "SELECT * FROM customer WHERE id>0", nativeQuery = true)
    List<Customer> findAllCustomer();
    Customer findAllByDeleteFlagIsNullAndIdIs(Integer id);

}

