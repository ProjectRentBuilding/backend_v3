package com.codegym.webservice.controller;

import com.codegym.dao.dto.BuildingDTO;
import com.codegym.dao.entity.Building;
import com.codegym.web.services.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/buildings")
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping("")
    public List<Building> getAllBuilding() {
        List<Building> buildings;
        buildings = buildingService.findAllByDeleteFlagIsNull();
        return buildings;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BuildingDTO> getBuilding(@PathVariable("id") int id) {
        BuildingDTO buildingDTO = buildingService.findAllByDeleteFlagIsNullAndIdIs(id);
        if (buildingDTO != null) {
            return ResponseEntity.ok(buildingDTO);
        }
        return null;
    }
}
