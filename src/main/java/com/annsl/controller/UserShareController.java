package com.annsl.controller;

import com.annsl.domain.UserShare;
import com.annsl.service.UserShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-share")
public class UserShareController {
    @Autowired
    private UserShareService userShareService;

    @PostMapping
    public boolean add(@RequestBody UserShare userShare){
        return userShareService.add(userShare)>0;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return userShareService.deleteById(id)>0;
    }

    @GetMapping("/{id}")
    public UserShare getById(@PathVariable Integer id){
        return userShareService.getById(id);
    }

    @GetMapping
    public List<UserShare> getAll(){
        return userShareService.getAll();
    }

    @PutMapping
    public boolean update(UserShare userShare){
        return userShareService.update(userShare)>0;
    }
}
