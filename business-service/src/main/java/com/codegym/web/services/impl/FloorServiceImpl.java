package com.codegym.web.services.impl;

import com.codegym.dao.entity.Floor;
import com.codegym.dao.repository.FloorRepository;
import com.codegym.web.services.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FloorServiceImpl implements FloorService {
    @Autowired
    private FloorRepository floorRepository;

    @Override
    public List<Floor> findAllByDeleteFlagIsNull() {
        return floorRepository.findAllByDeleteFlagIsNull();
    }
}
