package com.codegym.web.services;

import com.codegym.dao.dto.EquipmentDTO;
import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Equipment;
import com.codegym.dao.entity.Ground;
import com.codegym.dao.entity.TypeEquipment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EquipmentService {
    List<Equipment> findAllByDeleteFlagIsNull();
    EquipmentDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);
    Equipment findById(Integer id);
    void delete(Integer id) ;

    Page<Equipment> getEquipments(String nameEquipment, Pageable pageable);
    Page<Equipment> findAllByNameEquipmentContainingOrAmountContaining(String nameEquipment, Integer amount, Pageable pageable);
    void save(EquipmentDTO equipmentDTO);
    Page<Equipment> findAllByDeleteFlagIsNullAndAmountContaining(Integer amount, Pageable pageable);
    void updateEquipment(EquipmentDTO equipmentDTO);

}
