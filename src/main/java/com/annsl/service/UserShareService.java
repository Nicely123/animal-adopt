package com.annsl.service;

import com.annsl.domain.UserShare;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface UserShareService {
    /**
     * 添加一条用户捐赠信息
     * @param userShare
     * @return
     */
    int add(UserShare userShare);

    /**
     * 根据id删除用户捐赠信息
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 根据id获取用户捐赠信息
     * @param id
     * @return
     */
    UserShare getById(Integer id);

    /**
     * 获取所有捐赠信息
     * @return
     */
    List<UserShare> getAll();

    /**
     * 根据id更新用户捐赠信息
     * @param userShare
     * @return
     */
    int update(UserShare userShare);
}
