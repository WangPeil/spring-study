package com.example.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author peili.wang
 * @date 2020/3/5 22:32
 */
public class HelloImpl implements Hello {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloImpl.class);

    @Override
    public void sayHello() {
        LOGGER.info("Hello");
    }
}
