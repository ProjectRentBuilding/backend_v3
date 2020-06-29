package com.codegym.web.services.impl;

import com.codegym.dao.dto.CustomerDTO;
import com.codegym.dao.dto.UserBuildingDTO;
import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.TypeEquipment;
import com.codegym.dao.entity.UserBuilding;
import com.codegym.dao.repository.UserBuildingRepository;
import com.codegym.web.services.UserBuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserBuildingServiceImpl implements UserBuildingService {
    @Autowired
    UserBuildingRepository userBuildingRepository;
    @Override
    public List<UserBuilding> findAllByDeleteFlagIsNull() {
        return userBuildingRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public UserBuilding findByUsername(String username) {
      return userBuildingRepository.findByUsername(username);
    }

    @Override
    public UserBuildingDTO getUserBuildingByUsername(String username) {
       UserBuilding userBuilding = userBuildingRepository.findAllByDeleteFlagIsNullAndUsernameIs(username);
       if(userBuilding != null){
           UserBuildingDTO userBuildingDTO = new UserBuildingDTO();
           userBuildingDTO.setCustomer(userBuilding.getCustomer());
           userBuildingDTO.setDeleteFlag(userBuilding.getDeleteFlag());
           userBuildingDTO.setPasswordUser(userBuilding.getPasswordUser());
           userBuildingDTO.setCustomer(userBuilding.getCustomer());
           userBuildingDTO.setRoleUser(userBuilding.getRoleUser());
           userBuildingDTO.setEmployee(userBuilding.getEmployee());
           return userBuildingDTO;
       }
       return null;
    }

    @Override
    public void save(UserBuildingDTO userBuildingDTO) {
        UserBuilding userBuilding = new UserBuilding();
        userBuilding.setUsername(userBuildingDTO.getUsername());
        userBuilding.setDeleteFlag(userBuildingDTO.getDeleteFlag());
        userBuilding.setPasswordUser(userBuildingDTO.getPasswordUser());
        userBuilding.setEmployee(userBuildingDTO.getEmployee());
        userBuilding.setCustomer(userBuildingDTO.getCustomer());
        userBuilding.setRoleUser(userBuildingDTO.getRoleUser());
        userBuildingRepository.save(userBuilding);
    }
}
