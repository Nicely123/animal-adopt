package com.annsl.service;

import com.annsl.domain.TakeApartActivity;

import java.util.List;

public interface TakeApartActivityService {
    int add(TakeApartActivity taa);
    int deleteById(Integer id);
    TakeApartActivity getById(Integer id);
    List<TakeApartActivity> getAll();
    int update(TakeApartActivity taa);
}
