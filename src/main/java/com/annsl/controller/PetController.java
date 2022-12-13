package com.annsl.controller;


import com.annsl.domain.Pet;
import com.annsl.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class PetController {
    @Autowired
    private PetService petService;

    @PostMapping
    public boolean add(@RequestBody Pet pet){
        return petService.addPet(pet)>0;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return petService.deleteById(id)>0;
    }

    @GetMapping("/{id}")
    public Pet getById(@PathVariable Integer id){
        return petService.getById(id);
    }

    @GetMapping
    public List<Pet> getAll(){
        return petService.getAll();
    }

    @PutMapping
    public boolean update(Pet pet){
        return petService.update(pet)>0;
    }
}
