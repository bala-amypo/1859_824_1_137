package com.example.demo.service.impl;

import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepo;

    @Override
    public Role getRoleById(Long roleId) {
        return roleRepo.findById(roleId)
                .orElseThrow(() -> new RuntimeException("Role not found"));
    }

    @Override
    public void deleteRole(Long roleId) {
        roleRepo.findById(roleId).ifPresentOrElse(
                role -> roleRepo.delete(role),
                () -> { throw new RuntimeException("Role not found"); }
        );
    }

    @Override
    public void deactivateRole(Long roleId) {
        roleRepo.findById(roleId).ifPresentOrElse(
                role -> {
                    role.setActive(false); // assuming Role has active field
                    roleRepo.save(role);
                },
                () -> { throw new RuntimeException("Role not found"); }
        );
    }

    @Override
    public Role createRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public Role updateRole(Long roleId, Role roleDetails) {
        Role role = roleRepo.findById(roleId)
                .orElseThrow(() -> new RuntimeException("Role not found"));
        role.setName(roleDetails.getName());
        role.setActive(roleDetails.isActive());
        return roleRepo.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepo.findAll();
    }
}
