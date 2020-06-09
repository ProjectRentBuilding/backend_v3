package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ground")
public class Ground {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ground")
    private Integer id;


    @Column(name="codeGround")
    private String codeGround;

    @Column(name="area")
    private double area;

    @Column(name="status_ground")
    private String statusGround;

    @Column(name="price")
    private Integer price;

    @Column(name="price_manager")
    private Integer priceManager;

    @Column(name="delete_flag")
    private Integer deleteFlag;


    @ManyToOne
    @JoinColumn(name = "id_floor")
    private Floor floor;

    @OneToMany(mappedBy ="ground",cascade = CascadeType.ALL)
    private Set<Equipment> equipments;

    @OneToMany(mappedBy = "ground",cascade = CascadeType.ALL)
    private Set<Contract> contracts;

    @ManyToOne
    @JoinColumn(name = "id_type_ground")
    private TypeGround typeGround;


    public Ground() {

    }


}
