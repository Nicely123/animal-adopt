package com.annsl.service.impl;

import com.annsl.dao.LogDao;
import com.annsl.domain.Log;
import com.annsl.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;
    @Override
    public int addLog(Log log) {
        return logDao.addLog(log);
    }

    @Override
    public int deleteById(Integer id) {
        return logDao.deleteById(id);
    }

    @Override
    public Log getById(Integer id) {
        return logDao.getById(id);
    }

    @Override
    public List<Log> getAll() {
        return logDao.getAll();
    }

    @Override
    public int update(Log log) {
        return logDao.update(log);
    }
}
