package com.example.demo.controller;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

//    @GetMapping
//    public List<User> listUsers() {
//        List<User> users = userService.getAllUsers();
//        System.out.println(users); 
//        return users;
//    }
//    @GetMapping
//    public List<User> listUsers() {
//        List<User> users = userService.getAllUsers();
//        System.out.println(users); // Debug the fetched users
//        return users; // Return the fetched users
//    }

    @GetMapping
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }


//    @GetMapping("/new")
//    public ResponseEntity<User> createUserForm() {
//        return ResponseEntity.ok(new User());
//    }


    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        try {
            userService.saveUser(user);
            return ResponseEntity.status(HttpStatus.CREATED).body("User saved successfully");
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
    }

  

}
