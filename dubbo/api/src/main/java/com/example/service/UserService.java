package com.example.service;

import com.example.pojo.UserAddress;

import java.util.List;

/**
 * @author wangpeil
 */
public interface UserService {

    /**
     * 获取用户地址
     *
     * @param id
     * @return
     */
    List<UserAddress> getUserAddress(Integer id);
}
