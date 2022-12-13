package com.annsl.service.impl;

import com.annsl.dao.VoluntaryActivityDao;
import com.annsl.domain.VoluntaryActivity;
import com.annsl.service.VoluntaryActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoluntaryActivityServiceImpl implements VoluntaryActivityService {
    @Autowired
    private VoluntaryActivityDao activityDao;
    @Override
    public int add(VoluntaryActivity va) {
        return activityDao.add(va);
    }

    @Override
    public int deleteById(Integer id) {
        return activityDao.deleteById(id);
    }

    @Override
    public VoluntaryActivity getById(Integer id) {
        return activityDao.getById(id);
    }

    @Override
    public List<VoluntaryActivity> getAll() {
        return activityDao.getAll();
    }

    @Override
    public int update(VoluntaryActivity va) {
        return activityDao.update(va);
    }
}
