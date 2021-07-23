package com.tabwu.jedis.configuration;

import com.tabwu.jedis.beanProperties.RedisProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
@EnableConfigurationProperties(RedisProperties.class)
//@ConditionalOnClass(Jedis.class)
public class JedisAutoConfiguration {

    @Bean
    public Jedis jedis(RedisProperties redisProperties) {
        return new Jedis(redisProperties.getHost(),redisProperties.getPort());
    }
}
