package com.annsl.service;

import com.annsl.domain.TakeApartActivity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface TakeApartActivityService {
    /**
     * 添加一条人员参加活动信息
     * @param taa
     * @return
     */
    int add(TakeApartActivity taa);

    /**
     * 根据id删除一条人员参与活动信息
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 根据id获取一条人员参加活动信息
     * @param id
     * @return
     */
    TakeApartActivity getById(Integer id);

    /**
     * 获取人员参与活动全部信息
     * @return
     */
    List<TakeApartActivity> getAll();

    /**
     * 根据id更新人员参加活动信息
     * @param taa
     * @return
     */
    int update(TakeApartActivity taa);
}
