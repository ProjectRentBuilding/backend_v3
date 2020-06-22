package com.codegym.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "service")
@JsonIgnoreProperties
public class Services {
    @Id
    @Column(name = "id_service")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_service")
    private String nameService;

    @Column(name = "index_before_month")
    private Integer indexBeforeMonth;

    @Column(name = "index_after_month")
    private Integer indexAfterMonth;

    @Column(name = "consume")
    private Integer consume;

    @Column(name = "unit")
    private String unit;

    @Column(name = "price")
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "id_contract")
    private Contract contract;

    @Override
    public String toString() {
        return "Service{" +
                "id=" + id +
                ", nameService='" + nameService + '\'' +
                ", indexBeforeMonth=" + indexBeforeMonth +
                ", indexAfterMonth=" + indexAfterMonth +
                ", consume=" + consume +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", contract=" + contract +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public Integer getIndexBeforeMonth() {
        return indexBeforeMonth;
    }

    public void setIndexBeforeMonth(Integer indexBeforeMonth) {
        this.indexBeforeMonth = indexBeforeMonth;
    }

    public Integer getIndexAfterMonth() {
        return indexAfterMonth;
    }

    public void setIndexAfterMonth(Integer indexAfterMonth) {
        this.indexAfterMonth = indexAfterMonth;
    }

    public Integer getConsume() {
        return consume;
    }

    public void setConsume(Integer consume) {
        this.consume = consume;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}
