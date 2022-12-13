package com.annsl.service.impl;

import com.annsl.dao.DonateDao;
import com.annsl.domain.Donate;
import com.annsl.service.DonateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonateServiceImpl implements DonateService {
    @Autowired
    private DonateDao donateDao;
    @Override
    public int addDonate(Donate donate) {
        return donateDao.addDonate(donate);
    }

    @Override
    public int deleteById(Integer id) {
        return donateDao.deleteById(id);
    }

    @Override
    public Donate getById(Integer id) {
        return donateDao.getById(id);
    }

    @Override
    public List<Donate> getAll() {
        return donateDao.getAll();
    }

    @Override
    public int update(Donate donate) {
        return donateDao.update(donate);
    }
}
