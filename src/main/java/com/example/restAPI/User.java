package com.example.restAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
    int id;
    String name;
    String country;
    int age;

    public User() {
        System.out.println("user class default constructor called");
    }

    public User(int id, String name, String country, int age) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.age = age;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Autowired
//    MyController object;
//    @Autowired
//    User userobj;
}