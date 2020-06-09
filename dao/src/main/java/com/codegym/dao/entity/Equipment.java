package com.codegym.dao.entity;

import javax.persistence.*;

@Entity
@Table(name = "equipment")
public class Equipment {
    @Id
    @Column(name = "id_equipment")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_equipment")
    private String nameEquipment;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "status_equipment")
    private String statusEquipment;

    @Column(name = "amount_of_broken")
    private Integer amountOfBroken;

    @Column(name = "note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "id_type")
    private TypeEquipment typeEquipment;

    @ManyToOne
    @JoinColumn(name = "id_ground")
    private Integer idGround;

    @Column(name = "delete_flag")
    private Integer deleteFlag;

    public Equipment() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameEquipment() {
        return nameEquipment;
    }

    public void setNameEquipment(String nameEquipment) {
        this.nameEquipment = nameEquipment;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getStatusEquipment() {
        return statusEquipment;
    }

    public void setStatusEquipment(String statusEquipment) {
        this.statusEquipment = statusEquipment;
    }

    public Integer getAmountOfBroken() {
        return amountOfBroken;
    }

    public void setAmountOfBroken(Integer amountOfBroken) {
        this.amountOfBroken = amountOfBroken;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TypeEquipment getTypeEquipment() {
        return typeEquipment;
    }

    public void setTypeEquipment(TypeEquipment typeEquipment) {
        this.typeEquipment = typeEquipment;
    }

    public Integer getIdGround() {
        return idGround;
    }

    public void setIdGround(Integer idGround) {
        this.idGround = idGround;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
