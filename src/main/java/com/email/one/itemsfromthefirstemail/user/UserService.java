package com.email.one.itemsfromthefirstemail.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    //Find all Users
    public Iterable<User> findAll() {return repo.findAll(); }

    //Save a single user
    public User save(User user){
        repo.save(user);
        return user;
    }

    //Find one single user
    public Optional<User> findOneSingleUser(int id){
        return repo.findById(id);
    }

    //Delete a single User
    public void delete(int id){
        repo.deleteById(id);
    }
}