package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.UserRole;

public interface UserRoleService {

    UserRole assignRole(UserRole userRole);

    UserRole getById(Long id);

    List<UserRole> getAll();

    void remove(Long id);
}
