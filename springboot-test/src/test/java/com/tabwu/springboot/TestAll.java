package com.tabwu.springboot;

import com.tabwu.springboot.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAll {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private User user;

    @Autowired
    private Environment evn;

    @Test
    public void testRedis() {
        System.out.println(redisTemplate);
    }

    @Test
    public void testAutoFetchProperties() {
        System.out.println(user);
    }

    @Test
    public void test1() {
        System.out.println(evn.getProperty("user.name"));
        System.out.println(evn.getProperty("user.age"));
        System.out.println(evn.getProperty("user.gender"));
    }
}
