package com.annsl.dao;

import com.annsl.domain.UserShare;

import java.util.List;

public interface UserShareDao {
    int add(UserShare userShare);
    int deleteById(Integer id);
    UserShare getById(Integer id);
    List<UserShare> getAll();
    int update(UserShare userShare);
}
