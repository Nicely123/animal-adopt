package com.annsl.dao;


import com.annsl.domain.Admin;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdminDao {
    @Select("select * from admin")
    public List<Admin> getAll();

    @Select("slect * from admin where id = #{id}")
    public Admin getById(Integer id);
}
