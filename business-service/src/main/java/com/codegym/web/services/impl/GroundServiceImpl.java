package com.codegym.web.services.impl;

import com.codegym.dao.dto.GroundDTO;
import com.codegym.dao.entity.*;
import com.codegym.dao.repository.FloorRepository;
import com.codegym.dao.repository.GroundRepository;
import com.codegym.dao.repository.TypeGroundRepository;
import com.codegym.web.services.GroundService;
import com.codegym.web.services.TypeGroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class GroundServiceImpl implements GroundService {
    @Autowired
    private GroundRepository groundRepository;
    @Autowired
    private FloorRepository floorRepository;

    @Autowired
    private TypeGroundRepository typeGroundRepository;

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
            groundDTO.setEquipments(ground.getEquipments());
            groundDTO.setContracts(ground.getContracts());
            groundDTO.setNote(ground.getNote());

            // Chuyển đổi kiểu lưu đối tượng từ ground sang kiểu lưu integer groundDTO
            groundDTO.setFloorId(ground.getFloor().getId());
            groundDTO.setTypeGroundId(ground.getTypeGround().getId());
            return groundDTO;
        }
        return null;
    }

    @Override
    public Ground findById(Integer id) {
        return null;
    }

    @Override
    public void save(GroundDTO groundDTO) {
        Ground ground = new Ground();
        ground.setId(groundDTO.getId());
        ground.setCodeGround(groundDTO.getCodeGround());
        ground.setArea(groundDTO.getArea());
        ground.setStatusGround(groundDTO.getStatusGround());
        ground.setPrice(groundDTO.getPrice());
        ground.setPriceManager(groundDTO.getPriceManager());
        ground.setDeleteFlag(groundDTO.getDeleteFlag());
        ground.setEquipments(groundDTO.getEquipments());
        ground.setContracts(groundDTO.getContracts());
        ground.setNote(groundDTO.getNote());

        ground.setFloor(floorRepository.findAllByDeleteFlagIsNullAndIdIs(groundDTO.getFloorId()));

        ground.setTypeGround(typeGroundRepository.findById(groundDTO.getTypeGroundId()).orElse(null));
        groundRepository.save(ground);
    }

    @Override
    public void remove(Integer id) {
        Ground ground = groundRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        ground.setDeleteFlag(1);
        groundRepository.save(ground);

    }

    @Override
    public void updateGround(GroundDTO groundDTO) {
        Ground ground = groundRepository.findAllByDeleteFlagIsNullAndIdIs(groundDTO.getId());
        ground.setId(groundDTO.getId());
        ground.setCodeGround(groundDTO.getCodeGround());
        ground.setArea(groundDTO.getArea());
        ground.setStatusGround(groundDTO.getStatusGround());
        ground.setPrice(groundDTO.getPrice());
        ground.setPriceManager(groundDTO.getPriceManager());
        ground.setDeleteFlag(groundDTO.getDeleteFlag());
        ground.setEquipments(groundDTO.getEquipments());
        ground.setContracts(groundDTO.getContracts());
        ground.setNote(groundDTO.getNote());
        ground.setFloor(floorRepository.findAllByDeleteFlagIsNullAndIdIs(groundDTO.getFloorId()));
        ground.setTypeGround(typeGroundRepository.findById(groundDTO.getTypeGroundId()).orElse(null));
        groundRepository.save(ground);

    }
}
