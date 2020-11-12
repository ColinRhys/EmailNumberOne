package com.email.one.itemsfromthefirstemail.user;

import com.email.one.itemsfromthefirstemail.user.User;
import com.email.one.itemsfromthefirstemail.user.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {
    @Autowired
    private UserDaoService service;

    //GET all users
    @GetMapping("/users")
    public List<User> retrieveAllUsers() {return service.findAll();}

    //GET single User
    @GetMapping("/users/{id}")
    public User retrieveSingleUser(@PathVariable int id){
        User user = service.findOneSingleUser(id);
        if(user==null){
            //throw error here
        }
        return user;
    }

    //DELETE single User
    @DeleteMapping("/users/{id}")
    public User deleteSingleUser(@PathVariable int id){
        User user = service.deleteById(id);
        if(user==null){
            //throw error here
        }
        return user;
    }

    //Create single User
    @PostMapping("/users")
    public void createSingleUser(@RequestBody User user){
        User savedUser = service.save(user);
    }

}
