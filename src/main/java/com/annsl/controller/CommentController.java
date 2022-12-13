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
    public boolean add(@RequestBody Comment comment){
        return commentService.addComment(comment) > 0;
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Integer id){
        return commentService.deleteById(id) > 0;
    }

    @GetMapping("/{id}")
    public Comment getById(@PathVariable Integer id){
        return  commentService.getById(id);
    }

    @GetMapping
    public List<Comment> getAll(){
        return commentService.getAll();
    }

    @PutMapping
    public Boolean update(@RequestBody Comment comment){
        return commentService.update(comment) > 0;
    }
}
