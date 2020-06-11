package com.codegym.webservice.controller;

import com.codegym.dao.dto.BuildingDTO;
import com.codegym.dao.entity.Building;
import com.codegym.web.services.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteBulding(@PathVariable("id") int id) {
        BuildingDTO building = buildingService.findAllByDeleteFlagIsNullAndIdIs(id);
        buildingService.remove(building.getId());
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", Boolean.TRUE);
        return response;
    }
    @PostMapping("")
    public ResponseEntity<BuildingDTO> createBuilding(@RequestBody BuildingDTO buildingDTO) {
        buildingService.save(buildingDTO);
        return ResponseEntity.ok(buildingDTO);
    }


}
