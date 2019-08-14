package com.example.isengiseng.iseng.repository;

import com.example.isengiseng.iseng.model.Role;
import com.example.isengiseng.iseng.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAllByNameContaining(String key);
  List<Role> findAllByRole(String key);
}
