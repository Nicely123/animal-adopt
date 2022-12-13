package com.annsl.controller;

import com.annsl.domain.TakeApartActivity;
import com.annsl.service.TakeApartActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/take-apart-activity")
public class TakeApartActivityController {
    @Autowired
    private TakeApartActivityService takeApartActivityService;

    @PostMapping
    public boolean add(@RequestBody TakeApartActivity takeApartActivity){
        return takeApartActivityService.add(takeApartActivity)>0;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return takeApartActivityService.deleteById(id)>0;
    }

    @GetMapping("/{id}")
    public TakeApartActivity getById(@PathVariable Integer id){
        return takeApartActivityService.getById(id);
    }

    @GetMapping
    public List<TakeApartActivity> getAll(){
        return takeApartActivityService.getAll();
    }

    @PutMapping
    public boolean update(TakeApartActivity takeApartActivity){
        return takeApartActivityService.update(takeApartActivity)>0;
    }
}
