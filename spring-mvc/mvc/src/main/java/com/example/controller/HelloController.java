package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Objects;

/**
 * @author peili.wang
 * @date 2020/3/7 14:14
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        Objects.requireNonNull(model);
        model.addAttribute("msg", "hello spring mvc controller");
        // 自动关联视图解析器
        return "hello";
    }
}
