package com.codegym.web.services;

import com.codegym.dao.dto.GroundDTO;
import com.codegym.dao.dto.ServicesDTO;
import com.codegym.dao.entity.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ServicesService {
    List<Services> findAll();
    ServicesDTO findAllByIdIs(Integer id);
    void save(ServicesDTO servicesDTO);
    void remove(Integer id);

    void updateService(ServicesDTO servicesDTO);


    Page<Services> searchAll(String nameService, String periodic, Integer consume,
                             Date monthYear, Pageable pageable);
}
