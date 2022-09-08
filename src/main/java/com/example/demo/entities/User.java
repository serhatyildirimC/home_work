package com.example.demo.entities;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String surName;
    private String eMail;
    private String phoneNumber;

    User() {}
    public User(String name, String surName,String eMail,String phoneNumber) {
        this.name = name;
        this.surName = surName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }
}
