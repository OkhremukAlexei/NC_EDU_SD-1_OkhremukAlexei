package com.edu.service.Impl;

import com.edu.entity.User;

import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import com.edu.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository users;

    @Override
    public List<User> findAll() {
        return (List<User>) users.findAll();
    }

    @Override
    public Optional<User> findById(int id) {
        return users.findById(id);
    }

    @Override
    public User save(User user) {
        return users.save(user);
    }
    @Override
    public List<User> findUsersByRole(String userRole){
        return  users.findUsersByRole(userRole);
    }

    @Override
    public void delete(int idUser) {
        users.deleteById(idUser);
    }

}
