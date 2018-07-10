package com.yuedong.service;

import com.github.pagehelper.PageInfo;
import com.yuedong.domain.User;

public interface UserService {
    PageInfo<User> TestfindAllUser(int pageNum, int pageSize);
    int addUser(User user);

}
