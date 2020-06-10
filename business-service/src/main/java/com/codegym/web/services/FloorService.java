package com.codegym.web.services;


import com.codegym.dao.entity.Floor;

import java.util.List;

public interface FloorService {
    List<Floor> findAllByDeleteFlagIsNull();
}
