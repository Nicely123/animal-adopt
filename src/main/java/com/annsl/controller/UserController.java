package com.annsl.controller;

import com.annsl.domain.User;
import com.annsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public boolean add(@RequestBody User user){
        return userService.add(user)>0;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return userService.deleteById(id)>0;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Integer id){
        return userService.getById(id);
    }

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @PutMapping
    public boolean update(User user){
        return userService.update(user)>0;
    }
}
