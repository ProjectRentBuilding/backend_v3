package com.codegym.dao.repository;

import com.codegym.dao.entity.Building;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BuildingRepository extends JpaRepository<Building,Integer> {
    List<Building> findAllByDeleteFlagIsNull();
    Page<Building> findAllByDeleteFlagIsNull(Pageable pageable);
    Page<Building> findAllByDeleteFlagIsNullAndFullNameContaining(String fullName,Pageable pageable);
}
