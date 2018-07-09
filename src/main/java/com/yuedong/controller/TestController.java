package com.yuedong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
@RequestMapping(value = "/hello")
public class TestController {
    @RequestMapping(value = "/say",method= RequestMethod.GET)
    String say() {
        return "+++++++++++++++++++++++++++++";
    }
}
