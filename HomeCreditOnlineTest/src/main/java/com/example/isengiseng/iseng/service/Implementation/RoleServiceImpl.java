package com.example.isengiseng.iseng.service.Implementation;

import com.example.isengiseng.iseng.model.Role;
import com.example.isengiseng.iseng.repository.RoleRepository;
import com.example.isengiseng.iseng.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;



    @Override
    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public List<Role> getAllRolebyuser(String key) {
        return roleRepository.findAllByUser(key);
    }
}
