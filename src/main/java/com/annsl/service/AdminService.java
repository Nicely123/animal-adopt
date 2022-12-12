package com.annsl.service;

import com.annsl.domain.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AdminService {
    /**
     * 按id查询
     * @return
     */
    public List<Admin> getAll();
    /**
     * 按id查询
     * @param id
     * @return
     */
    public Admin getById(Integer id);
}
