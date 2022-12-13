package com.annsl.service;

import com.annsl.domain.Donate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface DonateService {
    /**
     * 添加一条捐赠物品信息
     * @param donate
     * @return
     */
    int addDonate(Donate donate);

    /**
     * 根据id删除一条捐赠物品信息
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 根据id获取一条捐赠物品信息
     * @param id
     * @return
     */
    Donate getById(Integer id);

    /**
     * 获取全部捐赠物品信息
     * @return
     */
    List<Donate> getAll();

    /**
     * 根据id更新捐赠物品信息
     * @param donate
     * @return
     */
    int update(Donate donate);
}
