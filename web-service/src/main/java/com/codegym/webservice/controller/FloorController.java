package com.codegym.webservice.controller;

import com.codegym.dao.entity.Floor;
import com.codegym.dao.repository.FloorRepository;
import com.codegym.web.services.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
