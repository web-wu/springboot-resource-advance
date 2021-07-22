package com.tabwu.springboot.configuration;

import com.tabwu.springboot.condition.ClassCondition;
import com.tabwu.springboot.condition.ConditionalOnClass;
import com.tabwu.springboot.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
//    @Conditional(ClassCondition.class)
    @ConditionalOnClass("redis.clients.jedis.Jedis")
    public User createUser() {
        return new User();
    }
}
