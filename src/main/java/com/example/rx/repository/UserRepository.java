package com.example.rx.repository;

import com.example.rx.entity.User;
import org.neo4j.springframework.data.repository.ReactiveNeo4jRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveNeo4jRepository<User, Long> {
    Mono<User> findByName(String name);
}
