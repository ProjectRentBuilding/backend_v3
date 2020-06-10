package com.codegym.webservice.controller;

import com.codegym.dao.entity.Building;
import com.codegym.web.services.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        buildings=buildingService.findAllByDeleteFlagIsNull();
        return buildings;
    }
}
