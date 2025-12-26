package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.*;
import com.example.demo.repository.*;
import com.example.demo.service.RolePermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePermissionServiceImpl implements RolePermissionService {

    private final RolePermissionRepository rolePermissionRepo;
    private final RoleRepository roleRepo;
    private final PermissionRepository permissionRepo;

    public RolePermissionServiceImpl(RolePermissionRepository rolePermissionRepo,
                                     RoleRepository roleRepo,
                                     PermissionRepository permissionRepo) {
        this.rolePermissionRepo = rolePermissionRepo;
        this.roleRepo = roleRepo;
        this.permissionRepo = permissionRepo;
    }

    @Override
    public RolePermission grantPermission(RolePermission mapping) {
        Role role = roleRepo.findById(mapping.getRole().getId())
                .orElseThrow(() -> new BadRequestException("Role not found or inactive"));

        Permission permission = permissionRepo.findById(mapping.getPermission().getId())
                .orElseThrow(() -> new BadRequestException("Permission not found or inactive"));

        if (!role.getActive() || !permission.getActive()) {
            throw new BadRequestException("Role or Permission inactive");
        }

        mapping.setRole(role);
        mapping.setPermission(permission);
        return rolePermissionRepo.save(mapping);
    }

    @Override
    public List<RolePermission> getPermissionsForRole(Long roleId) {
        return rolePermissionRepo.findByRole_Id(roleId);
    }

    @Override
    public RolePermission getMappingById(Long id) {
        return rolePermissionRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mapping not found"));
    }

    @Override
    public void revokePermission(Long mappingId) {
        RolePermission rp = getMappingById(mappingId);
        rolePermissionRepo.delete(rp);
    }
}
