package com.codegym.web.services.impl;

import com.codegym.dao.dto.ContractDTO;
import com.codegym.dao.dto.EmployeeDTO;
import com.codegym.dao.dto.EquipmentDTO;
import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Equipment;
import com.codegym.dao.repository.EquipmentRepository;
import com.codegym.web.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Override
    public List<Equipment> findAllByDeleteFlagIsNull() {
        return equipmentRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public EquipmentDTO findAllByDeleteFlagIsNullAndIdIs(Integer id) {
            Equipment equipment = equipmentRepository.findAllByDeleteFlagIsNullAndIdIs(id);
            if (equipment != null) {
                EquipmentDTO equipmentDTO = new EquipmentDTO();
                equipmentDTO.setId(equipment.getId());
                equipmentDTO.setTypeEquipment(equipment.getTypeEquipment());
                equipmentDTO.setNameEquipment(equipment.getNameEquipment());
                equipmentDTO.setAmount(equipment.getAmount());
                equipmentDTO.setAmountOfBroken(equipment.getAmountOfBroken());
                equipmentDTO.setNote(equipment.getNote());
                equipmentDTO.setGround(equipment.getGround());
            }
            return null;
    }

    @Override
    public void save(Equipment equipment) {
        equipmentRepository.save(equipment);
    }

    @Override
    public Page<Equipment> findAllByDeleteFlagIsNullAndTypeEquipment(Pageable pageable, String typeEquipment) {
        return equipmentRepository.findAllByDeleteFlagIsNullAndTypeEquipment(pageable, typeEquipment);
    }

    @Override
    public Page<Equipment> findAllByDeleteFlagIsNullAndGround(Pageable pageable, String ground) {
        return equipmentRepository.findAllByDeleteFlagIsNullAndGround(pageable, ground);
    }
}
