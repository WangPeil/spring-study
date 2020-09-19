package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author peili.wang
 * @date 2020/3/1 23:15
 */
@Service
public class UserService {
    private static final Logger LOGGER = LoggerFactory
            .getLogger(UserService.class);

    public void service() {
        LOGGER.info("开启服务");
    }
}
