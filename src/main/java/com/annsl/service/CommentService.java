package com.annsl.service;

import com.annsl.domain.Comment;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface CommentService {
    /**
     * 添加一条评论
     * @param comment
     * @return
     */
    int addComment(Comment comment);

    /**
     * 根据id删除评论
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 根据id查找评论
     * @param id
     * @return
     */
    Comment getById(Integer id);

    /**
     * 查找所有评论
     * @return
     */
    List<Comment> getAll();

    /**
     * 更新评论
     * @param comment
     * @return
     */
    int update(Comment comment);
}
