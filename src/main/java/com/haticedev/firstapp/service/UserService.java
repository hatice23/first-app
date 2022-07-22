package com.haticedev.firstapp.service;

import com.haticedev.firstapp.model.User;
import com.haticedev.firstapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
//        var userList = userRepository.findAll();
//        for (User user : userList) {
//            user.setActivated(true);
//            user.setUsername(user.getUsername() + "asdasd");
//        }
        return userRepository.findAll();
    }


    public User getByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() -> new RuntimeException("user not found!"));
    }

    public void deleteByID(Long id){
        userRepository.deleteById(id);

    }
    public User updateUser(User user){
        User existing = getByUsername(user.getUsername());
        existing.setName(user.getName());
        existing.setAge(user.getAge());
        return userRepository.save(existing);
    }
    public User updateUser(User user,String name){
        User existing = getByUsername(name);
        existing.setName(user.getName());
        existing.setAge(user.getAge());
        return userRepository.save(existing);
    }
}
