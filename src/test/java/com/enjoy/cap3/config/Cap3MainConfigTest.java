package com.enjoy.cap3.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class Cap3MainConfigTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(Cap3MainConfig.class);
        String[] names = app.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        //从容器中分别取两次person实例，看是否为同一个bean
        Object person1 = app.getBean("person");
        Object person2 = app.getBean("person");
        System.out.println(person1 == person2);
        //结论：person1和person2就是同一个对象。

    }
}