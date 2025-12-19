package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.RolePermission;
import com.example.demo.service.RolePermissionService;

@RestController
@RequestMapping("/api/role-permissions")
public class RolePermissionController {

    @Autowired
    private RolePermissionService service;

    @PostMapping
    public RolePermission assign(@RequestBody RolePermission rp) {
        return service.assign(rp);
    }
}
