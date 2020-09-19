package com.example.service;

import com.example.dao.UserDao;
import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 业务层
 *
 * @author peili.wang
 * @date 2020/3/7 16:26
 */
@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Transactional(rollbackFor = Exception.class)
    public Integer addUser(User user) {
        return userDao.addUser(user);
    }

    @Transactional(rollbackFor = Exception.class)
    public Integer deleteUserById(Integer id) {
        return userDao.deleteUserById(id);
    }

    public User queryUserById(Integer id) {
        return userDao.queryUserById(id);
    }

    @Transactional(rollbackFor = Exception.class)
    public Integer updateUser(User user) {
        return userDao.updateUser(user);
    }

}
