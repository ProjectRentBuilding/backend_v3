package com.codegym.web.services;


import com.codegym.dao.dto.GroundDTO;
import com.codegym.dao.entity.Ground;

import java.util.List;

public interface GroundService {
    List<Ground> findAllByDeleteFlagIsNull();
    GroundDTO findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
