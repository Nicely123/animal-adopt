package com.annsl.service;

import com.annsl.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface UserService {
    /**
     * 获取所有用户信息
     * @return
     */
    List<User> getAll();

    /**
     * 根据id获取一条用户信息
     * @param id
     * @return
     */
    User getById(Integer id);

    /**
     * 添加一条用户信息
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 根据id删除用户信息
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 根据id更新用户信息
     * @param user
     * @return
     */
    int update(User user);
}
