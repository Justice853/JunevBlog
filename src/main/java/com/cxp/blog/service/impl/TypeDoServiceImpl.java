package com.cxp.blog.service.impl;

import com.cxp.blog.dao.TypeDoMapper;
import com.cxp.blog.exception.NotFoundException;
import com.cxp.blog.pojo.TypeDo;
import com.cxp.blog.pojo.TypeDoExample;
import com.cxp.blog.service.TypeDoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeDoServiceImpl implements TypeDoService {
    @Autowired
    TypeDoMapper typeDoMapper;
    @Override
    public int save (TypeDo typeDo) {
        return typeDoMapper.insert ( typeDo );
    }

    @Override
    public TypeDo getType (Long id) {
        return typeDoMapper.getType ( id ) ;
    }

    @Override
    public TypeDo getTypeByName (String name) {
        return typeDoMapper.fingByName ( name );
    }

    @Override
    public List<TypeDo> list ( ) {
        TypeDoExample typeDoExample = new TypeDoExample ();
        typeDoExample.setOrderByClause ( "id desc" );
        return typeDoMapper.selectByExample ( typeDoExample );
    }

    @Override
    public int updateType (Long id,TypeDo typeDo) {
        TypeDo t = typeDoMapper.selectByPrimaryKey ( id );
        if (t==null){
            throw  new NotFoundException ( "不存在该类型" );
        }
        BeanUtils.copyProperties ( typeDo,t );
        return typeDoMapper.updateByPrimaryKey ( typeDo ) ;
    }

    @Override
    public void deleteType (Long id) {
        typeDoMapper.deleteByPrimaryKey ( id );
    }

    @Override
    public List<TypeDo> getAllType ( ) {
        return typeDoMapper.getAllTypeAndBlog ();
    }

    @Override
    public List<TypeDo> getAllTypeBlog ( ) {
        return typeDoMapper.getBlogType ();
    }


}
