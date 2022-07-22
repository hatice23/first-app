package com.haticedev.firstapp.controller;

import com.haticedev.firstapp.model.User;
import com.haticedev.firstapp.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@Valid @RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable Long id) {
        userService.deleteByID(id);
    }

    @PutMapping
    public User updateUser(@Valid @RequestBody User user){
        return userService.updateUser(user);
    }
    @PutMapping("/{username}")
    public User updateUser(@Valid @RequestBody User user,@PathVariable String username) {
        return userService.updateUser(user,username);
    }

}
