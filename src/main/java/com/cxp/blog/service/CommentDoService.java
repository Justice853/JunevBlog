package com.cxp.blog.service;

import com.cxp.blog.pojo.CommentDo;

import java.util.List;

public interface CommentDoService {
    List<CommentDo> listCommentByBlogId(Long blogId);

    int saveComment(CommentDo comment);

    void deleteComment(CommentDo comment,Long id);
}
