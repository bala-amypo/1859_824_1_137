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

    // POST /api/permissions
    @PostMapping
    public Permission create(@RequestBody Permission permission) {
        return service.createPermission(permission);
    }

    // PUT /api/permissions/{id}
    @PutMapping("/{id}")
    public Permission update(@PathVariable Long id,
                             @RequestBody Permission permission) {
        return service.updatePermission(id, permission);
    }

    // GET /api/permissions/{id}
    @GetMapping("/{id}")
    public Permission getById(@PathVariable Long id) {
        return service.getPermissionById(id);
    }

    // GET /api/permissions
    @GetMapping
    public List<Permission> getAll() {
        return service.getAllPermissions();
    }

    // PUT /api/permissions/{id}/deactivate
    @PutMapping("/{id}/deactivate")
    public Permission deactivate(@PathVariable Long id) {
        return service.deactivatePermission(id);
    }
}
