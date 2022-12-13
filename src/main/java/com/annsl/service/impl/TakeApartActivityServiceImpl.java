package com.annsl.service.impl;

import com.annsl.dao.TakeApartActivityDao;
import com.annsl.domain.TakeApartActivity;
import com.annsl.service.TakeApartActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TakeApartActivityServiceImpl implements TakeApartActivityService {
    @Autowired
    private TakeApartActivityDao taaDao;
    @Override
    public int add(TakeApartActivity taa) {
        return taaDao.add(taa);
    }

    @Override
    public int deleteById(Integer id) {
        return taaDao.deleteById(id);
    }

    @Override
    public TakeApartActivity getById(Integer id) {
        return taaDao.getById(id);
    }

    @Override
    public List<TakeApartActivity> getAll() {
        return taaDao.getAll();
    }

    @Override
    public int update(TakeApartActivity taa) {
        return taaDao.update(taa);
    }
}
