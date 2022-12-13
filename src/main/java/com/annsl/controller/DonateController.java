package com.annsl.controller;


import com.annsl.domain.Donate;
import com.annsl.service.DonateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donate")
public class DonateController {
    @Autowired
    private DonateService donateService;

    @PostMapping
    public boolean add(@RequestBody Donate donate){
        return donateService.addDonate(donate)>0;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return donateService.deleteById(id)>0;
    }

    @GetMapping("/{id}")
    public Donate getById(@PathVariable Integer id){
        return donateService.getById(id);
    }

    @GetMapping
    public List<Donate> getAll(){
        return donateService.getAll();
    }

    @PutMapping
    public boolean update(Donate donate){
        return donateService.update(donate)>0;
    }
}
