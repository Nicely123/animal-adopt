package com.annsl.service.impl;

import com.annsl.domain.TakeApartActivity;
import com.annsl.service.TakeApartActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TakeApartActivityServiceImpl implements TakeApartActivityService {
    @Autowired
    private TakeApartActivityService taaService;
    @Override
    public int add(TakeApartActivity taa) {
        return taaService.add(taa);
    }

    @Override
    public int deleteById(Integer id) {
        return taaService.deleteById(id);
    }

    @Override
    public TakeApartActivity getById(Integer id) {
        return taaService.getById(id);
    }

    @Override
    public List<TakeApartActivity> getAll() {
        return taaService.getAll();
    }

    @Override
    public int update(TakeApartActivity taa) {
        return taaService.update(taa);
    }
}
