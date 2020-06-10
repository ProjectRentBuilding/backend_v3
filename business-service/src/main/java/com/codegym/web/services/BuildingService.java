package com.codegym.web.services;

import com.codegym.dao.dto.BuildingDTO;
import com.codegym.dao.entity.Building;


import java.util.List;

public interface BuildingService {
    List<Building> findAllByDeleteFlagIsNull();
    BuildingDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);

}
