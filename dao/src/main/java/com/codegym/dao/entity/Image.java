package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

import static javax.persistence.CascadeType.ALL;

@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name_image")
    private String nameImage;

    @Column(name="url_image")
    private String urlImage;

    @Column(name="delete_flag")
    private Integer deleteFlag;

    @OneToMany(mappedBy = "image",cascade = ALL)
    @JoinColumn(name="id_building")
    private Set<Building> buildings;

    @OneToMany(mappedBy = "image",cascade = ALL)
    @JoinColumn(name="id_contract")
    private Set<Contract> contracts;

    public Image() {
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", nameImage='" + nameImage + '\'' +
                ", urlImage='" + urlImage + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", buildings=" + buildings +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(Set<Building> buildings) {
        this.buildings = buildings;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
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

