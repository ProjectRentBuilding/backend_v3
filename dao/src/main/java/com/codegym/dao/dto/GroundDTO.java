package com.codegym.dao.dto;

import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Equipment;
import com.codegym.dao.entity.Floor;
import com.codegym.dao.entity.TypeGround;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

public class GroundDTO implements Serializable {


    private Integer id;
    private String codeGround;
    private double area;
    private String statusGround;
    private Integer price;
    private Integer priceManager;
    private Integer deleteFlag;
    private Floor floor;
    private Set<Equipment> equipments;
    private Set<Contract> contracts;
    private TypeGround typeGround;

    public GroundDTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeGround() {
        return codeGround;
    }

    public void setCodeGround(String codeGround) {
        this.codeGround = codeGround;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getStatusGround() {
        return statusGround;
    }

    public void setStatusGround(String statusGround) {
        this.statusGround = statusGround;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPriceManager() {
        return priceManager;
    }

    public void setPriceManager(Integer priceManager) {
        this.priceManager = priceManager;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }

    public TypeGround getTypeGround() {
        return typeGround;
    }

    public void setTypeGround(TypeGround typeGround) {
        this.typeGround = typeGround;
    }
}
