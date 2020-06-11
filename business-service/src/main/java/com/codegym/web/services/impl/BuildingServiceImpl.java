package com.codegym.web.services.impl;

import com.codegym.dao.dto.BuildingDTO;
import com.codegym.dao.entity.Building;
import com.codegym.dao.entity.Floor;
import com.codegym.dao.repository.BuildingRepository;
import com.codegym.web.services.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;
    @Override
    public List<Building> findAllByDeleteFlagIsNull() {
        return buildingRepository.findAllByDeleteFlagIsNull();
    }

    @Override
    public BuildingDTO findAllByDeleteFlagIsNullAndIdIs(Integer id) {
        Building building = buildingRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        if (building != null) {
            BuildingDTO buildingDTO = new BuildingDTO();
            buildingDTO.setId(building.getId());
            buildingDTO.setAbbreviationName(building.getAbbreviationName());
            buildingDTO.setFullName(building.getFullName());
            buildingDTO.setTaxCode(building.getTaxCode());
            buildingDTO.setPhone(building.getPhone());
            buildingDTO.setEmail(building.getEmail());
            buildingDTO.setFax(building.getFax());
            buildingDTO.setAddress(building.getAddress());
            buildingDTO.setManagement(building.getManagement());
            buildingDTO.setManager(building.getManager());
            buildingDTO.setAccountNumber(building.getAccountNumber());
            buildingDTO.setRecipientName(building.getRecipientName());
            buildingDTO.setBank(building.getBank());
            buildingDTO.setUrlImage(building.getUrlImage());
            buildingDTO.setFloors(building.getFloors());
            return buildingDTO;
        }
        return null;
    }

    @Override
    public Building findById(Integer id) {
        return buildingRepository.findById(id).orElse(null);
    }
    @Override
    public void remove(Integer id) {
        Building building = buildingRepository.findAllByDeleteFlagIsNullAndIdIs(id);
        building.setDeleteFlag(1);
        buildingRepository.save(building);
    }
    @Override
    public void save(BuildingDTO buildingDTO) {
        Building building = new Building();
        building.setId(buildingDTO.getId());
        building.setAbbreviationName(buildingDTO.getAbbreviationName());
        building.setFullName(buildingDTO.getFullName());
        building.setTaxCode(buildingDTO.getTaxCode());
        building.setPhone(buildingDTO.getPhone());
        building.setEmail(buildingDTO.getEmail());
        building.setFax(buildingDTO.getFax());
        building.setAddress(buildingDTO.getAddress());
        building.setManagement(buildingDTO.getManagement());
        building.setManager(buildingDTO.getManager());
        building.setAccountNumber(buildingDTO.getAccountNumber());
        building.setRecipientName(buildingDTO.getRecipientName());
        building.setBank(buildingDTO.getBank());
        building.setUrlImage(buildingDTO.getUrlImage());
        building.setFloors(buildingDTO.getFloors());
        buildingRepository.save(building);
        }

}
