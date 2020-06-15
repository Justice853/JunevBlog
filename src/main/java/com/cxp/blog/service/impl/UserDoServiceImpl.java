package com.cxp.blog.service.impl;


import com.cxp.blog.dao.UserDoMapper;
import com.cxp.blog.pojo.UserDo;
import com.cxp.blog.service.UserDoService;
import com.cxp.blog.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDoServiceImpl implements UserDoService {
    @Autowired
    UserDoMapper userDoMapper;
    @Override
    public UserDo checkUser (String username, String password) {
        UserDo userDo =userDoMapper.findByUsernameAndPassword (username, MD5Utils.code ( password ));
        return userDo;
    }
}
