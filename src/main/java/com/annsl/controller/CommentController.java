package com.annsl.controller;

import com.annsl.domain.Comment;
import com.annsl.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @PostMapping
    public Result add(@RequestBody Comment comment){
        boolean flag = commentService.addComment(comment) > 0;
        return new Result(flag ? Code.SAVE_OK : Code.SAVE_ERR, flag);
    }

    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable Integer id){
        boolean flag = commentService.deleteById(id) > 0;
        return new Result(flag ? Code.DELETE_OK : Code.DELETE_ERR, flag);
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Comment comment = commentService.getById(id);
        Integer code = comment != null ? Code.GET_OK:Code.GET_ERR;
        String msg = comment != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, comment, msg);
    }

    @GetMapping
    public Result getAll(){
        List<Comment> commentList = commentService.getAll();
        Integer code = commentList != null ? Code.GET_ALL_OK:Code.GET_ALL_ERR;
        String msg = commentList != null ? "" : "数据查询失败，请重试！";
        return  new Result(code, commentList, msg);
    }

    @PutMapping
    public Result update(@RequestBody Comment comment){
        boolean flag = commentService.update(comment) > 0;
        return new Result(flag ? Code.UPDATE_OK : Code.UPDATE_ERR, flag);
    }
}
