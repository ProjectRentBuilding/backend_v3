package com.codegym.dao.repository;


import com.codegym.dao.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ImageRepository extends JpaRepository<Image,Integer> {
    List<Image> findAllByDeleteFlagIsNull();
}
