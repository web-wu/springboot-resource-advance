package com.tabwu.springboot;

import com.tabwu.springboot.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConditionApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConditionApplication.class, args);
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
