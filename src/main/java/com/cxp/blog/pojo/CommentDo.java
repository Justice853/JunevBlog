package com.cxp.blog.pojo;

import com.cxp.blog.vo.DetailedBlog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentDo {
    private Long id;

    private String nickname;

    private String email;

    private String content;

    private String avatar;

    private Date create_time;

    private Long blog_id;

    private Long parent_comment_id;

    private Boolean admin_comment;

    private String parentNickname;

    private List<CommentDo> replyComments = new ArrayList<> ();

    private CommentDo parentComment;

    private DetailedBlog blog;


    public String getParentNickname ( ) {
        return parentNickname;
    }

    public void setParentComment (CommentDo parentComment) {
        this.parentComment = parentComment;
    }

    public void setParentNickname (String parentNickname) {
        this.parentNickname = parentNickname;
    }

    public List<CommentDo> getReplyComments ( ) {
        return replyComments;
    }

    public void setReplyComments (List<CommentDo> replyComments) {
        this.replyComments = replyComments;
    }

    public CommentDo getParentComment ( ) {
        return parentComment;
    }




    public DetailedBlog getBlog ( ) {
        return blog;
    }

    public void setBlog (DetailedBlog blog) {
        this.blog = blog;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Long getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(Long blog_id) {
        this.blog_id = blog_id;
    }

    public Long getParent_comment_id() {
        return parent_comment_id;
    }

    public void setParent_comment_id(Long parent_comment_id) {
        this.parent_comment_id = parent_comment_id;
    }

    public Boolean getAdmin_comment() {
        return admin_comment;
    }

    public void setAdmin_comment(Boolean admin_comment) {
        this.admin_comment = admin_comment;
    }
}