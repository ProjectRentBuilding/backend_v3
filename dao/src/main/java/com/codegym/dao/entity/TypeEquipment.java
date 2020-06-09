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

    @OneToMany(mappedBy  = "idType", cascade = CascadeType.ALL)
    private Set<Equipment> equipment;

    @Column(name = "name_type")
    private String nameType;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    public TypeEquipment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(Set<Equipment> equipment) {
        this.equipment = equipment;
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

    @Override
    public String toString() {
        return "TypeEquipment{" +
                "id=" + id +
                ", equipment=" + equipment +
                ", nameType='" + nameType + '\'' +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}
