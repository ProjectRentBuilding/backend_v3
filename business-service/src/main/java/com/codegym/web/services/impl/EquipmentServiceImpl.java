package com.codegym.web.services.impl;

import com.codegym.dao.entity.Equipment;
import com.codegym.dao.repository.EquipmentRepository;
import com.codegym.web.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
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
}
