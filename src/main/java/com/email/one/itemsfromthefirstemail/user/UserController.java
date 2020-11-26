package com.email.one.itemsfromthefirstemail.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserDaoService service;

    //GET all users
    @GetMapping("/users")
    public Iterable<User> retrieveAllUsers() {return service.findAll();}

    //GET single User
    @GetMapping("/users/{id}") //Needs to be fixed
    public Optional<User> retrieveSingleUser(@PathVariable int id){
        return service.findOneSingleUser(id);
    }

    //DELETE single User
    @DeleteMapping("/users/{id}") //Needs to be fixed
    public void deleteSingleUser(@PathVariable int id){
        service.delete(id);
    }

    //Create single User
    @PostMapping("/users")
    public User createSingleUser(@RequestBody User user){
        User savedUser = service.save(user);
        return user;
    }

}
