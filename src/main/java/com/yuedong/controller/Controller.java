package com.yuedong.controller;

import com.yuedong.domain.User;
import com.yuedong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping(value = "/userinfo")
public class Controller {
    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public int addUser(User user) {
        return userService.addUser(user);
    }

    @GetMapping(value = "/user",produces = {"application/json;charset=UTF-8"})
    public Object TestfindAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize)
    {
        System.out.println(userService.TestfindAllUser(pageNum,pageSize));
        return userService.TestfindAllUser(pageNum,pageSize);
    }

}
