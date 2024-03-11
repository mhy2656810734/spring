package com.spring.demo;

import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @author mahaiyang
 * @date 2024/3/11 15:03
 */
@Controller
public class UserController {
    @Autowired
    @Qualifier(value = "user")
    private User u1;
    private User user = new User();
//    @Setter
//    public void setUser(User user) {
//        this.user = user;
//    }

    public UserController(User user) {
        this.user = user;
    }
    public void say() {
        System.out.println("通过Autowired 搭配 Qualifier注入");
        u1.say();
    }
}
