package com.codegym.dao.repository;


import com.codegym.dao.entity.Floor;
import com.codegym.dao.entity.Image;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ImageRepository extends JpaRepository<Image,Integer> {
    List<Image> findAllByDeleteFlagIsNull();
    Page<Image> findAllByDeleteFlagIsNull(Pageable pageable);
    Page<Image> findAllByDeleteFlagIsNullAndNameImageContaining(String nameImage,Pageable pageable);
}
