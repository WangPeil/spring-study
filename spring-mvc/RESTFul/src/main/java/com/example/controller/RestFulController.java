package com.example.controller;

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
    /**
     * RESTFlu风格 http://localhost:8080/hello/1/2
     *
     * @param a 变量1
     * @param b 变量2
     * @return 计算结果
     */
    @RequestMapping(value = "/hello/{a}/{b}",
            method = {RequestMethod.POST, RequestMethod.GET})
    public String hello(@PathVariable int a, @PathVariable int b) {
        return String.valueOf(a + b);
    }

}
