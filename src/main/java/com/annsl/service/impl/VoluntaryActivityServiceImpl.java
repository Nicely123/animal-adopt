package com.annsl.service.impl;

import com.annsl.domain.VoluntaryActivity;
import com.annsl.service.VoluntaryActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VoluntaryActivityServiceImpl implements VoluntaryActivityService {
    @Autowired
    private VoluntaryActivityService vaService;
    @Override
    public int add(VoluntaryActivity va) {
        return vaService.add(va);
    }

    @Override
    public int deleteById(Integer id) {
        return vaService.deleteById(id);
    }

    @Override
    public VoluntaryActivity getById(Integer id) {
        return vaService.getById(id);
    }

    @Override
    public List<VoluntaryActivity> getAll() {
        return vaService.getAll();
    }

    @Override
    public int update(VoluntaryActivity va) {
        return vaService.update(va);
    }
}
