package com.cxp.blog.service;

import com.cxp.blog.pojo.UserDo;

public interface UserDoService {
    UserDo checkUser(String username, String password);
}
