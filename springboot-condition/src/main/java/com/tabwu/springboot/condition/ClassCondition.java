package com.tabwu.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;


public class ClassCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata Metadata) {
        /*boolean flag = true;

        try {
            Class.forName("redis.clients.jedis.Jedis");
        } catch (ClassNotFoundException e) {
            flag = false;
            e.printStackTrace();
        }

        return flag;*/

        Map<String, Object> map = Metadata.getAnnotationAttributes(ConditionalOnClass.class.getName());

        System.out.println(map);

        String[] attributes =(String[]) map.get("value");

        boolean flag = true;
        for (String attribute : attributes) {
            try {
                Class.forName(attribute);
            } catch (ClassNotFoundException e) {
                flag = false;
                e.printStackTrace();
            }
        }
        return flag;

    }
}
