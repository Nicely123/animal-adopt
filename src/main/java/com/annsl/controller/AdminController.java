package com.annsl.controller;

import com.annsl.domain.Admin;
import com.annsl.exception.BusinessException;
import com.annsl.exception.SystemException;
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
    public Result add(@RequestBody Admin admin){
        boolean flag = adminService.addAdmin(admin)>0;
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = adminService.deleteById(id)>0;
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){

        /*if (id == 1){
            throw  new BusinessException(Code.BUSINESS_ERR, "业务异常测试");
        }
        try {
            int i = 1/0;
        }catch (Exception exception){
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "连接服务器超时，请稍后重试", exception);
        }*/

        Admin admin = adminService.getById(id);
        Integer code = admin != null ? Code.GET_OK : Code.GET_ERR;
        String msg = admin != null ? "" : "数据查询失败，请重试！";
        return new Result(code,admin,msg);
    }

    @GetMapping
    public Result getAll(){
        List<Admin> adminList = adminService.getAll();
        Integer code = adminList != null ? Code.GET_ALL_OK : Code.GET_ALL_ERR;
        String msg = adminList != null ? "" : "数据查询失败，请重试！";
        return new Result(code,adminList,msg);
    }

    @PutMapping
    public Result update(@RequestBody Admin admin){
        boolean flag = adminService.update(admin) > 0;
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR, flag);
    }
}
