package com.sam.db.springdb.controller;

import com.sam.db.springdb.repository.UserRepository;
import com.sam.db.springdb.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(value = "/all")
    public List<User> findall (){
        return userRepository.findAll();
    }

    @PostMapping(value = "/add")
    public List<User> addUser(@RequestBody final User user){
        userRepository.save(user);
        return userRepository.findAll();
    }
}
