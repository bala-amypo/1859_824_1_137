package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Role;
import com.example.demo.service.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService service;

    @PostMapping
    public Role create(@RequestBody Role role) {
        return service.createRole(role);
    }

    @GetMapping("/{id}")
    public Role getById(@PathVariable Long id) {
        return service.getRoleById(id);
    }

    @GetMapping
    public List<Role> getAll() {
        return service.getAllRoles();
    }

    @PutMapping("/{id}")
    public Role update(@PathVariable Long id,
                       @RequestBody Role role) {
        return service.updateRole(id, role);
    }

    @PutMapping("/{id}/deactivate")
    public Role deactivate(@PathVariable Long id) {
        return service.deactivateRole(id);
    }
}
`