package com.instagrocer.tastyGreens.Entity;

import jakarta.persistence.Entity;

import java.util.Set;

@Entity
public class User {

    private Long id;
    private String userName;
    private String password;
    private Set<String> roles;
}
