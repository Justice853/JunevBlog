package com.cxp.blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class TagsDo {
    private Long id;

    private String name;

    private List<BlogDo> blogs = new ArrayList<> ();

    public List<BlogDo> getBlogs ( ) {
        return blogs;
    }

    public void setBlogs (List<BlogDo> blogs) {
        this.blogs = blogs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}