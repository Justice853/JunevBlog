package com.cxp.blog.pojo;

import java.util.Date;

public class FriendDo {
    private Long id;

    private String blogaddress;

    private String blogname;

    private Date create_time;

    private String pictureaddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlogaddress() {
        return blogaddress;
    }

    public void setBlogaddress(String blogaddress) {
        this.blogaddress = blogaddress == null ? null : blogaddress.trim();
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname == null ? null : blogname.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getPictureaddress() {
        return pictureaddress;
    }

    public void setPictureaddress(String pictureaddress) {
        this.pictureaddress = pictureaddress == null ? null : pictureaddress.trim();
    }
}