package com.codegym.webservice.controller;


import com.codegym.dao.dto.ContractDTO;
import com.codegym.dao.dto.EquipmentDTO;
import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Equipment;
import com.codegym.web.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
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

    @GetMapping(value = "/paging", params = {"page", "size", "search"})
    public Page<Equipment> getListEquipment(@RequestParam("page") int page,
                                          @RequestParam("size") int size,
                                          @RequestParam("search") String name) {
        return equipmentService.getEquipments(name, PageRequest.of(page, size));
    }

//    @GetMapping(value = "/paging", params = {"page", "size", "s0","s1"})
//    public Page<Equipment> getListEquipment(@RequestParam("page") int page,
//                                            @RequestParam("size") int size,
//                                            @RequestParam("s0") String name,
//                                            @RequestParam("s1") Integer amount) {
//        return equipmentService.findAllByNameEquipmentContainingOrAmountContaining(name,amount, PageRequest.of(page, size));
//    }

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

//    @PostMapping("")
//    public ResponseEntity<EquipmentDTO> createEquipment(@RequestBody EquipmentDTO equipmentDTO) {
//        equipmentService.save(equipmentDTO);
//        return ResponseEntity.ok(equipmentDTO);
//    }

    @PostMapping("")
    public ResponseEntity<?> createEquipment(@Valid @RequestBody EquipmentDTO equipmentDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return new ResponseEntity<List>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        equipmentService.save(equipmentDTO);
        return ResponseEntity.ok(equipmentDTO);
    }


    @PutMapping("/{id}")
    public ResponseEntity<EquipmentDTO> updateEquipment(@PathVariable(value = "id") Integer id , @RequestBody EquipmentDTO equipmentDTO){
        equipmentService.updateEquipment(equipmentDTO);
        return ResponseEntity.ok(equipmentDTO);
    }


}
