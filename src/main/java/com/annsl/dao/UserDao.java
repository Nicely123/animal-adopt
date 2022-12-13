package com.annsl.dao;

import com.annsl.domain.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User getById(Integer id);
    int add(User user);
    int deleteById(Integer id);
    int update(User user);
}
