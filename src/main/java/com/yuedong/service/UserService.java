package com.yuedong.service;

import com.github.pagehelper.PageInfo;
import com.yuedong.domain.User;

public interface UserService {

    PageInfo<User> findAllUser(int pageNum,int pageSize);
}
