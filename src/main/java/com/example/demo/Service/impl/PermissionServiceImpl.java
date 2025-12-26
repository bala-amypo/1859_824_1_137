package com.example.demo.service.impl;

import com.example.demo.entity.Permission;
import com.example.demo.exception.*;
import com.example.demo.repository.PermissionRepository;
import com.example.demo.service.PermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    private final PermissionRepository permissionRepo;

    public PermissionServiceImpl(PermissionRepository permissionRepo) {
        this.permissionRepo = permissionRepo;
    }

    @Override
    public Permission createPermission(Permission permission) {
        permissionRepo.findByPermissionKey(permission.getPermissionKey())
                .ifPresent(p -> { throw new BadRequestException("Permission already exists"); });
        return permissionRepo.save(permission);
    }

    @Override
    public Permission updatePermission(Long id, Permission updated) {
        Permission permission = getPermissionById(id);
        permission.setPermissionKey(updated.getPermissionKey());
        permission.setDescription(updated.getDescription());
        permission.setActive(updated.getActive());
        return permissionRepo.save(permission);
    }

    @Override
    public Permission getPermissionById(Long id) {
        return permissionRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Permission not found"));
    }

    @Override
    public List<Permission> getAllPermissions() {
        return permissionRepo.findAll();
    }

    @Override
    public void deactivatePermission(Long id) {
        Permission permission = getPermissionById(id);
        permission.setActive(false);
        permissionRepo.save(permission);
    }
}
