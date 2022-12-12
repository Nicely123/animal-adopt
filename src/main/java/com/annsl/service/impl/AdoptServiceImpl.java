package com.annsl.service.impl;

import com.annsl.dao.AdoptDao;
import com.annsl.domain.Adopt;
import com.annsl.service.AdoptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdoptServiceImpl implements AdoptService {
    @Autowired
    private AdoptDao adoptDao;
    @Override
    public int addAdopt(Adopt adopt) {
        return adoptDao.addAdopt(adopt);
    }

    @Override
    public int deleteById(Integer id) {
        return adoptDao.deleteById(id);
    }

    @Override
    public Adopt getById(Integer id) {
        return adoptDao.getById(id);
    }

    @Override
    public List<Adopt> getAll() {
        return adoptDao.getAll();
    }

    @Override
    public int update(Adopt adopt) {
        return adoptDao.update(adopt);
    }
}
