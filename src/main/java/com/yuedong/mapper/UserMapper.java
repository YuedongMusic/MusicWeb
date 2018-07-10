package com.yuedong.mapper;

import com.yuedong.domain.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String userName);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userName);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> SelectAllUser();
}