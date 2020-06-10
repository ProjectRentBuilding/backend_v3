package com.codegym.dao.dto;

import com.codegym.dao.entity.Ground;
import com.codegym.dao.entity.TypeEquipment;

public class EquipmentDTO {
    private Integer id;
    private String nameEquipment;
    private Integer amount;
    private Integer amountOfBroken;
    private String note;
    private TypeEquipment typeEquipment;
    private Ground ground;
    private Integer deleteFlag;

    public EquipmentDTO() {
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

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Override
    public String toString() {
        return "EquipmentDTO{" +
                "id=" + id +
                ", nameEquipment='" + nameEquipment + '\'' +
                ", amount=" + amount +
                ", amountOfBroken=" + amountOfBroken +
                ", note='" + note + '\'' +
                ", typeEquipment=" + typeEquipment +
                ", ground=" + ground +
                ", deleteFlag=" + deleteFlag +
                '}';
    }
}
