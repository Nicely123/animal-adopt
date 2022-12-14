package com.annsl.controller;

import com.annsl.domain.Pet;
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
    public Result add(@RequestBody TakeApartActivity takeApartActivity){
        boolean flag = takeApartActivityService.add(takeApartActivity) > 0;
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = takeApartActivityService.deleteById(id) > 0;
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        TakeApartActivity activity = takeApartActivityService.getById(id);
        Integer code = activity != null ? Code.GET_OK:Code.GET_ERR;
        String msg = activity != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, activity, msg);
    }

    @GetMapping
    public Result getAll(){
        List<TakeApartActivity> activities = takeApartActivityService.getAll();
        Integer code = activities != null ? Code.GET_ALL_OK:Code.GET_ALL_ERR;
        String msg = activities != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, activities, msg);
    }

    @PutMapping
    public Result update(TakeApartActivity takeApartActivity){
        boolean flag = takeApartActivityService.update(takeApartActivity) > 0;
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }
}
