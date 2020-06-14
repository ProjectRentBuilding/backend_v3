package com.codegym.webservice.controller;

import com.codegym.dao.entity.TypeFloor;
import com.codegym.web.services.TypeFloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/typeFloors")
public class TypeFloorController {
    @Autowired
    private TypeFloorService typeFloorService;

    @GetMapping("")
    public List<TypeFloor> getAllTypeGround() {
        List<TypeFloor> typeFloors;
        typeFloors = typeFloorService.findAll();
        return typeFloors;
    }
}