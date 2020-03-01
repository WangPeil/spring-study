package com.example;

import com.example.pojo.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author peili.wang
 * @date 2020/3/1 15:02
 */
public class SpringTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringTest.class);

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        User user = context.getBean("user", User.class);
        LOGGER.info(user.toString());
    }
}
