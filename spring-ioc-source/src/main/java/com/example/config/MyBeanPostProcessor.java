package com.example.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * @author wangpeil
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(@NonNull Object bean, @NonNull String beanName) throws BeansException {
        System.out.printf("before init: bean name: \"%s\",\" bean: \"%s\"", beanName, bean.toString());
        System.out.println();
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(@NonNull Object bean, @NonNull String beanName) throws BeansException {
        System.out.printf("after init: bean name: \"%s\",\" bean: \"%s\"", beanName, bean.toString());
        System.out.println();
        return bean;
    }
}
