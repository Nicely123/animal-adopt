package com.annsl.service.impl;

import com.annsl.dao.DenoteDao;
import com.annsl.domain.Denote;
import com.annsl.service.DenoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DenoteServiceImpl implements DenoteService {
    @Autowired
    private DenoteDao denoteDao;
    @Override
    public int addDenote(Denote denote) {
        return denoteDao.addDenote(denote);
    }

    @Override
    public int deleteById(Integer id) {
        return denoteDao.deleteById(id);
    }

    @Override
    public Denote getById(Integer id) {
        return denoteDao.getById(id);
    }

    @Override
    public List<Denote> getAll() {
        return denoteDao.getAll();
    }

    @Override
    public int update(Denote denote) {
        return denoteDao.update(denote);
    }
}
