package com.codegym.dao.entity;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "floor")
public class Floor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_floor")
    private Integer id;

    @Column(name="name_floor")
    private String nameFloor;

    @Column(name="code_floor")
    private String codeFloor;

    @Column(name="area")
    private double area;

    @Column(name="capacity")
    private String capacity;

    @Column(name="status_floor")
    private String statusFloor;

    @Column(name="delete_flag")
    private Integer deleteFlag;

    @ManyToOne
    @JoinColumn(name = "id_type_floor")
    private TypeFloor typeFloor;

    @ManyToOne
    @JoinColumn(name="id_building")
    private Building building;

    @OneToMany(mappedBy ="floor",cascade = ALL)
    private Set<Ground> grounds;

    public Floor() {
    }


}
