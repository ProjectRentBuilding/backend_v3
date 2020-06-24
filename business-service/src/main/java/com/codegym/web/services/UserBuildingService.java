package com.codegym.web.services;

import com.codegym.dao.dto.CustomerDTO;
import com.codegym.dao.dto.UserBuildingDTO;
import com.codegym.dao.entity.TypeEquipment;
import com.codegym.dao.entity.UserBuilding;

import java.util.List;


public interface UserBuildingService {
    List<UserBuilding> findAllByDeleteFlagIsNull();
    UserBuilding findByUsername(String username);
    UserBuildingDTO getUserBuildingByUsername(String username);
    void save(UserBuildingDTO userBuildingDTO);
}
