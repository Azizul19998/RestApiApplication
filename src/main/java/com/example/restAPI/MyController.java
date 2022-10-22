package com.example.restAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Component
@RestController
public class MyController {
    // to keep list of the all the API's-- its like a folder/class

    HashMap<Integer,User> users= new HashMap<>();



    @GetMapping("/get_users")
    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        for(User u : users.values()) list.add(u);
        return list;
    }

    @GetMapping("/get_user")
    public User getUser(@RequestParam("id") int id) {
        return users.get(id);
    }

    @PostMapping("/add_user")
    public void addUser( @RequestParam("id") int id,
                         @RequestParam("name") String name,
                         @RequestParam("country") String country,
                         @RequestParam("age") int age)
    {
        User u = new User(id,name,country,age);
        users.put(id,u);
    }
    @PostMapping("/add_user_body")
    public void addUserBody( @RequestBody User user ) {
        users.put(user.getId(), user);
    }
    @DeleteMapping("/delete_user/{id}")
    public void deleteUser(@PathVariable("id") int id) {
        users.remove(id);
    }

    @Autowired
    User obj;
    @GetMapping("/myController")
    public User getUserByAutowired() {
        return obj;
    }
    @PostMapping("/otherController")
    public void function() {
        obj.setAge(100);
        obj.setName("BABU");
        obj.setCountry("Australia");

    }
}
