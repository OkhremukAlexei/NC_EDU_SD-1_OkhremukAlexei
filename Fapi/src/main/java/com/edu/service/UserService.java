package com.edu.service;

import com.edu.models.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findUserByLogin(String login);
    User save(User user);
    void delete(int idUser);
}
