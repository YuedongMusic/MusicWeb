package com.yuedong.mapper;

import com.yuedong.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from user_info where username=#{userName} and password=#{password}")
    User selectByUsername(@Param("userName") String userName, @Param("password") String password);


}