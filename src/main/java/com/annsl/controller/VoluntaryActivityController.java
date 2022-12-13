package com.annsl.controller;

import com.annsl.domain.User;
import com.annsl.domain.VoluntaryActivity;
import com.annsl.service.VoluntaryActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/voluntary-activity")
public class VoluntaryActivityController {
    @Autowired
    private VoluntaryActivityService service;

    @PostMapping
    public boolean add(@RequestBody VoluntaryActivity activity){
        return service.add(activity)>0;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return service.deleteById(id)>0;
    }

    @GetMapping("/{id}")
    public VoluntaryActivity getById(@PathVariable Integer id){
        return service.getById(id);
    }

    @GetMapping
    public List<VoluntaryActivity> getAll(){
        return service.getAll();
    }

    @PutMapping
    public boolean update(VoluntaryActivity activity){
        return service.update(activity)>0;
    }
}
