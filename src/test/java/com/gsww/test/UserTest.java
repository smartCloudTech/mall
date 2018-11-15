package com.gsww.test;

import com.gsww.entity.User;
import com.gsww.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTest {
    @Autowired
    private UserService userService;


    @Test
    public void test1(){
        User user = new User("张三", "123");
        userService.saveUser(user);
    }
    @Test
    public void test2(){
        User user = new User("aaa", "bbb");
        User example = userService.findUserByExample(user);
        System.out.println(example.getName()+example.getPassword());
    }
}