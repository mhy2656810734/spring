package com.spring.demo;

import org.springframework.stereotype.Controller;

/**
 * @author mahaiyang
 * @date 2024/3/11 14:58
 */
@Controller
public class User {
    public void say() {
        System.out.println("sai hasss");
    }
    public void hh() {
        System.out.println("小马");
    }
    public User user() {
        User user = new User();
        return user;
    }
}
