package com.example.dao;

import com.example.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wangpeil
 */
@Mapper
public interface UserDao {
    /**
     * 查询用户
     *
     * @param id 用户id
     * @return 用户
     */
    User selectAll(@Param("id") Integer id);
}
