package com.codegym.web.services;

import com.codegym.dao.entity.Services;

import java.util.List;

public interface ServicesService {
    List<Services> findAll();
    Services findAllByIdIs(Integer id);
}
