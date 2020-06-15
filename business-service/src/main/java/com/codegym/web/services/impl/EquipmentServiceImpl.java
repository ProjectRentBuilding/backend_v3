package com.codegym.web.services.impl;


import com.codegym.dao.dto.EquipmentDTO;
import com.codegym.dao.entity.Equipment;
import com.codegym.dao.repository.EquipmentRepository;
import com.codegym.dao.repository.GroundRepository;
import com.codegym.dao.repository.TypeEquipmentRepository;
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

    @Autowired
    GroundRepository groundRepository;

    @Autowired
    TypeEquipmentRepository typeEquipmentRepository;

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
                equipmentDTO.setTypeEquipmentId(equipment.getTypeEquipment().getId());
                equipmentDTO.setNameEquipment(equipment.getNameEquipment());
                equipmentDTO.setAmount(equipment.getAmount());
                equipmentDTO.setAmountOfBroken(equipment.getAmountOfBroken());
                equipmentDTO.setNote(equipment.getNote());
                equipmentDTO.setGroundId(equipment.getGround().getId());
                return equipmentDTO;
            }
            return null;
    }


    @Override
    public Equipment findById(Integer id) {
        return equipmentRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        Equipment equipment = equipmentRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        equipment.setDeleteFlag(1);
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

    @Override
    public void save(EquipmentDTO equipmentDTO) {
        Equipment equipment = new Equipment();

        equipmentDTO.setId(equipmentDTO.getId());
        equipment.setTypeEquipment(typeEquipmentRepository.findById(equipmentDTO.getTypeEquipmentId()).orElse(null));
        equipment.setNameEquipment(equipmentDTO.getNameEquipment());
        equipment.setAmount(equipmentDTO.getAmount());
        equipment.setAmountOfBroken(equipmentDTO.getAmountOfBroken());
        equipment.setNote(equipmentDTO.getNote());
        equipment.setGround(groundRepository.findById(equipmentDTO.getGroundId()).orElse(null));

        equipmentRepository.save(equipment);
    }

    @Override
    public void updateEquipment(EquipmentDTO equipmentDTO) {
        Equipment equipment = equipmentRepository.findAllByDeleteFlagIsNullAndIdIs(equipmentDTO.getId());

        equipment.setId(equipmentDTO.getId());
        equipment.setTypeEquipment(typeEquipmentRepository.findById(equipmentDTO.getTypeEquipmentId()).orElse(null));
        equipment.setNameEquipment(equipmentDTO.getNameEquipment());
        equipment.setAmount(equipmentDTO.getAmount());
        equipment.setAmountOfBroken(equipmentDTO.getAmountOfBroken());
        equipment.setNote(equipmentDTO.getNote());
        equipment.setGround(groundRepository.findById(equipmentDTO.getGroundId()).orElse(null));

        equipmentRepository.save(equipment);
    }


}
