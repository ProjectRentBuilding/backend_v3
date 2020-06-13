package com.codegym.webservice.controller;


import com.codegym.dao.dto.EquipmentDTO;
import com.codegym.dao.entity.Equipment;
import com.codegym.web.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/equipments")
public class EquipmentController {
    @Autowired
    EquipmentService equipmentService;

    @GetMapping("")
    public List<Equipment> getAllEquipment() {
        List<Equipment> equipments;
        equipments = equipmentService.findAllByDeleteFlagIsNull();
        return equipments;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EquipmentDTO> getEquipment(@PathVariable("id") int id) {
        EquipmentDTO equipmentDTO = equipmentService.findAllByDeleteFlagIsNullAndIdIs(id);
        if (equipmentDTO != null) {
            return ResponseEntity.ok(equipmentDTO);
        }
        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteEquipment(@PathVariable(value = "id") Integer id) {
        EquipmentDTO equipment = equipmentService.findAllByDeleteFlagIsNullAndIdIs(id);
        equipmentService.delete(equipment.getId());
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @PostMapping("")
    public ResponseEntity<EquipmentDTO> createEquipment(@RequestBody EquipmentDTO equipmentDTO) {
        equipmentService.save(equipmentDTO);
        return ResponseEntity.ok(equipmentDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EquipmentDTO> updateEquipment(@PathVariable(value = "id") Integer id , @RequestBody EquipmentDTO equipmentDTO){
        equipmentService.updateEquipment(equipmentDTO);
        return ResponseEntity.ok(equipmentDTO);
    }


}
