package com.codegym.dao.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@JsonIgnoreProperties
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_image")
    private Integer id;

    @Column(name="name_image")
    private String nameImage;

    @Column(name="url_image")
    private String urlImage;

    @Column(name="delete_flag")
    private Integer deleteFlag;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="id_building")
    private Building building;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name="id_contract")
    private Contract contract;

    public Image() {
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", nameImage='" + nameImage + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", building=" + building +
                ", contract=" + contract +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public String getNameImage() {
        return nameImage;
    }

    public void setNameImage(String nameImage) {
        this.nameImage = nameImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}

