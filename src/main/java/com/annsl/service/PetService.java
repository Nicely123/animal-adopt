package com.annsl.service;

import com.annsl.domain.Pet;

import java.util.List;

public interface PetService {
    /**
     * 添加一条宠物信息
     * @param pet
     * @return
     */
    int addPet(Pet pet);

    /**
     * 根据id删除一条宠物信息
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 根据id获取一条宠物信息
     * @param id
     * @return
     */
    Pet getById(Integer id);

    /**
     * 获取全部宠物信息
     * @return
     */
    List<Pet> getAll();

    /**
     * 根据id更新宠物信息
     * @param pet
     * @return
     */
    int update(Pet pet);
}
