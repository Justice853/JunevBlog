package com.cxp.blog.dao;

import com.cxp.blog.pojo.CommentDo;
import com.cxp.blog.pojo.CommentDoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface CommentDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommentDo record);

    int insertSelective(CommentDo record);

    List<CommentDo> selectByExample(CommentDoExample example);

    CommentDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CommentDo record);

    int updateByPrimaryKey(CommentDo record);

    List<CommentDo> findByBlogIdParentIdNull(@Param("blogId") Long blogId, @Param("blogParentId") Long blogParentId);

    //查询一级回复
    List<CommentDo> findByBlogIdParentIdNotNull(@Param("blogId") Long blogId, @Param("id") Long id);

    //查询二级回复
    List<CommentDo> findByBlogIdAndReplayId(@Param("blogId") Long blogId,@Param("childId") Long childId);

    int saveComment(CommentDo commentDo);
}