package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "building")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_building")
    private Integer id;

    @Column(name="abbreviation_name")
    private String abbreviationName;

    @Column(name="full_name")
    private String fullName;
    @Column(name="tax_code")
    private String taxCode;

    @Column(name="phone")
    private Integer phone;

    @Column(name="email")
    private String email;

    @Column(name="fax")
    private String fax;

    @Column(name="address")
    private String address;

    @Column(name="management")
    private String management;

    @Column(name="manager")
    private String manager;

    @Column(name="account_number")
    private String accountNumber;

    @Column(name="recipient_name")
    private String recipientName;

    @Column(name="bank")
    private String bank;

    @Column(name="delete_flag")
    private Integer deleteFlag;

    @OneToMany(mappedBy = "building",cascade = CascadeType.ALL)
    private List<Image> images;

    @OneToMany(mappedBy = "building",cascade = CascadeType.ALL)
    private List<Floor> floors;

    public Building() {
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", abbreviationName='" + abbreviationName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", taxCode='" + taxCode + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", fax='" + fax + '\'' +
                ", address='" + address + '\'' +
                ", management='" + management + '\'' +
                ", manager='" + manager + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", recipientName='" + recipientName + '\'' +
                ", bank='" + bank + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", images=" + images +
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

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
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

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
}
