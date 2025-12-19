package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Permission;
import com.example.demo.service.PermissionService;

@RestController
@RequestMapping("/api/permissions")
public class PermissionController {

    @Autowired
    private PermissionService service;

    @PostMapping
    public Permission create(@RequestBody Permission permission) {
        return service.create(permission);
    }

    @PutMapping("/{id}")
    public Permission update(@PathVariable Long id, @RequestBody Permission permission) {
        return service.update(id, permission);
    }

    @GetMapping("/{id}")
    public Permission getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<Permission> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}/deactivate")
    public Permission deactivate(@PathVariable Long id) {
        return service.deactivate(id);
    }
}
