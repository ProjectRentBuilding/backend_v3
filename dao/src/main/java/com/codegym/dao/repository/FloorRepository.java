package com.codegym.dao.repository;


import com.codegym.dao.entity.Floor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FloorRepository extends JpaRepository<Floor,Integer> {
    List<Floor> findAllByDeleteFlagIsNull();
    Page<Floor> findAllByDeleteFlagIsNull(Pageable pageable);
    Page<Floor> findAllByDeleteFlagIsNullAndNameFloorContaining(String nameFloor,Pageable pageable);

    Floor findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
