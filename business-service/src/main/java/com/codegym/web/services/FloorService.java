package com.codegym.web.services;
import com.codegym.dao.dto.FloorDTO;
import com.codegym.dao.entity.Floor;
import java.util.List;


public interface FloorService {
    List<Floor> findAllByDeleteFlagIsNull();
    FloorDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);

    Floor findById(Integer id);

    void save(FloorDTO floorDTO);

    void remove(Integer id);

    void updateFloor(FloorDTO floorDTO);

}
