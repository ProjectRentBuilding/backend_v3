package com.codegym.web.services;

import com.codegym.dao.entity.TypeFloor;
import com.codegym.dao.entity.TypeGround;

import java.util.List;

public interface TypeFloorService {
    List<TypeFloor> findAll();
    TypeFloor findById(Integer id);
}
