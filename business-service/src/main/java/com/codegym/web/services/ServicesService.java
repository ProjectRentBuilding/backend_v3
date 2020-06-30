package com.codegym.web.services;


import com.codegym.dao.dto.ServicesDTO;
import com.codegym.dao.entity.Services;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.Date;
import java.util.List;

public interface ServicesService {
    List<Services> findAll();
    Page<Services> searchAndPage(Integer consume, Integer price, Date monthYear, String nameCustomer, Pageable pageable);
    Page<Services> findAllByConsumeBeforeAndPriceBeforeAndMonthYearBeforeAndContract_Customer_NameContaining(Integer consume, Integer price, Date monthYear, String contract_customer_name, Pageable pageable);

    ServicesDTO findAllByIdIs(Integer id);
    void save(ServicesDTO servicesDTO);
    void remove(Integer id);

    void updateService(ServicesDTO servicesDTO);

    Page<Services> searchAll(String nameService, String periodic, Integer consume,
                             Date monthYear, Pageable pageable);

    Page<Services> searchServiceIdContract(Integer idContract, Date startDate, Date endDate, Pageable pageable);

    List<String> searchAllDistinct();
    Page<Services> searchInformationService(Integer idContract,String nameService,
                                            Date startDate, Date endDate, Pageable pageable);
}
