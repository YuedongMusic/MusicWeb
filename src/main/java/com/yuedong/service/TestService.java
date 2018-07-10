package com.yuedong.service;

import com.github.pagehelper.PageInfo;
import com.yuedong.domain.Music;
import com.yuedong.domain.User;

public interface TestService {

    PageInfo<Music> findAllUser(int pageNum, int pageSize);
}
