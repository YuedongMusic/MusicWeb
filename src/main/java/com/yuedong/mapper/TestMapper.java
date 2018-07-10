package com.yuedong.mapper;

import com.yuedong.domain.Test;

public interface TestMapper {
    int deleteByPrimaryKey(Integer testid);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer testid);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}