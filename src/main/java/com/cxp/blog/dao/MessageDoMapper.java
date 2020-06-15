package com.cxp.blog.dao;

import com.cxp.blog.pojo.MessageDo;
import com.cxp.blog.pojo.MessageDoExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MessageDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MessageDo record);

    int insertSelective(MessageDo record);

    List<MessageDo> selectByExample(MessageDoExample example);

    MessageDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MessageDo record);

    int updateByPrimaryKey(MessageDo record);

    List<MessageDo> findByParentIdNull(@Param("ParentId") Long ParentId);

    //查询一级回复
    List<MessageDo> findByParentIdNotNull(@Param("id") Long id);

    //查询二级以及所有子集回复
    List<MessageDo> findByReplayId(@Param("childId") Long childId);

//    //删除评论
//    void deleteMessage(Long id);
//
//    int saveMessage(MessageDo message);
}