package com.yuedong.controller;

import com.yuedong.domain.Music;
import com.yuedong.mapper.MusicMapper;
import com.yuedong.service.TestService;
import com.yuedong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class TestController {

    @Autowired
    private TestService testService;


    @ResponseBody
    @GetMapping(value = "/all",produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize){
        return testService.findAllUser(pageNum,pageSize);
    }



}


