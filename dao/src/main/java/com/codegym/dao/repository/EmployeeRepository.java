package com.codegym.dao.repository;

import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    List<Employee> findAllByDeleteFlagIsNull();
    Employee findAllByDeleteFlagIsNullAndIdIs(Integer id);
    Page<Employee> findAllByDeleteFlagIsNullAndNameContainingIgnoreCase(String fullName, Pageable pageable);
    @Query(value = "SELECT e " +
            "FROM Employee e " +
            "where e.name like %?1% " +
            "and e.idCard like %?2% " +
            "and e.address like %?3% " +
            "and e.part like %?4% " +
            "and e.deleteFlag is null " +
            "order by e.id")
    Page<Employee> searchAnything(String name, String idCard, String address, String part, Pageable pageable);


}
