package com.edu.controller;

import com.edu.entity.User;
import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserService service;

    @GetMapping(path="/add")
    public @ResponseBody
    String addNewUser (@RequestParam String name, @RequestParam String role) {
        User user = new User();
        user.setUserName(name);
        user.setRole(role);
        service.save(user);
        return "Saved";
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return service.findAll();
    }
}
