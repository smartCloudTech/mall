package com.gsww.controller;

import com.gsww.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @program: mall
 * @description: resultful测试
 * @author: EvanChan
 * @create: 2018-10-30 19:45
 **/
@Controller
public class ResultfulTestController {

    @RequestMapping("/userView/{id}")
    public @ResponseBody User userView(@PathVariable("id") Integer id){
        User user = new User("zzz", "ccc");
        user.setId(1);
        return user;
    }
}