package com.codegym.dao.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@JsonIgnoreProperties
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
    @JsonManagedReference
    @JoinColumn(name = "id_type_floor")
    private TypeFloor typeFloor;

    @ManyToOne
    @JsonManagedReference
    @JoinColumn(name="id_building")
    private Building building;

    @JsonBackReference
    @OneToMany(mappedBy ="floor",cascade = ALL)
    private Set<Ground> grounds;

    public Floor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameFloor() {
        return nameFloor;
    }

    public void setNameFloor(String nameFloor) {
        this.nameFloor = nameFloor;
    }

    public String getCodeFloor() {
        return codeFloor;
    }

    public void setCodeFloor(String codeFloor) {
        this.codeFloor = codeFloor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getStatusFloor() {
        return statusFloor;
    }

    public void setStatusFloor(String statusFloor) {
        this.statusFloor = statusFloor;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public TypeFloor getTypeFloor() {
        return typeFloor;
    }

    public void setTypeFloor(TypeFloor typeFloor) {
        this.typeFloor = typeFloor;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Set<Ground> getGrounds() {
        return grounds;
    }

    public void setGrounds(Set<Ground> grounds) {
        this.grounds = grounds;
    }
}
