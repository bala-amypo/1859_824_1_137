package com.example.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository repository;

    @Override
    public Role createRole(Role role) {
        if (repository.existsByRoleName(role.getRoleName())) {
            throw new RuntimeException("Role name already exists");
        }
        return repository.save(role);
    }

    @Override
    public Role updateRole(Long id, Role role) {
        Role existing = repository.findById(id).orElse(null);
        if (existing == null) {
            return null;
        }

        existing.setRoleName(role.getRoleName());
        existing.setDescription(role.getDescription());
        existing.setActive(role.getActive());

        return repository.save(existing);
    }

    @Override
    public Role getRoleById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Role> getAllRoles() {
        return repository.findAll();
    }

    @Override
    public Role deactivateRole(Long id) {
        Role role = repository.findById(id).orElse(null);
        if (role == null) {
            return null;
        }

        role.setActive(false);
        return repository.save(role);
    }
}
