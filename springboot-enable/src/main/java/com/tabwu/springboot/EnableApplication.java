package com.tabwu.springboot;

//import com.tabwu.springboot.annotation.EnableUser;
//import com.tabwu.springboot.annotation.MyDefineImportRegister;
//import com.tabwu.springboot.annotation.MyImportSelecter;
//import com.tabwu.springboot.configuration.EntityConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Import;

@SpringBootApplication
//@ComponentScan("com.tabwu.springboot.configuration")
//@EnableUser
//@Import(Order.class)
//@Import(EntityConfiguration.class)
//@Import(MyImportSelecter.class)
//@Import(MyDefineImportRegister.class)
public class EnableApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EnableApplication.class, args);

        /*Object goods = context.getBean("getGoods");

        System.out.println(goods);

        *//*Goods goods = context.getBean(Goods.class);
        System.out.println(goods);

        Order order = context.getBean(Order.class);
        System.out.println(order);*//*

        Object jedis = context.getBean("jedis");
        System.out.println(jedis);*/

       /* Object jedis = context.getBean("jedis");
        System.out.println(jedis);*/

        Jedis jedis1 = context.getBean(Jedis.class);

        System.out.println(jedis1);

    }
}
