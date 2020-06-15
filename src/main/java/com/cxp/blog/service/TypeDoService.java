package com.cxp.blog.service;

import com.cxp.blog.pojo.TypeDo;

import java.util.List;

public interface TypeDoService {
    int save(TypeDo typeDo);

    TypeDo getType(Long id);

    TypeDo getTypeByName(String name);

    List<TypeDo> list();

    int updateType(Long id,TypeDo typeDo);

    void deleteType(Long id);

    List<TypeDo>getAllType();

    List<TypeDo>getAllTypeBlog();
}
