package com.ninos.service.impl;

import com.ninos.dao.UserRepository;
import com.ninos.model.User;
import com.ninos.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void save(User user) {
      userRepository.save(user);
    }


    @Override
    public User findByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public boolean checkUserExists(String username, String email) {
        if (checkUsernameExists(username) || checkEmailExists(email)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean checkUsernameExists(String username) {
        if(null != findByUsername(username)){
            return true;
        }
        return false;
    }

    @Override
    public boolean checkEmailExists(String email) {
        if (null != findByEmail(email)){
            return true;
        }
        return false;
    }


}
