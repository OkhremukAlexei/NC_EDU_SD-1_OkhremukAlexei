package com.edu.service;

import com.edu.entity.User;

import java.util.ArrayList;
import java.util.Optional;

public interface UserService {
    ArrayList<User> findAll();
    Optional<User> findById(int id);
    User save(User user);
    void delete(User user);
}
