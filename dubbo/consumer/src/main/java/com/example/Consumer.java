package com.example;

import com.example.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangpeil
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        OrderService orderService = context.getBean(OrderService.class);
        String order = orderService.getOrder();
        System.out.println(order);
    }
}
