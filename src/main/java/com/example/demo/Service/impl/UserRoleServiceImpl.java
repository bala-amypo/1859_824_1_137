package com.example.demo.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserRole;
import com.example.demo.repository.UserRoleRepository;
import com.example.demo.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository repository;

    @Override
    public UserRole assignRole(UserRole userRole) {
        return repository.save(userRole);
    }

    @Override
    public UserRole getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<UserRole> getAll() {
        return repository.findAll();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }
}
