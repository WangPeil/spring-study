package com.example.controller;

import com.alibaba.fastjson.JSON;
import com.example.pojo.User;
import com.example.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author peili.wang
 * @date 2020/3/7 16:24
 */
@RestController
public class UserController {
    private static final Logger LOGGER = LoggerFactory
            .getLogger(UserController.class);

    @Resource(name = "userService")
    private UserService userService;

    @GetMapping("/getAllUser")
    public String getAllUser() {
        LOGGER.info("into getAllUser method");
        return JSON.toJSONString(userService.getAllUser());
    }

    @PostMapping("/addUser/{name}/{age}")
    public String addUser(@PathVariable String name, @PathVariable Integer age) {
        LOGGER.info("into addUser method");
        return JSON.toJSONString(userService.addUser(new User(null, name, age)));
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUserById(@PathVariable Integer id) {
        LOGGER.info("into deleteUserById method");
        return JSON.toJSONString(userService.deleteUserById(id));
    }

    @GetMapping("/queryUserById/{id}")
    public String queryUserById(@PathVariable Integer id) {
        LOGGER.info("into queryUserById method");
        return JSON.toJSONString(userService.queryUserById(id));
    }

    @PutMapping("/updateUser/{id}/{name}/{age}")
    public String updateUser(@PathVariable Integer id, @PathVariable String name,
                             @PathVariable Integer age) {
        LOGGER.info("into updateUser method");
        return JSON.toJSONString(userService.updateUser(new User(id, name, age)));
    }
}
