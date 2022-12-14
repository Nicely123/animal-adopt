package com.annsl.controller;

import com.annsl.domain.User;
import com.annsl.domain.UserShare;
import com.annsl.service.UserShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-share")
public class UserShareController {
    @Autowired
    private UserShareService userShareService;

    @PostMapping
    public Result add(@RequestBody UserShare userShare){
        boolean flag = userShareService.add(userShare) > 0;
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = userShareService.deleteById(id) > 0;
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        UserShare userShare = userShareService.getById(id);
        Integer code = userShare != null ? Code.GET_OK:Code.GET_ERR;
        String msg = userShare != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, userShare, msg);
    }

    @GetMapping
    public Result getAll(){
        List<UserShare> userShareList = userShareService.getAll();
        Integer code = userShareList != null ? Code.GET_ALL_OK:Code.GET_ALL_ERR;
        String msg = userShareList != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, userShareList, msg);
    }

    @PutMapping
    public Result update(UserShare userShare){
        boolean flag = userShareService.update(userShare) > 0;
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }
}
