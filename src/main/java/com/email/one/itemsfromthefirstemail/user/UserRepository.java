package com.email.one.itemsfromthefirstemail.user;

import org.springframework.data.repository.CrudRepository;
import com.email.one.itemsfromthefirstemail.user.User;

public interface UserRepository extends CrudRepository<User, Integer>{
}
