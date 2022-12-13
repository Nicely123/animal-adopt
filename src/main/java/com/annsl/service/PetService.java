package com.annsl.service;

import com.annsl.domain.Pet;

import java.util.List;

public interface PetService {
    int addPet(Pet pet);
    int deleteById(Integer id);
    Pet getById(Integer id);
    List<Pet> getAll();
    int update(Pet pet);
}
