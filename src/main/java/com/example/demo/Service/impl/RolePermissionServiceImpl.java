package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.RolePermission;
import com.example.demo.repository.RolePermissionRepository;
import com.example.demo.service.RolePermissionService;

@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    private RolePermissionRepository repository;

    public RolePermission assign(RolePermission rp) {
        return repository.save(rp);
    }
}
