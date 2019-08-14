package com.example.isengiseng.iseng.service.Implementation;

import com.example.isengiseng.iseng.model.Role;
import com.example.isengiseng.iseng.model.User;
import com.example.isengiseng.iseng.repository.UserRepository;
import com.example.isengiseng.iseng.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> index(String key) {
        return userRepository.findAllByNameContaining(key);
    }

    @Override
    public User get(String id) {
        return userRepository.getOne(id);
    }


    @Override
    public String delete(String id) {
        return userRepository.getOne(id) == null ? "USER TIDAK ADA" : id + " BERHASIL DIHAPUS";
    }

    @Override
    public List<Role> role(String key) {
        return userRepository.findAllByRole(key);
    }
}
