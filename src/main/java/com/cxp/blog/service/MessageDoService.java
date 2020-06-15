package com.cxp.blog.service;

import com.cxp.blog.pojo.MessageDo;

import java.util.List;

public interface MessageDoService {
    //查询留言列表
    List<MessageDo> listMessage();

    //保存留言
    int saveMessage(MessageDo message);

    //删除留言
    void deleteMessage(Long id);
}
