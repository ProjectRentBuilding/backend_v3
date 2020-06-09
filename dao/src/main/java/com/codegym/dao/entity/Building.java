package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "building")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="name_floor")
    private String nameFloor;

    @Column(name="code_floor")
    private String codeFloor;
    @Column(name="area")
    private double area;

    @Column(name="capacity")
    private String capacity;

    @Column(name="status_floor")
    private String statusFloor;

    @Column(name="delete_flag")
    private Integer deleteFlag;

    @ManyToOne
    @JoinColumn(name = "id_image")
    private Image image;

    @OneToMany(mappedBy = "building",cascade = CascadeType.ALL)
    private List<Floor> floors;

    public Building() {
    }

    @Override
    public String toString() {
        return "Building{" +
                "id=" + id +
                ", nameFloor='" + nameFloor + '\'' +
                ", codeFloor='" + codeFloor + '\'' +
                ", area=" + area +
                ", capacity='" + capacity + '\'' +
                ", statusFloor='" + statusFloor + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", image=" + image +
                ", floors=" + floors +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameFloor() {
        return nameFloor;
    }

    public void setNameFloor(String nameFloor) {
        this.nameFloor = nameFloor;
    }

    public String getCodeFloor() {
        return codeFloor;
    }

    public void setCodeFloor(String codeFloor) {
        this.codeFloor = codeFloor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getStatusFloor() {
        return statusFloor;
    }

    public void setStatusFloor(String statusFloor) {
        this.statusFloor = statusFloor;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
}
