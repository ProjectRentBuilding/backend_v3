package com.codegym.dao.repository;

import com.codegym.dao.entity.Building;
import com.codegym.dao.entity.Floor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FloorRepository extends JpaRepository<Floor,Integer> {
    List<Floor> findAllByDeleteFlagIsNull();
    Page<Floor> findAllByDeleteFlagIsNull(Pageable pageable);
    Page<Floor> findAllByDeleteFlagIsNullAndNameFloorContaining(String nameFloor,Pageable pageable);

}
