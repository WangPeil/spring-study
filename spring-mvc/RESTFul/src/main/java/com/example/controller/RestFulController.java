package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author peili.wang
 * @date 2020/3/7 14:52
 */
@RestController
public class RestFulController {
    private static final Logger LOGGER = LoggerFactory.getLogger(RestFulController.class);

    /**
     * RESTFlu风格 http://localhost:8080/hello/message
     * 解决乱码问题
     *
     * @param message 传递信息
     * @return 返回结果
     */
    @RequestMapping(value = "/hello/{message}",
            method = {RequestMethod.POST, RequestMethod.GET})
    public String hello(@PathVariable String message) {
        LOGGER.info(message);
        return message;
    }

}
