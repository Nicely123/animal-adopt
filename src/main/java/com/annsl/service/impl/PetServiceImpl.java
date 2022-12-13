package com.annsl.service.impl;

import com.annsl.dao.PetDao;
import com.annsl.domain.Pet;
import com.annsl.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PetServiceImpl implements PetService {
    @Autowired
    private PetDao petDao;
    @Override
    public int addPet(Pet pet) {
        return petDao.addPet(pet);
    }

    @Override
    public int deleteById(Integer id) {
        return petDao.deleteById(id);
    }

    @Override
    public Pet getById(Integer id) {
        return petDao.getById(id);
    }

    @Override
    public List<Pet> getAll() {
        return petDao.getAll();
    }

    @Override
    public int update(Pet pet) {
        return petDao.update(pet);
    }
}
