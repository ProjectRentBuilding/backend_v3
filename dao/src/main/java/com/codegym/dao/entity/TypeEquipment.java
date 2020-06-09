package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "type_equipment")
public class TypeEquipment {
    @Id
    @Column(name = "id_type")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(targetEntity = Equipment.class, cascade = CascadeType.ALL)
    private List<Equipment> equipment;

    @Column(name = "name_type")
    private String nameType;

    @Column(name = "delete_flag")
    private Integer deleteFlag;
}
