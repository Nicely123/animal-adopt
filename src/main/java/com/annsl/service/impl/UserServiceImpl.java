package com.annsl.service.impl;

import com.annsl.domain.User;
import com.annsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserService userService;
    @Override
    public List<User> getAll() {
        return userService.getAll();
    }

    @Override
    public User getById(Integer id) {
        return userService.getById(id);
    }

    @Override
    public int add(User user) {
        return userService.add(user);
    }

    @Override
    public int deleteById(Integer id) {
        return userService.deleteById(id);
    }

    @Override
    public int update(User user) {
        return userService.update(user);
    }
}
