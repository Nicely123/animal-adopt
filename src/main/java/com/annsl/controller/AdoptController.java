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
    public Result add(@RequestBody Adopt adopt){
        boolean flag = adoptService.addAdopt(adopt)>0;
        return new Result(flag ? Code.SAVE_OK: Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = adoptService.deleteById(id)>0;
        return new Result(flag ? Code.DELETE_OK: Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Adopt adopt = adoptService.getById(id);
        Integer code = adopt != null ? Code.GET_OK : Code.GET_ERR;
        String msg = adopt != null ? "" : "数据查询失败，请重试！";
        return new Result(code, adopt, msg);
    }

    @GetMapping
    public Result getAll(){
        List<Adopt> adoptList = adoptService.getAll();
        Integer code = adoptList != null ? Code.GET_ALL_OK: Code.GET_ALL_ERR;
        String msg = adoptList != null ? "" : "查询失败请重试";
        return new Result(code, adoptList, msg);
    }

    @PutMapping
    public Result update(Adopt adopt){
        boolean flag = adoptService.update(adopt)>0;
        return new Result(flag ? Code.SAVE_OK: Code.SAVE_ERR, flag);
    }
}
