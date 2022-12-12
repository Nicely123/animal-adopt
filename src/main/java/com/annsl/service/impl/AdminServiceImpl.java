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

    @Override
    public int addAdmin(Admin admin) {
        return adminDao.addAdmin(admin);
    }

    @Override
    public int update(Admin admin) {
        return adminDao.update(admin);
    }

    @Override
    public int deleteById(Integer id) {
        return adminDao.deleteById(id);
    }
}
