package com.yuedong.musicweb;

import com.yuedong.domain.User;
import com.yuedong.mapper.UserMapper;
import com.yuedong.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MusicwebApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
//        if (userService.IsLoginCorrect("wangbowen","wangbowen0223"))
//            System.out.println(1);
//        else System.out.println(2);

//        Iterator it=users.iterator();
//        while(it.hasNext()){
//            User user=(User)it.next();
//            System.out.println(user.getUserName()+user.getPassword());
//        }
//        System.out.println(userService.findAllUser(1,10));
//
   }

}
