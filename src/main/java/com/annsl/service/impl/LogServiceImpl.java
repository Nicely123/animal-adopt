package com.annsl.service.impl;

import com.annsl.domain.Log;
import com.annsl.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogService logService;
    @Override
    public int addLog(Log log) {
        return logService.addLog(log);
    }

    @Override
    public int deleteById(Integer id) {
        return logService.deleteById(id);
    }

    @Override
    public Log getById(Integer id) {
        return logService.getById(id);
    }

    @Override
    public List<Log> getAll() {
        return logService.getAll();
    }

    @Override
    public int update(Log log) {
        return logService.update(log);
    }
}
