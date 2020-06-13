package com.codegym.webservice.controller;

import com.codegym.dao.dto.ContractDTO;
import com.codegym.dao.entity.Contract;
import com.codegym.web.services.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteContract(@PathVariable(value = "id") Integer contractID) {
        ContractDTO contract = contractService.findAllByDeleteFlagIsNullAndIdIs(contractID);
        contractService.delete(contract.getId());
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

    @PostMapping("")
    public ResponseEntity<ContractDTO> createContract(@RequestBody ContractDTO contractDTO) {
        contractService.save(contractDTO);
        return ResponseEntity.ok(contractDTO);
    }


    @PutMapping("/{id}")
    public ResponseEntity<ContractDTO> updateContract(@PathVariable(value = "id") Integer id, @RequestBody ContractDTO contractDTO) {
        contractService.updateContract(contractDTO);
        return ResponseEntity.ok(contractDTO);
    }

//
//    @GetMapping("/{id}")
//    public Map<String,String> getContract(@PathVariable("id") int id) {
//        ContractDTO contractDTO = contractService.findAllByDeleteFlagIsNullAndIdIs(id);
//        HashMap<String, String> map = new HashMap<>();
//        map.put("customerName", contractDTO.getCustomer().getName());
//        map.put("idCardCustomer", contractDTO.getCustomer().getIdCard());
//        map.put("addressCustomer", contractDTO.getCustomer().getAddress());
//        map.put("emailCustomer", contractDTO.getCustomer().getEmail());
//        map.put("groundName", contractDTO.getGround().getCodeGround());
//        map.put("term", String.valueOf(contractDTO.getTerm()));
//        map.put("status", String.valueOf(contractDTO.getStatusContract()));
//        map.put("startRentDay", String.valueOf(contractDTO.getStartRentDay()));
//        map.put("endRentDay", String.valueOf(contractDTO.getEndRentDay()));
//        map.put("price", String.valueOf(contractDTO.getPrice()));
//        map.put("total", String.valueOf(contractDTO.getTotal()));
//        map.put("deposits", String.valueOf(contractDTO.getDeposits()));
//        map.put("taxCode", String.valueOf(contractDTO.getTaxCode()));
//        map.put("content", String.valueOf(contractDTO.getContent()));
//        map.put("unified", String.valueOf(contractDTO.getUnified()));
//        map.put("id", String.valueOf(contractDTO.getId()));
//        map.put("deleteFlag", String.valueOf(contractDTO.getDeleteFlag()));
//        map.put("urlImage", contractDTO.getUrlImage());
//        return map;
//    }


}
