package com.codegym.dao.repository;

import com.codegym.dao.dto.EquipmentDTO;
import com.codegym.dao.entity.Equipment;
import com.codegym.dao.entity.Ground;
import com.codegym.dao.entity.TypeEquipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
    List<Equipment> findAllByDeleteFlagIsNull();
//    EquipmentDTO getEquipmentById(Integer id);
    Equipment findAllByDeleteFlagIsNullAndIdIs(Integer id);
    Page<Equipment> findAllByDeleteFlagIsNullAndNameEquipmentContaining(String nameEquipment, Pageable pageable);
    Page<Equipment> findAllByNameEquipmentContainingOrAmountContaining(String nameEquipment, Integer amount, Pageable pageable);
    Page<Equipment> findAllByDeleteFlagIsNullAndAmountContaining(Integer amount, Pageable pageable);
}
