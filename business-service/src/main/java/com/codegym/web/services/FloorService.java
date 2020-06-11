package com.codegym.web.services;



import com.codegym.dao.dto.BuildingDTO;
import com.codegym.dao.dto.FloorDTO;
import com.codegym.dao.entity.Building;
import com.codegym.dao.entity.Floor;
import com.codegym.dao.entity.Ground;
import com.codegym.dao.entity.TypeFloor;

import java.util.List;
import java.util.Set;

public interface FloorService {
    List<Floor> findAllByDeleteFlagIsNull();
    FloorDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);

    Floor findById(Integer id);

    void save(FloorDTO floorDTO);

    void remove(Integer id);

}
