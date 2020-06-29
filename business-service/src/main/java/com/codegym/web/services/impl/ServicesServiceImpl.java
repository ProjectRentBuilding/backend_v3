package com.codegym.web.services.impl;

import com.codegym.dao.dto.ServicesDTO;
import com.codegym.dao.entity.Services;
import com.codegym.dao.repository.ContractRepository;
import com.codegym.dao.repository.ServicesRepository;
import com.codegym.web.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    ServicesRepository serviceRepository;

    @Autowired
    ContractRepository contractRepository;

    @Override
    public List<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public ServicesDTO findAllByIdIs(Integer id) {
        Services services= serviceRepository.findAllByIdIs(id);
        if (services != null) {
            ServicesDTO servicesDTO = new ServicesDTO();
            servicesDTO.setId(services.getId());
            servicesDTO.setNameService(services.getNameService());
            servicesDTO.setPeriodic(services.getPeriodic());
            servicesDTO.setUnit(services.getUnit());
            servicesDTO.setPrice(services.getPrice());
            servicesDTO.setConsume(services.getConsume());
            servicesDTO.setMonthYear(services.getMonthYear());
            servicesDTO.setIndexBeforeMonth(services.getIndexBeforeMonth());
            servicesDTO.setIndexAfterMonth(services.getIndexAfterMonth());
            servicesDTO.setContractId(services.getContract().getId());
            return servicesDTO;
        }
        return null;
    }

    @Override
    public void save(ServicesDTO servicesDTO) {
        Services services = new Services();
        services.setId(servicesDTO.getId());
        services.setNameService(servicesDTO.getNameService());
        services.setPeriodic(servicesDTO.getPeriodic());
        services.setUnit(servicesDTO.getUnit());
        services.setPrice(servicesDTO.getPrice());
        services.setConsume(servicesDTO.getConsume());
        services.setIndexBeforeMonth(servicesDTO.getIndexBeforeMonth());
        services.setIndexAfterMonth(servicesDTO.getIndexAfterMonth());
        services.setMonthYear(servicesDTO.getMonthYear());
        services.setContract(contractRepository.findAllByDeleteFlagIsNullAndIdIs(servicesDTO.getContractId()));
        serviceRepository.save(services);
    }

    @Override
    public void remove(Integer id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public void updateService(ServicesDTO servicesDTO) {
        Services services = serviceRepository.findAllByIdIs(servicesDTO.getId());
        services.setId(servicesDTO.getId());
        services.setNameService(servicesDTO.getNameService());
        services.setPeriodic(servicesDTO.getPeriodic());
        services.setUnit(servicesDTO.getUnit());
        services.setPrice(servicesDTO.getPrice());
        services.setConsume(servicesDTO.getConsume());
        services.setIndexBeforeMonth(servicesDTO.getIndexBeforeMonth());
        services.setIndexAfterMonth(servicesDTO.getIndexAfterMonth());
        services.setMonthYear(servicesDTO.getMonthYear());
        services.setContract(contractRepository.findAllByDeleteFlagIsNullAndIdIs(servicesDTO.getContractId()));
        serviceRepository.save(services);
    }

    @Override
    public Page<Services> searchAll(String nameService, String periodic, Integer consume, Date monthYear, Pageable pageable) {
        return serviceRepository.searchAll(nameService, periodic, consume, monthYear,pageable);
    }
}
