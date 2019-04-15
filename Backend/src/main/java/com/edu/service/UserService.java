package com.edu.service;

import com.edu.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Iterable<User> findAll();
    Optional<User> findById(int idUser);
    User save(User user);
    List<User> findUsersByRole(String userRole);
    void delete(int idUser);
}
