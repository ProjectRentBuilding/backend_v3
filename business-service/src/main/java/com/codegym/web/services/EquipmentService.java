package com.codegym.web.services;

import com.codegym.dao.dto.EquipmentDTO;
import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Equipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EquipmentService {
    List<Equipment> findAllByDeleteFlagIsNull();
    EquipmentDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);

    Equipment findById(Integer id);
    void delete(Integer id) ;
    Page<Equipment> findAllByDeleteFlagIsNullAndTypeEquipment(String typeEquipment, Pageable pageable);
    Page<Equipment> findAllByDeleteFlagIsNullAndGroundContainingIgnoreCase(String ground, Pageable pageable);
    Page<Equipment> getEquipments(String nameEquipment, Pageable pageable);
    void save(EquipmentDTO equipmentDTO);

    void updateEquipment(EquipmentDTO equipmentDTO);

}
