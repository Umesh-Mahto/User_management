package com.geekster.User.Management.System.controller;

import com.geekster.User.Management.System.model.User;
import com.geekster.User.Management.System.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    UserService service;
    @PostMapping("/addUser")
    public String addUser(@Valid @RequestBody User user){
        return service.addUsers(user);
    }
    @GetMapping("getAllUser")
    public Iterable<User>getAllUser(){
        return service.getAllUser();
    }
    @GetMapping("/{userId}")
    public Optional<User>getUserById(@PathVariable Long userId){
        return service.getUserById(userId);
    }

    @PutMapping("updateUser")

    public String updateUser(@RequestBody User user){
        return service.updateUser(user);
    }
    @DeleteMapping("/{userId}")
    public String deleteById(@PathVariable Long userId){
        return service.deleteById(userId);
    }
}
