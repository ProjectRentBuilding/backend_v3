package com.codegym.webservice.controller;

import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Equipment;
import com.codegym.web.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/equipments")
public class EquipmentController {
    @Autowired
    EquipmentService equipmentService;

    @GetMapping("")
    public List<Equipment> getAllContract() {
        List<Equipment> equipments;
        equipments = equipmentService.findAllByDeleteFlagIsNull();
        return equipments;
    }
}
