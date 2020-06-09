package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ground")
public class Ground {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="codeGround")
    private String codeGround;

    @Column(name="area")
    private double area;

    @Column(name="status_ground")
    private String statusGround;

    @Column(name="price")
    private Integer price;

    @Column(name="price_manager")
    private Integer priceManager;

    @Column(name="delete_flag")
    private Integer deleteFlag;

    @Column(name="type_ground")
    private String typeGround;

    @ManyToOne
    @JoinColumn(name = "id_floor")
    private Floor floor;

    @OneToMany(mappedBy ="ground",cascade = CascadeType.ALL)
    private Set<Equipment> equipments;

    @OneToMany(mappedBy = "ground")
    private Set<Contract> contracts;

    public Ground() {
    }

    @Override
    public String toString() {
        return "Ground{" +
                "id=" + id +
                ", codeGround='" + codeGround + '\'' +
                ", area=" + area +
                ", statusGround='" + statusGround + '\'' +
                ", price=" + price +
                ", priceManager=" + priceManager +
                ", deleteFlag=" + deleteFlag +
                ", typeGround='" + typeGround + '\'' +
                ", floor=" + floor +
                ", equipments=" + equipments +
                ", contracts=" + contracts +
                '}';
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
}
