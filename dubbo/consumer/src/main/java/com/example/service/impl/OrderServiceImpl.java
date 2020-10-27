package com.example.service.impl;

import com.example.pojo.UserAddress;
import com.example.service.OrderService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wangpeil
 */
@Service
public class OrderServiceImpl implements OrderService {

    private final UserService userService;

    @Autowired
    public OrderServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String getOrder() {
        List<UserAddress> userAddresses = userService.getUserAddress(1);
        return String.valueOf(userAddresses);
    }
}
