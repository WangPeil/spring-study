package com.example.config;

import com.example.aspect.LogAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类
 *
 * @author peili.wang
 * @date 2020/3/4 19:48
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

    @Bean
    public LogAspect getLogAspect() {
        return new LogAspect();
    }
}
