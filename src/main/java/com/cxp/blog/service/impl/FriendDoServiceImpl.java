package com.cxp.blog.service.impl;

import com.cxp.blog.dao.FriendDoMapper;
import com.cxp.blog.pojo.FriendDo;
import com.cxp.blog.pojo.FriendDoExample;
import com.cxp.blog.service.FriendDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendDoServiceImpl implements FriendDoService {

    @Autowired
    private FriendDoMapper friendDoMapper;

    @Override
    public List<FriendDo> listFriendLink ( ) {
        FriendDoExample friendDoExample = new FriendDoExample ();
        friendDoExample.setOrderByClause ("id desc");
        return  friendDoMapper.selectByExample ( friendDoExample );
    }

    @Override
    public int saveFriendLink (FriendDo friend) {
        return friendDoMapper.insert ( friend );
    }

    @Override
    public FriendDo getFriendLink (Long id) {
        return friendDoMapper.selectByPrimaryKey ( id );
    }

    @Override
    public FriendDo getFriendLinkByBlogaddress (String blogaddress) {
        return friendDoMapper.getFriendLinkByBlogaddress ( blogaddress );
    }

    @Override
    public int updateFriendLink (FriendDo friend) {
        return friendDoMapper.updateByPrimaryKey ( friend );
    }

    @Override
    public void deleteFriendLink (Long id) {
        friendDoMapper.deleteByPrimaryKey ( id );
    }
}
