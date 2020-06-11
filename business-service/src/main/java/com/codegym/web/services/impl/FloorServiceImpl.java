package com.codegym.web.services.impl;

import com.codegym.dao.dto.FloorDTO;
import com.codegym.dao.entity.Building;
import com.codegym.dao.entity.Floor;
import com.codegym.dao.entity.Ground;
import com.codegym.dao.entity.TypeFloor;
import com.codegym.dao.repository.FloorRepository;
import com.codegym.web.services.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class FloorServiceImpl implements FloorService {
    @Autowired
    private FloorRepository floorRepository;

    @Override
    public List<Floor> findAllByDeleteFlagIsNull() {
        return floorRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public FloorDTO findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        Floor floor = floorRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        if (floor != null) {
            FloorDTO floorDTO = new FloorDTO();
            floorDTO.setId(floor.getId());
            floorDTO.setNameFloor(floor.getNameFloor());
            floorDTO.setCodeFloor(floor.getCodeFloor());
            floorDTO.setArea(floor.getArea());
            floorDTO.setCapacity(floor.getCapacity());
            floorDTO.setStatusFloor(floor.getStatusFloor());
            floorDTO.setTypeFloor(floor.getTypeFloor());
            floorDTO.setBuilding(floor.getBuilding());
            floorDTO.setGrounds(floor.getGrounds());
            return floorDTO;
        }
       return null;
    }

    @Override
    public Floor findById(Integer id) {
        return null;
    }

    @Override
    public void save(FloorDTO floorDTO) {

    }

    @Override
    public void remove(Integer id) {
        Floor floor = floorRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        floor.setDeleteFlag(1);
        floorRepository.save(floor);

    }
}
