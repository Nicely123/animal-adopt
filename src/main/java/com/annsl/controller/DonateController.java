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
    public Result add(@RequestBody Donate donate){
        boolean flag = donateService.addDonate(donate) > 0;
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = donateService.deleteById(id) > 0;
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Donate donate = donateService.getById(id);
        Integer code = donate != null ? Code.GET_OK:Code.GET_ERR;
        String msg = donate != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, donate, msg);
    }

    @GetMapping
    public Result getAll(){
        List<Donate> donateList = donateService.getAll();
        Integer code = donateList != null ? Code.GET_ALL_OK:Code.GET_ALL_ERR;
        String msg = donateList != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, donateList, msg);
    }

    @PutMapping
    public Result update(Donate donate){
        boolean flag = donateService.update(donate) > 0;
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }
}
