package com.example.rx.service.impl;

import com.example.rx.entity.User;
import com.example.rx.repository.UserRepository;
import com.example.rx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Mono<User> findUserByName(String name) {
        return userRepository.findByName(name);
    }
}
