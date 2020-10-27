package com.example.service.impl;

import com.example.pojo.UserAddress;
import com.example.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangpeil
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddress(Integer id) {
        UserAddress address1 = new UserAddress(1, "beijing");
        UserAddress address2 = new UserAddress(1, "hebei");
        return Arrays.asList(address1, address2);
    }
}
