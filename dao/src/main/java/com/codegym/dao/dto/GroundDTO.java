package com.codegym.dao.dto;

import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.Equipment;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

public class GroundDTO implements Serializable {

    private Integer id;

    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "(MB)[0-9]{3}", message ="Mã mặt bằng có định dạng là MBxxx (x là số 0-9)" )
    private String codeGround;

//    @NotEmpty(message = "Không được để trống")
//    @Size(max=15,message = "Diện tích tối đa 15 ký tự")
//    @Pattern(regexp = "([1-9]([0-9])?)|([0-9]([1-9])?)", message ="Diện tích phải đúng định dạng" )
    private double area;
    private String statusGround;
    private Integer price;
    private Integer priceManager;
    private Integer deleteFlag;

    private Set<Equipment> equipments;
    private Set<Contract> contracts;

    private Integer floorId;
    private Integer typeGroundId;
    private String note;


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

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
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

    public Integer getTypeGroundId() {
        return typeGroundId;
    }

    public void setTypeGroundId(Integer typeGroundId) {
        this.typeGroundId = typeGroundId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
