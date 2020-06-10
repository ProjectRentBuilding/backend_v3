package com.codegym.dao.repository;


import com.codegym.dao.entity.Ground;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface GroundRepository extends JpaRepository<Ground,Integer> {
    List<Ground> findAllByDeleteFlagIsNull();
    Page<Ground> findAllByDeleteFlagIsNull(Pageable pageable);
    Page<Ground> findAllByDeleteFlagIsNullAndCodeGroundContaining(String codeGround,Pageable pageable);

    Ground findAllByDeleteFlagIsNullAndIdIs(Integer id);
}
