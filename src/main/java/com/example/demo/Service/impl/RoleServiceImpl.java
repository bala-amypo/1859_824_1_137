package com.example.demo.service.impl;

import com.example.demo.entity.Role;
import com.example.demo.exception.*;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepo;

    public RoleServiceImpl(RoleRepository roleRepo) {
        this.roleRepo = roleRepo;
    }

    @Override
    public Role createRole(Role role) {
        roleRepo.findByRoleName(role.getRoleName())
                .ifPresent(r -> { throw new BadRequestException("Role already exists"); });
        return roleRepo.save(role);
    }

    @Override
    public Role updateRole(Long id, Role updated) {
        Role role = getRoleById(id);
        role.setRoleName(updated.getRoleName());
        role.setDescription(updated.getDescription());
        role.setActive(updated.getActive());
        return roleRepo.save(role);
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Role not found"));
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepo.findAll();
    }

    @Override
    public void deactivateRole(Long id) {
        Role role = getRoleById(id);
        role.setActive(false);
        roleRepo.save(role);
    }
}
