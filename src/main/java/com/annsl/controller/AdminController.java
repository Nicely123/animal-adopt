package com.annsl.controller;

import com.annsl.domain.Admin;
import com.annsl.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/{id}")
    public Admin getById(@PathVariable Integer id){
        return adminService.getById(id);
    }

    @GetMapping
    public List<Admin> getAll(){
        return  adminService.getAll();
    }
}
