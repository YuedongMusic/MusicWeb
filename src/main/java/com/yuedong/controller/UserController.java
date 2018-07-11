package com.yuedong.controller;
/*
* Create by wangbowen in 2018/7/11
*
* */
import com.yuedong.aspect.LogAspect;
import com.yuedong.domain.User;
import com.yuedong.service.UserService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    private final static org.slf4j.Logger logger=LoggerFactory.getLogger(UserController.class);




    @Autowired
    private UserService userService;
   /*
   * 用户登录
   * */
    @PostMapping("/login")
    public int login(HttpServletRequest request)
    {
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        User user=userService.IsLoginCorrect(username,password);
        if (user!=null)
        {
            request.getSession().setAttribute("user_info",user);
            return 1;
        }
        else return 0;
    }


    /*
    * 添加用户
    * */
    @PostMapping("/add")
    public int add(User user)
    {
        return userService.addUser(user);
    }


    /*
    * 获取当前用户信息
    *
    * */
    @GetMapping("/getuserinfo")
    public User getUserInfo(HttpServletRequest request)
    {
        return (User)request.getSession().getAttribute("user_info");
    }
}
