package com.annsl.service.impl;

import com.annsl.dao.UserShareDao;
import com.annsl.domain.UserShare;
import com.annsl.service.UserShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserShareServiceImpl implements UserShareService {
    @Autowired
    private UserShareDao userShareDao;
    @Override
    public int add(UserShare userShare) {
        return userShareDao.add(userShare);
    }

    @Override
    public int deleteById(Integer id) {
        return userShareDao.deleteById(id);
    }

    @Override
    public UserShare getById(Integer id) {
        return userShareDao.getById(id);
    }

    @Override
    public List<UserShare> getAll() {
        return userShareDao.getAll();
    }

    @Override
    public int update(UserShare userShare) {
        return userShareDao.update(userShare);
    }
}
