package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private boolean active;

    // Constructor
    public Role() {}

    public Role(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {      // <-- Needed by RoleServiceImpl
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {    // <-- Needed by RoleServiceImpl
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
