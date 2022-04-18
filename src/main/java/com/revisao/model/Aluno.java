package com.revisao.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter @Setter
@AllArgsConstructor
public class Aluno {
    private UUID id;
    private String name;
    private Integer age;
    private String year;
    private Float grade;

    public Aluno(UUID id, String name, Integer age, String year) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.year = year;
    }
}
