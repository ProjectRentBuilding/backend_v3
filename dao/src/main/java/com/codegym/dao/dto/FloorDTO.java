package com.codegym.dao.dto;
import com.codegym.dao.entity.Ground;
import java.io.Serializable;
import java.util.Set;


public class FloorDTO implements Serializable {

    private Integer id;
    private String nameFloor;
    private String codeFloor;
    private double area;
    private String capacity;
    private String statusFloor;
    private Integer deleteFlag;
    private Integer typeFloorId;
    private Integer buildingId;
    private Set<Ground> grounds;


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

    public Integer getTypeFloorId() {
        return typeFloorId;
    }

    public void setTypeFloorId(Integer typeFloorId) {
        this.typeFloorId = typeFloorId;
    }

    public Integer getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(Integer buildingId) {
        this.buildingId = buildingId;
    }

    public Set<Ground> getGrounds() {
        return grounds;
    }

    public void setGrounds(Set<Ground> grounds) {
        this.grounds = grounds;
    }
}
