package com.codegym.web.services;


import com.codegym.dao.entity.Image;

import java.util.List;

public interface ImageService {
    List<Image> findAllByDeleteFlagIsNull();
}
