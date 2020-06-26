package com.codegym.dao.repository;


import com.codegym.dao.entity.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.Date;
import java.util.List;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Integer> {
    List<Services> findAll();
    Services findAllByIdIs(Integer id);

    @Query(value="select s from Services s where s.nameService like %?1% and s.periodic " +
            "like %?2% and s.consume>=?3 and s.monthYear>=?4  order by s.id")
    Page<Services> searchAll(String nameService, String periodic, Integer consume,
                             Date monthYear, Pageable pageable);
}
