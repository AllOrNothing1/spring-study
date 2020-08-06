package com.enjoy.cap2.config;

import com.enjoy.cap1.Person;
import com.enjoy.cap2.controller.OrderController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
/*
//根据注解来判断注入哪些bean
@ComponentScan(value = "com.enjoy.cap2",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
}, useDefaultFilters = false)
*/

/*
//根据注解来判断过滤掉哪些bean
@ComponentScan(value = "com.enjoy.cap2",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class})
}, useDefaultFilters = true)
*/
/*
//根据指定类判断来注入bean
@ComponentScan(value = "com.enjoy.cap2", includeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {OrderController.class})
}, useDefaultFilters = false)
*/
//自定义拦截来注入bean
@ComponentScan(value = "com.enjoy.cap2", includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {CustomTypeFilter.class})
}, useDefaultFilters = false)
public class Cap2MainConfig {
    /**
     * 给容器中注册一个bean，类型为返回值的类型。bean的id为方法名，或者直接在注解中规定好bean的id
     */
    @Bean("aaaPerson")
    public Person person(){
        return new Person("james",20);
    }
}
