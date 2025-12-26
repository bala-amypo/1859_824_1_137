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

    // Constructors
    public Role() {}

    public Role(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {     // used instead of getRoleName()
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {   // used instead of getActive()
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
