package com.annsl.controller;

import com.annsl.domain.User;
import com.annsl.domain.UserShare;
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
    public Result add(@RequestBody VoluntaryActivity activity){
        boolean flag = service.add(activity) > 0;
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = service.deleteById(id) > 0;
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        VoluntaryActivity activity = service.getById(id);
        Integer code = activity != null ? Code.GET_OK:Code.GET_ERR;
        String msg = activity != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, activity, msg);
    }

    @GetMapping
    public Result getAll(){
        List<VoluntaryActivity> activities = service.getAll();
        Integer code = activities != null ? Code.GET_ALL_OK:Code.GET_ALL_ERR;
        String msg = activities != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, activities, msg);
    }

    @PutMapping
    public Result update(VoluntaryActivity activity){
        boolean flag = service.update(activity) > 0;
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }
}
