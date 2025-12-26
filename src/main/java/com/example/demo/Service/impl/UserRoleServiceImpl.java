package com.example.demo.service.impl;

import com.example.demo.entity.*;
import com.example.demo.exception.*;
import com.example.demo.repository.*;
import com.example.demo.service.UserRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    private final UserRoleRepository userRoleRepo;
    private final UserAccountRepository userRepo;
    private final RoleRepository roleRepo;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepo,
                               UserAccountRepository userRepo,
                               RoleRepository roleRepo) {
        this.userRoleRepo = userRoleRepo;
        this.userRepo = userRepo;
        this.roleRepo = roleRepo;
    }

    @Override
    public UserRole assignRole(UserRole mapping) {
        UserAccount user = userRepo.findById(mapping.getUser().getId())
                .orElseThrow(() -> new BadRequestException("User not found or inactive"));

        Role role = roleRepo.findById(mapping.getRole().getId())
                .orElseThrow(() -> new BadRequestException("Role not found or inactive"));

        if (!user.getActive() || !role.getActive()) {
            throw new BadRequestException("User or Role inactive");
        }

        mapping.setUser(user);
        mapping.setRole(role);
        return userRoleRepo.save(mapping);
    }

    @Override
    public List<UserRole> getRolesForUser(Long userId) {
        return userRoleRepo.findByUser_Id(userId);
    }

    @Override
    public UserRole getMappingById(Long id) {
        return userRoleRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mapping not found"));
    }

    @Override
    public void removeRole(Long mappingId) {
        UserRole ur = getMappingById(mappingId);
        userRoleRepo.delete(ur);
    }
}
