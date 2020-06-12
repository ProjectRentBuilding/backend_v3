package com.codegym.dao.dto;

import com.codegym.dao.entity.Customer;
import com.codegym.dao.entity.Employee;
import com.codegym.dao.entity.Ground;

import java.io.Serializable;
import java.util.Date;


public class ContractDTO implements Serializable {
    private Integer id;
    private Integer employeeId;
    private Integer customerId;
    private Integer groundId;
    private String urlImage;
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
                ", employee=" + employeeId +
                ", customer=" + customerId +
                ", ground=" + groundId +
                ", urlImage='" + urlImage + '\'' +
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

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getGroundId() {
        return groundId;
    }

    public void setGroundId(Integer groundId) {
        this.groundId = groundId;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
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
