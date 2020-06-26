package com.codegym.web.services;

import com.codegym.dao.entity.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Date;
import java.util.List;

public interface ServicesService {
    List<Services> findAll();
    Services findAllByIdIs(Integer id);
    Page<Services> searchAndPage(Integer consume, Integer price, Date monthYear, String nameCustomer, Pageable pageable);
    Page<Services> findAllByConsumeBeforeAndPriceBeforeAndMonthYearBeforeAndContract_Customer_NameContaining(Integer consume, Integer price, Date monthYear, String contract_customer_name, Pageable pageable);

}
