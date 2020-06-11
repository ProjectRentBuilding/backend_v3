package com.codegym.dao.dto;

import com.codegym.dao.entity.Contract;
import com.codegym.dao.entity.UserBuilding;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class EmployeeDTO implements Serializable {
    private Integer id;
    private Integer deleteFlag;
    private String name;
    private Date birthday;
    private String idCard;
    private int phone;
    private String email;
    private String address;
    private String gender;
    private UserBuilding userBuilding;
    private Set<Contract> contracts;

    public EmployeeDTO() {
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", deleteFlag=" + deleteFlag +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", idCard='" + idCard + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", userBuilding=" + userBuilding +
                ", contracts=" + contracts +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public UserBuilding getUserBuilding() {
        return userBuilding;
    }

    public void setUserBuilding(UserBuilding userBuilding) {
        this.userBuilding = userBuilding;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}
