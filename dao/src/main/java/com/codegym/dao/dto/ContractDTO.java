package com.codegym.dao.dto;

import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.Employee;
import com.codegym.dao.entity.Ground;
import com.codegym.dao.entity.Image;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;



public class ContractDTO implements Serializable {
    private Integer id;
    private Employee employee;
    private Customer customer;
    private Ground ground;
    private Set<Image> images;
    private Double term;
    private Boolean statusContract;
    private Date startRentDay;
    private Date endRentDay;
    private Double price;
    private Double total;
    private Double deposits;
    private String taxCode;
    private String content;
    private Boolean unified;
    private Integer deleteFlag;

    public ContractDTO() {
    }

    @Override
    public String toString() {
        return "ContractDTO{" +
                "id=" + id +
                ", employee=" + employee +
                ", customer=" + customer +
                ", ground=" + ground +
                ", images=" + images +
                ", term=" + term +
                ", statusContract=" + statusContract +
                ", startRentDay=" + startRentDay +
                ", endRentDay=" + endRentDay +
                ", price=" + price +
                ", total=" + total +
                ", deposits=" + deposits +
                ", taxCode='" + taxCode + '\'' +
                ", content='" + content + '\'' +
                ", unified=" + unified +
                ", deleteFlag=" + deleteFlag +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }

    public Double getTerm() {
        return term;
    }

    public void setTerm(Double term) {
        this.term = term;
    }

    public Boolean getStatusContract() {
        return statusContract;
    }

    public void setStatusContract(Boolean statusContract) {
        this.statusContract = statusContract;
    }

    public Date getStartRentDay() {
        return startRentDay;
    }

    public void setStartRentDay(Date startRentDay) {
        this.startRentDay = startRentDay;
    }

    public Date getEndRentDay() {
        return endRentDay;
    }

    public void setEndRentDay(Date endRentDay) {
        this.endRentDay = endRentDay;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getDeposits() {
        return deposits;
    }

    public void setDeposits(Double deposits) {
        this.deposits = deposits;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getUnified() {
        return unified;
    }

    public void setUnified(Boolean unified) {
        this.unified = unified;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}
