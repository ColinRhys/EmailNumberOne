package com.email.one.itemsfromthefirstemail.user;

import com.email.one.itemsfromthefirstemail.user.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    //some test users
    static {
        users.add(new User(1, "Lance", 47));
        users.add(new User(2, "Howard", 37));
        users.add(new User(3, "Jimmy", 27));
    }

    //Find all Users
    public List<User> findAll() {return users; }

    //Save a single user
    public User save(User user){
        if(user.getId()==null){
            if(user.getId()==null){
                user.setId(++userCount);
            }
        }
        users.add(user);
        return user;
    }

    //Find one single user
    public User findOneSingleUser(int id){
        for(User user:users){
            if(user.getId()==id){
                return user;
            }
        }
        return null;
    }

    //Delete a single User
    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();
        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }
        return null;
    }

}
