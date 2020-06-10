package com.codegym.web.services.impl;

import com.codegym.dao.entity.Ground;
import com.codegym.dao.repository.GroundRepository;
import com.codegym.web.services.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroundServiceImpl implements GroundService {
    @Autowired
    private GroundRepository groundRepository;

    @Override
    public List<Ground> findAllByDeleteFlagIsNull() {
        return groundRepository.findAllByDeleteFlagIsNull();
    }
}
