package com.codegym.web.services.impl;

import com.codegym.dao.dto.GroundDTO;
import com.codegym.dao.entity.*;
import com.codegym.dao.repository.GroundRepository;
import com.codegym.web.services.GroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class GroundServiceImpl implements GroundService {
    @Autowired
    private GroundRepository groundRepository;

    @Override
    public List<Ground> findAllByDeleteFlagIsNull() {
        return groundRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public GroundDTO findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        Ground ground = groundRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        if (ground != null) {
            GroundDTO groundDTO = new GroundDTO();
            groundDTO.setId(ground.getId());
            groundDTO.setCodeGround(ground.getCodeGround());
            groundDTO.setArea(ground.getArea());
            groundDTO.setStatusGround(ground.getStatusGround());
            groundDTO.setPrice(ground.getPrice());
            groundDTO.setPriceManager(ground.getPriceManager());
            groundDTO.setFloor(ground.getFloor());
            groundDTO.setEquipments(ground.getEquipments());
            groundDTO.setContracts(ground.getContracts());
            groundDTO.setTypeGround(ground.getTypeGround());
            return groundDTO;
        }
        return null;
    }
}
