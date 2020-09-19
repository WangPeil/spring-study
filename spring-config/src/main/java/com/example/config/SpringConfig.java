package com.example.config;

import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

/**
 * @author peili.wang
 * @date 2020/3/1 19:35
 */
@Configuration
@ComponentScan("com.example.pojo")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Value("${name}")
    private String name;
    @Value("${sex}")
    private String sex;
    @Value("${address}")
    private String address;

    /**
     * 返回的bean在容器中的key为方法名
     *
     * @return bean
     */
    @Bean()
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public User getUser() {
        User user = new User();
        user.setName(name);
        user.setSex(sex);
        user.setAddress(address);
        return user;
    }
}
