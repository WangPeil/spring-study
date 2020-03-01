package com.example.config;

import com.example.pojo.User;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * 表明这是一个配置类
 *
 * @author peili.wang
 * @date 2020/2/24 18:09
 */
@Configuration
public class MyConfig {

    /**
     * 返回User的实例
     * @return user
     */
    @Bean
    public User getUser() {
        return new User(1,"aaa",3, Lists.newArrayList("书1", "书2"));
    }

}
