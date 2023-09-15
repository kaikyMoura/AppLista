package com.applistabackend.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Document(collection = "tb_tasklist")
public class Task {

    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    @Getter @Setter
    private String nome;

    public Task(Long id, String nome) {
        Id = id;
        this.nome = nome;
    }
}
