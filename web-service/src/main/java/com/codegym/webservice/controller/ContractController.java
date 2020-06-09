package com.codegym.webservice.controller;

import com.codegym.dao.dto.ContractDTO;
import com.codegym.dao.entity.Contract;
import com.codegym.web.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/contracts")
public class ContractController {

    @Autowired
    ContractService contractService;

    @GetMapping("")
    public List<Contract> getAllContract() {
        List<Contract> contracts;
        contracts = contractService.findAllByDeleteFlagIsNull();
        return contracts;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContractDTO> getContract(@PathVariable("id") int id) {
        ContractDTO contractDTO = contractService.findAllByDeleteFlagIsNullAndIdIs(id);
        if (contractDTO != null) {
            return ResponseEntity.ok(contractDTO);
        }
        return ResponseEntity.ok(null);
    }



}
