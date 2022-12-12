package com.annsl.service;

import com.annsl.domain.Admin;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface AdminService {
    /**
     * 查询所有管理员信息
     * @return
     */
    List<Admin> getAll();
    /**
     * 按id查询管理员信息
     * @param id
     * @return
     */
    Admin getById(Integer id);

    /***
     * 添加管理员信息
     * @param admin
     * @return
     */
    int addAdmin(Admin admin);

    /***
     * 更新管理员信息
     * @param admin
     * @return
     */
    int update(Admin admin);

    /***
     * 根据id删除管理员信息
     * @param id
     * @return
     */
    int deleteById(Integer id);
}
