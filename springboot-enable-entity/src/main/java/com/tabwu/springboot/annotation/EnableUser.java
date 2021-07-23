package com.tabwu.springboot.annotation;

import com.tabwu.springboot.entity.Goods;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(Goods.class)
public @interface EnableUser {

}
