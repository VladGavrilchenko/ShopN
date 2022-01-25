package com.example.Shop.Repository;


import com.example.Shop.User;
import com.example.Shop.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    List<User> findUserByRoles(Role role);
    User findUserById(Long id);
}
