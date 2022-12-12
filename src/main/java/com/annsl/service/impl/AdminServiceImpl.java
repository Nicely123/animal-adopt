package com.annsl.service.impl;

import com.annsl.dao.AdminDao;
import com.annsl.domain.Admin;
import com.annsl.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;

    @Override
    public List<Admin> getAll() {
        return adminDao.getAll();
    }

    @Override
    public Admin getById(Integer id) {
        return adminDao.getById(id);
    }
}
