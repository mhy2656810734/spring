package com.spring.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * @author mahaiyang
 * @date 2024/3/11 14:15
 */
@Controller
public class Student {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public  void print() {
        System.out.println("hello student");
    }
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public User func() {
        User user = new User();
        return user;
    }
    @Bean( {"us","u1"})
    public User getUser() {
        User user = new User();
        return user;
    }
}
