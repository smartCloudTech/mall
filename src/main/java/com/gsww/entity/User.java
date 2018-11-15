package com.gsww.entity;


import com.gsww.validation.ValidateGroup1;
import com.gsww.validation.ValidateGroup2;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Size(min=1,max = 10,message = "{user.name.error}",groups = {ValidateGroup1.class})
    private String name;
    @Size(min = 3,max = 8,message = "{user.password.error}",groups = {ValidateGroup2.class})
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}