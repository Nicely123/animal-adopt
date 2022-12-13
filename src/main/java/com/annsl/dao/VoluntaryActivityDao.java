package com.annsl.dao;

import com.annsl.domain.VoluntaryActivity;

import java.util.List;

public interface VoluntaryActivityDao {
    int add(VoluntaryActivity va);
    int deleteById(Integer id);
    VoluntaryActivity getById(Integer id);
    List<VoluntaryActivity> getAll();
    int update(VoluntaryActivity va);
}
