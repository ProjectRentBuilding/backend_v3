package com.codegym.dao.entity;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name = "role_user")
public class RoleUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_role")
    private Long id;

    @OneToMany(mappedBy = "roleUser")
    private Set<UserBuilding> userBuildings;

    public RoleUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<UserBuilding> getUserBuildings() {
        return userBuildings;
    }

    public void setUserBuildings(Set<UserBuilding> userBuildings) {
        this.userBuildings = userBuildings;
    }
}
