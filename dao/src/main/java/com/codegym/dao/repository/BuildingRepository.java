package com.codegym.dao.repository;

import com.codegym.dao.entity.Building;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingRepository extends JpaRepository<Building,Integer> {
    List<Building> findAllByDeleteFlagIsNull();
    Page<Building> findAllByDeleteFlagIsNull(Pageable pageable);
    Page<Building> findAllByDeleteFlagIsNullAndFullNameContaining(String fullName,Pageable pageable);
}
