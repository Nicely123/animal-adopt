package com.annsl.dao;

import com.annsl.domain.Comment;

import java.util.List;

public interface CommentDao {
    int addComment(Comment comment);
    int deleteById(Integer id);
    Comment getById(Integer id);
    List<Comment> getAll();
    int update(Comment comment);
}
