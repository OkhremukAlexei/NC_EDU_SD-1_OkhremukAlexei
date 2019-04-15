package com.edu.controller;

import com.edu.entity.User;
import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(path="/add/")
    public @ResponseBody
    String addNewUser (@RequestParam String name, @RequestParam String role, @RequestParam String password) {
        User user = new User();
        user.setUserName(name);
        user.setPassword(password);
        user.setRole(role);
        userService.save(user);
        return "Saved";
    }

    @GetMapping(path = "/all/")
    public @ResponseBody
    Iterable getAllUsers() {
        return userService.findAll();
    }

    @GetMapping(path = "/getById/")
    public @ResponseBody
    Optional<User> getUserById(@RequestParam  int id){
        return userService.findById(id);
    }

    @GetMapping(path="/getByRole/")
    public @ResponseBody
    List<User> getByRole(@RequestParam String role){
        return userService.findUsersByRole(role);
    }

    @DeleteMapping(path = "/delete/")
    public @ResponseBody
    void deleteById(@RequestParam int idUser){
        userService.delete(idUser);
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}
