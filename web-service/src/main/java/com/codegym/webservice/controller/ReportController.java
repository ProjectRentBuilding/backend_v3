package com.codegym.webservice.controller;

import com.codegym.dao.dto.ReportDTO;
import com.codegym.dao.dto.ReportInt;
import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Ground;
import com.codegym.dao.repository.ContractRepository;
import com.codegym.web.services.ContractService;
import com.codegym.web.services.GroundService;
import com.codegym.web.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/reports")
public class ReportController {

    @Autowired
    ContractService contractService;

    @Autowired
    GroundService groundService;

    @Autowired
    ReportService reportService;

    @GetMapping("/all")
    public List<ReportInt> getAllReport() {
        return reportService.searchAllReport();
    }

    @GetMapping("/high")
    public List<ReportInt> getReportHigh() {
        return reportService.searchAllReportHigh();
    }

    @GetMapping("/low")
    public List<ReportInt> getReportLow() {
        return reportService.searchAllReportLow();
    }

    //    @GetMapping("/all")
//    public List<ReportDTO> dungCmnHinh5s() {
//        List<Ground> grounds;
//        List<Contract> contracts;
//        List<ReportDTO> reportDTOS=new ArrayList<>();
//        grounds = groundService.findAllByDeleteFlagIsNull();
//        contracts = contractService.findAllByDeleteFlagIsNull();
//
//        for (int i = 0; i < grounds.size(); i++) {
//            double totalCal = 0;
//            for (int j = 0; j < contracts.size(); j++) {
//                if (contracts.get(j).getGround().getCodeGround().equals(grounds.get(i).getCodeGround())) {
//                    totalCal += contracts.get(j).getTotal();
//                }
//            }
//            System.out.println("ma mat bang " + grounds.get(i).getCodeGround() + " tong tien " + totalCal);
//            ReportDTO reportDTO;
//            reportDTO = new ReportDTO(grounds.get(i).getCodeGround(), totalCal);
//            reportDTOS.add(reportDTO);
//        }
//
//        return reportDTOS;


}
