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

    @Override
    public Permission createPermission(Permission permission) {
        return repository.save(permission);
    }

    @Override
    public Permission updatePermission(Long id, Permission permission) {
        Permission existing = repository.findById(id).orElse(null);
        if (existing == null) {
            return null;
        }
        existing.setPermissionName(permission.getPermissionName());
        existing.setDescription(permission.getDescription());
        return repository.save(existing);
    }

    @Override
    public Permission getPermissionById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Permission> getAllPermissions() {
        return repository.findAll();
    }

    @Override
    public Permission deactivatePermission(Long id) {
        Permission permission = repository.findById(id).orElse(null);
        if (permission == null) {
            return null;
        }
        permission.setActive(false);
        return repository.save(permission);
    }
}
