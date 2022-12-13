package com.annsl.service;

import com.annsl.domain.VoluntaryActivity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface VoluntaryActivityService {
    /**
     * 添加一条志愿活动信息
     * @param va
     * @return
     */
    int add(VoluntaryActivity va);

    /**
     * 根据id删除一条志愿活动信息
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 根据id获取志愿活动信息
     * @param id
     * @return
     */
    VoluntaryActivity getById(Integer id);

    /**
     * 获取所有志愿活动信息
     * @return
     */
    List<VoluntaryActivity> getAll();

    /**
     * 根据id更新志愿活动信息
     * @param va
     * @return
     */
    int update(VoluntaryActivity va);
}
