package com.cxp.blog.service;

import com.cxp.blog.pojo.FriendDo;

import java.util.List;

public interface FriendDoService {
    //查询所有友链
    List<FriendDo> listFriendLink();

    //友链新增
    int saveFriendLink(FriendDo friend);

    //根据id查询友链
    FriendDo getFriendLink(Long id);

    //根据网址查询友链
    FriendDo getFriendLinkByBlogaddress(String blogaddress);

    //编辑修改友链
    int updateFriendLink(FriendDo friend);

    //删除友链
    void deleteFriendLink(Long id);
}
