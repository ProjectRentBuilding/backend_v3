package com.codegym.dao.entity;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "floor")
public class Floor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nameFloor;
    private String codeFloor;
    private double area;
    private String capacity;
    private String statusFloor;
    private Integer deleteFlag;
    private String typeFloor;
    @ManyToOne(targetEntity = Building.class)
    @JoinColumn(name="building_id")
    private Building building;
    @OneToMany(targetEntity = Ground.class,cascade = ALL)
    @JoinColumn(name="ground_id")
    private List<Ground> grounds;

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

    public String getTypeFloor() {
        return typeFloor;
    }

    public void setTypeFloor(String typeFloor) {
        this.typeFloor = typeFloor;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public List<Ground> getGrounds() {
        return grounds;
    }

    public void setGrounds(List<Ground> grounds) {
        this.grounds = grounds;
    }
}
