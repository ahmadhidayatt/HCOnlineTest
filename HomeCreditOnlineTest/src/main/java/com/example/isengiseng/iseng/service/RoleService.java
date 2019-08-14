package com.example.isengiseng.iseng.service;

import com.example.isengiseng.iseng.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRole();
    List<Role> getAllRolebyuser(String key);

}
