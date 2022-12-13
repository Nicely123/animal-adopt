package com.annsl.dao;

import com.annsl.domain.Donate;

import java.util.List;

public interface DonateDao {
    int addDonate(Donate donate);
    int deleteById(Integer id);
    Donate getById(Integer id);
    List<Donate> getAll();
    int update(Donate donate);
}
