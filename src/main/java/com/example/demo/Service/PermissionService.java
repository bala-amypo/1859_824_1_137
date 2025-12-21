package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Permission;

public interface PermissionService {

    Permission create(Permission permission);

    Permission update(Long id, Permission permission);

    Permission getById(Long id);

    List<Permission> getAll();

    Permission deactivate(Long id);
}
