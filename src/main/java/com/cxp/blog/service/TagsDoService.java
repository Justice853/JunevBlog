package com.cxp.blog.service;

import com.cxp.blog.pojo.TagsDo;
import com.cxp.blog.pojo.TypeDo;

import java.util.List;

public interface TagsDoService {
    int save (TagsDo tagsDo);

    TagsDo getTags (Long id);

    TagsDo getTagsByName (String name);

    List<TagsDo> list ( );

    int updateTags (Long id, TagsDo tagsDo);

    void deleteTags (Long id);

    List<TagsDo> getTagByString(String text);

//    List<TagsDo>getAllTagsBlog();
}
