package com.annsl.controller;


import com.annsl.domain.Log;
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
    public Result add(@RequestBody Pet pet){
        boolean flag = petService.addPet(pet) > 0;
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = petService.deleteById(id) > 0;
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Pet pet = petService.getById(id);
        Integer code = pet != null ? Code.GET_OK:Code.GET_ERR;
        String msg = pet != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, pet, msg);
    }

    @GetMapping
    public Result getAll(){
        List<Pet> petList = petService.getAll();
        Integer code = petList != null ? Code.GET_ALL_OK:Code.GET_ALL_ERR;
        String msg = petList != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, petList, msg);
    }

    @PutMapping
    public Result update(Pet pet){
        boolean flag = petService.update(pet) > 0;
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }
}
