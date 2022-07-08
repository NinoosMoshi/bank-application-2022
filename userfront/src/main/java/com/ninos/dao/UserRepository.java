package com.ninos.dao;

import com.ninos.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findUserByUsername(String username);
    User findUserByEmail(String email);

}
