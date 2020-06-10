package com.codegym.web.services;

import com.codegym.dao.dto.ContractDTO;
import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Equipment;

import java.util.List;

public interface EquipmentService {
    List<Equipment> findAllByDeleteFlagIsNull();
//    EquipmentDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
