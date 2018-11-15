package com.gsww.controller;

import com.gsww.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: mall
 * @description: json测试
 * @author: EvanChan
 * @create: 2018-10-30 19:18
 **/
@Controller
public class JSONTestController {

    //请求JSON，返回JSON
    @RequestMapping(value = "/requestJson")
    public @ResponseBody User requestJson(@RequestBody User user){


        return user;
    }

    //请求key/value，返回JSON
    @RequestMapping(value = "/responseJson")
    public @ResponseBody User responseJson(User user){


        return user;
    }
}