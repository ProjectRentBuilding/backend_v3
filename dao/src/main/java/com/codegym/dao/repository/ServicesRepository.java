package com.codegym.dao.repository;

import com.codegym.dao.entity.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Integer> {
    List<Services> findAll();
    Services findAllByIdIs(Integer id);
}
