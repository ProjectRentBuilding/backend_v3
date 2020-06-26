package com.codegym.webservice.controller;

import com.codegym.dao.entity.Services;
import com.codegym.web.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @GetMapping(value = "/paging", params = {"page", "size", "consume", "price", "monthYear", "nameCustomer"})
    public Page<Services> searchAndPage(@RequestParam("page") int page,
                                        @RequestParam("size") int size,
                                        @RequestParam(value = "consume") Integer consume,
                                        @RequestParam(value = "price")  Integer price,
                                        @RequestParam(value = "monthYear")  @DateTimeFormat(pattern = "yyyy-MM-dd") Date monthYear,
                                        @RequestParam(value = "nameCustomer", defaultValue = "") String nameCustomer) {
        return servicesService.findAllByConsumeBeforeAndPriceBeforeAndMonthYearBeforeAndContract_Customer_NameContaining(consume, price, monthYear, nameCustomer, PageRequest.of(page, size));
    }
}
