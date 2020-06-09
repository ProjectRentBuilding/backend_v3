package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_customer")
    private Long id;

    @Column(name = "name_customer")
    private String name ;

    @Column(name = "birthday")
    private Date birthday ;

    @Column(name = "id_card")
    private String idCard ;

    @Column(name = "phone")
    private int phone ;

    @Column(name = "email")
    private String email ;

    @Column(name = "address")
    private String address ;

    @Column(name = "gender")
    private String gender ;

    @Column(name = "website")
    private String website ;

    @Column(name = "name_company")
    private String nameCompany ;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username",referencedColumnName = "username")
    private UserBuilding userBuilding;



    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public UserBuilding getUserBuilding() {
        return userBuilding;
    }

    public void setUserBuilding(UserBuilding userBuilding) {
        this.userBuilding = userBuilding;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", idCard='" + idCard + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", website='" + website + '\'' +
                ", nameCompany='" + nameCompany + '\'' +
                ", userBuilding=" + userBuilding +
                '}';
    }
}
