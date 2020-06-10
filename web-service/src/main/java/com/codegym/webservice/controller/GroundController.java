package com.codegym.webservice.controller;

import com.codegym.dao.entity.Ground;
import com.codegym.web.services.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/grounds")
public class GroundController {
    @Autowired
    private GroundService groundService;

    @GetMapping
    public List<Ground> getAllGround() {
        List<Ground> grounds;
        grounds = groundService.findAllByDeleteFlagIsNull();
        return grounds;
    }
}
