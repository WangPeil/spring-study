package com.example.dao;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层
 *
 * @author peili.wang
 * @date 2020/3/7 16:26
 */
@Repository
public interface UserDao {
    /**
     * 查找表中所有用户
     *
     * @return
     */
    List<User> getAllUser();

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    Integer addUser(User user);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    Integer deleteUserById(@Param("id") Integer id);

    /**
     * 查找用户
     *
     * @param id
     * @return
     */
    User queryUserById(@Param("id") Integer id);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    Integer updateUser(User user);
}
