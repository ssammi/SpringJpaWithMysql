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

    @GetMapping(value = "/{name}")
    public List<User> findUser(@PathVariable("name") final String name){
        return userRepository.findByName(name);
    }

    @PostMapping(value = "/add")
    public List<User> addUser(@RequestBody final User user){
        userRepository.save(user);
        return userRepository.findAll();
    }

    @GetMapping(value = "/id/{id}")
    public User getUserById(@PathVariable("id") final Long id){
        return userRepository.findOne(id);
    }

    @GetMapping(value = "update/{id}/{name}")
    public User updateUserName(@PathVariable("id") final Long id, @PathVariable("name") final String name){
        User userinfo = getUserById(id);
        userinfo.setName(name);

        return userRepository.save(userinfo);
    }
}
