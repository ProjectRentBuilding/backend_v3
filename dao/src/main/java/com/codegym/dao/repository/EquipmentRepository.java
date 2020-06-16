package com.codegym.dao.repository;

import com.codegym.dao.entity.Equipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
    List<Equipment> findAllByDeleteFlagIsNull();
    Equipment findAllByDeleteFlagIsNullAndIdIs(Integer id);
    Page<Equipment> findAllByDeleteFlagIsNullAndTypeEquipmentContainingIgnoreCase(String typeEquipment,Pageable pageable);
    Page<Equipment> findAllByDeleteFlagIsNullAndGroundContainingIgnoreCase( String ground, Pageable pageable);
    Page<Equipment> findAllByDeleteFlagIsNullAndNameEquipmentContaining(String nameEquipment, Pageable pageable);

}
