package com.codegym.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "equipment")
public class Equipment {
    @Id
    @Column(name = "id_equipment")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name_equipment")
    private String nameEquipment;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "status_equipment")
    private String statusEquipment;

    @Column(name = "amount_of_broken")
    private Integer amountOfBroken;

    @Column(name = "note")
    private String note;

    @ManyToOne(targetEntity = TypeEquipment.class)
    @JoinColumn(name = "id_type")
    private Integer idType;

    @Column(name = "delete_flag")
    private Integer deleteFlag;
}
