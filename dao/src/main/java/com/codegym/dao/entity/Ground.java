package com.codegym.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "ground")
public class Ground {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String codeGround;
    private double area;
    private String statusGround;
    private Integer price;
    private Integer priceManager;
    private Integer deleteFlag;
    private String typeGround;
    @ManyToOne(targetEntity = Floor.class)
    @JoinColumn(name = "floor_id")
    private Floor floor;

    @OneToMany(targetEntity = Equipment.class)
    @JoinColumn(name="equipment_id")
    private Equipment equipment;

    @OneToMany(targetEntity = Contract.class)
    @JoinColumn(name="contract_id")
    private Contract contract;

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

    public String getTypeGround() {
        return typeGround;
    }

    public void setTypeGround(String typeGround) {
        this.typeGround = typeGround;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
