package com.codegym.dao.entity;

import javax.persistence.*;
@Entity
@Table(name = "user_building")
public class UserBuilding {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "username")
    private Long id;

    @Column(name = "password_user")
    private String passwordUser;

    @Column(name = "delete_flag")
    private Boolean deleteFlag;

    @OneToOne(mappedBy = "customer")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "id_role")
    private RoleUser roleUser;

    @OneToOne(mappedBy = "userBuilding")
    private Employee employee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public RoleUser getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(RoleUser roleUser) {
        this.roleUser = roleUser;
    }

    @Override
    public String toString() {
        return "UserBuilding{" +
                "id=" + id +
                ", passwordUser='" + passwordUser + '\'' +
                ", deleteFlag=" + deleteFlag +
                ", customer=" + customer +
                ", roleUser=" + roleUser +
                ", employee=" + employee +
                '}';
    }
}
