package com.codegym.dao.dto;

import com.codegym.dao.entity.Floor;
import java.io.Serializable;
import java.util.Set;

public class BuildingDTO implements Serializable {

    private Integer id;
    private String abbreviationName;
    private String fullName;
    private String taxCode;
    private String phone;
    private String email;
    private String fax;
    private String address;
    private String management;
    private String manager;
    private String accountNumber;
    private String recipientName;
    private String bank;
    private Integer deleteFlag;
    private String urlImage;
    private Set<Floor> floors;

    @Override
    public String toString() {
        return "BuildingDTO{" +
                "id=" + id +
                ", abbreviationName='" + abbreviationName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", taxCode='" + taxCode + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", fax='" + fax + '\'' +
                ", address='" + address + '\'' +
                ", management='" + management + '\'' +
                ", manager='" + manager + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", recipientName='" + recipientName + '\'' +
                ", bank='" + bank + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", urlImage='" + urlImage + '\'' +
                ", floors=" + floors +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAbbreviationName() {
        return abbreviationName;
    }

    public void setAbbreviationName(String abbreviationName) {
        this.abbreviationName = abbreviationName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManagement() {
        return management;
    }

    public void setManagement(String management) {
        this.management = management;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Set<Floor> getFloors() {
        return floors;
    }

    public void setFloors(Set<Floor> floors) {
        this.floors = floors;
    }
}
