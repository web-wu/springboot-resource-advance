package com.tabwu.springboot.configuration;

import com.tabwu.springboot.entity.Goods;
import com.tabwu.springboot.entity.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
public class EntityConfiguration {

    @Bean
    public Goods getGoods() {
        return new Goods();
    }

    @Bean
    public Order getOrder() {
        return new Order();
    }

    @Bean
    public Jedis jedis() {
        return new Jedis();
    }
}
