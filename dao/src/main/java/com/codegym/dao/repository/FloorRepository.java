package com.codegym.dao.repository;

import com.codegym.dao.entity.Floor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FloorRepository extends JpaRepository<Floor,Integer> {
    List<Floor> findAllByDeleteFlagIsNull();
}
