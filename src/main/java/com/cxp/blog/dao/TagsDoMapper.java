package com.cxp.blog.dao;

import com.cxp.blog.pojo.TagsDo;
import com.cxp.blog.pojo.TagsDoExample;
import com.cxp.blog.pojo.TypeDo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TagsDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TagsDo record);

    int insertSelective(TagsDo record);

    TagsDo fingByName(String name);

    List<TagsDo> selectByExample(TagsDoExample example);

    TagsDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TagsDo record);

    int updateByPrimaryKey(TagsDo record);

//    List<TagsDo> getBlogTag();
}