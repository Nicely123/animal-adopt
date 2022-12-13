package com.annsl.controller;

import com.annsl.domain.Admin;
import com.annsl.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping
    public boolean add(@RequestBody Admin admin){
        return adminService.addAdmin(admin)>0;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return adminService.deleteById(id)>0;
    }

    @GetMapping("/{id}")
    public Admin getById(@PathVariable Integer id){
        return adminService.getById(id);
    }

    @GetMapping
    public List<Admin> getAll(){
        return  adminService.getAll();
    }

    @PutMapping
    public boolean update(@RequestBody Admin admin){
        return adminService.update(admin) > 0;
    }
}
