package com.codegym.webservice.controller;

import com.codegym.dao.dto.ServicesDTO;
import com.codegym.dao.entity.Services;
import com.codegym.web.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity<ServicesDTO> getService(@PathVariable("id") int id) {
        ServicesDTO servicesDTO = servicesService.findAllByIdIs(id);
        if (servicesDTO != null) {
            return ResponseEntity.ok(servicesDTO);
        }
        return null;
    }

    @PostMapping("")
    public ResponseEntity<?> createService(@Valid @RequestBody ServicesDTO servicesDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return new ResponseEntity<List>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        servicesService.save(servicesDTO);
        return ResponseEntity.ok(servicesDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateService(@PathVariable(value = "id") Integer id, @RequestBody @Valid ServicesDTO servicesDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return new ResponseEntity<List>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        servicesService.updateService(servicesDTO);
        return ResponseEntity.accepted().body(servicesDTO);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteService(@PathVariable("id") int id) {
        ServicesDTO service = servicesService.findAllByIdIs(id);
        servicesService.remove(service.getId());
        Map<String, Boolean> response = new HashMap<>();
        response.put("delete", Boolean.TRUE);
        return response;
    }

    @GetMapping(value = "/paging", params = {"page", "size", "nameService", "periodic", "consume", "monthYear"})
    public Page<Services> getListServices(@RequestParam("page") int page,
                                          @RequestParam("size") int size,
                                          @RequestParam(value = "nameService", defaultValue = "") String nameService,
                                          @RequestParam(value = "periodic", defaultValue = "") String periodic,
                                          @RequestParam(value = "consume") Integer consume,
                                          @RequestParam(value = "monthYear", defaultValue = "2001-01-01")
                                          @DateTimeFormat(pattern = "yyyy-MM-dd") Date monthYear) {
        Page<Services> services;
        services = servicesService.searchAll(nameService, periodic, consume, monthYear, PageRequest.of(page, size));
        return services;
    }
}
