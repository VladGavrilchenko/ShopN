package com.example.Shop.service;

import com.example.Shop.Repository.UserRepository;
import com.example.Shop.User;
import com.example.Shop.model.Role;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {


    private UserRepository userRepository;

    UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public User findUserByUsername(String username)
    {
        return  userRepository.findByUsername(username);
    }


    public List<User> findAllManager() {
        return  userRepository.findUserByRoles(Role.MANAGER);
    }
    public void addUser(User user)
    {
        user.setRoles(Collections.singleton(Role.USER));
        userRepository.save(user);
    }

    public  void addManager(User user)
    {
        user.setRoles(Collections.singleton(Role.MANAGER));
        userRepository.save(user);
    }

    public  List<User> findAll()
    {
        return  userRepository.findAll();
    }

    public User findById(Long id)
    {

        return    userRepository.findUserById(id);
    }

    public void delete(User user)
    {
        userRepository.delete(user);
    }
    public void save(User user){
        userRepository.save(user);
    }






}
