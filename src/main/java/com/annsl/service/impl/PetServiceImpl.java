package com.annsl.service.impl;

import com.annsl.domain.Pet;
import com.annsl.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PetServiceImpl implements PetService {
    @Autowired
    private PetService petService;
    @Override
    public int addPet(Pet pet) {
        return petService.addPet(pet);
    }

    @Override
    public int deleteById(Integer id) {
        return petService.deleteById(id);
    }

    @Override
    public Pet getById(Integer id) {
        return petService.getById(id);
    }

    @Override
    public List<Pet> getAll() {
        return petService.getAll();
    }

    @Override
    public int update(Pet pet) {
        return petService.update(pet);
    }
}
