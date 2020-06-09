package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contract")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_employee")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "id_ground")
    private Ground ground;

    @OneToMany(mappedBy = "image")
    private Set<Image> images;


    @Column(name = "term")
    private Double term;

    @Column(name = "status_contract")
    private Boolean statusContract;

    @Column(name = "start_rent_day")
    private Date startRentDay;

    @Column(name = "end_rent_day")
    private Date endRentDay;

    @Column(name = "price")
    private Double price;

    @Column(name = "total")
    private Double total;

    @Column(name = "deposits")
    private Double deposits;

    @Column(name = "tax_code")
    private String taxCode;

    @Column(name = "content")
    private String content;

    @Column(name = "unified")
    private Boolean unified;

    @Column(name = "delete_flag")
    private Integer deleteFlag;






}
