package com.annsl.service.impl;

import com.annsl.domain.UserShare;
import com.annsl.service.UserShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserShareServiceImpl implements UserShareService {
    @Autowired
    private UserShareService userShareService;
    @Override
    public int add(UserShare userShare) {
        return userShareService.add(userShare);
    }

    @Override
    public int deleteById(Integer id) {
        return userShareService.deleteById(id);
    }

    @Override
    public UserShare getById(Integer id) {
        return userShareService.getById(id);
    }

    @Override
    public List<UserShare> getAll() {
        return userShareService.getAll();
    }

    @Override
    public int update(UserShare userShare) {
        return userShareService.update(userShare);
    }
}
