package com.codegym.web.services;

import com.codegym.dao.dto.BuildingDTO;
import com.codegym.dao.entity.Building;
import com.codegym.dao.entity.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface BuildingService {
    List<Building> findAllByDeleteFlagIsNull();
    BuildingDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);

    Page<Building> getBuildings(String fullName, Pageable pageable);

    Building findById(Integer id);

    void save(BuildingDTO buildingDTO);

    void remove(Integer id);

    void updateBuilding(BuildingDTO buildingDTO);

}
