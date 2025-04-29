package com.example.demoproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // Save method is predefine method in Mongo Repository
    // with this method we will save user in our database
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // findAll method is predefine method in Mongo Repository
    // with this method we will all user that is save in our database
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

}
