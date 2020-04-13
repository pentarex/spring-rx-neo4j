package com.example.rx.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.neo4j.springframework.data.core.schema.GeneratedValue;
import org.neo4j.springframework.data.core.schema.Id;
import org.neo4j.springframework.data.core.schema.Node;

@Node
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id @GeneratedValue
    private int id;

    private String name;
}
