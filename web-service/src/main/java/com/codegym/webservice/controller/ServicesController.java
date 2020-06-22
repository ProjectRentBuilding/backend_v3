package com.codegym.webservice.controller;

import com.codegym.dao.entity.Services;
import com.codegym.web.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/services")
public class ServicesController {
    @Autowired
    private ServicesService servicesService;

    @GetMapping("")
    public List<Services> getAllService() {
        return servicesService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Services> getService(@PathVariable("id") int id) {
        Services services = servicesService.findAllByIdIs(id);
        if (services != null) {
            return ResponseEntity.ok(services);
        }
        return null;
    }
}
