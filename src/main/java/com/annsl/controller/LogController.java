package com.annsl.controller;

import com.annsl.domain.Log;
import com.annsl.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/log")
public class LogController {
    @Autowired
    private LogService logService;

    @PostMapping
    public boolean add(@RequestBody Log log){
        return logService.addLog(log)>0;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return logService.deleteById(id)>0;
    }

    @GetMapping("/{id}")
    public Log getById(@PathVariable Integer id){
        return logService.getById(id);
    }

    @GetMapping
    public List<Log> getAll(){
        return logService.getAll();
    }

    @PutMapping
    public boolean update(Log log){
        return logService.update(log)>0;
    }
}
