package com.codegym.web.services.impl;

import com.codegym.dao.entity.Services;
import com.codegym.dao.repository.ServicesRepository;
import com.codegym.web.services.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ServicesServiceImpl implements ServicesService {

    @Autowired
    ServicesRepository serviceRepository;

    @Override
    public List<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Services findAllByIdIs(Integer id) {
        return serviceRepository.findAllByIdIs(id);
    }

    @Override
    public Page<Services> searchAndPage(Integer consume, Integer price, Date monthYear, String nameCustomer, Pageable pageable) {
        return serviceRepository.searchAndPage(consume, price, monthYear, nameCustomer, pageable);
    }

    @Override
    public Page<Services> findAllByConsumeBeforeAndPriceBeforeAndMonthYearBeforeAndContract_Customer_NameContaining(Integer consume, Integer price, Date monthYear, String contract_customer_name, Pageable pageable) {
        return serviceRepository.findAllByConsumeBeforeAndPriceBeforeAndMonthYearBeforeAndContract_Customer_NameContaining(consume, price, monthYear, contract_customer_name, pageable);
    }
}
