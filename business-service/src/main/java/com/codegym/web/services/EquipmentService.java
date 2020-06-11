package com.codegym.web.services;

import com.codegym.dao.dto.EquipmentDTO;
import com.codegym.dao.entity.Building;
import com.codegym.dao.entity.Equipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EquipmentService {
    List<Equipment> findAllByDeleteFlagIsNull();
    EquipmentDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);

    Equipment findById(Integer id);
//    void save(Equipment equipment);
    void delete(Integer id) ;
    Page<Equipment> findAllByDeleteFlagIsNullAndTypeEquipment(Pageable pageable, String typeEquipment);
    Page<Equipment> findAllByDeleteFlagIsNullAndGround(Pageable pageable, String ground);
}
