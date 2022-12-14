package com.annsl.controller;

import com.annsl.domain.Donate;
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
    public Result add(@RequestBody Log log){
        boolean flag = logService.addLog(log) > 0;
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = logService.deleteById(id) > 0;
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Log log = logService.getById(id);
        Integer code = log != null ? Code.GET_OK:Code.GET_ERR;
        String msg = log != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, log, msg);
    }

    @GetMapping
    public Result getAll(){
        List<Log> logList = logService.getAll();
        Integer code = logList != null ? Code.GET_ALL_OK:Code.GET_ALL_ERR;
        String msg = logList != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, logList, msg);
    }

    @PutMapping
    public Result update(Log log){
        boolean flag = logService.update(log) > 0;
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }
}
