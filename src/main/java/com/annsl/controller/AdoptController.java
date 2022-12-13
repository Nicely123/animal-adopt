package com.annsl.controller;

import com.annsl.domain.Adopt;
import com.annsl.service.AdoptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adopt")
public class AdoptController {
    @Autowired
    private AdoptService adoptService;

    @PostMapping
    public boolean add(@RequestBody Adopt adopt){
        return adoptService.addAdopt(adopt)>0;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return adoptService.deleteById(id)>0;
    }

    @GetMapping("/{id}")
    public Adopt getById(@PathVariable Integer id){
        return adoptService.getById(id);
    }

    @GetMapping
    public List<Adopt> getAll(){
        return adoptService.getAll();
    }

    @PutMapping
    public boolean update(Adopt adopt){
        return adoptService.update(adopt)>0;
    }
}
