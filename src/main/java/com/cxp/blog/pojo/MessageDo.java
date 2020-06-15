package com.cxp.blog.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageDo {
    private Long id;

    private String nickname;

    private String email;

    private String content;

    private String avatar;

    private Date create_time;

    private Long parent_message_id;

    private Boolean admin_message;

    //回复评论
    private List<MessageDo> replyMessages = new ArrayList<> ();
    private MessageDo parentMessage;
    private String parentNickname;

    public List<MessageDo> getReplyMessages ( ) {
        return replyMessages;
    }

    public void setReplyMessages (List<MessageDo> replyMessages) {
        this.replyMessages = replyMessages;
    }

    public MessageDo getParentMessage ( ) {
        return parentMessage;
    }

    public void setParentMessage (MessageDo parentMessage) {
        this.parentMessage = parentMessage;
    }

    public String getParentNickname ( ) {
        return parentNickname;
    }

    public void setParentNickname (String parentNickname) {
        this.parentNickname = parentNickname;
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

    public Long getParent_message_id() {
        return parent_message_id;
    }

    public void setParent_message_id(Long parent_message_id) {
        this.parent_message_id = parent_message_id;
    }

    public Boolean getAdmin_message() {
        return admin_message;
    }

    public void setAdmin_message(Boolean admin_message) {
        this.admin_message = admin_message;
    }
}