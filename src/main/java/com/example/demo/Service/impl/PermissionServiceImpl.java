package com.example.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Permission;
import com.example.demo.repository.PermissionRepository;
import com.example.demo.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionRepository repository;

    public Permission create(Permission permission) {
        return repository.save(permission);
    }

    public Permission update(Long id, Permission permission) {
        Permission existing = repository.findById(id).orElse(null);
        if (existing == null) return null;

        existing.setName(permission.getName());
        existing.setDescription(permission.getDescription());
        return repository.save(existing);
    }

    public Permission getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Permission> getAll() {
        return repository.findAll();
    }

    public Permission deactivate(Long id) {
        Permission p = repository.findById(id).orElse(null);
        if (p == null) return null;

        p.setActive(false);
        return repository.save(p);
    }
}
