package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "permission", uniqueConstraints = {
        @UniqueConstraint(columnNames = "permission_name")
})
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "permission_name", nullable = false, unique = true)
    private String permissionName;

    private String description;

    private Boolean active = true;

    public Permission() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getPermissionName() { return permissionName; }
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() { return active; }
    public void setActive(Boolean active) {
        this.active = active;
    }
}
