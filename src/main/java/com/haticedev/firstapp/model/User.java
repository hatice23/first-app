package com.haticedev.firstapp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "`user`")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @NotNull
    private String name;

    @Max(22)
    @Min(18)
    private int age;


    private boolean activated;

    public User() {
    }

    public User(String username, String name, boolean activated,int age) {
        this.username = username;
        this.name = name;
        this.activated = activated;
        this.age=age;
    }
}
