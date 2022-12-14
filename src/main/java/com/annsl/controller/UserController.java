package com.annsl.controller;

import com.annsl.domain.Pet;
import com.annsl.domain.User;
import com.annsl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Result add(@RequestBody User user){
        boolean flag = userService.add(user) > 0;
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = userService.deleteById(id) > 0;
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        User user = userService.getById(id);
        Integer code = user != null ? Code.GET_OK:Code.GET_ERR;
        String msg = user != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, user, msg);
    }

    @GetMapping
    public Result getAll(){
        List<User> userList = userService.getAll();
        Integer code = userList != null ? Code.GET_ALL_OK:Code.GET_ALL_ERR;
        String msg = userList != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, userList, msg);
    }

    @PutMapping
    public Result update(User user){
        boolean flag = userService.update(user) > 0;
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }
}
