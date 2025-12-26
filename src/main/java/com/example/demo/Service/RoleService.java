package com.example.demo.service;

import com.example.demo.entity.Role;
import java.util.List;

public interface RoleService {

    Role getRoleById(Long roleId);

    void deleteRole(Long roleId);

    void deactivateRole(Long roleId);

    Role createRole(Role role);               // Add this
    Role updateRole(Long roleId, Role role);  // Add this
    List<Role> getAllRoles();                 // Add this
}
