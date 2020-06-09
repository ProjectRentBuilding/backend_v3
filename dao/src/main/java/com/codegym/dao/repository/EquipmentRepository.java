package com.codegym.dao.repository;

import com.codegym.dao.entity.Equipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
    List<Equipment> findAllByDeleteFlagIsNull();
    Page<Equipment> findAllByDeletedIsFalse(Pageable pageable);
}
