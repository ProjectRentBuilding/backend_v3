package com.codegym.webservice.controller;

import com.codegym.dao.dto.FloorDTO;
import com.codegym.dao.entity.Floor;
import com.codegym.dao.repository.FloorRepository;
import com.codegym.web.services.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/floors")
public class FloorController {
    @Autowired
    private FloorService floorService;

    @GetMapping("")
    public List<Floor> getAllFloor() {
        List<Floor> floors;
        floors = floorService.findAllByDeleteFlagIsNull();
        return floors;
    }

    @GetMapping("/{id}")
    public ResponseEntity<FloorDTO> getFloor(@PathVariable("id") int id) {
        FloorDTO floorDTO = floorService.findAllByDeleteFlagIsNullAndIdIs(id);
        if (floorDTO != null) {
            return ResponseEntity.ok(floorDTO);
        }
        return null;
    }
}
