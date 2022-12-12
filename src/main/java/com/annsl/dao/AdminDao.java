package com.annsl.dao;


import com.annsl.domain.Admin;

import java.util.List;

public interface AdminDao {
   // @Select("select * from admin")
    List<Admin> getAll();
    Admin getById(Integer id);
    int addAdmin(Admin admin);
    int deleteById(Integer id);
    int update(Admin admin);

}
