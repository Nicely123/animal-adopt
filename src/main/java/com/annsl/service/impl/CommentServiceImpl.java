package com.annsl.service.impl;

import com.annsl.dao.CommentDao;
import com.annsl.domain.Comment;
import com.annsl.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentDao commentDao;
    @Override
    public int addComment(Comment comment) {
        return commentDao.addComment(comment);
    }

    @Override
    public int deleteById(Integer id) {
        return commentDao.deleteById(id);
    }

    @Override
    public Comment getById(Integer id) {
        return commentDao.getById(id);
    }

    @Override
    public List<Comment> getAll() {
        return commentDao.getAll();
    }

    @Override
    public int update(Comment comment) {
        return commentDao.update(comment);
    }
}
