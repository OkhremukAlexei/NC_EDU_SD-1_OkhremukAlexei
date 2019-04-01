package com.edu.service;

import com.edu.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import com.edu.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public ArrayList<User> findAll() {
        return (ArrayList<User>) repository.findAll();
    }

    @Override
    public Optional<User> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public void delete(User user) {
        repository.delete(user);
    }
}
