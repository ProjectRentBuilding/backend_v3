package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "type_equipment")
public class TypeEquipment {
    @Id
    @Column(name = "id_type")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(mappedBy  = "typeEquipment", cascade = CascadeType.ALL)
    private Set<Equipment> equipments;

    @Column(name = "name_type")
    private String nameType;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    public TypeEquipment() {
    }

    @Override
    public String toString() {
        return "TypeEquipment{" +
                "id=" + id +
                ", equipments=" + equipments +
                ", nameType='" + nameType + '\'' +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
