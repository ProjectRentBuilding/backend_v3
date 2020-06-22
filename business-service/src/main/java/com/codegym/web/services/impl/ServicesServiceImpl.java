package com.codegym.web.services.impl;

import com.codegym.dao.entity.Services;
import com.codegym.dao.repository.ServicesRepository;
import com.codegym.web.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    ServicesRepository serviceRepository;

    @Override
    public List<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Services findAllByIdIs(Integer id) {
        return serviceRepository.findAllByIdIs(id);
    }
}
