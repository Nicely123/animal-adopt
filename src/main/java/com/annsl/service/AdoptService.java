package com.annsl.service;

import com.annsl.dao.AdoptDao;
import com.annsl.domain.Adopt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface AdoptService {
    /***
     * 添加领养信息
     * @param adopt
     * @return
     */
    int addAdopt(Adopt adopt);

    /***
     * 根据id删除领养信息
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /***
     * 根据id查询领养信息
     * @param id
     * @return
     */
    Adopt getById(Integer id);

    /***
     * 查询所有领养信息
     * @return
     */
    List<Adopt> getAll();

    /***
     * 根据id更新领养信息
     * @param adopt
     * @return
     */
    int update(Adopt adopt);
}
