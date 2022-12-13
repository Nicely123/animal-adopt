package com.annsl.service;

import com.annsl.domain.Log;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface LogService {
    /**
     * 添加一条日志信息
     * @param log
     * @return
     */
    int addLog(Log log);

    /**
     * 根据id删除一条日志信息
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 根据id获取一条日志信息
     * @param id
     * @return
     */
    Log getById(Integer id);

    /**
     * 获取全部日志信息
     * @return
     */
    List<Log> getAll();

    /**
     * 根据id更新日志信息
     * @param log
     * @return
     */
    int update(Log log);
}
