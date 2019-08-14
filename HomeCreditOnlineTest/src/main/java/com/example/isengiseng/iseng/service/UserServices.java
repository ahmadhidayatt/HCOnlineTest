package com.example.isengiseng.iseng.service;

import com.example.isengiseng.iseng.model.Role;
import com.example.isengiseng.iseng.model.User;

import java.util.List;

public interface UserServices {
    List<User> index(String key);

    User get(String id);

    String delete(String id);

    List<Role> role(String key);
}
