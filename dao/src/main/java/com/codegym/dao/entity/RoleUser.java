package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "role_user")
public class RoleUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_role")
    private Integer id;

    @Column(name = "role_name")
    private String roleName;

    @OneToMany(mappedBy = "roleUser")
    private Set<UserBuilding> userBuildings;

    public RoleUser() {
    }

    @Override
    public String toString() {
        return "RoleUser{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", userBuildings=" + userBuildings +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<UserBuilding> getUserBuildings() {
        return userBuildings;
    }

    public void setUserBuildings(Set<UserBuilding> userBuildings) {
        this.userBuildings = userBuildings;
    }
}
