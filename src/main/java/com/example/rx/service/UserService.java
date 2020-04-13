package com.example.rx.service;

import com.example.rx.entity.User;
import reactor.core.publisher.Mono;

public interface UserService {

    Mono<User> findUserByName(String name);

}
