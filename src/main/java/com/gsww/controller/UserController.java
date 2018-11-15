package com.gsww.controller;


import com.gsww.entity.User;
import com.gsww.service.UserService;
import com.gsww.validation.ValidateGroup1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserController{
    @Autowired
    private UserService userService;


    //在需要校验的pojo前添加@Validated，并添加方法形参BindingResult bindingResult用于接收错误提示信息
    //若存在多个要校验的数据，则@Validated与BindingResult bindingResult是成对出现的，
    // 且二者的顺序要保证@Validated在前BindingResult bindingResult在后
    //@Validated(value = {ValidateGroup1.class})的value用于指定使用的校验分组

    //@ModelAttribute用于指定数据回显后request中的key，其只适用于pojo类，简单数据类型的回显需要使用model对象
    //数据回显可以使用Model对象来实现，所以@ModelAttribute是通过注解简化了代码书写
    @RequestMapping(value = "login")
    public ModelAndView login(@ModelAttribute(value = "u") @Validated(value = {ValidateGroup1.class}) User user, BindingResult bindingResult, HttpSession session){

        //创建ModelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //获取校验错误信息
        if(bindingResult.hasErrors()){
            List<ObjectError> objectErrorList = bindingResult.getAllErrors();
            modelAndView.addObject("errorList",objectErrorList);
            modelAndView.setViewName("/login.jsp");
            return modelAndView;
        }



        User example = userService.findUserByExample(user);

        if(example!=null){
            modelAndView.setViewName("/index.jsp");
        }else{
            modelAndView.setViewName("/login.jsp");
        }

        return modelAndView;
    }


    @RequestMapping(value = "register")
    public ModelAndView register(User user){
        System.out.println("用户名："+user.getName());
        userService.saveUser(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login.jsp");
        return modelAndView;
    }

}