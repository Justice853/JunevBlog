package com.cxp.blog.dao;

import com.cxp.blog.pojo.FriendDo;
import com.cxp.blog.pojo.FriendDoExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FriendDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FriendDo record);

    int insertSelective(FriendDo record);

    List<FriendDo> selectByExample(FriendDoExample example);

    FriendDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(FriendDo record);

    int updateByPrimaryKey(FriendDo record);

    FriendDo getFriendLinkByBlogaddress(String blogaddress);
}