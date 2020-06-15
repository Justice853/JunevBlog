package com.cxp.blog.dao;

import com.cxp.blog.pojo.TypeDo;
import com.cxp.blog.pojo.TypeDoExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TypeDoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TypeDo record);


    int insertSelective(TypeDo record);

    TypeDo fingByName(String name);

    List<TypeDo> selectByExample(TypeDoExample example);

    TypeDo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TypeDo record);

    int updateByPrimaryKey(TypeDo record);

    List<TypeDo> getAllTypeAndBlog();

    TypeDo getType(Long id);

    List<TypeDo> getBlogType();
}