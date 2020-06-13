package com.codegym.webservice.controller;

import com.codegym.dao.entity.Ground;
import com.codegym.dao.entity.TypeGround;
import com.codegym.web.services.TypeGroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/typeGrounds")
public class TypeGroundController {

    @Autowired
    private TypeGroundService typeGroundService;

    @GetMapping("")
    public List<TypeGround> getAllTypeGround() {
        List<TypeGround> typeGrounds;
        typeGrounds = typeGroundService.findAll();
        return typeGrounds;
    }
}
