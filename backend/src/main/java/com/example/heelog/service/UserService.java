package com.example.heelog.service;

import com.example.heelog.entity.User;
import com.example.heelog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User getUserInfo(String id) {
        return userRepository.findUserById(id);
    }


}
