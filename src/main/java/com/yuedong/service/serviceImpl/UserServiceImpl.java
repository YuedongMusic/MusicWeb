package com.yuedong.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuedong.domain.User;
import com.yuedong.mapper.UserMapper;
import com.yuedong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public PageInfo<User> TestfindAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<User> userDomains = userMapper.selectAllUser();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

    public int addUser(User user) {

        return userMapper.insertSelective(user);
    }


}
