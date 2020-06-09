package com.codegym.dao.repository;

import com.codegym.dao.entity.Ground;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroundRepository extends JpaRepository<Ground,Integer> {
    List<Ground> findAllByDeleteFlagIsNull();
}
