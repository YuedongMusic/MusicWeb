package com.yuedong.musicweb;

import com.yuedong.domain.User;
import com.yuedong.mapper.TestMapper;
import com.yuedong.mapper.UserMapper;
import com.yuedong.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MusicwebApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
        List<User> users;
        com.yuedong.domain.Test test=testMapper.selectByPrimaryKey(1);
        System.out.println(test.getTestid()+test.getTestname());
//        users=userMapper.SelectAllUser();
//        Iterator it=users.iterator();
//        while(it.hasNext()){
//            User user=(User)it.next();
//            System.out.println(user.getUserName()+user.getPassword());
//        }
//        System.out.println(userService.findAllUser(1,10));
//
   }

}
