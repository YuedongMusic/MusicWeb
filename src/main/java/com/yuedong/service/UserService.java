package com.yuedong.service;

import com.github.pagehelper.PageInfo;
import com.yuedong.domain.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

//
//    PageInfo<User> findAllUser(int pageNum, int pageSize);


    int addUser(User user);
    User IsLoginCorrect(String username,String password); //验证登录用户名及密码
}
