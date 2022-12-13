package com.annsl.service;

import com.annsl.domain.Denote;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface DenoteService {
    /**
     * 添加一条捐赠物品信息
     * @param denote
     * @return
     */
    int addDenote(Denote denote);

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
    Denote getById(Integer id);

    /**
     * 获取全部捐赠物品信息
     * @return
     */
    List<Denote> getAll();

    /**
     * 根据id更新捐赠物品信息
     * @param denote
     * @return
     */
    int update(Denote denote);
}
