package com.annsl.dao;

import com.annsl.domain.Log;

import java.util.List;

public interface LogDao {
    int addLog(Log log);
    int deleteById(Integer id);
    Log getById(Integer id);
    List<Log> getAll();
    int update(Log log);
}
