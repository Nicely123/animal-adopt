package com.annsl.dao;

import com.annsl.domain.TakeApartActivity;

import java.util.List;

public interface TakeApartActivityDao {
    int add(TakeApartActivity taa);
    int deleteById(Integer id);
    TakeApartActivity getById(Integer id);
    List<TakeApartActivity> getAll();
    int update(TakeApartActivity taa);
}
