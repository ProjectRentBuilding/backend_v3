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

    Page<Services> findAllByConsumeBeforeAndPriceBeforeAndMonthYearBeforeAndContract_Customer_NameContaining(Integer consume, Integer price, Date monthYear, String contract_customer_name, Pageable pageable);
//    @Query(value = "SELECT s FROM Services s where s.consume>=?1 and s.price>=?2 and s.monthYear>=?3 and s.contract.customer.name like %?4% order by s.nameService" )
    @Query(value = "SELECT s " +
            "FROM Services s " +
            "where s.consume>=?1" +
            "and s.price>=?2" +
            "and s.monthYear>=?3 " +
            "and s.contract.customer.name like %?4%" +
            "order by s.nameService")
    Page<Services> searchAndPage(Integer consume, Integer price, Date monthYear, String nameCustomer, Pageable pageable);

    @Query(value="select s from Services s where s.nameService like %?1% and s.periodic " +
            "like %?2% and s.consume>=?3 and s.monthYear>=?4  order by s.id")
    Page<Services> searchAll(String nameService, String periodic, Integer consume,
                             Date monthYear, Pageable pageable);

    @Query(value = "select * from \n" +
            "\tservice s\n" +
            "where id_contract = ?1 \n" +
            "and date(month_year) between ?2 and ?3 ", nativeQuery = true)
    Page<Services> searchServiceIdContract(Integer idContract, Date startDate, Date endDate,Pageable pageable);
}
