package com.gsww.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: mall
 * @description: 测试类
 * @author: EvanChan
 * @create: 2018-10-29 21:07
 **/
@Controller
public class TestController {
    @RequestMapping("/deleteUser")
    public String deleteUser(Integer [] id){
        for(int i:id){
            System.out.println(i);
        }
        return "/index.jsp";
    }
}