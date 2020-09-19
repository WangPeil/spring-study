package com.example.utils;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author peili.wang
 * @date 2020/3/1 23:04
 */

public class Logger {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Logger.class);

    public void info() {
        LOGGER.info("日志打印输出");
    }
}
