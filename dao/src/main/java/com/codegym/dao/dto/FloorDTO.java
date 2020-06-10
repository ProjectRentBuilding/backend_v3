package com.codegym.dao.dto;

import com.codegym.dao.entity.Building;
import com.codegym.dao.entity.Ground;
import com.codegym.dao.entity.TypeFloor;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

public class FloorDTO implements Serializable {

    private Integer id;
    private String nameFloor;
    private String codeFloor;
    private double area;
    private String capacity;
    private String statusFloor;
    private TypeFloor typeFloor;
    private Building building;
    private Set<Ground> grounds;

    public FloorDTO() {
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
