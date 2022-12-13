package com.annsl.service.impl;

import com.annsl.dao.UserDao;
import com.annsl.domain.User;
import com.annsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public User getById(Integer id) {
        return userDao.getById(id);
    }

    @Override
    public int add(User user) {
        return userDao.add(user);
    }

    @Override
    public int deleteById(Integer id) {
        return userDao.deleteById(id);
    }

    @Override
    public int update(User user) {
        return userDao.update(user);
    }
}
