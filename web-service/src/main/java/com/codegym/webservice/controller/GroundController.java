package com.codegym.webservice.controller;

import com.codegym.dao.dto.GroundDTO;
import com.codegym.dao.entity.Ground;
import com.codegym.web.services.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/grounds")
public class GroundController {
    @Autowired
    private GroundService groundService;

    @GetMapping("")
    public List<Ground> getAllGround() {
        List<Ground> grounds;
        grounds = groundService.findAllByDeleteFlagIsNull();
        return grounds;
    }

    @GetMapping("/{id}")
    public ResponseEntity<GroundDTO> getGround(@PathVariable("id") int id) {
        GroundDTO groundDTO = groundService.findAllByDeleteFlagIsNullAndIdIs(id);
        if (groundDTO != null) {
            return ResponseEntity.ok(groundDTO);
        }
        return null;
    }
}
