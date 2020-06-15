package com.cxp.blog.service.impl;

import com.cxp.blog.dao.TagsDoMapper;
import com.cxp.blog.dao.TypeDoMapper;
import com.cxp.blog.exception.NotFoundException;
import com.cxp.blog.pojo.TagsDo;
import com.cxp.blog.pojo.TagsDoExample;
import com.cxp.blog.pojo.TypeDo;
import com.cxp.blog.pojo.TypeDoExample;
import com.cxp.blog.service.TagsDoService;
import com.cxp.blog.service.TypeDoService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagsDoServiceImpl implements TagsDoService {
    @Autowired
    TagsDoMapper tagsDoMapper;


    @Override
    public int save (TagsDo tagsDo) {
        return tagsDoMapper.insert ( tagsDo );
    }

    @Override
    public TagsDo getTags (Long id) {
        return tagsDoMapper.selectByPrimaryKey ( id );
    }

    @Override
    public TagsDo getTagsByName (String name) {
        return tagsDoMapper.fingByName ( name );
    }

    @Override
    public List<TagsDo> list ( ) {
        TagsDoExample tagsDoExample = new TagsDoExample ();
        tagsDoExample.setOrderByClause ( "id desc" );
        return tagsDoMapper.selectByExample ( tagsDoExample );
    }

    @Override
    public int updateTags (Long id, TagsDo tagsDo) {
        TagsDo t = tagsDoMapper.selectByPrimaryKey ( id );
        if(t==null){
            throw new NotFoundException ( "不存在该标签" );
        }
        BeanUtils.copyProperties ( tagsDo,t );
        return tagsDoMapper.updateByPrimaryKey ( tagsDo );
    }

    @Override
    public void deleteTags (Long id) {
        tagsDoMapper.deleteByPrimaryKey ( id );
    }

    @Override
    public List<TagsDo> getTagByString (String text) {
        List<TagsDo> tagsDos = new ArrayList<> (  );
        List<Long> longs = convertToList ( text );
        for(Long long1 : longs){
            tagsDos.add ( tagsDoMapper.selectByPrimaryKey ( long1 ) );
        }
        return tagsDos;
    }

//    @Override
//    public List<TagsDo> getAllTagsBlog ( ) {
//        return tagsDoMapper.getBlogTag ();
//    }

    private List<Long> convertToList(String ids) {  //把前端的tagIds字符串转换为list集合
        List<Long> list = new ArrayList<>();
        if (!"".equals(ids) && ids != null) {
            String[] idarray = ids.split(",");
            for (int i=0; i < idarray.length;i++) {
                list.add(new Long(idarray[i]));
            }
        }
        return list;
    }

}
