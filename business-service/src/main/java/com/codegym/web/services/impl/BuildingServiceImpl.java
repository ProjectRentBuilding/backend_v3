package com.codegym.web.services.impl;

import com.codegym.dao.entity.Building;
import com.codegym.dao.repository.BuildingRepository;
import com.codegym.web.services.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;
    @Override
    public List<Building> findAllByDeleteFlagIsNull() {
        return buildingRepository.findAllByDeleteFlagIsNull();
    }
}
