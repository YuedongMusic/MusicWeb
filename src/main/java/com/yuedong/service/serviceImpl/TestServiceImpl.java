package com.yuedong.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yuedong.domain.Music;
import com.yuedong.domain.User;
import com.yuedong.mapper.MusicMapper;
import com.yuedong.mapper.UserMapper;
import com.yuedong.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "testService")
public class TestServiceImpl implements TestService {

    @Autowired(required = false)
    private MusicMapper musicmapper;
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public PageInfo<Music> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<Music> userDomains = musicmapper.selectAllUser();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

}
