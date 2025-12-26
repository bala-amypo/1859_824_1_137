package com.example.demo.service.impl;

import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepo;

    @Override
    public Role getRoleById(Long roleId) {
        // Fetch Role as Optional
        Optional<Role> roleOptional = roleRepo.findById(roleId);

        // Handle the optional properly
        return roleOptional.orElseThrow(() -> new RuntimeException("Role not found"));
    }

    @Override
    public void deleteRole(Long roleId) {
        Optional<Role> roleOptional = roleRepo.findById(roleId);

        roleOptional.ifPresentOrElse(
                role -> roleRepo.delete(role),
                () -> { throw new RuntimeException("Role not found"); }
        );
    }
}
