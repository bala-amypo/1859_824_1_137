package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.UserRole;
import com.example.demo.service.UserRoleService;

@RestController
@RequestMapping("/api/user-roles")
public class UserRoleController {

    @Autowired
    private UserRoleService service;

    @PostMapping
    public UserRole assign(@RequestBody UserRole userRole) {
        return service.assignRole(userRole);
    }

    @GetMapping("/{id}")
    public UserRole getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<UserRole> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.remove(id);
    }
}
