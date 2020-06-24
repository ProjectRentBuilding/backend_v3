package com.codegym.dao.repository;

import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findAllByDeleteFlagIsNull();
    Employee findAllByDeleteFlagIsNullAndIdIs(Integer id);
    Page<Employee> findAllByDeleteFlagIsNullAndNameContainingIgnoreCase(String fullName, Pageable pageable);

}
