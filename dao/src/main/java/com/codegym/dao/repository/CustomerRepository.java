package com.codegym.dao.repository;

import com.codegym.dao.dto.CustomerDTO;
import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findAllByDeleteFlagIsNull();
    Customer findAllByDeleteFlagIsNullAndIdIs(Integer id);

}
